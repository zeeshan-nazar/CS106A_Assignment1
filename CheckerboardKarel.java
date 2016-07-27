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

	public void ourKarelIsMostRightSide(){

		if(noBeepersPresent()){
			turnLeft();
			move();
			turnLeft();
			putBeeper();

		}

		else{
			
			turnLeft();
			move();
			turnLeft();
			move();
			putBeeper();

		}

	}



	public void ourKarelIsMostleftSide(){

		if(noBeepersPresent()){

			turnRight();
			move();
			turnRight();
			putBeeper();

		}

		else{

			turnRight();
			move();
			turnRight();
			move();
			putBeeper();

		}

	}

	// You fill in this part
	public void run(){
		if(noBeepersPresent()){
			putBeeper();
		}

	while(frontIsClear()){

		puttingBeepersInRows();
		ourKarelIsMostRightSide();
		puttingBeepersInRows();
		ourKarelIsMostleftSide();

		}

	}
}
