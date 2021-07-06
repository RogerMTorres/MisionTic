
def generadorRegiones(largo1: float,largo2: float, largo3: float, largo4: float, porcentajeAjuste: float) -> str:

    areaLargo1 = largo1**2
    areaLargo2 = largo2**2
    areaLargo3 = largo3**2
    areaLargo4 = largo4**2

    areaPromedio = ((areaLargo1)+(areaLargo2)+(areaLargo3)+(areaLargo4))/4
    diferenciaPermitida = porcentajeAjuste * areaPromedio

    p1 = abs(areaPromedio - areaLargo1)
    p2 = abs(areaPromedio - areaLargo2)
    p3 = abs(areaPromedio - areaLargo3)
    p4 = abs(areaPromedio - areaLargo4)

    totalAprobado = 0
    totalDescartado = 0
    totalArea = 0

    if(p1<diferenciaPermitida):
        totalAprobado = totalAprobado + 1
        totalArea = totalArea + areaLargo1
    else:
        totalDescartado = totalDescartado + 1

    if(p2<diferenciaPermitida):
        totalAprobado = totalAprobado + 1
        totalArea = totalArea + areaLargo2
    else:
        totalDescartado = totalDescartado + 1

    if(p3<diferenciaPermitida):
        totalAprobado = totalAprobado + 1
        totalArea = totalArea + areaLargo3
    else:
        totalDescartado = totalDescartado + 1

    if(p4<diferenciaPermitida):
        totalAprobado = totalAprobado + 1
        totalArea = totalArea + areaLargo4
    else:
        totalDescartado = totalDescartado + 1


    if(totalAprobado>=2):
        return "Región confirmada: piezas aprobadas = "+str(totalAprobado)+",  área piezas ubicadas = "+str(totalArea)
    else:
        return "Fichas descartadas: "+str(totalDescartado)+", considerar nuevo grupo de piezas del stock"



print(generadorRegiones(3, 1, 2, 2.5, 0.5))