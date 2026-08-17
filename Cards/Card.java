
public class Card implements Comparable
{
    private Suit suit;
    private Face face;
    private String imageFileName;
    private boolean faceUp;
    
    public Card(Suit s, Face f)
    {
        suit = s;
        face = f;
        imageFileName = "cards/" + face.getFileLetter() +
            suit.getSuitFirstLetter() + ".gif";
        faceUp = false;
    }
    
    
    public boolean isFaceUp()
    {
        return faceUp;
    }
    
    public void turnOver()
    {
        faceUp = !faceUp;
    }
    
    public String getImageFileName()
    {
        if(faceUp)
            return imageFileName;
        else
            return "cardBack.jpg";
    }
    
    public String toString()
    {
        return face.toString() + " of " + suit.toString();
    }
    
    public Face getFace()
    {
        return face;
    }
    
    public Suit getSuit()
    {
        return suit;
    }
    
    public int getValue()
    {
        return face.getValue();
    }
    
    public int getRank()
    {
        return face.getRank();
    }
    
    public void setValue(int v)
    {
        face.setValue(v);
    }
    
    public void setRank(int r)
    {
        face.setRank(r);
    }
    
    //pre-condition obj is a Card object
    public int compareTo(Object obj)
    {
        Card other = (Card)obj;
        
        return this.getRank()- other.getRank();
    }
        
}
