from django.shortcuts import render

# Create your views here.
from django.http import JsonResponse
from myapp.utils import get_product_by_name

def product_detail(request, name):
    data = get_product_by_name(name)
    return JsonResponse({"product": data})
