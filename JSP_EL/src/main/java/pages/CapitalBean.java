package pages;

public class CapitalBean {
	private String uname;
	private String result;
	
	public CapitalBean() {
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void convert() {
		this.result = this.uname.toUpperCase();
	}
}
