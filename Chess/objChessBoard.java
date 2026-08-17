//8x8 chess board 
import java.awt.*;
import java.util.ArrayList;
public class objChessBoard extends Canvas
{
    protected objPaintInstruction currentInstruction = null;
    protected ArrayList PaintInstructions = new ArrayList<>();
       
    public void chessBoard()
    {
    }

    public void update(Graphics g)
    {
        paint(g);
    }

    public void paint(Graphics g)
    {
        //BORDER
        if(PaintInstructions.size() == 0)
        {
            g.setColor(new Color(0,0,0)); 
            g.drawLine(49,49,450,49); 
            g.drawLine(49,49,50,850); 
            g.drawLine(49,450,450,500); //South border
            g.drawLine(450,49,450,800); 

            currentInstruction = new objPaintInstruction(0,0,8);
            PaintInstructions.add(currentInstruction);
        }
        //MORE BORDER
        g.setColor(new Color(255,255,255));
        g.fillRect(50,450,450,50); //Paint over the current status text  

        for (int i = 0; i < PaintInstructions.size(); i++)
        {
            currentInstruction = (objPaintInstruction)PaintInstructions.get(i);
            int startRow = currentInstruction.getStartRow();
            int startColumn = currentInstruction.getStartColumn();
            int rowCells = currentInstruction.getRowCells();
            int columnCells = currentInstruction.getColumnCells();

            for (int row = startRow; row < (startRow + rowCells); row++)
            {
                for (int column = startColumn; column < (startColumn + columnCells); column++)
                {
                    drawTile(row, column, g);   //MOVES PIECES
                }
            }
        }

        drawExtra(g);   //TEXT
    }

    public void drawTile(int row, int column, Graphics g)
    {
        if ((row + 1) % 2 == 0)
        {
            if ((column + 1) % 2 == 0)
                g.setColor(new Color(255,255,255));
            else
                g.setColor(new Color(0,255,0)); 
        }
        else
        {
            if ((column + 1) % 2 == 0)
                g.setColor(new Color(0,255,0));
            else
                g.setColor(new Color(255,255,255));
        }
        g.fillRect((50 + (column * 50)), (50 + (row * 50)), 50, 50);    //SIZE OF BOARD        
    }

    protected void drawExtra(Graphics g)   //Any class extending the chess board can use this method to add extra things, like player pieces
    {
    }

    protected int findWhichTileSelected(int coor) 
    {
        for (int i = 0; i < 8; i++)
        {
            if ((coor >= (50 + (i * 50))) && (coor <= (100 + (i * 50))))
            {
                return i;
            }
        }
        return -1;
    }
} 