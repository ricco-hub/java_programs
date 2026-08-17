import java.awt.*;

/**
 * Write a description of class ColorChangingBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColorChangingBall extends Ball
{
    public ColorChangingBall()
    {
        xStep = 10;
        yStep = 10;
    }

    public ColorChangingBall(int x, int y)
    {
        super(x + 10, y + 10, Color.green);
    }

    public ColorChangingBall(int x, int y, int d, int xMove, int yMove)
    {
        super(x + 10, y + 10, d, xMove, yMove, Color.green);
    }

    public void move(int width, int height)
    {
        super.move(width, height);
        Color RGB = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        if(xLoc <= 0 || xLoc >= width - diameter)
            setColor(RGB);
        if(yLoc <= 0 || yLoc >= height - diameter)
            setColor(RGB);
    }
}