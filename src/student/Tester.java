package student;

public class Tester {

	public static void main(String[] args) {

		Student stu1 = new Student(58 , 66 , 77);
		Student stu2 = new Student(70 , 56 , 51);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		Graduatestudent gstu = new Graduatestudent (58,59,60);
		gstu.print();
	}

}
