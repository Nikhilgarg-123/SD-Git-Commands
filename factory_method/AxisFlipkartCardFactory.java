package factory_method;

public class AxisFlipkartCardFactory extends CC_Factory{

	@Override
	public ICreditCard CreateFactory() {
		// TODO Auto-generated method stub
		return new AxisFlipkartCard();
	}
	

}
