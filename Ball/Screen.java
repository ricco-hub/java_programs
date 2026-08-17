import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Screen extends JPanel implements ActionListener
{
    private Ball [] balls;
    private int width, height;

    public Screen(int w, int h)
    {
        width = w;
        height = h;
        balls = new Ball[4];
        balls[0] = new Oval();
        balls[2] = new ColorChangingBall(150, 150);
        balls[1] = new ColorChangingBall();
        balls[3] = new ColorChangingBall(300, 300, 10, 10, 7);
        Timer t = new Timer(30, this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae)
    {
        for(Ball b: balls)
            b.move(width, height);
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Ball b: balls)
            b.paint(g);   //calls on paint method from Ball class

    }

}
