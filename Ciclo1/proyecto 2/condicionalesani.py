Entero = 0
Entero = int(input ("escriba un numero:"))
print (type(Entero))

if Entero >0:
    if Entero >= 10 and Entero <=99:
        print ("el numero es positivo y tiene dos digitos")
    else:
        print ("el numero es positivo y NO tiene dos digitos")
else:
    if Entero >= -999 and Entero <=-100:
        print ("el numero es negativo y tiene tres digitos")
    else:
        print ("el numero es negativo y NO tiene tres digitos") 

