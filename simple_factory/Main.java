package simple_factory;

public class Main {
	public static void main(String[] args) {
		ICreditCard c1 = CC_Factory.get_CC("pnbVisa");
		if (c1 != null) {
			c1.getLimit();
			c1.getName();
		}
System.out.println();
		ICreditCard c2 = CC_Factory.get_CC("AxisFlipkartCard");
		if (c2 != null) {
			c2.getLimit();
			c2.getName();
		}
System.out.println();
		ICreditCard c3 = CC_Factory.get_CC("Duet");
		if (c3 != null) {
			c3.getLimit();
			c3.getName();
		} else {
			System.out.println("Card Not Exist");
		}

	}
}
