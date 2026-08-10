package simple_factory;

public class CC_Factory {
	public static ICreditCard get_CC(String card_name) {
		ICreditCard card=null;
		if (card_name=="AxisFlipkartCard"){
			card = new AxisFlipkartCard();
				
		}else if (card_name == "pnbVisa"){
			card = new pnbVisa();
		}else {
			System.out.println("wrong Card");
		}
		return card;
	}

}
