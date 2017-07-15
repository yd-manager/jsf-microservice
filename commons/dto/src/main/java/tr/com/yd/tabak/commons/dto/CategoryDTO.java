package tr.com.yd.tabak.commons.dto;

public class CategoryDTO extends BaseDTO{

	private CategoryDTO categoryDTO;

	private String categoryName;


	//GETTER AND SETTER
	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}

	
}
