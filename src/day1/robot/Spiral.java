
package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {
int a=0;
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot mush=new Robot();
		// 5. Set your robot's pen to the down position
mush.penDown();
		// 3. Set the robot to go at max speed (10)
mush.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for(int a=0;a<400;a++){
			// 7. Change the pen color to random
	mush.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	mush.move(5*a);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	mush.turn(360/7);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i
mush.setPenWidth(a);
	}
}
}