/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// You fill in this part
	private void goToDoor(){
		while(frontIsClear()){
			move();
		}
		
			turnRight();
			move();
			while(frontIsClear()){
				turnLeft();
				if(frontIsClear()){
					while(!beepersPresent()){
						move();
					}
					break;
				}
				
				else{
					turnRight();
					move();
				}
			}
		
	}
	
	private void collectNewsPeper(){
		
		pickBeeper();
		
	}
	
	private void turnBackHome(){
		turnAround();
		while(frontIsClear()){
		move();
		} 
		turnRight();
		while(frontIsClear()){
		move();
		}
		turnLeft();
		turnAround();
		
	}
public void run(){
		
		goToDoor();
		collectNewsPeper();
		turnBackHome();
	}

}
