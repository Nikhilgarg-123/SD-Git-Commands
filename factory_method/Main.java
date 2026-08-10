package factory_method;

public class Main {
	public static void main(String[] args) {
		ICreditCard card=null;
		String cardname = "PNB";
		if (cardname == "PNB") {
			card = new PNBVisaCardFactory().getCardDetails();
		} else if (cardname == "Axis") {
			card = new AxisFlipkartCardFactory().getCardDetails();
		} else {
			System.out.println("No card");
		}

		card.getName();
		card.getLimit();
		System.out.println();
		cardname = "Axis";
		if (cardname == "PNB") {
			card = new PNBVisaCardFactory().getCardDetails();
		} else if (cardname == "Axis") {
			card = new AxisFlipkartCardFactory().getCardDetails();
		} else {
			System.out.println("No card");
		}

		card.getName();
		card.getLimit();

	}
}
