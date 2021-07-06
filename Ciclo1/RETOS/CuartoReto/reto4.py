def detalleTransaccionesBP(caso: dict) -> dict:

    listaCompleta = []

    cajero = []

    listaCompleta = caso.values()

    for llave in caso:

        cajero.append(llave)

    t_Retiros = 0
    totalMonto = 0

    totalConsignaciones = 0
    t_Consignaciones = 0

    totalTransferencia = 0
    t_Transferencia = 0

    contador = 0
    codigoCajero = str
    for estado in listaCompleta:

        codigoCajero = cajero[contador]

        contador = contador + 1

        variable = codigoCajero.find("BP")

        if(variable == 5): #Find

            if(estado['estado']=="Fuera de Servicio" or estado['estado']=="Operando"): ##Retiros


                cantidadTransacciones = len(estado['transacciones'])

                for i in range(0, cantidadTransacciones):

                    if((estado['transacciones'][i]['tipoMovimiento'])=="retiro"):

                        totalMonto = totalMonto + estado['transacciones'][i]['monto']
                        t_Retiros = t_Retiros + 1   
                    
            else: ##Retiros
                pass

            if(estado['estado']=="Fuera de Servicio" or estado['estado']=="Operando"): ##Consignaciones


                cantidadTransacciones = len(estado['transacciones'])

                for i in range(0, cantidadTransacciones):

                    if((estado['transacciones'][i]['tipoMovimiento'])=='consignacion'):

                        totalConsignaciones = totalConsignaciones + estado['transacciones'][i]['monto']
                        t_Consignaciones = t_Consignaciones + 1   
                    
            else: ##Consignaciones
                pass

            if(estado['estado']=="Fuera de Servicio" or estado['estado']=="Operando"): ##Transferencia

                cantidadTransacciones = len(estado['transacciones'])

                for i in range(0, cantidadTransacciones):

                    if((estado['transacciones'][i]['tipoMovimiento'])=='transferencia'):

                        totalTransferencia = totalTransferencia + estado['transacciones'][i]['monto']
                        t_Transferencia = t_Transferencia + 1   
                    
            else: ##Transferencia
                pass

        else: #Find

            pass
        
    promedioRetiros = totalMonto / t_Retiros
    promedioConsignaciones = totalConsignaciones / t_Consignaciones
    promedioTransferencia = totalTransferencia / t_Transferencia

    return {'retiros': {'cantidad': t_Retiros, 'promedio': int(promedioRetiros)}, 
    'consignaciones': {'cantidad': t_Consignaciones, 'promedio': int(promedioConsignaciones)}, 
    'transferencias': {'cantidad': t_Transferencia, 'promedio': int(promedioTransferencia)}}

from casosGeneradosP61 import*

print(detalleTransaccionesBP(caso4))