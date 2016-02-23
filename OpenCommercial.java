

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

public class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    String newLine = "http://www.".concat(inputLine).concat(".com");
    
    URL u = new URL(newLine);
    InputStream ins = u.openStream();
    InputStreamReader isr = new InputStreamReader (ins);
    BufferedReader yourSite = new BufferedReader (isr);
    String st1 = yourSite.readLine();
    String st2 = yourSite.readLine();
    String st3 = yourSite.readLine();
    String st4 = yourSite.readLine();
    String st5 = yourSite.readLine();
    System.out.println(st5);
    System.out.println(st4);
    System.out.println(st3);
    System.out.println(st2);
    System.out.println(st1);
    /*int size=5;
    String outputLines[];
    outputLines = new String[size];
    for(int i=0;i<size;i++)
    {
    	 outputLines[i]=yourSite.readLine();
    }
    for(int i=size-1;i>=0;i--) 
    {
        System.out.println(outputLines[i]);
    }*/
    

    /* Replace this comment with your solution.  */

  }
  
  	
  	
}