# CarPricePredictorML

CarPricePredictorML permet de pr�dire le prix de la voiture sur la base de l'algorithme "RandomTree". En tant que mod�le d'apprentissage, un exemple de mod�le d'apprentissage est fourni sur la base duquel le prix de la voiture est pr�dit avec les diff�rents attributs.

## Commencer

`CarPricePredictorML` est un projet bas� sur Spring Boot avec le support Maven. Il peut �tre construit avec les commandes suivantes:

`` `
$ mvn clean install
$ mvn spring-boot:run
`` `

## Lancer les tests
`` `
$ mvn clean test
`` `

## D�mo

#### UI
`CarPricePredictorML` est h�berg� sur un [serveur heroku] (https://carpricepredictor.herokuapp.com/) avec un exemple de fichier de mod�le d'apprentissage.

#### API
Pour utiliser l'API de `CarPricePredictorML`, l'URL, l'en-t�te et le corps JSON suivants peuvent �tre utilis�s:

* URL de demande
`` `
[POST] http://carpricepredictor.herokuapp.com/v1/cars
`` `
* Ent�te
`` `
Type de contenu: application / json
`` `
* Corps
`` `
{
����"kilometers": 2500,
����"owner": 2,
����"rcType": "INDIVIDUAL",
����"engineType": "PETROL",
����"transmissionType": "MANUAL",
����"registrationyear": "2000",
����"city": "Bangalore",
����"modelType": "LXI"
}
`` `

# Auteurs
* ** Harikrushna Vanpariya **

## Construit avec

* [Weka] (https://www.cs.waikato.ac.nz/ml/weka/) - Le cadre d�apprentissage automatique utilis�.
* [SpringBoot] (https://spring.io/projects/spring-boot) - La structure de l'API Rest utilis�e.
* [Maven] (https://maven.apache.org/) - Gestion des d�pendances.
* [AngularJS] (https://angularjs.org/) - Le cadre d'interface utilisateur utilis�.
* [Bootstrap] (https://getbootstrap.com/) - Le cadre d'interface utilisateur utilis�.