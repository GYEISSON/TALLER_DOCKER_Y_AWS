package edu.escuelaing.arep;
import static spark.Spark.*;

import spark.Request;
import spark.Response;

/**
 * 
 *
 */
public class SparkWebServer {
    
    public static void main( String[] args )
    {

        System.out.println( "Hello Docker!" );
        port(getPort());
        get("/word", (req, res) -> inputDataPage(req, res));
        

    }
    private static String inputDataPage(Request req, Response res)  {
    	String word = req.queryParams("lugar");
    	
        return lugar;
    }
    

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
    
}