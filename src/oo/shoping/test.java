package oo.shoping;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	{
			System.out.println("原價" + "\t" + "折扣後" + "\t" + "還原金");
			ArrayList<Customer> list = new ArrayList();
			list.add(new Customer(6000));
			list.add(new SilverCustomer(8000));
			list.add(new SilverCustomer(10000));
			list.add(new GoldenCustomer(30000));
			list.add(new Customer(2000));
			list.add(new GoldenCustomer(10000));
			for (int i = 0; i < list.size(); i++) {
				Customer cus = list.get(i);
				cus.print();
		
		Custumer cus = new Custumer();
		cus.Normalcust(100);
		cus.Silvercust(100);
	}

}
