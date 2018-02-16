/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.translate;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author brodynelson
 */



public class CorsOptionsController implements Route  {

    @Override
    public Object handle(Request request, Response response) {
        
        String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
        if (accessControlRequestHeaders != null) {
            response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
        }
        String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
        if (accessControlRequestMethod != null) {
            response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
        }
        
        // cache 10 mins - max in webkit 
        response.header("Access-Control-Max-Age", "600");
        
        return "OK";
        
    }
    
}