'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminCurso', [
  'ngRoute',
  'adminCurso.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Curso.html', controller: 'CursoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
