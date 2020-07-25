var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
    $scope.submitForm = function () {
        var url = "/magaziemp/add";

        var config = {
            headers: {
                'Accept': 'text/plain'
            }
        };
        var data = {
            idMagazieMP: $scope.id,
            magazieMPUnitMas: $scope.unitMas,
            magazieMPDataAchiz: $scope.dataAchiz,
            magazieMPFurnizor: $scope.furnizor,
            magazieMPDocAchiz: $scope.docAchiz,
            magazieMPIdMateriePrima: $scope.materiePrima,
            magazieMPUtilizat: $scope.utilizat,
            magazieMPCant: $scope.cant
        };


        $http.post(url, data, config).then(function (response) {
            console.log("ceva");
            $scope.postResultMessage = response.data;
        }, function error(response) {
            $scope.postResultMessage = "Error with status: " + response.statusText;
        });

        $scope.id = "";
        $scope.unitMas = "";
        $scope.dataAchiz = "";
        $scope.furnizor = "";
        $scope.docAchiz = "";
        $scope.idMateriePrima = "";
        $scope.utilizat = "";
        $scope.cant = "";

    };
});

