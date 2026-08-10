package factory_method;

public abstract class CC_Factory {
	public abstract ICreditCard CreateFactory();
	
	public ICreditCard getCardDetails() {
		return CreateFactory();
	}

}
