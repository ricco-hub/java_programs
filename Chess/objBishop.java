//bishop = 3

public class objBishop extends Pieces
{
    static int count = 0;

    public void objBishop ()
    {
    }

    public boolean legalMove(int startRow, int startColumn, int desRow, int desColumn, int[][] playerMatrix)
    {
        if (startRow == desRow || startColumn == desColumn) //If moved straight
        {
            strErrorMsg = "Bishop can only move along diagonal lines";
            return false;            
        }
        else if(playerMatrix[desRow][desColumn] != playerMatrix[startRow][startColumn])
        {
            String [] args = {"Sound", "sound"};
            try{
                Sound.main(args);
            }catch(Exception ex)
            {
            }            
        }        
        return axisMove(startRow, startColumn, desRow, desColumn, playerMatrix, false);
    }
} 