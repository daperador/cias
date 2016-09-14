'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminCentroFormacion', [
  'ngRoute',
  'adminCentroFormacion.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/CentroFormacion.html', controller: 'CentroFormacionCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
