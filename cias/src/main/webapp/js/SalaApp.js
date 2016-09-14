'use strict';


// Declare app level module which depends on filters, and services
var module = angular.module('adminSala', [
    'ngRoute',
    'adminSala.controllers'
]);
module.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/Sala.html', controller: 'SalaCtrl'});
        $routeProvider.otherwise({redirectTo: '/'});
    }]);
