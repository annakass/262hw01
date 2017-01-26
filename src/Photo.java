import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Photo {
	
	//variables
	BufferedImage picture;
	int w; //width
	int h; //height
	double ratio;
	
	
	//constructor
	public Photo(String filename) throws IOException {
		picture = ImageIO.read(new File(filename));
		w = picture.getWidth();
		h = picture.getHeight();
		ratio = w/h;
		
		Resize(600,800);
	}
	
	public void ResizeByH (int height) {
		
	}
	
	public void ResizeByW (int height) {
		
	}
	
	public void Resize (int width, int height) {
		Image temp = picture.getScaledInstance(width, height, 0);
		BufferedImage picture2 = new BufferedImage(width, height, 1);
		picture2.getGraphics().drawImage(temp, 0, 0 , null); //cast image into bufferedimage type
		picture = picture2;
		printphoto(picture);
		
	}
	
	private void printphoto (){
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(new JLabel(new ImageIcon(picture)));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you want the X button to close the app
	}
	private void printphoto (BufferedImage buff){
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(new JLabel(new ImageIcon(buff)));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if you want the X button to close the app

		
	}
	
	//returns color at point
	public Color getColorAt (int width, int height) {
		Color col = new Color (picture.getRGB(width, height));
		return col;
	}
	
	public int getWidth(){
		return w;	
	}
	public int getHeight(){
		return h;	
	}
	//mini class Colour to make color into an array
	
	//takes a single rgb int and turns into colour
	public Colour transform(int rawcolor){
			Color col = new Color(rawcolor);
			
			Colour colour = new Colour(col);
			return colour;
		}
		
		//takes point and gets colour
	public Colour getColour(int width, int height){
			Color col = new Color(picture.getRGB(width, height));
			Colour colour = new Colour(col);
			return colour;
		}
	public class Colour {
		int r;
		int g;
		int b;
		int [] colour = new int[3];

		public Colour (Color color) {
			r = color.getRed();
			g = color.getGreen();
			b = color.getBlue();
			colour[0] = r;
			colour[1] = g;
			colour[2] = b;
		}
		public void printColor(){
			System.out.println(r + " " + g + " " + b);
			
		}
		
	}

}
