package tr.com.yd.tabak.commons.dto;


public class QuestionDTO extends BaseDTO{

	private CategoryDTO categoryDTO;

	private String questionSentence;


	//GETTER AND SETTER
	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public void setQuestionSentence(String questionSentence) {
		this.questionSentence = questionSentence;
	}

	public String getQuestionSentence() {
		return questionSentence;
	}

	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	
}
