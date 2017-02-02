import java.io.IOException;

public class HwMain {
	public static void main(String[] args) throws IOException {
		Photo original = new Photo("Person.jpg");
		original.ResizeByH(700);
		
		Photo background = new Photo("Back.jpg");
		background.ResizeByH(700);

		Photo copy = new Photo("Person.jpg");
		copy.ResizeByH(700);
		
		
		
		
		
		Photo bw = new Photo("Person.jpg");
		bw.ResizeByH(700);
		bw.blurheavy();
		bw.makeBW();
		//bw.printphoto();
		
		
		
		
		
		copy.replacePicture(original, background, bw);
		//copy.blur();
		copy.printphoto();
//		

		

	}


}