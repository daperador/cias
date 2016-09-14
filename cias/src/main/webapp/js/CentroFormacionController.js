'use strict';

/* Controllers */
var module = angular.module('adminCentroFormacion.controllers', []);

module.controller('CentroFormacionCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = {};
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/CentroFormacion', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarEntidadAutorizadora=function(){
            $http.get('./webresources/EntidadAutorizadora', {})
                .success(function (data, status, headers, config) {
                    $scope.listaEntidadAutorizadora = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de entidadAutorizadora, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarEntidadAutorizadora();
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
        $http.post('./webresources/CentroFormacion', JSON.stringify($scope.datosFormulario), {}
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
            $http.delete('./webresources/CentroFormacion/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de CentroFormacion, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
