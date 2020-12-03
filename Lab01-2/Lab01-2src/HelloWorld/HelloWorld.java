/* HelloWorld.java
 * Created on 2004. 8. 5.
 */

/**
 * Add one sentence class summary here Add class description here
 * 
 * @author jhan
 * @version 1.0, 2004. 8. 5.
 */
public class HelloWorld {

  public static void main(String[] args) {
    
    String msg = "From " + System.getProperty("user.name") + ": ";    
    System.out.print(msg + "Hello, world!");

  }
}