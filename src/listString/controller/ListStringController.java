package listString.controller;

import java.util.List;
import java.util.ArrayList;
import listString.model.Kahoot;

public class ListStringController {
	private List<Kahoot> myKahoots;
		
	public ListStringController() {
		myKahoots = new ArrayList<Kahoot>();
	}
	public void start() {
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	private void fillTheList() {
		Kahoot fiftyStates = new Kahoot(50, 2, "John", true);
		Kahoot abc = new Kahoot(26, 1, "Bob", false);
		Kahoot num = new Kahoot(20, 3, "Patty", true);
		Kahoot fruit = new Kahoot(12, 5, "George", true);
		Kahoot pie = new Kahoot(1, 1, "Tanner", false);
		myKahoots.add(fiftyStates);
		myKahoots.add(abc);
		myKahoots.add(num);
		myKahoots.add(fruit);
		myKahoots.add(pie);
	}
}
