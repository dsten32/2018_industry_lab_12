package ictgradschool.industry.bounce;

import java.awt.*;

/**
 * Class to represent a simple rectangle.
 * 
 * @author Ian Warren
 */
public class GemShape extends Shape {
	/**
	 * Default constructor that creates a RectangleShape instance whose instance
	 * variables are set to default values.
	 */
	public GemShape() {
		super();
	}

	/**
	 * Creates a RectangleShape instance with specified values for instance
	 * variables.
	 * @param x x position.
	 * @param y y position.
	 * @param deltaX speed and direction for horizontal axis.
	 * @param deltaY speed and direction for vertical axis.
	 */
	public GemShape(int x, int y, int deltaX, int deltaY) {
		super(x,y,deltaX,deltaY);
	}

	/**
	 * Creates a RectangleShape instance with specified values for instance
	 * variables.
	 * @param x x position.
	 * @param y y position.
	 * @param deltaX speed (pixels per move call) and direction for horizontal
	 *        axis.
	 * @param deltaY speed (pixels per move call) and direction for vertical
	 *        axis.
	 * @param width width in pixels.
	 * @param height height in pixels.
	 */
	public GemShape(int x, int y, int deltaX, int deltaY, int width, int height) {
		super(x,y,deltaX,deltaY,width,height);
	}

	private Polygon getPolygon(){
		int x1=fX,x2,x3,x5,x6,x4 = fX+fWidth;
		int y1=fY+fHeight/2,y2=fY,y3=fY,y4=y1,y5=fY+fHeight,y6=y5;

		if(fWidth<=40){
			x2=fX+fWidth/2;
			x3 = fX+fWidth/2;
			x5 = x3;
			x6 = x2;
		} else{
			x2=fX+20;
			x3 = fX+fWidth-20;
			x5 = x3;
			x6 = x2;
		}

		int[] x = {x1,x2,x3,x4,x5,x6};
		int[] y = {y1,y2,y3,y4,y5,y6};
		int points = 6;
		Polygon polygon=new Polygon(x,y,points);

		return polygon;
	}
	/**
	 * Paints this RectangleShape object using the supplied Painter object.
	 */
	@Override
	public void paint(Painter painter) {
		painter.drawPolygon(getPolygon());
	}
}
