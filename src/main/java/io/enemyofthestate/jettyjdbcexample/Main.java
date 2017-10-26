package io.enemyofthestate.jettyjdbcexample;

import org.httpobjects.HttpObject;
import org.httpobjects.Request;
import org.httpobjects.Response;
import org.httpobjects.jetty.HttpObjectsJettyHandler;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        int port = 8080;

        HttpObject rootResource = new HttpObject("/") {

            public Response get(Request req) {
                return OK(Text("Hello, World!"));
            }
        };

        HttpObject starWarsResource = new HttpObject("/starwars") {

            public Response get(Request req) {

                try {
                    Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
                    PreparedStatement prep = conn.prepareStatement("SELECT * FROM characters");
                    ResultSet rs = prep.executeQuery();
                    StringBuilder sb = new StringBuilder();
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        sb.append("id: ");
                        sb.append(id);
                        sb.append(", name: ");
                        sb.append(name);
                        sb.append("\n");
                    }
                    String results = sb.toString();
                    return OK(Text(results));
                } catch(Throwable err) {
                    throw new RuntimeException(err);
                }
            }
        };

        System.out.println("Starting server on port " + port);
        HttpObjectsJettyHandler.launchServer(port, rootResource, starWarsResource);
    }
}
