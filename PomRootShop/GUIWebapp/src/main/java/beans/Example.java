package beans;

import javax.inject.Named;

@Named
public class Example {
	private String mytext = "Das ist fantstisch";

	public Example() {
	}

	public String getMytext() {
		return mytext;
	}

	public void setMytext(String mytext) {
		this.mytext = mytext;
	}

}
