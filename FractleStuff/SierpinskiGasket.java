import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.*;

public class SierpinskiGasket extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;


/*
   //x is accross and y is down
   point 1 - Right  A
   point 2 - Left   B
   point 3 - Top    C
   point 4 draws back to point 1 to complete triangle

    private int[] xPos = {360, 40, 200, 360};
    private int[] yPos = {300, 300, 20, 300};
*/
    private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    int bicect;


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public SierpinskiGasket()
    {
        
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawCircle method.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
       
        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);
       
    }

  
//find midpoint of each smaller triangle to make as points of smaller triangle

   /** Draws a triangle  in the middle of the 3 x,y points provided
        finds the midpoints of triangles line segments
        uses midpoint to draw a triangle inside of the points provided

   @param array of 4 points a -> b -> c -> a

   */
/*
   //x is accross and y is down
   point 1 - Right  A
   point 2 - Left   B
   point 3 - Top    C
   point 4 draws back to point 1 to complete triangle

    private int[] xPos = {360, 40, 200, 360};
    private int[] yPos = {300, 300, 20, 300};
*/
   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       int dxsquared = (int)Math.pow(xPos[0] - xPos[1],2);
       int dysquared = (int)Math.pow(yPos[0] - yPos[1],2);
       int distance = (int)Math.sqrt(dxsquared + dysquared);

         page.setColor (Color.red);

        if (distance > 10)
        {
            //find midpoints and draw triangle
            //int ABMidx = (xPos[0]
            //int ABMidy = (
            
            
                        /*
               //x is accross and y is down
               point 1 - Right  A
               point 2 - Left   B
               point 3 - Top    C
               point 4 draws back to point 1 to complete triangle
            
                private int[] xPos = {360, 40, 200, 360};
                private int[] yPos = {300, 300, 20, 300};
            */
            
           int ABMidX = (xPos[0]+xPos[1])/2;
           int ACMidX = (xPos[0] + xPos[2])/2;
           int BCMidX = (xPos[2] + xPos[1])/2;
           
           int ABMidY = (yPos[0] + yPos[1])/2;
           int ACMidY = (yPos[0] + yPos[2])/2;
           int BCMidY = (yPos[1] + yPos[2])/2;
           //what
           xPos[0] = xPos[1];//ABMidX;
           xPos[1] = BCMidX;
           //xPos[2] = BCMidX;
           //xPos[3] = ABMidX;
           
           yPos[0] = yPos[1];//ABMidY;
           yPos[1] = BCMidY;
           //yPos[2] = BCMidY;
           //yPos[3] = ABMidY;
           page.drawPolyline (xPos, yPos, xPos.length);
           
           xPos[0] = ABMidX;
           yPos[0] = ABMidY;
           xPos[1] = BCMidX;
           yPos[1] = BCMidY;
           
           page.drawPolyline (xPos, yPos, xPos.length);
           
           int [] leftTriangleXPos = {ABMidX, xPos[1], BCMidX, ABMidX};
           int [] leftTriangleYPos = {ABMidY, yPos[1], BCMidY, ABMidY};
           
           
           
           //Triangle(leftTriangleXPos, leftTriangleYPos, page);
           //int [] rightTriangleXPos = {ACMidX, xPos[0], BCMidX, ACMidX};
           //int [] rightTriangleYPos = {ACMidY, yPos[0], BCMidY, ACMidY};
           
           //Triangle(rightTriangleXPos, rightTriangleYPos, page);
           
           //xPos[0] = ABMidX;
        
           
           //ABMidX = (xPos[0]+xPos[1])/2;
           //ACMidX = (xPos[0] + xPos[2])/2;
          // BCMidX = (xPos[2] + xPos[1])/2;
           
          // ABMidY = (yPos[0] + yPos[1])/2;
          // ACMidY = (yPos[0] + yPos[2])/2;
           //BCMidY = (yPos[1] + yPos[2])/2;
           
           
           
           
           

            //Triangle(xPos, yPos, page);
           
        /**
         * 
         */

            
            //page.drawTriangle();
           
            //Triangle(xPos, yPos, page);
            //Triangle(xPos, yPos, page);
            //Triangle(xPos, yPos, page);
        /**
         * 
            
            for (int i = 0; i < xPos.length-1;i++){
                xPos[i] = Math.abs((xPos[i] - xPos[i+1])/2);
                yPos[i] = Math.abs((yPos[i]-yPos[i+1])/2);
            
            }
            xPos[3] = xPos[0];
            yPos[3] = yPos[0];
            
         */           
            //call the 3 new triangles
            
           
        }
        

   }//end of Triangle
   
  

}
