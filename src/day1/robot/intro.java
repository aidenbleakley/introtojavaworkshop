package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class intro {
public static void main(String[] args) {
	Robot manbot=new Robot();
Robot
	manbot.setRandomPenColor();
	manbot.penDown();
	manbot.setPenWidth(1000);
	manbot.move(100);
manbot.turn(1000);
manbot.move(100);
manbot.turn(90);
manbot.move(100);
manbot.turn(270);
manbot.move(100);
manbot.turn(90);
manbot.move(100);
manbot.turn(270);
manbot.move(100);
}
}