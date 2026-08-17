import java.awt.*;
import javax.swing.*;

public class MainClass
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("Bouncing Ball");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.setVisible(true);
        
        
        Container c = jf.getContentPane();
        Screen s = new Screen(c.getWidth(), c.getHeight());
        jf.add(s);
        
        
    }
}
