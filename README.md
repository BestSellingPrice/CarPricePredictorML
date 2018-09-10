# CarPricePredictorML

CarPricePredictorML helps to predict the price of the car based on the "RandomTree" Algorithm. As learning mpdel a sample learning model is provided based on which the car price is predicted with the different attributes.

## Getting Started

`CarPricePredictorML` is a Spring boot based project with Maven support. It can be built with the following commands :

```
$ mvn clean install
$ mvn spring-boot:run
```

Request URL :

http://carpricepredictor.herokuapp.com/v1/cars (POST)

Header:
Content-Type:application/json

Body:

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
