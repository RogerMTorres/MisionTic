def prediccion(equipo:dict) -> str:
    nombre = equipo["nombre"]
    continente = equipo["Continente"]
    PG = equipo["PG"]
    PE = equipo["PE"]
    PP = equipo["PP"]
    DG = equipo["GF"] - equipo["GC"]
    Posesion = equipo["Posesion"]
    if isinstance(equipo["Ganador"],str): Ganador = int(equipo["Ganador"][0])
    else: Ganador =equipo["Ganador"]
    Nomina = equipo["Nomina"]
    if continente == "Europa":
  
        if PG > PP or PE > PP:        
            if DG > 0 and Posesion > 0.5:           
                if Ganador > 0:
                    return "El equipo {} tiene el 0.9 de probabilidad de ganar el torneo".format(nombre)
                else:                
                    if Nomina > 700:
                         return "El equipo {} tiene el 0.8 de probabilidad de ganar el torneo".format(nombre)
                    else :
                        return "El equipo {} tiene el 0.7 de probabilidad de ganar el torneo".format(nombre)           
            else:
                return "El equipo {} tiene el 0.5 de probabilidad de ganar el torneo".format(nombre)       
        else:         
            if DG > 0 and Posesion > 0.4:
                return "El equipo {} tiene el 0.5 de probabilidad de ganar el torneo".format(nombre)
            else:
                return "El equipo {} tiene el 0.4 de probabilidad de ganar el torneo".format(nombre)  
    else:            
    
        if Ganador > 0:
            if PG > PP and PE > PP:         
                if DG > 0 or Posesion > 0.5:
                    return "El equipo {} tiene el 0.85 de probabilidad de ganar el torneo".format(nombre)
                else:
                    return "El equipo {} tiene el 0.8 de probabilidad de ganar el torneo".format(nombre)    
            else:               
                    if Nomina > 700 and Posesion > 0.4:
                        return "El equipo {} tiene el 0.6 de probabilidad de ganar el torneo".format(nombre)
                    else :
                        return "El equipo {} tiene el 0.4 de probabilidad de ganar el torneo".format(nombre)   
        else:          
            if continente == "Sudamerica" and not(Posesion < 0.45):            
                if DG >0:
                    return "El equipo {} tiene el 0.6 de probabilidad de ganar el torneo".format(nombre)
                else:
                    return "El equipo {} tiene el 0.5 de probabilidad de ganar el torneo".format(nombre)
        
            else:
                return "El equipo {} tiene el 0.4 de probabilidad de ganar el torneo".format(nombre)

# print(prediccion({"nombre":"Manchester", "PG" : 5, "PE": 3, "PP": 2, "Ganador": 2, "GF": 38, "GC": 20, "Nomina": 800, "Continente": "Europa", "Posesion": 0.52}))
print(prediccion({"nombre":"Boca", "PG" : 5, "PE": 2, "PP": 3, "Ganador": "3+", "GF": 20, "GC": 29, "Nomina": 600, "Continente": "Sudamerica", "Posesion": 0.45}))
# print(prediccion({"nombre":"Zamalek", "PG" : 5, "PE": 2, "PP": 3, "Ganador": 0, "GF": 20, "GC": 29, "Nomina": 600, "Continente": "Africa", "Posesion": 0.45}))
# print(prediccion({"nombre":"Manchester City", "PG" : 5, "PE": 3, "PP": 2, "Ganador": 0, "GF": 38, "GC": 20, "Nomina": 800, "Continente": "Europa", "Posesion": 0.52}))
# print(prediccion({"nombre":"COLOMBIA", "PG" : 1, "PE": 1, "PP": 1, "Ganador": 0, "GF": 38, "GC": 20, "Nomina": 800, "Continente": "Europa", "Posesion": 0.52}))