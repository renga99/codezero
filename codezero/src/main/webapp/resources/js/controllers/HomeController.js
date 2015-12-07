'use strict';

var HomeController = function($scope, $http) {
	
	$scope.wp = {};

    $scope.getWebpage = function() {
        $http.get('home/webPage').success(function(urlName){
            $scope.currentWebpage = urlName;
        });
    };

    $scope.addWebpage = function(wp) {

        $http.post('home/addWebpage', wp).success(function() {
            $scope.getWebpage();
            $scope.wp.urlName = '';
            $scope.wp.cii = '';
            $scope.wp.db = '';
        });
    };
    
      
    $scope.getWebpage();
};

