(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('LotController', LotController);

    LotController.$inject = ['$http'];

    function LotController($http) {
        var vm = this;

        vm.lot = [];
        vm.getAll = getAll;

        init();

        function init(){
            getAll();
        }

        function getAll() {
            var url = "/lot/all";
            var lotPromise = $http.get(url);
            lotPromise.then(function (response) {
                vm.lot = response.data;
            })
        }

    }

})();
