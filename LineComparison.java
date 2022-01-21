public class LineComparison{
	static int x1,x2,y1,y2;
	static double line1_Length;
	
	public static void main (String[] args){
		
		System.out.println("Welcome to Line Comparison!!!");	
		x1 = 4;
		y1 = 5;
		x2 = 5;
		y2 = 6;
	
		line1_Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("line1 length:" + line1_Length);
		

	}
}


