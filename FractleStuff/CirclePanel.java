import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.geom.*;

public class CirclePanel extends JPanel
{
    private final int PANEL_WIDTH = 400;
    private final int PANEL_HEIGHT = 400;

    private final double SQ = Math.sqrt(3.0) / 6;

    private final int TOPX = 200, TOPY = 20;
    private final int LEFTX = 60, LEFTY = 300;
    private final int RIGHTX = 340, RIGHTY = 300;

    private int current; //current order

    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public CirclePanel ()
    {
        
        setBackground (Color.white);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawCircle method.
    //-----------------------------------------------------------------
    @Override
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);

        page.setColor (Color.blue);

        drawCircle(300, 100, 500,page);
        
        
        
        
        
       
    }
    
    void drawCircle(int x, int y, float radius,Graphics page) {
        //recursive code here
        
      page.drawOval(x,y,(int)radius,(int)radius);

        radius *= .5;
        x +=radius/2;
        y += radius/2;
        
        if (radius > 10){
            if (x%2 == 0){
                page.setColor(Color.black);
            }else{
                page.setColor(Color.green);
            }
            drawCircle((int) x, y + (int)radius/2, radius, page);
            drawCircle((int) x, y - (int)radius/2, radius, page);
            
            drawCircle((int) (x + radius/2), y, radius, page);
            drawCircle((int) (x - radius/2), y, radius, page);
            
        }
        
    }//end of drawCircle

    
}
