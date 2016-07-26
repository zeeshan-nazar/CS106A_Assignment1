/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	public void puttingBeepersInRows(){

		while(frontIsClear()){

			move();

		if(frontIsClear()){

			move();
			putBeeper();

			}

		}

	}



	// You fill in this part
	public void run(){
		if(noBeepersPresent()){

			putBeeper();
		}
		
		while(true){
	while(frontIsClear()){

		puttingBeepersInRows();
		}
	turnLeft();
	move();
	turnLeft();
	putBeeper();
	while(frontIsClear()){

		puttingBeepersInRows();
		}
	turnRight();
	move();
	turnRight();
	putBeeper();
	while(frontIsClear()){

		puttingBeepersInRows();
			}
		}
	}

}
