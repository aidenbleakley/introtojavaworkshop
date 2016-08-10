package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class intro {
public static void main(String[] args) {
	Robot manbot=new Robot("batman");
manbot.penDown();
	manbot.setRandomPenColor();
manbot.sparkle();
manbot.setSpeed(10);
manbot.move(500);
manbot.turn(270);
manbot.move(800);
manbot.hide();
	Robot mush=new Robot("vic");
mush.move(500);
mush.turn(90);


}
}