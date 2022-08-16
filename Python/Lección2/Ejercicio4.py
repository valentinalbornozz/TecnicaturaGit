# Ejercicio Etapas de vida según la edad
from xml.dom.minidom import Element


edad = int(input('Digite su edad: '))
mensaje = None
if 0 <= edad < 10: #sintaxis simplificada
    mesaje = 'La infancia es increible y bella'
elif 10 <= edad < 20: 
    mensaje = 'Tienes muchos cambios, mucho que estudiar'
elif 20 <= edad < 30:
    mensaje = 'Amor y comienza el trabajo'
elif 30 <= edad < 40: 
    mensaje = 'Dolores'
elif 40 <= edad < 50: 
    mensaje = 'mucho trabajo, crecen los hijos'
elif 50 <= edad <60:
    mensaje = 'cambios físicos y psicologicos'
elif 60 <= edad < 70:
    mensaje = 'viajes'
elif 70 <= edad < 80:
    mensaje = 'Enfermedades'
elif 80 <= edad < 90:
    mensaje = 'Vive la vida'
else:
    mensaje = 'Error, etapa de vida no reconocida'
print(f'Tu edad es: {edad}, {mensaje} ')