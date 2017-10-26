package io.enemyofthestate.jettyjdbcexample;

import org.httpobjects.HttpObject;
import org.httpobjects.Request;
import org.httpobjects.Response;

public class Main {

    void main(String[] args) {

        int port = 8080;

        HttpObject rootResource = new HttpObject("/") {

            public Response delete(Request req) {
                return null;
            }

            public Response get(Request req){
                return null;
            }

            public Response head(Request req){
                return null;
            }

            public Response options(Request req){
                return null;
            }

            public Response post(Request req){
                return null;
            }

            public Response put(Request req){
                return null;
            }

            public Response trace(Request req){
                return null;
            }

            public Response patch(Request req){
                return null;
            }
        };

        HttpObject starWarsResource = new HttpObject("/starwars") {

            public Response delete(Request req) {
                return null;
            }

            public Response get(Request req){
                return null;
            }

            public Response head(Request req){
                return null;
            }

            public Response options(Request req){
                return null;
            }

            public Response post(Request req){
                return null;
            }

            public Response put(Request req){
                return null;
            }

            public Response trace(Request req){
                return null;
            }

            public Response patch(Request req){
                return null;
            }
        };

        System.out.println("Starting server on port " + port);
    }
}
