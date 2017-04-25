package oo.mid;

import oo.abstraction.Car;

public class Mealtester {

	public static void main(String[] args) {
        Meal c1 = new Meal("cheese burger" , "large", "ice cream");
		
	    Meal c2 = new Meal("fish burger" ,"medium", "black tea" );
		
		Meal c3 = new Meal("rice burger" ,"small", "french fried" );

		
		
		Meal[] meals = new Meal[3];
		
		meals[0]=  new Meal("cheese burger" , "large", "ice cream");
		meals[1]= new Meal("fish burger" ,"medium", "black tea" );
		meals[2]= new Meal("rice burger" ,"small", "french fried" );
		
		int i = 0 ;
		for (i=0; i<3; i++){
			System.out.println(meals[i].others);
		}
		
	}

}
