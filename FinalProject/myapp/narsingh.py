import redis

# Connect to Redis running in Docker
redis_client = redis.StrictRedis(host='localhost', port=6379, db=0)


import time
from myapp.models import Product

def get_product_by_name(name):
    # Check Redis first
    cached = redis_client.get(name)
    if cached:
        print("Fetched from Redis")
        return cached.decode('utf-8')

    # If not cached, query MySQL
    start = time.time()
    product = Product.objects.get(name=name)
    end = time.time()

    duration = end - start
    print(f"Fetched from MySQL in {duration:.4f} seconds")

    # Cache result in Redis
    redis_client.set(name, f"{product.name}, {product.price}, {product.stock}")

    return f"{product.name}, {product.price}, {product.stock}"

print(get_product_by_name("Laptop"))
