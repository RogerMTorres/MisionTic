# x = ("Joey", "Monica", "Ross")

# y = ("Chandler", "Pheobe")

# z = ("David", "Rachel", "Courtney")

# result = zip(x, y, z)

# print(result)

# print(tuple(result))

#Convertir dos listas a un diccionario
# coin = ('Bitcoin', 'Ether', 'Ripple', 'Litecoin')

# code = ('BTC', 'ETH', 'XRP', 'LTC')

# dicionario = dict(zip(coin, code))
# print (dicionario)

# La Función Zip con Tres/ Múltiples Listas

# list_a = ['Bitcoin', 'Ethereum', 'Ripple', 'Litecoin', 'Bitcoin-cash']

# list_b = ['BTC', 'ETH', 'XRP', 'LTC', 'BCH']

# list_c = ['11605', '271', '0.335', '102', '347']

# result = zip(list_a, list_b, list_c)

# print(tuple(result))

# La función Zip asterisco (Unzip)

# a = ['a1', 'a2', 'a3']

# r = zip(*a)

# print(tuple(r))

# Zip una matriz

# explicacion: Una matriz en un arreglo multidimensional de m*n, 
# donde m representa el número de filas y n representa el número de columnas.

# En Python, podemos utilizar la función zip para encontrar 
# la transpuesta de la matriz. El primer paso es descomprimir la matriz 
# utilizando el operador* y finalmente utilizas la función zip y la unes 
# nuevamente, como se muestra en el siguiente ejemplo:

# mat = [[1,2,3], [4,5,6]]

# trans_mat = zip(*mat)

# print(tuple(trans_mat))

# Iterar a través de dos listas en paralelo

# list_1 = ['Numpy', 'asyncio', 'cmath', 'enum', 'ftplib']

# list_2 = ['C', 'C++', 'Java', 'Python']

# for i, j in zip(list_1, list_2):

#     print(i, j)


f = open("zipOutput.txt", "a+")

list_1 = ['C','C++', 'Python','Java']

list_2 = ['Solidity','Android','Php','Kotlin']

for i in zip(list_1, list_2):

    f.write(str(i))

f.close()

