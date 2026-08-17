import java.awt.*;
import javax.swing.*;

public class RunnerShowCardHands
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("showCardHands");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 550);
        jf.setVisible(true);
        
        
        Container c = jf.getContentPane();
        
        ShowCardHands sc = new ShowCardHands();
        jf.add(sc);
        
        
    }
}