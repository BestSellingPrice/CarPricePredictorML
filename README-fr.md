# CarPricePredictorML

CarPricePredictorML aide à prédire le prix de la voiture en se basant sur l'algorithme "Random Tree". En tant que modèle d'apprentissage, un exemple de modèle d'apprentissage est fourni sur la base duquel le prix de la voiture est prédit avec les différents attributs.

## Commencer
 `CarPricePredictorML`  est un projet basé sur Spring Boot avec le support Maven. Il peut être construit avec les commandes suivantes:
```
$ mvn clean install
$ mvn spring-boot:run
```

## Lancer les tests
```
$ mvn clean test
```

## Démo

#### UI
`CarPricePredictorML` est hébergé sur un [heroku serveur](https://carpricepredictor.herokuapp.com/) avec un exemple de fichier de modèle d'apprentissage.

 #### API
Pour utiliser l'API de `CarPricePredictorML`, les URL, en-têtes et corps JSON suivants peuvent être utilisés:

* URL de demande
```
[POST] http://carpricepredictor.herokuapp.com/v1/cars 
```
* Entête
```
Content-Type:application/json
```
* Corps
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

# Auteurs
* **Harikrushna Vanpariya** 

## Construit avec des

* [Weka](https://www.cs.waikato.ac.nz/ml/weka/) - Le cadre d'apprentissage automatique utilisé.
* [SpringBoot](https://spring.io/projects/spring-boot) - La structure de l'API Rest utilisée.
* [Maven](https://maven.apache.org/) - Gestion de la dépendance.
* [AngularJS](https://angularjs.org/) - Le framework d'interface utilisateur utilisé.
* [Bootstrap](https://getbootstrap.com/) - Le framework d'interface utilisateur utilisé.
