public class Values
{
    static int whitePoints = 0;
    static int blackPoints = 0;

    public static int whitePoints()
    {
        return whitePoints;
    }

    public static int blackPoints()
    {
        return blackPoints;
    }
    
    public static void resetWhite()
    {
        whitePoints = 0;
    }
    
    public static void resetBlack()
    {
        blackPoints = 0;
    }

    public static void whitePawnPoints()
    {
       whitePoints++;
    }

    public static void whiteBishopPoints()
    {
        whitePoints+=3;
    }

    public static void whiteKnightPoints()
    {
        whitePoints+=3;
    }

    public static void whiteRookPoints()
    {
        whitePoints+=5;
    }

    public static void whiteQueenPoints()
    {
        whitePoints+=9;
    }

    public static void blackPawnPoints()
    {
        blackPoints++;
    }

    public static void blackBishopPoints()
    {
        blackPoints+=3;
    }

    public static void blackKnightPoints()
    {
        blackPoints+=3;
    }

    public static void blackRookPoints()
    {
        blackPoints+=5;
    }

    public static void blackQueenPoints()
    {
        blackPoints+=9;
    }
}
