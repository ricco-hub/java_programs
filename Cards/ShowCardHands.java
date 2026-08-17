import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;     //images
import java.io.*;           //reading from file


public class ShowCardHands extends JPanel implements ActionListener
{
    private Deck d;
    private CardHand hand1, hand2, hand3;
    
    public ShowCardHands()
    {
        JButton b = new JButton("next card");
        b.addActionListener(this);
        add(b);
        
        d = new Deck();
        d.shuffle();
        
        hand1 = new CardHand();
        hand2 = new CardHand();
        hand3 = new CardHand();
        
    }
        
    public void actionPerformed(ActionEvent ae)
    {
        Card nextCard = d.getNextCard();
        nextCard.turnOver();
        hand1.addCardToHand(nextCard);
        hand2.addCardInNumOrder(nextCard);
        hand3.addCardSuitThenNumOrder(nextCard);
        repaint();
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        int x = 50;
        for(Card c: hand1.getHand())
        {
            try{
                Image cardImage = ImageIO.read(new File( c.getImageFileName()));
                g.drawImage(cardImage, x, 50, 73, 97, this);
                x+=20;
            }catch(IOException e){}
        }
        
        x = 50;
        for(Card c: hand2.getHand())
        {
            try{
                Image cardImage = ImageIO.read(new File( c.getImageFileName()));
                g.drawImage(cardImage, x, 200, 73, 97, this);
                x+=20;
            }catch(IOException e){}
        }
        
        x = 50;
        for(Card c: hand3.getHand())
        {
           try{
                Image cardImage = ImageIO.read(new File( c.getImageFileName()));
                g.drawImage(cardImage, x, 350, 73, 97, this);
                x+=20;
            }catch(IOException e){}
        }
    }
        
    
    
    
    
    
    
    
    
    
    
    
    
}
