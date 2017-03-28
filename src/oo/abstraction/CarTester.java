package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota" , 1800 , "Altis", "Sedan" , 100);
		
		Car c2 = new Car("Ford" , 2000 , "focus", "Sedan" , 100);
		
		Car c3 = new Car("BMW" , 1000 , "M140i", "Sedan" , 100);
      
	int[] n = new int [5];
	System.out.println(n[2]);
	
	
	Car[] cars = new Car[3];
	System.out.println(cars[0]);
	
	cars[0]= new Car("Toyota" , 1800 , "Altis", "Sedan" , 100) ;
	cars[1]= new Car("Ford" , 2000 , "focus", "Sedan" , 100) ;
	cars[2]= new Car("BMW" , 1000 , "M140i", "Sedan" , 100) ;
	
	
	int i = 0 ;
	for (i=0; i<3; i++){
		System.out.println(cars[i].name);
	}
	System.out.println(i);
	for (i=1; i<=9; i=i+2){
		System.out.println(i);
	}
	System.out.println(i);
		
	class AA {
		
	}
    AA a = new AA();
}
}
