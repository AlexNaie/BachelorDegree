var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "/materieprima/add";

        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        }
        var data = {
            idMateriePrima: $scope.id,
            materiePrimaNume: $scope.nume
        };

        $http.post(url, data, config).then(function (response) {
            $scope.postResultMessage = response.data;
        }, function error(response) {
            $scope.postResultMessage = "Error with status: " +  response.statusText;
        });

        $scope.id = "";
        $scope.nume = "";
    }
});