package uv.mx.sistemasweb;

/**
 * Hello world!
 *
 */

import static spark.Spark.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/aprobado", (req, res) -> "Espero sacar un 10");
    }
}
