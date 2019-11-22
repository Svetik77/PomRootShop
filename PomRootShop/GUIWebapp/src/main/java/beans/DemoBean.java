package beans;

import javax.inject.Named;

@Named
public class DemoBean {
	
	private String mytext = "Das ist fantstisch";

	public String getMytext() {
		return mytext;
	}

	public void setMytext(String mytext) {
		this.mytext = mytext;
	}

	public DemoBean() {
		// TODO Auto-generated constructor stub
	}

}
