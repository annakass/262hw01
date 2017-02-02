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
		
		public Color ave (Color left, Color middle, Color right) {
			double avgr =( left.getRed() + middle.getRed() + right.getRed()) / 3;
			double avgg =( left.getGreen() + middle.getGreen() + right.getGreen()) / 3;
			double avgb =( left.getBlue() + middle.getBlue() + right.getBlue()) / 3;
			Color avg = new Color ((int)avgr, (int)avgg, (int)avgb);
			return avg;
			
		}
		
		public Color averageLight (Color left, Color middle, Color right) {
			double avgr =( left.getRed() +  4* middle.getRed() + right.getRed()) / 6;
			double avgg =( left.getGreen() + 4* middle.getGreen() + right.getGreen()) / 6;
			double avgb =( left.getBlue() + 4*middle.getBlue() + right.getBlue()) / 6;
			Color avg = new Color ((int)avgr, (int)avgg, (int)avgb);
			return avg;
			
		}
		
		public Color averageHeavy (Color left, Color middle, Color right) {
			double avgr =( left.getRed() + right.getRed()) / 2;
			double avgg =( left.getGreen() + right.getGreen()) / 2;
			double avgb =( left.getBlue() + right.getBlue()) / 2;
			Color avg = new Color ((int)avgr, (int)avgg, (int)avgb);
			return avg;
			
		}
		
	
		
	}