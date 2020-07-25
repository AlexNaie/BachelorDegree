(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('ProdusController', ProdusController);

    ProdusController.$inject = ['$http'];

    function ProdusController($http) {
        var vm = this;

        vm.lot = [];
        vm.getAll = getAll;

        init();

        function init(){
            getAll();
        }

        function getAll() {
            var url = "/produs/all";
            var produsPromise = $http.get(url);
            produsPromise.then(function (response) {
                vm.produs = response.data;
            })
        }

    }

})();
