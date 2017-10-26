package io.enemyofthestate.jettyjdbcexample;

import org.httpobjects.HttpObject;
import org.httpobjects.Request;
import org.httpobjects.Response;
import org.httpobjects.jetty.HttpObjectsJettyHandler;

import static org.httpobjects.util.Method.GET;

public class Main {

    void main(String[] args) {

        int port = 8080;

        HttpObject rootResource = new HttpObject("/") {

            public Response delete(Request req) {
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response get(Request req){
                return OK(Text("Hello, World!"));
            }

            public Response head(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response options(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response post(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response put(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response trace(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response patch(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }
        };

        HttpObject starWarsResource = new HttpObject("/starwars") {

            public Response delete(Request req) {
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response get(Request req){
                return null;
            }

            public Response head(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response options(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response post(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response put(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response trace(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }

            public Response patch(Request req){
                return METHOD_NOT_ALLOWED(GET);
            }
        };

        System.out.println("Starting server on port " + port);
        HttpObjectsJettyHandler.launchServer(port, rootResource, starWarsResource);
    }
}
