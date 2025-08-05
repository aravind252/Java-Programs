package progs;

public class student {
	
	int sn=1;
	String sname="jhon";
	char gender='M';
	double fee=1000.0;
	public void study() {
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		student obj=new student();
		obj.study();
		System.out.println(obj.sn);
		System.out.println(obj.sname);
		System.out.println(obj.gender);
		System.out.println(obj.fee);
	}

}
