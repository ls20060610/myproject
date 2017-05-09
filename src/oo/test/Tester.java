package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;
import student.Student;



public class Tester {

	public static void main(String[] args) {
		
		Student stu = new Student();
		System.out.println(stu);
		

		Car c = new Car("XX" , 2000 , "name" , "type" ,2000 );
		ArrayList a = new ArrayList();
		//String[] numbers = {"588" , "300" , "452" , "7264" , "426" };
		a.add("588");
		a.add("300");
		a.add("452");
//		a.add(123);
//		a.add(true);
		System.out.println(a.size());
		a.add("7264");
		a.add("426");
		System.out.println(a.size());
		a.addAll(a);
		System.out.println(a.size());
		a.set(2 , "584");
		System.out.println(a);
		String data = (String)a.get(3);
		//int n = (int)a.get(4);
		
	}

}
