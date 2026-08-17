import java.awt.*;
/**
 * Write a description of class Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oval extends Ball
{
    public void paint(Graphics g)
    {
        g.setColor(ballColor);
        g.fillOval(xLoc, yLoc, diameter * 10, diameter * 5);
    }
}
