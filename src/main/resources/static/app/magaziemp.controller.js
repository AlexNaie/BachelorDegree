(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('MagazieMPController', MagazieMPController);

    MagazieMPController.$inject = ['$http'];

    function MagazieMPController($http) {
        var vm = this;

        vm.magazieMP = [];
        vm.getAll = getAll;

        init();

        function init(){
            getAll();
        }

        function getAll() {
            var url = "/magaziemp/all";
            var magazieMPPromise = $http.get(url);
            magazieMPPromise.then(function (response) {
                vm.magazieMP = response.data;
            })
        }
    }
})();
