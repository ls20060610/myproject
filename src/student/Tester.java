package student;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		Student stu1 = new Student(58 , 66 , 77);
		Student stu2 = new Student(70 , 56 , 51);
		Student stu3 = new Student(72 , 51 , 59);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		Graduatestudent gstu1 = new Graduatestudent (58,59,60);
		Graduatestudent gstu2 = new Graduatestudent (70,70,70);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58 , 66 , 77));
		list.add(new Student(70 , 56 , 51));
		list.add(new Student(72 , 51 , 59));
		list.add(new Graduatestudent(58,59,60));
		list.add(new Graduatestudent(70,70,70));
		for(int i = 0 ; i< list.size() ; i++){
			Student stu = list.get(i);
			stu.print();
			
		}
		
		
		
		
		
		
		
	}

}
