package Maze;

public class Maze {
    public static void main(String[] args) {
        
        
    }
  
    private int collectCells(int row, int col) {
		
		if ((row < 0) || (row >= slideData.length) || (col < 0) || (col >= slideData[0].length)
				|| (slideData[row][col] != COLONY)) {
			return(0);
		} else {
   			slideData[row][col] = NON_COLONY;
   			return(1+
					collectCells(row+1, col)+
					collectCells(row-1, col)+
					collectCells(row, col+1)+
					collectCells(row, col-1));			
		}
	}

    private void findPath(int row, int col) {

    }
    
  }


