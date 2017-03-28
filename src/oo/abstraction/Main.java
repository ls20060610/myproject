package oo.abstraction;

public class Main {

	public static void main(String[] args) {
      Car c = new Car("XX" , 2000 , "name" , "type" ,2000 );
      c.setmilage(25000);
		//
      float current = c.addmilage(80);
      System.out.println("目前里程數為:" + current);
	}

}
