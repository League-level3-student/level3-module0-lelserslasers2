package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
		Robot[] robos = new Robot[3];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robos.length; i++) {
			robos[i] = new Robot("mini");
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robos[i].moveTo(40 + 70*i, 250);
			robos[i].setSpeed(10);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		Random randy = new Random();
		boolean going = true;
		int winnerI = -1; 
		while (going){
		
		for (int i = 0; i < robos.length; i++) {
			for (int j = 0; j < randy.nextInt(50); j++) {
				robos[i].move(1);
				robos[i].turn(1);
				
				if (robos[i].getY() == 40 + 70*i && robos[i].getX() == 250) {
					going = false;
					winnerI = i + 1;
				}
			}
		}
		
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	System.out.println("ROBOT " + winnerI + " has WON (Index: " + (winnerI - 1) + ")");
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
