'use strict';


// Declare app level module which depends on filters, and services
var module = angular.module('adminCertificacion', [
    'ngRoute',
    'adminCertificacion.controllers'
]);
module.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/Certificacion.html', controller: 'CertificacionCtrl'});
        $routeProvider.otherwise({redirectTo: '/'});
    }]);
