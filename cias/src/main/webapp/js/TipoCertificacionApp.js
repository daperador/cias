'use strict';


// Declare app level module which depends on filters, and services
var module = angular.module('adminTipoCertificacion', [
    'ngRoute',
    'adminTipoCertificacion.controllers'
]);
module.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/TipoCertificacion.html', controller: 'TipoCertificacionCtrl'});
        $routeProvider.otherwise({redirectTo: '/'});
    }]);
