package lab4;
import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO;
/**
 * Model: Contains all the state and logic
 * Does not contain anything about images or graphics, must ask view for that
 *
 * has methods to
 *  detect collision with boundaries
 * decide next direction
 * provide direction
 * provide location
 **/

public class Model
{
	int frameWidth;
	int frameHeight;
	int imgWidth;
	int imgHeight;
	int xloc = 0;
	int yloc = 0;
	int xIncr = 8;
	int yIncr = 2;
	Direction direction;
	    
	Model(int fwidth, int fheight, int iwidth, int iheight)
	{
		this.frameWidth = fwidth;
		this.frameHeight = fheight;
		this.imgWidth = iwidth;
		this.imgHeight = iheight;
		this.direction = Direction.SOUTHEAST;
	}

	//decides location and direction of the model
	//calculates collision with boundaries
	public void updateLocationAndDirection()
	{
		xloc += xIncr;
		yloc += yIncr;
		
		if(xloc + imgWidth >= frameWidth)
    	{
    		xIncr = -xIncr;
    		if(yIncr > 0) 
    		{
    			direction = Direction.SOUTHWEST;
    		}
    		if(yIncr < 0) 
    		{
    			direction = Direction.NORTHWEST;
    		}
    	}
		if(yloc + imgHeight >= frameHeight - 10)
    	{
    		yIncr = -yIncr;
    		if(xIncr > 0) 
    		{
    			direction = Direction.NORTHEAST;
    		}
    		if(xIncr < 0) 
    		{
    			direction = Direction.NORTHWEST;
    		}
    	}
		if(xloc <= -25)
    	{
    		xIncr = -xIncr;
    		if(yIncr > 0) 
    		{
    			direction = Direction.SOUTHEAST;
    		}
    		if(yIncr < 0) 
    		{
    			direction = Direction.NORTHEAST;
    		}
    	}
		if(yloc <= -15)
    	{
    		yIncr = -yIncr;
    		if(xIncr > 0) 
    		{
    			direction = Direction.SOUTHEAST;
    		}
    		if(xIncr < 0) 
    		{
    			direction = Direction.SOUTHWEST;
    		}
    	}
	}
	
	public int getX() 
	{
		return this.xloc;
	}
	public int getY() 
	{
		return this.yloc;
	}

	public Direction getDirect()
	{
		return this.direction;
	}
}
