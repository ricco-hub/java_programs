import java.awt.*;

public class Ball
{
    protected int xLoc, yLoc, diameter;
    protected int xStep, yStep;
    protected Color ballColor;
    
    public Ball()
    {
        xLoc = 0;
        yLoc = 0;
        diameter = 8;
        xStep = 5;
        yStep = 7;
        ballColor = Color.black;
    }
    
    public Ball(int x, int y, Color c)
    {
        xLoc = x;
        yLoc = y;
        diameter = 8;
        xStep = 5;
        yStep = 7;
        ballColor = c;
    }
    
  
    public Ball(int x, int y, int d, int xMove, int yMove, Color c)
    {
        xLoc = x;
        yLoc = y;
        diameter = d;
        xStep = xMove;
        yStep = yMove;
        ballColor = c;
    }
    
    public int getX()
    {
        return xLoc;
    }
    
    public int getY()
    {
        return yLoc;
    }
    
    public void setColor(Color c)
    {
        ballColor = c;
    }
    
    
    public void paint(Graphics g)
    {
        g.setColor(ballColor);
        g.fillOval(xLoc, yLoc, diameter, diameter);
    }
    
    public void move(int width, int height)
    {
        xLoc += xStep;
        yLoc += yStep;
        
        //bounce off left and right
        if(xLoc <= 0 || xLoc >= width - diameter)
            xStep = -xStep;
            
        //bounce off top and bottom
        if(yLoc <= 0 || yLoc >= height - diameter)
            yStep = - yStep;
    }
    
}
