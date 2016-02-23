import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nuke {


	  /** Prompts the user for the name X of a company (a single string), opens
	   *  the Web site corresponding to www.X.com, and prints the first five lines
	   *  of the Web page in reverse order.
	   *  @param arg is not used.
	   *  @exception Exception thrown if there are any problems parsing the 
	   *             user's input or opening the connection.
	   */
	  public static void main(String[] arg) throws Exception {

	    BufferedReader keyboard;

	    keyboard = new BufferedReader(new InputStreamReader(System.in));

	    System.out.print("Please enter the name of a company (without spaces): ");
	    System.out.flush();        /* Make sure the line is printed immediately. */
	    String inputLine = keyboard.readLine();
	    StringBuilder outputLine = new StringBuilder(inputLine);
	    String output = outputLine.deleteCharAt(1).toString();
	    System.out.println(output);
	  }
	   
}