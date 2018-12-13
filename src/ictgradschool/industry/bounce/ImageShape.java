package ictgradschool.industry.bounce;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Class to represent a simple rectangle.
 * 
 * @author Ian Warren
 */
public class ImageShape extends Shape {
	public static BufferedImage image;

	public void loadImage() throws IOException{
		image = ImageIO.read(new File("s-l300.jpg"));
		fWidth = image.getWidth();
		fHeight = image.getHeight();
	}

	/**
	 * Default constructor that creates a RectangleShape instance whose instance
	 * variables are set to default values.
	 */
	public ImageShape() {
		super();
		try {
			loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates a RectangleShape instance with specified values for instance
	 * variables.
	 * @param x x position.
	 * @param y y position.
	 * @param deltaX speed and direction for horizontal axis.
	 * @param deltaY speed and direction for vertical axis.
	 */
	public ImageShape(int x, int y, int deltaX, int deltaY) {
		super(x,y,deltaX,deltaY);
		try {
			loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	public ImageShape(int x, int y, int deltaX, int deltaY, int width, int height) {
		super(x,y,deltaX,deltaY,width,height);
		try {
			loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	public void paint(GraphicsPainter painter) {
//
//		painter.drawImage(image,fX,fY,null);
//	}
	/**
	 * Paints this RectangleShape object using the supplied Painter object.
	 */
	@Override
	public void paint(Painter painter) {
		painter.drawImage(image,fX,fY,null);
	}




}
