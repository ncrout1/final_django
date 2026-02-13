from django.urls import path
from . import views

urlpatterns = [
    path('product/<str:name>/', views.product_detail, name='product_detail'),
]