/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run(){
	turnLeft();
	threeTimesNewBeeper();
	move();
	turnRight();
	fourTimesMove();
	turnRight();
	newBeeper();
	move();
	newBeeper();
	move();
	turnLeft();
	fourTimesMove();
	turnLeft();
	twoTimesNewBeeper();
	move();
	newBeeper();
	turnRight();
	fourTimesMove();
	turnRight();
	move();
	newBeeper();
	move();
	newBeeper();
	turnLeft();
	
	}
	

	private void newBeeper() {
		// TODO Auto-generated method stub
		putBeeper();
		move();
		
	}
	private void fourTimesMove() {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			move();
		}
		
	}
	
	private void threeTimesNewBeeper() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
			newBeeper();
		}
		
	}
	
	private void twoTimesNewBeeper() {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++){
			newBeeper();
		}
		
	}
	
}


