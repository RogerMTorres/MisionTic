def distEUC(Valor_x1,Valor_x2,Valor_y1,Valor_y2):
    resultado = ((Valor_x1 - Valor_x2) ** 2 + (Valor_y2 - Valor_y1) ** 2) ** (1/2)
    return resultado

def volumendelcono (radio_cono, altodelcono):
    pi = 3.1416
    resultado = (((pi * radio_cono **2) /3) * altodelcono)
    return resultado

def promedioNotas (nota_1,nota_2,nota_3,nota_4):
    return sum( (nota_1,nota_2,nota_3,nota_4) ) / len((nota_1,nota_2,nota_3,nota_4))
    