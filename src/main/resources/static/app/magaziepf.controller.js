(function (){
    'use strict';

    angular
        .module('app', [])
        .controller('MagaziePFController', MagaziePFController);

    MagaziePFController.$inject = ['$http'];

    function MagaziePFController($http) {
        var vm = this;

        vm.magaziePF = [];
        vm.getAll = getAll;

        init();

        function init(){
            getAll();
        }

        function getAll() {
            var url = "/magaziepf/all";
            var magaziePFPromise = $http.get(url);
            magaziePFPromise.then(function (response) {
                vm.magaziePF = response.data;
            })
        }

    }

})();