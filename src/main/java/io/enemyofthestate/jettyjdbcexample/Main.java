package io.enemyofthestate.jettyjdbcexample;

import org.httpobjects.HttpObject;
import org.httpobjects.Request;
import org.httpobjects.Response;
import org.httpobjects.jetty.HttpObjectsJettyHandler;

import static org.httpobjects.util.Method.GET;

public class Main {

    public static void main(String[] args) {

        int port = 8080;

        HttpObject rootResource = new HttpObject("/") {

            public Response get(Request req){
                return OK(Text("Hello, World!"));
            }
        };

        HttpObject starWarsResource = new HttpObject("/starwars") {

            public Response get(Request req){
                throw new RuntimeException("Not yet implemented.");
            }
        };

        System.out.println("Starting server on port " + port);
        HttpObjectsJettyHandler.launchServer(port, rootResource, starWarsResource);
    }
}
