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
//		showTheList();
		changeTheList();
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
			for (int letter = currentKahoot.getTopic().length() - 1; letter >= 0; letter -= 1) {
				popup.displayText(currentKahoot.getTopic().substring(letter, letter + 1));
			}
		}
	}
	private void fillTheList() {
		Kahoot fiftyStates = new Kahoot(50, 2, "John", true, "States");
		Kahoot abc = new Kahoot(26, 1, "Bob", false, "ABC's");
		Kahoot num = new Kahoot(20, 3, "Patty", true, "Numbers");
		Kahoot fruit = new Kahoot(12, 5, "George", true, "Fruits");
		Kahoot pie = new Kahoot(1, 1, "Tanner", false, "Pie");
		Kahoot name = new Kahoot(3, 1, "Doug", true, "Names");
		myKahoots.add(fiftyStates);
		myKahoots.add(abc);
		myKahoots.add(num);
		myKahoots.add(fruit);
		myKahoots.add(pie);
		myKahoots.add(name);
	}
	
	private void changeTheList() {
		String toRemove = "";
		popup.displayText("The current list size is: " + myKahoots.size());
		toRemove = popup.getResponse("What would you like to remove?");
		Kahoot removed = myKahoots.remove(Integer.parseInt(toRemove));
		popup.displayText("I removed the Kahoot about " + removed.getTopic());
		popup.displayText("The list now has: " + myKahoots.size() + " items inside.");
		myKahoots.add(0, removed);
		
		popup.displayText("The kahoot about " + removed.getTopic() + " was replaced back in.");
		popup.displayText("The list is back to: " + myKahoots.size());
		
	}
	
	public ListStringDisplay getPopup() {
		return popup;
	}
	public ArrayList<Kahoot> getMyKahoots() {
		return (ArrayList<Kahoot>)myKahoots;
	}
}
