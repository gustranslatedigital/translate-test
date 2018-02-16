package com.translate;

import spark.Filter;
import spark.Request;
import spark.Response;

/**
 *
 * @author brodynelson
 */
public class CorsFilter implements Filter {

    @Override
    public void handle(Request request, Response response) {
        response.header("Access-Control-Allow-Origin", "*");
        response.type("application/json");
    }
}
