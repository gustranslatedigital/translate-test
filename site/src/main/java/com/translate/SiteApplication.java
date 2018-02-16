package com.translate;

import com.google.common.net.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Spark;
import spark.servlet.SparkApplication;
import spark.servlet.SparkFilter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import java.io.IOException;
import java.io.InputStream;

import static spark.Spark.*;

public class SiteApplication extends SparkFilter implements SparkApplication {

    private static final Logger log = LoggerFactory.getLogger(SiteApplication.class);

    @Override
    public void init() {

        options("/*", new CorsOptionsController());
        Spark.before(new CorsFilter());

        get("/*", ((request, response) -> {
            response.type(MediaType.HTML_UTF_8.toString());
            request.raw().getRequestDispatcher("/index.html").include(request.raw(), response.raw());
            return "";
        }));
    }
}