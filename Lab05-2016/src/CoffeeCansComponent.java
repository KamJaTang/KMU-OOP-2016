// Draw a top view of 24 soda cans, that is 24 circles,
// arranged in a 4 x 6 grid.

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class CoffeeCansComponent extends JComponent
{

   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      for(int row=0;row<4;row++){
    	  for(int col=0;col<6;col++){
    	      Ellipse2D.Double can = new Ellipse2D.Double(100*col, 100*row, 100, 100);
    	      g2.draw(can);
    	  }
      	}
      }
}