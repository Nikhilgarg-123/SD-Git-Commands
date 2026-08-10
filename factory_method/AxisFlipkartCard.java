package factory_method;

public class AxisFlipkartCard implements ICreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("Flipkart Axis");
		return "Flipkart Axis";
	}

	@Override
	public int getLimit() {
		// TODO Auto-generated method stub
		System.out.println(111000);
		return 111000;
	}
	

}
