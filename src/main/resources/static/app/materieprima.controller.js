(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('MateriePrimaController', MateriePrimaController);

    MateriePrimaController.$inject = ['$http'];

    function MateriePrimaController($http) {
        var vm = this;

        vm.materiePrima = [];
        vm.getAll = getAll;

        init();

            function init(){
                getAll();
            }

            function getAll() {
                var url = "/materieprima/all";
                var materiePrimaPromise = $http.get(url);
                materiePrimaPromise.then(function (response) {
                    vm.materiePrima = response.data;
                })
            }

    }

});