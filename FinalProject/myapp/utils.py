import time
import redis
from django.conf import settings
from myapp.models import Product

# Connect to Redis
redis_client = redis.StrictRedis(
    host=settings.REDIS_HOST,
    port=settings.REDIS_PORT,
    db=settings.REDIS_DB,
    decode_responses=True  # ensures strings instead of bytes
)

def get_product_by_name(name):
    start = time.time()
    # Check Redis first
    cached = redis_client.get(name)
    if cached:
        end = time.time()
        print("Fetched from Redis")
        duration = end - start
        print(f"Fetched from Redis in {duration:.4f} seconds")
        return cached

    # If not cached, query MySQL
   
    product = Product.objects.get(name=name)
    
    end = time.time()
    duration = end - start
    print(f"Fetched from MySQL in {duration:.4f} seconds")

    # Cache result in Redis (with TTL of 60s)
    redis_client.setex(name, 60, f"{product.name}, {product.price}, {product.stock}")

    return f"{product.name}, {product.price}, {product.stock}"