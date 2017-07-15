package tr.com.yd.tabak.commons.dto;

import java.util.List;

public class ServeyResultDetailsDTO extends BaseDTO{

	private EvaluationDTO evaluationDTO;

	private List<TOSDTO> tosDTOList;

	private QuestionDTO questionDTO;

	
	//GETTER AND SETTER
	public EvaluationDTO getEvaluationDTO() {
		return evaluationDTO;
	}

	public void setEvaluationDTO(EvaluationDTO evaluationDTO) {
		this.evaluationDTO = evaluationDTO;
	}

	public List<TOSDTO> getTosDTOList() {
		return tosDTOList;
	}

	public void setTosDTOList(List<TOSDTO> tosDTOList) {
		this.tosDTOList = tosDTOList;
	}

	public QuestionDTO getQuestionDTO() {
		return questionDTO;
	}

	public void setQuestionDTO(QuestionDTO questionDTO) {
		this.questionDTO = questionDTO;
	}
	
	
}
