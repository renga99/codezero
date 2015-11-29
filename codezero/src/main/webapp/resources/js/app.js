'use strict';

var CodezeroApp = {};

var App = angular.module('CodezeroApp', ['CodezeroApp.filters', 'CodezeroApp.services', 'CodezeroApp.directives']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: 'index',
        controller: HomeController
    });
    
    $routeProvider.otherwise({redirectTo: '/'});
}]);
