

Info_cine = {'cantidad_boletas':5,
             "tipo_sala": "Dinanix",
             "hora_pico":False,
             "pago_tarjeta_cine":True,
             "reserva": False}

cantidad_boletas = Info_cine ["cantidad_boletas"]
tipo_sala = Info_cine ["tipo_sala"]
hora_pico = Info_cine ["hora_pico"]
pago_tarjeta_cine = Info_cine ["pago_tarjeta_cine"]
reserva= Info_cine ["reserva"]

tarifa_Dinamix = 18800
tarifa_3D = 15500
tarifa_2D = 11300

#determinar el tipo de sala

if tipo_sala == "Dinamix" :
    tarifa_basica = tarifa_Dinamix
elif tipo_sala == "3D" :
    tarifa_basica = tarifa_3D
elif tipo_sala == "2D" :
    tarifa_basica = tarifa_2D
   
#calcular descuentos

#descuento por hora no pico

descuento_horapico = 0
if hora_pico == False :
    descuento_horapico = 0.1*tarifa_basica
    if cantidad_boletas >= 3:
        descuento_horapico = descuento_horapico + 500



#descuento por pago con tarjeta
if pago_tarjeta_cine == True:
   descuento_tipopago = 0.05*tarifa_basica

#recargo por reserva
recargo = 0
if reserva == True:
    recargo = 2000

valor_boleto = tarifa_basica - descuento_horapico 
print (valor_boleto)