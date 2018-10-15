# CarPricePredictorML

CarPricePredictorML ayuda a predecir el precio de un coche basándose en el algoritmo "RandomTree". Se incluye un modelo de aprendizaje basado en cuál será el precio del coche según una serie de diferentes atributos.

## Inicio

`CarPricePredictorML` es un proyecto basado en Spring Boot con soporte para Maven. Puede compilarse utilizando los comandos siguientes:

```
$ mvn clean install
$ mvn spring-boot:run
```

## Ejecutar los tests
```
$ mvn clean test
```

## Demo

#### UI
`CarPricePredictorML` está hospedado en un [servidor heroku](https://carpricepredictor.herokuapp.com/) con un fichero que contiene un modelo de aprendizaje de ejemplo.

#### API
Para usar la API de `CarPricePredictorML`, se pueden usar la siguiente URL, Header y JSON en el cuerpo del mensaje:

* URL
```
[POST] http://carpricepredictor.herokuapp.com/v1/cars 
```
* Header
```
Content-Type:application/json
```
* JSON
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

## Construido con

* [Weka](https://www.cs.waikato.ac.nz/ml/weka/) - El framework de aprendizaje automático usado.
* [SpringBoot](https://spring.io/projects/spring-boot) - El framework usado para construir la API Rest.
* [Maven](https://maven.apache.org/) - Inyección de dependencias.
* [AngularJS](https://angularjs.org/) - El framework utilizado para UI.
* [Bootstrap](https://getbootstrap.com/) - El framework CSS utilizado para UI.

