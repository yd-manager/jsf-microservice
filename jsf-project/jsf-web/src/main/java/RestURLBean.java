import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class RestURLBean {

	private String root;
	
	@PostConstruct
	public void init()
	{
		root = "http://localhost:8080";
	}

	public String getRoot() {
		return root;
	}
	
	
}
