'use strict';


// Declare app level module which depends on filters, and services
var module = angular.module('adminVinculacion', [
    'ngRoute',
    'adminVinculacion.controllers'
]);
module.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/Vinculacion.html', controller: 'VinculacionCtrl'});
        $routeProvider.otherwise({redirectTo: '/'});
    }]);
