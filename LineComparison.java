public class LineComparison{
	static int x1,x2,y1,y2;
	static int x3,x4,y4,y3;

	static double line1Length;
	static double line2Length;

	public static void main (String[] args){

		x1 = 4;
		y1 = 5;
		x2 = 5;
		y2 = 6;
		x3 = 4;
		y3 = 5;
		x4 = 5;
		y4 = 6;

		line1Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("line1 length:" + line1Length);
		line2Length = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("line2 length:" + line2Length);
		if( Double.compare(line1Length,line2Length) == 0 )
			System.out.println("Both lines are equal");
		else if( Double.compare(line1Length,line2Length) < 0 )
			System.out.println("lines2 is greater");
		else
			System.out.println("line1 is greater");

	}
}
