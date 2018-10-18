[Read me](https://github.com/BestSellingPrice/CarPricePredictorML/blob/master/README.md) | [Lis moi](https://github.com/BestSellingPrice/CarPricePredictorML/blob/master/README-fr.md) | [Leeme](https://github.com/BestSellingPrice/CarPricePredictorML/blob/master/Spanish-README.md)

____
# CarPricePredictorML

CarPricePredictorML helps to predict the price of the car based on the "RandomTree" Algorithm. As learning model a sample learning model is provided based on which the car price is predicted with the different attributes.

## Getting Started

`CarPricePredictorML` is a Spring Boot based project with Maven support. It can be built with the following commands :

```
$ mvn clean install
$ mvn spring-boot:run
```

## Running the tests
```
$ mvn clean test
```

## Demo

#### UI
`CarPricePredictorML` is hosted on a [heroku server](https://carpricepredictor.herokuapp.com/) with a sample learning model file.

#### API
To use the API of `CarPricePredictorML`, the following URL, Header and JSON body can be used:

* Request URL
```
[POST] http://carpricepredictor.herokuapp.com/v1/cars 
```
* Header
```
Content-Type:application/json
```
* Body
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

# Authors
* **Harikrushna Vanpariya** 

## Built With

* [Weka](https://www.cs.waikato.ac.nz/ml/weka/) - The Machine Learning framework used.
* [SpringBoot](https://spring.io/projects/spring-boot) - The Rest API framework used.
* [Maven](https://maven.apache.org/) - Dependency Management.
* [AngularJS](https://angularjs.org/) - The UI framework used.
* [Bootstrap](https://getbootstrap.com/) - The UI framework used.
