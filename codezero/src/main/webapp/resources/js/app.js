//'use strict';
//
//var CodezeroApp = {};
//
//var App = angular.module('CodezeroApp', ['CodezeroApp.filters', 'CodezeroApp.services', 'CodezeroApp.directives']);
//
//// Declare app level module which depends on filters, and services
//App.config(['$routeProvider', function ($routeProvider) {
//    $routeProvider.when('/', {
//        templateUrl: 'index',
//        controller: HomeController
//    });
//    
//    $routeProvider.otherwise({redirectTo: '/'});
//}]);

'use strict';

var AngularSpringApp = {};

var App = angular.module('AngularSpringApp', ['AngularSpringApp.filters', 'AngularSpringApp.services', 'AngularSpringApp.directives','bsLoadingOverlay']);

// Declare app level module which depends on filters, and services
App.config(['$routeProvider', function ($routeProvider) {
    
    $routeProvider.when('/home', {
        templateUrl: 'home/layout',
        controller: 'HomeController'
    });

    $routeProvider.otherwise({redirectTo: '/home'});
}]);
