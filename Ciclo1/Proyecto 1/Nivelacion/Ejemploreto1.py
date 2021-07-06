def dar_tiempo(PesoArchivo: float, Velocidadin: float, Tipout: int)->str:
    if Tipout ==1:
        Tipout = "MB"
        Peso=PesoArchivo
    elif Tipout ==2:
        Tipout = "GB"
        Peso=PesoArchivo *1000
    elif Tipout ==3:
        Tipout = "TB"
        Peso=PesoArchivo *1000000
    
    tiempo = Peso/ (0.125*Velocidadin)

    dias =int (tiempo//86400)
    horas =int ((tiempo-86400*dias)//3600)
    minutos =int ((tiempo-(3600*horas+86400*dias))//60)
    segundos =int (tiempo-(86400*dias+3600*horas+ 60*minutos))
    cadena = "tardaria "  + str(dias) + " dias " + " " + str(horas) + " horas" + str(minutos) + " minutos" + " " + str(segundos) + "para descargar un archivo de " + str(PesoArchivo) + " MB" 
    cadena1 = "tardaria " + str(horas) + " horas " + str(minutos) + " minutos" + " " + str(segundos) + "para descargar un archivo de " + str(PesoArchivo) + " MB" 
    cadena2 = "tardaria " + str(minutos) + " minutos " + " " + str(segundos) + "para descargar un archivo de " + str(PesoArchivo) + " MB" 
    cadena3 = "tardaria " + str(segundos) + "para descargar un archivo de " + str(PesoArchivo) + " MB" 
    if dias  ==0 & horas ==0:
        return cadena2
    elif dias ==0:
        return cadena1
    elif dias ==0 & horas ==0 & minutos == 0:
        return cadena3
    else:
        return cadena

print (dar_tiempo(PesoArchivo =1000009, Velocidadin = 10000, Tipout = 2))  