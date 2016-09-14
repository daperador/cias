'use strict';

/* Controllers */
var module = angular.module('adminInstructor.controllers', []);

module.controller('InstructorCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = {};
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Instructor', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarCertificacion=function(){
            $http.get('./webresources/Certificacion', {})
                .success(function (data, status, headers, config) {
                    $scope.listaCertificacion = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de certificacion, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarCertificacion();
            $scope.listarPersonaNatural=function(){
            $http.get('./webresources/PersonaNatural', {})
                .success(function (data, status, headers, config) {
                    $scope.listaPersonaNatural = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de personaNatural, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarPersonaNatural();
            $scope.listarVinculacion=function(){
            $http.get('./webresources/Vinculacion', {})
                .success(function (data, status, headers, config) {
                    $scope.listaVinculacion = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de vinculacion, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarVinculacion();
            $scope.listarEmpresa=function(){
            $http.get('./webresources/Empresa', {})
                .success(function (data, status, headers, config) {
                    $scope.listaEmpresa = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de empresa, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarEmpresa();
        

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Instructor', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('�Desea elminar este registro?')) {    
            $http.delete('./webresources/Instructor/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Instructor, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
