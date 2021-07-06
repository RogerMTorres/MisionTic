def prediccion(equipo:dict) -> str:

    #if(equipo['Ganador']>0 or equipo['Ganador']=="3+"): ########################  Ganador

    diferenciaGoles = equipo['GF']-equipo['GC']

    ganador = str(equipo['Ganador'])    

    if(equipo['Continente']=="Europa"): #Equipo Europeo

        if(equipo['PG']>equipo['PP'] or equipo['PE'] > equipo['PP']): #PG > PP

            if(diferenciaGoles > 0 and equipo['Posesion'] > 0.5): #Diferencia de goles > 0

                if(ganador=="1" or ganador=="2" or ganador=="3+"): ########################  Ganador

                    return "El equipo "+equipo['nombre']+" tiene el 0.9 de probabilidad de ganar el torneo"

                elif(ganador=="0"): ########################  Ganador

                    if(equipo['Nomina']>700): #Nomina > 700

                        return "El equipo "+equipo['nombre']+" tiene el 0.8 de probabilidad de ganar el torneo"

                    else: #Nomina > 700

                        return "El equipo "+equipo['nombre']+" tiene el 0.7 de probabilidad de ganar el torneo"


            else: #Diferencia de goles > 0

                return "El equipo "+equipo['nombre']+" tiene el 0.5 de probabilidad de ganar el torneo"

        else:#PG > PP

            if(diferenciaGoles>=0 and equipo['Posesion']>0.4):
                
                return "El equipo "+equipo['nombre']+" tiene el 0.5 de probabilidad de ganar el torneo"

            else:

                return "El equipo "+equipo['nombre']+" tiene el 0.4 de probabilidad de ganar el torneo"
   
    
    else: #Equipo Europeo

        if(ganador=="1" or ganador=="2" or ganador=="3+"): ####################### Ganador

            if(equipo['PG']>equipo['PP'] and equipo['PE']>equipo['PP']): #PG > PP

                if(diferenciaGoles>0 or equipo['Posesion']>0.5): # DG > 0 v

                     return "El equipo "+equipo['nombre']+" tiene el 0.8 5 de probabilidad de ganar el torneo"

                else: # DG > 0 v

                    return "El equipo "+equipo['nombre']+" tiene el 0.6 de probabilidad de ganar el torneo"

            else: #PG > PP

                if(equipo['Nomina']>700 and equipo['Posesion']>0.4): #Nomina > 700

                    return "El equipo "+equipo['nombre']+" tiene el 0.6 de probabilidad de ganar el torneo"

                else: #Nomina > 700

                    return "El equipo "+equipo['nombre']+" tiene el 0.4 de probabilidad de ganar el torneo"

        elif(ganador=="0"): ####################### Ganador

            if(equipo['Continente']=="Sudamerica" and equipo['Posesion']>0.45): ############Equipo sudamericano
                
                if(diferenciaGoles>0): #Diferencia de goles > 0

                    return "El equipo "+equipo['nombre']+" tiene el 0.6 de probabilidad de ganar el torneo"

                else: #Diferencia de goles > 0

                    return "El equipo "+equipo['nombre']+" tiene el 0.5 de probabilidad de ganar el torneo"

            else: ############Equipo sudamericano

                return "El equipo "+equipo['nombre']+" tiene el 0.4 de probabilidad de ganar el torneo"

    #pass


print(prediccion({"nombre":"Manchester City", "PG": 5, "PE": 3, "PP": 2, "Ganador": 0, "GF": 38, "GC": 20, "Nomina": 800, "Continente": "Europa", "Posesion": 0.52}))