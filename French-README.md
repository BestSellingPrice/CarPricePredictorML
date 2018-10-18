# CarPricePredictorML

CarPricePredictorML permet de prédire le prix de la voiture sur la base de l'algorithme "RandomTree". En tant que modèle d'apprentissage, un exemple de modèle d'apprentissage est fourni sur la base duquel le prix de la voiture est prédit avec les différents attributs.

## Commencer

`CarPricePredictorML` est un projet basé sur Spring Boot avec le support Maven. Il peut être construit avec les commandes suivantes:

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
`CarPricePredictorML` est hébergé sur un [serveur heroku](https://carpricepredictor.herokuapp.com/) avec un exemple de fichier de modèle d'apprentissage.

#### API
Utiliser l'API de `CarPricePredictorML`, l'URL, l'en-tête et le corps JSON suivants peuvent être utilisés:

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

## Construit avec

* [Weka](https://www.cs.waikato.ac.nz/ml/weka/) - Le cadre d'apprentissage automatique utilisé.
* [SpringBoot](https://spring.io/projects/spring-boot) - La structure de l'API Rest utilisée.
* [Maven](https://maven.apache.org/) - Gestion des dépendances.
* [AngularJS](https://angularjs.org/) - Le framework d'interface utilisateur utilisé.
* [Bootstrap](https://getbootstrap.com/) - Le framework d'interface utilisateur utilisé.


