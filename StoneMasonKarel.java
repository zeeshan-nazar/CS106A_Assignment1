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
	
	
	private void presentColumn(){
		
		while (frontIsClear()){
			if (noBeepersPresent()){
				putBeeper();
			}
	   move();
	  }
	  if (noBeepersPresent()){
	   putBeeper();
	  }
	}
	
	public void jump4StepForNextColumn(){
		for(int column=0;column<4;column++){
			move();
		}
		
	}
	
	

	// You fill in this part
	public void run(){
		
		while(frontIsClear()){
			turnLeft();
			presentColumn();
			turnRight();
		jump4StepForNextColumn();
		turnRight();
		presentColumn();
		turnLeft();
		
		}
		
	}
	

}
