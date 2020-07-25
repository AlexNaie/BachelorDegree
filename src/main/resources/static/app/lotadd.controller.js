var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "/lot/add";

        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        }
        var data = {
            idLot: $scope.id,
            lotCantitate: $scope.cantitate,
            lotIdProdus: $scope.idprodus,
            lotIdReteta: $scope.idreteta

        };

        $http.post(url, data, config).then(function (response) {
            $scope.postResultMessage = response.data;
        }, function error(response) {
            $scope.postResultMessage = "Error with status: " +  response.statusText;
        });

        $scope.id = "";
        $scope.cantitate = "";
        $scope.idprodus = "";
        $scope.idreteta = "";
    }
});