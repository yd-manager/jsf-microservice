package tr.com.yd.tabak.restapi.domain.entity;

import java.util.List;

public class ServeyResultDetails extends BaseEntity {

	private Evaluation evaluation;
	
	private List<TOS> tosList;
	
	private Question question;

	//GETTER AND SETTER
	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public List<TOS> getTosList() {
		return tosList;
	}

	public void setTosList(List<TOS> tosList) {
		this.tosList = tosList;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
