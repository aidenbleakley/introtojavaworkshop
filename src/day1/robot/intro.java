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
mush.setRandomPenColor();
	mush.penDown();
	mush.setSpeed(10);
	mush.move(500);
mush.turn(90);
mush.move(800);
mush.hide();
Robot dude=new Robot();
dude.setSpeed(10);
dude.setRandomPenColor();
dude.penDown();
dude.turn(180);
dude.move(400);
dude.turn(270);
}
}