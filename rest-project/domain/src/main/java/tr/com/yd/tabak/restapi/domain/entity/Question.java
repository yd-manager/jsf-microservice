package tr.com.yd.tabak.restapi.domain.entity;

public class Question extends BaseEntity{
	
	private Category category;
	
	private String questionSentence;

	
	//GETTER AND SETTER
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getQuestionSentence() {
		return questionSentence;
	}

	public void setQuestionSentence(String questionSentence) {
		this.questionSentence = questionSentence;
	}
	
	

}
