
public class rectangle {

	/**
	 * @param args
	 */
	void area(int l,int b)
	{
		int r;
		r=l*b;
		System.out.println("The area of the rectangle is:\t"+r);
	}
	void area(double l,double b)
	{
		double r;
		r=l*b;
		System.out.println("The area of the rectangle is:\t"+r);
	}
	
	void area(int l)
	{
		int r1;
		r1=l*l;
		System.out.println("The area is:\t"+r1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle obj=new rectangle();
		obj.area(5,6);
		obj.area(7);
		obj.area(4.4,7.9);
	}

}
