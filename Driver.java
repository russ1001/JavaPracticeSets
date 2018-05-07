import java.util.Scanner;

// Driver class for testing.
public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = scan.nextInt();

		System.out.print("Enter height: ");
		int height = scan.nextInt();

		// create world object.
		World world = new World(width, height);

		// used to calculate score by avoiding falling rocks.
		int score = 0;

		loop: while(true){

			world.displayWorld();

			System.out.println("\nEnter an Action (left/ right/ up/ down/ exit):");
			String action = scan.next();

			// To handle actions inputed by user.
			switch(action){
			case "left":
				world.moveLeft();
				break;
			case "right":
				world.moveRight();
				break;
			case "up":
				world.moveUp();
				break;
			case "down":
				world.moveDown();
				break;
			case "exit":
				break loop;
			default:
				System.out.println("Not a valid Action");
				continue;

			}

			// handle falling rock mechanism
			if(world.fallingRock()){ // rue player got crushed.
				System.out.println("Character was crushed by a rock.");
				System.out.println("Score: "+score);
				break loop;
			}else{
				// player is save increase score.
				score += 1;
			}
		}
	}
}