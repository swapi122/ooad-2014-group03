package timeRead;
import java.awt.Color;
import java.util.Observable;

public class Model extends Observable {
	
	public int gio=0;
    public int phut=0;
    public int giay=0;
	//public final int BALL_SIZE = 20;
	//private int xPosition = 0;
	//private int yPosition = 0;
	private int xLimit, yLimit;
	//private int xDelta = 5;
	//private int yDelta = 5;
	String s="";
	//int i=0;
	public void setLimits(int xLimit, int yLimit) {
		this.xLimit = xLimit ;//- BALL_SIZE;
		this.yLimit = yLimit ;//- BALL_SIZE;
	}

	//public int getX() {
		//return xPosition;
	//}

	//public int getY() {
		//return yPosition;
	//}

	public void makeOneStep() {
		//if(i==1){
			//i=0;
		//}
		// Do the work
		//xPosition += xDelta;
		//if (xPosition < 0 || xPosition >= xLimit) {
			//xDelta = -xDelta;
			//xPosition += xDelta;

		//}
		//yPosition += yDelta;
		//if (yPosition < 0 || yPosition >= yLimit) {
			//yDelta = -yDelta;
			//yPosition += yDelta;


		//}
		// Notify observers
		if(giay<59)
        {
      	  giay=giay+1;  
        }
        else
        {
      	  giay=0;
      	  phut=phut+1;
      	  if(phut>59)
      	  {
      		  gio = gio +1;
      	  }
        }
        s=gio+":"+phut+":" + giay;
		setChanged();
		notifyObservers();
	}
}

