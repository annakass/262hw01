import java.awt.Color;

	public class ColorA {
		Color color;
		int rgbint;
		int r;
		int g;
		int b;
		double rd;
		double gd;
		double bd;
		int [] colorA = new int[3];
		double ratior;
		double ratiog;
		double ratiob;

		public ColorA (Color colorIn) {
			color = colorIn;
			rgbint = colorIn.getRGB();
			r = colorIn.getRed();
			g = colorIn.getGreen();
			b = colorIn.getBlue();
			rd = (double) r;
			gd = (double) g;
			bd = (double) b;
			colorA[0] = r;
			colorA[1] = g;
			colorA[2] = b;
			ratior = rd / (bd + gd);
			ratiog = gd / (bd + rd);
			ratiob = bd / (rd + gd);
			
		}
		public void printColor(){
			System.out.print(r + " " + g + " " + b);
			
		}
		public void printColorln(){
			System.out.println(r + " " + g + " " + b);
			
		}
		
	}