def distEUC(Valor_x1 =0,Valor_x2=0,Valor_y1  =0,Valor_y2  =0):
    resultado = ((Valor_x1 - Valor_x2) ** 2 + (Valor_y2 - Valor_y1) ** 2) ** (1/2)
    return resultado

def volumendelcono (radio_cono = 0, altodelcono = 0):
    pi = 3.1416
    resultado = (((pi * radio_cono **2) /3) * altodelcono)
    return resultado

def promedioNotas (nota_1  =1.0 ,nota_2  =1.0,nota_3  =1.0,nota_4  =1.0):
    return sum( (nota_1,nota_2,nota_3,nota_4) ) / len((nota_1,nota_2,nota_3,nota_4))

def aRectangulo(L=1,a=1):
    #print ("El largo recibido es:",L)
    #print ("El ancho recibido es:",a)
    resultadoAarea = L * a
    return resultadoAarea    

def promedio3Conexiones(c1=0,c2=0,c3=0):
    return sum( (c1,c2,c3) )/ len((c1,c2,c3))