AutoPricePredictorML
CarPricePredictorML ayuda a predecir el precio del automóvil según el algoritmo "RandomTree". Como mpdel de aprendizaje, se proporciona un modelo de aprendizaje de muestra basado en el cual se predice el precio del automóvil con los diferentes atributos.

Empezando
CarPricePredictorML es un proyecto basado en arranque de Spring con soporte de Maven. Se puede construir con los siguientes comandos:

$ mvn instalación limpia
$ mvn spring-boot: run
Corriendo las pruebas
$ mvn prueba limpia
Manifestación
UI
CarPricePredictorML está alojado en el servidor heroku con un archivo modelo de aprendizaje de muestra.

API
Para usar la API de CarPricePredictorML, se pueden usar las siguientes URL, encabezado y cuerpo de JSON:

URL de solicitud
[POST] http://carpricepredictor.herokuapp.com/v1/cars
Encabezamiento
Tipo de contenido: aplicación / json
Cuerpo
{
    "kilómetros": 2500,
    "propietario": 2,
    "rcType": "INDIVIDUAL",
    "engineType": "PETROL",
    "transmissionType": "MANUAL",
    "registrationyear": "2000",
    "ciudad": "Bangalore",
    "modelType": "LXI"
}
Autores
Harikrushna Vanpariya
Construido con
Weka - El framework de Machine Learning utilizado.
SpringBoot - El framework de API Rest usado
Maven - Gestión de la dependencia
AngularJS - El marco de interfaz de usuario utilizado
Bootstrap - El marco de interfaz de usuario utilizado
