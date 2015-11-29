'use strict';

var CarController = function($scope, $http) {

	$scope.getURL = function() {
        $http.get('home/getURL').success(function(urlName){
            $scope.currentUrl = urlName;
        });
    };
};