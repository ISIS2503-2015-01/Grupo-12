/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
(function(){var migraniaReport= angular.module('migraniaReport',[]);

migraniaReport.directive('toolbar', function(){
        return{
            restrict:'E',
            templateUrl: 'partials/toolbar.html',
            controller:function(){
                this.tab=0;
                this.selectTab=function(setTab){
                    this.tab=setTab;
                };
                this.isSelected=function(tabParam){
                    return this.tab===tabParam;
                };
            },
            controllerAs:'toolbar'
        };
    });

migraniaReport.directive('pacientesInfo', function(){
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



