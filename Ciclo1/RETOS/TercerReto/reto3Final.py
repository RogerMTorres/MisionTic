def programadorTareas(listaTareas : list) -> dict:

    listaCompleta = []

    turno = []

    duracionTurnoActual = 0

    for tareaActual in listaTareas:

        if (listaCompleta == [] and duracionTurnoActual == 0 and turno == []):

            turno.append(tareaActual)
            duracionTurnoActual = duracionTurnoActual + tareaActual['duracion']

        else:

            if ((duracionTurnoActual + tareaActual['duracion'])<= 240 and turno [-1]['tf'] <= tareaActual['t0']):
                turno.append(tareaActual)
                duracionTurnoActual = duracionTurnoActual + tareaActual['duracion']

            else:

                listaCompleta.append([turno,duracionTurnoActual])
                turno = []
                turno.append(tareaActual)
                duracionTurnoActual = 0
                duracionTurnoActual = duracionTurnoActual + tareaActual['duracion']

    if(duracionTurnoActual != 0):

        listaCompleta.append([turno,duracionTurnoActual])

    else: 

        pass

    totalTiempo = 0

    totalMaquinas = len(listaCompleta)
    
    for tiempo in listaCompleta:
        
        totalTiempo = totalTiempo + tiempo[1]
    
    tiempoPromedio = round(totalTiempo/totalMaquinas, 2)

    return {'maquinasOcupadas':totalMaquinas, 'ocupacionPromedio':tiempoPromedio}


print(programadorTareas([{'t0': 3, 'tf': 62, 'duracion': 59, 'id': 'Etapa18'}, {'t0': 11, 'tf': 148, 'duracion': 137, 'id': 'Etapa19'}, {'t0': 37, 'tf': 147, 'duracion': 110, 'id': 'Etapa20'}, {'t0': 80, 'tf': 111, 'duracion': 31, 'id': 'Etapa7'}, {'t0': 202, 'tf': 224, 'duracion': 22, 'id': 'Etapa16'}, {'t0': 346, 'tf': 378, 'duracion': 32, 'id': 'Etapa2'}, {'t0': 401, 'tf': 452, 'duracion': 51, 'id': 'Etapa5'}, {'t0': 408, 'tf': 453, 'duracion': 45, 'id': 'Etapa6'}, {'t0': 468, 'tf': 516, 'duracion': 48, 'id': 'Etapa8'}, {'t0': 476, 'tf': 504, 'duracion': 28, 'id': 'Etapa9'}, {'t0': 549, 'tf': 586, 'duracion': 37, 'id': 'Etapa14'}, {'t0': 678, 'tf': 729, 'duracion': 51, 'id': 'Etapa4'}, {'t0': 791, 'tf': 827, 'duracion': 36, 'id': 'Etapa10'}, {'t0': 824, 'tf': 844, 'duracion': 20, 'id': 'Etapa15'}, {'t0': 886, 'tf': 961, 'duracion': 75, 'id': 'Etapa13'}, {'t0': 890, 'tf': 906, 'duracion': 16, 'id': 'Etapa17'}, {'t0': 922, 'tf': 958, 'duracion': 36, 'id': 'Etapa1'}, {'t0': 1021, 'tf': 1082, 'duracion': 61, 'id': 
'Etapa3'}, {'t0': 1102, 'tf': 1195, 'duracion': 93, 'id': 'Etapa11'}, {'t0': 1435, 'tf': 1496, 'duracion': 61, 'id': 'Etapa12'}]))