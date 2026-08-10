package simple_factory;

public class pnbVisa implements ICreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("PNB Visa");
		return "PNB Visa";
	}

	@Override
	public int getLimit() {
		// TODO Auto-generated method stub
		System.out.println(100000);
		return 100000;
	}
	

}
