package demo.jfrogwork;


import demo.jfrogwork.commons.JsonToXMLConverter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	String json = "{\"name\": \"keesh\"}";

    	String result = null;


        try {
        	result = new JsonToXMLConverter().convertJsonToXml(json);
        } catch (IOException e) {
          e.printStackTrace();
        }

        System.out.println( "Hello World!" );
        System.out.println(result);
    }
}
