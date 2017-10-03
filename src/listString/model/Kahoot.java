package listString.model;

public class Kahoot {
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	
	public Kahoot() {
		questionCount = 0;
		level = 0;
		creator = "";
		isJumble = false;
	}
	
	public Kahoot(int questionCount, int level, String creator, boolean isJumble) {
		this.questionCount = questionCount;
		this.level = level;
		this.creator = creator;
		this.isJumble = isJumble;
	}
	
	public String toString() {
		String Jumble = "";
		if (isJumble) {
			Jumble += "is Jumbled.";
		} else {
			Jumble += "is not Jumbled.";
		}
		String description = "This Kahoot has " + questionCount + " questions, is level " + 
	level + ", was made by " + creator + ", and " + Jumble;
		
		return description;
	}
	
	public int getQuestionCount() {
		return questionCount;
	}
	public int getLevel() {
		return level;
	}
	public String getCreator() {
		return creator;
	}
	public boolean getIsJumble() {
		return isJumble;
	}
	
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public void setIsJumble(boolean isJumble) {
		this.isJumble = isJumble;
	}
}
