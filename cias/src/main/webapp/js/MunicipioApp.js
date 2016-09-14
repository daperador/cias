'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminMunicipio', [
  'ngRoute',
  'adminMunicipio.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Municipio.html', controller: 'MunicipioCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
