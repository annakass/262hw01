import java.awt.*;
import java.io.IOException;

public class HwMain {
	public static void main(String[] args) throws IOException {
		Photo og = new Photo("Person.jpg");
		og.ResizeByH(700);
		og.printphoto();
		
		Photo copy = new Photo("Person.jpg");
		copy.ResizeByH(700);
		
		Photo bw = new Photo("Person.jpg");
		bw.ResizeByH(700);
		bw.makeBW();
		bw.printphoto();
		
		
		Photo background = new Photo("Back.jpg");
		background.ResizeByH(700);
		background.printphoto();
		
//		Photo greytest = new Photo("Person.jpg");
//		greytest.ResizeByH(700);
//		greytest.makeGreyscale();
//		greytest.printphoto();
		
		copy.replacePicture(og, background, bw);
		copy.printphoto();
		
		

	}


}