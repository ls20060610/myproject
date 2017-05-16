package oo.shoping;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("原價" + "\t" + "折扣後" + "\t" + "還原金");
			ArrayList<Custumer> list = new ArrayList();
			list.add(new Normalcust(6000));
			list.add(new Silvercust(8000));
			list.add(new SilverCust(10000));
			list.add(new GoldenCust(30000));
			list.add(new Normalcust(2000));
			list.add(new GoldenCust(10000));
			//for (int i = 0; i < list.size(); i++) {
			//	Custumer cus = list.get(i);
			for(Custumer cust : list){
				
				if (cust instanceof SilverCustomer &&
						!(cus instanceof GoldenCustomer)){
					System.out.print("*");
					Silver silver = (Silver)cust;
				}
				cust.print(i);

				String[] array = {"aa","bb","cc"};
				for(String s : array){
					System.out.print(s);
				}
				
				Custumer custumer = new Custumer();
				custumer.Normalcust(100);
				custumer.Silvercust(100);
			}

		}
	}
}
