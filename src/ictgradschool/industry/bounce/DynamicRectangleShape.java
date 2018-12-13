package ictgradschool.industry.bounce;

import javax.xml.bind.annotation.XmlElement;
import java.awt.*;

/**
 * Class to represent a simple rectangle.
 * 
 * @author Ian Warren
 */
public class DynamicRectangleShape extends RectangleShape {
//	adding default color of black and instance var to specify color at construction
	private static final Color DEFAULT_COLOR = new Color(1,1,1);

	protected Color color;
	/**
	 * Default constructor that creates a RectangleShape instance whose instance
	 * variables are set to default values.
	 */
	public DynamicRectangleShape() {
		super();
		this.color=DEFAULT_COLOR;
	}

	public DynamicRectangleShape(Color color) {
		super();
		this.color=color;
	}
	/**
	 * Creates a RectangleShape instance with specified values for instance
	 * variables.
	 * @param x x position.
	 * @param y y position.
	 * @param deltaX speed and direction for horizontal axis.
	 * @param deltaY speed and direction for vertical axis.
	 */
	public DynamicRectangleShape(int x, int y, int deltaX, int deltaY) {
		super(x,y,deltaX,deltaY);
		this.color=DEFAULT_COLOR;
	}

	public DynamicRectangleShape(int x, int y, int deltaX, int deltaY,Color color) {
		super(x,y,deltaX,deltaY);
		this.color=color;
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
	public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height) {
		super(x,y,deltaX,deltaY,width,height);
		this.color=DEFAULT_COLOR;
	}
	public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height,Color color) {
		super(x,y,deltaX,deltaY,width,height);
		this.color=color;
	}


	
	/**
	 * Paints this RectangleShape object using the supplied Painter object.
	 */
	@Override
	public void paint(Painter painter) {
		painter.setColor(color);
		painter.drawRect(fX,fY,fWidth,fHeight);

		if (this.sideHit){
			painter.fillRect(fX,fY,fWidth,fHeight);
		}else if (this.topBotHit){
			painter.drawRect(fX,fY,fWidth,fHeight);
		}

//		painter.fillRect(fX,fY,fWidth,fHeight);

	}
}
