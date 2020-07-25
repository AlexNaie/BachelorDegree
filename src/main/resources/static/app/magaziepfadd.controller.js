var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "/magaziepf/add";

        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        }
        var data = {
            idMagaziePF: $scope.id,
            magaziePFDataProd: $scope.dataprod,
            magaziePFIdLot: $scope.idlot,
            magaziePFIdProdus: $scope.idprodus,
            magaziePFIdReteta: $scope.idreteta

        };

        $http.post(url, data, config).then(function (response) {
            $scope.postResultMessage = response.data;
        }, function error(response) {
            $scope.postResultMessage = "Error with status: " +  response.statusText;
        });

        $scope.id = "";
        $scope.dataprod = "";
        $scope.idlot = "";
        $scope.idprodus = "";
        $scope.idreteta = "";
    }
});