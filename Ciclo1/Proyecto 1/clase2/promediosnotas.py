import geoMate as gc

#promedio notas de 0.0 a 5.0
#reportar la mayor nota y tambien la menor.
nota_1 = 5.0
nota_2 = 3.1
nota_3 = 3.8
nota_4 = 4.0
#promedio = (nota_1 + nota_2 + nota_3 + nota_4)/4
#promedio = sum( (nota_1,nota_2,nota_3,nota_4) ) / len((nota_1,nota_2,nota_3,nota_4))
#promedio = gc.promedioNotas(nota_1,nota_2,nota_3,nota_4)
print ("el promedio es:",gc.promedioNotas(nota_1,nota_2,nota_3,nota_4))
print ("la mayor nota es", max((nota_1,nota_2,nota_3,nota_4)))
print ("la menor nota es", min((nota_1,nota_2,nota_3,nota_4)))