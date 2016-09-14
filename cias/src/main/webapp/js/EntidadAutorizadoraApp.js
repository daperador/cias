'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminEntidadAutorizadora', [
  'ngRoute',
  'adminEntidadAutorizadora.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/EntidadAutorizadora.html', controller: 'EntidadAutorizadoraCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
