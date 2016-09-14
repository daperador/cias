'use strict';

/* Controllers */
var module = angular.module('adminCurso.controllers', []);

module.controller('CursoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = {};
        $scope.datosFormulario = {};
        $scope.panelEditar = false;
        $scope.listar = function () {
            $http.get('./webresources/Curso', {})
                    .success(function (data, status, headers, config) {
                        $scope.lista = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
        };

        $scope.listarInstructor = function () {
            $http.get('./webresources/Instructor', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaInstructor = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de instructor, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarInstructor();
        $scope.listarSala = function () {
            $http.get('./webresources/Sala', {})
                    .success(function (data, status, headers, config) {
                        $scope.listaSala = data;
                    }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n de sala, por favor intente m\xe1s tarde');
            });
        };
        $scope.listarSala();


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
            $http.post('./webresources/Curso', JSON.stringify($scope.datosFormulario), {}
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
        $scope.eliminar = function (data) {
            if (confirm('�Desea elminar este registro?')) {
                $http.delete('./webresources/Curso/' + data.id, {})
                        .success(function (data, status, headers, config) {
                            $scope.listar();
                        }).error(function (data, status, headers, config) {
                    alert('Error al eliminar la informaci\xf3n de Curso, por favor intente m\xe1s tarde');
                });
            }
        };
    }]);
