from os import sep


def indicadoresPetroleo (rutaArchivo: str)->dict:
    import pandas as pd
    if rutaArchivo[-3:].lower() != 'csv':
        return 'Extensión inválida'

    try:
        data = pd.read_csv(rutaArchivo,sep=",")
    except:
        return "Error al leer el archivo de datos"
    data["Fecha"] = pd.to_datetime(data['Fecha'],dayfirst = True)
    data.set_index("Fecha",inplace=True)

    variacion = list()
    for i in range(len(data["Ecopetrol"])-1):
        calculo   =  (abs(data["Ecopetrol"][i] - data["Ecopetrol"][i+1])/data["Ecopetrol"][i])*100
        variacion.append(calculo)
    variacion = pd.Series(variacion)
    promediovariacion = variacion.mean()
    promedioCasos = data["Casos"].mean()
    data = data[data["Casos"]<= promedioCasos]
    
    resultado = {"Promedio Variación": promediovariacion, "Registros Menores": data}
    return resultado

print(indicadoresPetroleo('https://raw.githubusercontent.com/luismescobarf/clasesCiclo1/master/BaseDeDatosReto5.csv'))
