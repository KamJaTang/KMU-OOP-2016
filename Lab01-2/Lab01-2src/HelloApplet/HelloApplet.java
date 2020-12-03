import java.applet.Applet;
import java.awt.Graphics;

/* HelloApplet.java
 * Created on 2004. 8. 5.
 */

/**
 * Add one sentence class summary here Add class description here
 * 
 * @author jhan
 * @version 1.0, 2004. 8. 5.
 */
public class HelloApplet extends Applet {

  public void paint(Graphics g) {

    String msg = "Hello, world!";

    for (int i=0; i<3; i++){
      g.drawString(msg, 25, 13*(i+1));
    }
  }

}