'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminInstructor', [
  'ngRoute',
  'adminInstructor.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Instructor.html', controller: 'InstructorCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
