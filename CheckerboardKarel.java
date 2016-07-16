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

	// You fill in this part
	public void run(){
		
		int n1=8;
		int n2=8;
		
		
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				if(i%2==0)
				{
					if(frontIsClear())
					{
						if(j%2!=0)
						{
							putBeeper();
							move();
						}
						else
						{
							move();
						}
					}
					else
					{
						turnRight();
						move();
						turnRight();
					}
				}
				else
				{
					if(frontIsClear())
					{
						if(j%2!=0)
						{
							putBeeper();
							move();
						}
						else
						{
							move();
						}
					}
					else
					{
						turnLeft();
						move();
						turnLeft();
					}
					
				}
		}
	}
		
		
		/*for(int i=1; i<=n1;i++)
			for(int j=1;j<=n2;j++)
			{
				
				if(i%2!=0)
				{
					if(!frontIsClear())
					{
						turnLeft();
						move();
						putBeeper();
						turnLeft();
					}
					
					if(j%2==0)
					{
						move();
					}
					
					else{
						putBeeper();
						move();
					}
				}
				else{
					
					if(j%n2==0)
					{
						turnRight();
						move();
						putBeeper();
						
					}
					
					if(j%2!=0)
					{
						if(!frontIsClear())
						{
							turnRight();
							move();
							putBeeper();
							
						}
						else
						{
							move();
						}
					}
					
					else
					{
						putBeeper();
						move();
						
					}
					
					
				}
			}*/
		
	}
}
			

