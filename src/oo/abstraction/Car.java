package oo.abstraction;

public class Car {
	String brand;
	String name;
	String type;
	int cc;
	int status;
	float milage;
	
	public Car(String brand, int cc, String name, String type, int status){
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;
		this.status = status;
	}

	public void setmilage(int m){
		milage = m;
	}
	
	public float addmilage( int m ){
		milage = milage + m;
		return milage;
	}
	
    public void maintain(){
    	status = 5;
    }
	
}
