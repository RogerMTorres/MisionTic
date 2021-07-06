numero = int(input ("escriba un numero:"))


if  numero <0:
    numero = numero * (-1)

if numero >=1 and numero<=9:
    print ("el numero tiene un digito")
elif numero >=10 and numero <=99:
        print ("el numero tiene dos digitos")
elif numero >=100 and numero <=999:
    print ("el numero tiene tres digitos")
elif numero >=1000 and numero <=9999:
    print ("el numero tiene cuatro digitos")
else:
    print ("el numero tiene mas de cuatro digitos")