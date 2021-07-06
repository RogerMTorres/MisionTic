#primer programa nivelacion semana 1

#variable y tipos de datos

Primer_nombre = "fracisco"
segundo_nombre = "carlos"
primer_apellido = "torres"
edad =25
documento = "1000022152"
# nota1 = 0
# nota2 = 0
# nota3 = 0
# nota4 = 0


#print (Primer_nombre)
#print (type (Primer_nombre))

nombre_completo = Primer_nombre +" " + segundo_nombre + " "+ primer_apellido
print (nombre_completo)
print ("edad del estudiante = ", edad)
print ("documento del estudiante: " + documento)

nota1 = input ("ingrese la nota1")
nota2 = input ("ingrese la nota2")
nota3 = input ("ingrese la nota3")
nota4 = input ("ingrese la nota4")

promedio = (float (nota1) + float (nota2) + float (nota3) + float (nota4))/4
#print (promedio)


#operadores aritmeticos
# + sumar 
# - restar
# * multiplicar
# / dividir
# // divicion entera
# % modulo
# ** elevar a una potencia

#pemdas -- parentesis, exponentes, multiplicacion, divicion, suma, resta

# resultado = 10//3
# print (resultado)

promedio = round (promedio ,1)
print (promedio)

#codicionales

# if condicion:
#     print ("este codigo se ejecuta si es verdadera")

# else:
#     print ("este codigo se ejecuta si es falsa")

#operadores relacionales
# >= mayor o igual
# == igual
# != diferente
# <= menor igal

if promedio >= 3.0:
    print ("Paso")
else :
    print ("no paso")
