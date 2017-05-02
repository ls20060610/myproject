package student;

public class Graduatestudent extends Student{
	int theris;
	
	public Graduatestudent(int English , int Math , int Chinese){
		this.English = English;
		this.Math = Math;
		this.Chinese = Chinese;
	}
		 public void print(){
			 System.out.println(getScore(English)+ "\t" + getScore(Math)+ "\t" + getScore(Chinese));
			 
	}

}
