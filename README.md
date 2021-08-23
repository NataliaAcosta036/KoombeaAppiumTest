# Resumen de codificaion
Proyecto de automatizacion móvil (Android) realizado para ejecutar pruebas del funcionamiento de la app Conversor de Unidades (PreciseUnitConversion.apk), particularmente de los flujos Dimensión (Longitud, Area y Volumen) y Movimiento (Velocidad, Aceleración, Velocidad angular y Velocidad de flujo)

#*El framework
Se utiliza como framework principal Appium. Las pruebas se pueden ejecutar en emuladores de android estudio, en un celular con sistema operativo Android, entre otros.

Tambien se utiliza Cucumber para el manejo de los features, que es donde se describen los escenarios de prueba (en lenguaje Gherkin).

#*Compilador 
Se utiliza como compilador el Java Development Kit 8 en su version 11.0.1, El JDK incluye una JVM privada y algunos otros recursos para finalizar el desarrollo
de una aplicación Java.


#*Prácticas de automatización
La practica de automatizacion que se utiliza es:

Screenplay: Es un modelo centrado en el usuario, que lo ayuda a cambiar el enfoque de las pruebas de aceptación automatizadas de interacciones de bajo nivel
con el sistema, es lo que quieren lograr con su interacción con Su sistema y cómo exactamente lo van a hacer. Se utiliza esta practica por que es muy buena
y amigable con los principios SOLID, ademas de esto integra el negocio con el codigo, y es mucho mas facil de entender.



#*Herramienta de automatización utilizado

*Appium
*Cucumber


#*Estrategia de automatización

Se utiliza el modelo de diseño Screenplay.

#*Aplicación que se esta probando

Conversor de Unidades (La ubicación del APK es co.com.koombea.automation.android\src\test\resources\app\PreciseUnitConversion.apk)

#*El driver y la versión utilizada

Android en un dispositivo cuya versión es Android 10


#*Informacion necesaria para que una persona ingrese y conozca el funcionamiento de la automatizacion

Lo mas importante es saber que el proyecto utiliza el runner RunnerTags que es el encargado de ejecutar la automatización.
En el proyecto se encuentra un serenity.properties con las Desired Capabilities, que se puedes modificar según el dispositivo donde se vaya a ejecutar la automatización.
Se adjunta un video con la ejecución de los escenarios de prueba.

#*Repositorio de git donde se encuentra alojado el proyecto

URL: https://github.com/NataliaAL23/koombeaAppiumProject.git


#*Reporte del resultado de la automatización

Dentro del proyecto se crea una carpeta llamada Target (siempre que se ejecuta completamente el proyecto) dentro de la ruta: Target/size/serenity, se crean un archivo con extensión html, el cual contiene dicho informe.

