'use strict'
var module = angular.module('demo.controllers', []);

module.controller("UserController", ["$scope", "UserService",
    function($scope, UserService) {
        $scope.userDto = {
            userId: null,
            userName: null,
            skillDtos: []
        };
        $scope.carDto = {
            kilometers: 1000,
            owner: 1,
            rcType: "INDIVIDUAL",
            engineType:"PETROL",
            transmissionType: "MANUAL",
            registrationyear: 2010
        };
        $scope.skills = [];
        UserService.getUserById(1).then(function(value) {
            console.log(value.data);
        }, function(reason) {
            console.log("error occured");
        }, function(value) {
            console.log("no callback");
        });
        $scope.saveUser = function() {
            var newcarDto =UserService.predictCar($scope.carDto).then(function(value){
                    console.log(value.data);
                    $scope.carDto = value.data;
            });
        }
    }
]);