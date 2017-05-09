package oo.shoping;

public class Custumer {

	
	int type;
	int money;
	
	float x , k1 , k2 , k3 , k4;
	
	
	public Custumer(int type , int money){
		this.type = type;
		this.money = money;
		
	}
	
	public void real(){
		System.out.println(count(type) + count(money));
		
	}
		
	public void count(int input){
		if(type == 1){
			System.out.println(money);
		}else if(type == 2){
			System.out.println(money *0.9);
		}else if(type == 3){
			System.out.println(money * 0.9 +( money * 0.05));
		}
		
		return;
		
		
	}
	
}
