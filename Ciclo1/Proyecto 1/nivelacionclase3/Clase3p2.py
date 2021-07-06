def producto_mas_costoso (carrito_compras: dict) -> str:
    if carrito_compras == {}:
        return "no hay productos en el carrito"
    
    productos = sorted(carrito_compras.keys())
    maximo = max(carrito_compras.values())

    for producto in productos:
        if carrito_compras[producto] ==maximo:
            return producto

carrito1 = {"bananos":5000, "chocolotania":5000, "gaseosa":2300}
carrito2 = {"cereal":2000, "pescado": 8900, "sal":2890, "desodorante":15000}
carrito3= {}

print (producto_mas_costoso(carrito1))

print (producto_mas_costoso(carrito2))

print (producto_mas_costoso(carrito3))