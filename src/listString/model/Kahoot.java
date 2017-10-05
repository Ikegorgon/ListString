package listString.model;

public class Kahoot {
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	private String topic;
	
	public Kahoot() {
		questionCount = 0;
		level = 0;
		creator = "";
		isJumble = false;
		topic = "";
	}
	
	public Kahoot(int questionCount, int level, String creator, boolean isJumble, String topic) {
		this.questionCount = questionCount;
		this.level = level;
		this.creator = creator;
		this.isJumble = isJumble;
		this.topic = topic;
	}
	
	public String toString() {
		String Jumble = "";
		if (isJumble) {
			Jumble += "is Jumbled.";
		} else {
			Jumble += "is not Jumbled.";
		}
		String description = "This Kahoot about " + topic + " has " + questionCount + " questions, is level " + 
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
	public String getTopic() {
		return topic;
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
	public void setTopic(String topic) {
		this.topic = topic;
	}
}
