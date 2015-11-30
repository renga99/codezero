'use strict';

var HomeController = function($scope, $http, bsLoadingOverlayService) {
	
	$scope.wp = {};

    $scope.getWebpage = function() {
    	$scope.showOverlay();
        $http.get('home/webPage').success(function(urlName){
            $scope.currentWebpage = urlName;
        });
        $scope.hideOverlay();
    };

    $scope.addWebpage = function(wp) {

        $http.post('home/addWebpage', wp).success(function() {
            $scope.getWebpage();
            $scope.wp.urlName = '';
            $scope.wp.cii = '';
            $scope.wp.db = '';
        });
    };
    
    $scope.showOverlay = function () {
        bsLoadingOverlayService.start();
      };

      $scope.hideOverlay = function () {
        bsLoadingOverlayService.stop();
      };
      
    $scope.getWebpage();
};

