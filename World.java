public class World {

	// data feilds
	private char[][] world;
	private int characterRow, characterColumn;

	// Constructor as defined.
	public World(int width, int height) {
		world = new char[width][height];

		for(int i=0; i<world.length; i++){
			for(int j=0; j<world[0].length; j++){
				world[i][j] = '-';
			}
		}

		characterRow = 0;
		characterColumn = 0;
	}

	// Functions
	public void moveUp(){

		// if allowed to go top i.e not at top row or above position has no rock then can go up.
		if(characterRow>0 && world[characterRow-1][characterColumn] !='#'){
			characterRow -= 1;
		}   
	}

	public void moveDown(){

		// similar to above.
		if(characterRow<world.length-1 && world[characterRow+1][characterColumn] !='#'){
			characterRow += 1;
		}   
	}

	public void moveLeft(){

		if(characterColumn>0 && world[characterRow][characterColumn-1] !='#'){
			characterColumn -= 1;
		}   
	}

	public void moveRight(){

		if(characterColumn<world[0].length-1 && world[characterRow][characterColumn+1] !='#'){
			characterColumn += 1;
		}   
	}

	// function to dsplay world
	public void displayWorld(){

		// loop over 2D array.
		for(int i=0; i<world.length; i++){
			for(int j=0; j<world[0].length; j++){

				// if position of character matches print p else -/#.
				if(i==characterRow && j==characterColumn){
					System.out.print("P");
				}else{
					System.out.print(world[i][j]);
				}
			}
			System.out.println("");
		}
	}

	// Function create a rock: if player crushed return true else false;
	public boolean fallingRock(){

		// randomly calculate on which row-col rock will fall
		int row = (int)(Math.random()*world.length);
		int col = (int)(Math.random()*world[0].length);

		// if rock falls at current player position player is crushed return true;
		if(row == characterRow && col == characterColumn){
			return true;
		}else{

			// If position does not have rock then place # else recursively cal fallingRock() to get new position.
			if(world[row][col] == '-'){
				world[row][col] = '#';
				return false;
			}else{
				return fallingRock();
			}
		}
	}
}