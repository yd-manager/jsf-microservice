package tr.com.yd.tabak.restapi.domain.entity;

public class Category extends BaseEntity{
	private Category category;
	
	private String categoryName;

	
	//GETTER AND SETTER
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}
