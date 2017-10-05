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
		String currentCreator = "";
		for (int i = 0; i < myKahoots.size(); i++) {
			currentCreator = myKahoots.get(i).getCreator();
			Kahoot currentKahoot = myKahoots.get(i);
			String creator = currentKahoot.getCreator();
			popup.displayText(myKahoots.get(i).toString());
			if (currentCreator.equals("")) {
				for (int loop = 0; loop < 5; loop++) {
					popup.displayText("Who made this crap?");
				}
			}
			for (int CurrentLetterIndex = 0; CurrentLetterIndex < creator.length(); CurrentLetterIndex++) {
				popup.displayText(currentCreator.substring(CurrentLetterIndex, CurrentLetterIndex + 1));
			}
		}
	}
	private void fillTheList() {
		Kahoot fiftyStates = new Kahoot(50, 2, "John", true, "States");
		Kahoot abc = new Kahoot(26, 1, "Bob", false, "ABC's");
		Kahoot num = new Kahoot(20, 3, "Patty", true, "Numbers");
		Kahoot fruit = new Kahoot(12, 5, "George", true, "Fruits");
		Kahoot pie = new Kahoot(1, 1, "Tanner", false, "Pie");
		myKahoots.add(fiftyStates);
		myKahoots.add(abc);
		myKahoots.add(num);
		myKahoots.add(fruit);
		myKahoots.add(pie);
	}
}
