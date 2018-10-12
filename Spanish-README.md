# CarPricePredictorML

CarPricePredictorML te ayuda a predecir el precio de un automóvil basado en el algoritmo “RandomTree”. Como modelo de aprendizaje se provee un modelo de ejemplo basado en cual es el precio predicho del auto con los diferentes atributos.

## Comenzando

`CarPricePredictorML` es un proyecto basado en Spring Boot con soporte Maven. Puede ser preparado con los siguientes comandos :

```
$ mvn clean install
$ mvn spring-boot:run
```

## Ejecutando las pruebas
```
$ mvn clean test
```

## Demo

#### IU
`CarPricePredictorML` está alojado en un [servidor Heroku](https://carpricepredictor.herokuapp.com/) con un modelo de aprendizaje en un archivo de ejemplo.

#### API
Para utilizar la API de `CarPricePredictorML`, los siguientes parámetros de URL, Cabecera y cuerpo JSON pueden ser utilizados:

* URL de la Solicitud
```
[POST] http://carpricepredictor.herokuapp.com/v1/cars 
```
* Cabecera
```
Content-Type:application/json
```
* Cuerpo
```
{
    "kilometers": 2500,
    "owner": 2,
    "rcType": "INDIVIDUAL",
    "engineType": "PETROL",
    "transmissionType": "MANUAL",
    "registrationyear": "2000",
    "city": "Bangalore",
    "modelType": "LXI"
}
```

# Autores
* **Harikrushna Vanpariya** 

## Hecho con

* [Weka](https://www.cs.waikato.ac.nz/ml/weka/) - El framework de aprendizaje automatizado que fue utilizado.
* [SpringBoot](https://spring.io/projects/spring-boot) - El framework de la Rest API.
* [Maven](https://maven.apache.org/) - Manejo de Dependencias.
* [AngularJS](https://angularjs.org/) - El framework de IU.
* [Bootstrap](https://getbootstrap.com/) - El framework de IU.