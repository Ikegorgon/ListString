package listString.controller;

import java.util.List;
import java.util.ArrayList;
import listString.model.Kahoot;
import listString.view.ListStringDisplay;

public class ListStringController {
	private List<Kahoot> myKahoots;
	private ListStringDisplay popup;
	
	public ListStringController() {
		myKahoots = new ArrayList<Kahoot>();
		popup = new ListStringDisplay();
	}
	public void start() {
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
		fillTheList();
		showTheList();
	}
	private void showTheList() {
		for (int i = 0; i < myKahoots.size(); i++) {
			popup.displayText(myKahoots.get(i).toString());
		}
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
