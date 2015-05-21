/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function(){var migraniaReport= angular.module('migraniaReport',[]);

migraniaReport.directive('pacientesInfo', function(){
        return{
            restrict:'E',
            templateUrl:'pages/pacientes-info.html',
            controller: ['$http',function($http){
                var self=this;
                self.pacientes=[];
                    $http.get('URL del Servicio').success(function(data){
                        self.pacientes=data;
                    });
            }],
            controllerAs:'getPacientes'
        };
    });
    
    migraniaReport.directive('episodiosdolor', function(){
        return{
            restrict:'E',
            templateUrl:'partials/pacientes-info.html',
            controller: ['$http',function($http){
                var self=this;
                self.pacientes=[];
                    $http.get('URL del Servicio').success(function(data){
                        self.pacientes=data;
                    });
            }],
            controllerAs:'getPacientes'
        };
    });
    
        migraniaReport.directive('episodiosdolorfecha', function(){
        return{
            restrict:'E',
            templateUrl:'partials/pacientes-info.html',
            controller: ['$http',function($http){
                var self=this;
                self.pacientes=[];
                    $http.get('URL del Servicio').success(function(data){
                        self.pacientes=data;
                    });
            }],
            controllerAs:'getPacientes'
        };
    });
    
        migraniaReport.directive('episodiodetalle', function(){
        return{
            restrict:'E',
            templateUrl:'partials/pacientes-info.html',
            controller: ['$http',function($http){
                var self=this;
                self.pacientes=[];
                    $http.get('URL del Servicio').success(function(data){
                        self.pacientes=data;
                    });
            }],
            controllerAs:'getPacientes'
        };
    });
    
})();



