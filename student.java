
public class student {

	/**
	 * @param args
	 */
	int age;
	String name,usn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student(22,"Rajath","4Ni17IS106");
		student obj1=new student();
		
		
	}
	 student()
	{
		age=0;
		name=null;
		usn=null;
		System.out.println("Age="+age+"\n"+"Name="+name+"\n"+"Usn="+usn+"\n");
	}
	 student(int age1,String name1,String usn1)
	{
		age=age1;
		name=name1;
		usn=usn1;
		System.out.println("Age="+age+"\n"+"Name="+name+"\n"+"Usn="+usn+"\n");
	}

}
