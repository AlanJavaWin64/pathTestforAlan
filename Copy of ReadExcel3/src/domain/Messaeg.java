package domain;

public class Messaeg {

	private String first;
	private String name;
	private String numberS;
	private String date;
	private String sex;
	private String cellphone;
	private String localhost;
	private String numberK;
	

	public Messaeg() {
		super();
		
	}

	public Messaeg(String name, String numberS, String date, String sex,
			String cellphone, String localhost,String numberK,String first) {
		super();
		this.name = name;
		this.numberS = numberS;
		this.date = date;
		this.sex = sex;
		this.cellphone = cellphone;
		this.localhost = localhost;
		this.numberK = numberK;
		this.first = first;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberS() {
		return numberS;
	}

	public void setNumberS(String numberS) {
		this.numberS = numberS;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getLocalhost() {
		return localhost;
	}

	public void setLocalhost(String localhost) {
		this.localhost = localhost;
	}
	
	public String getNumberK() {
		return numberK;
	}

	public void setNumberK(String numberK) {
		this.numberK = numberK;;
	}
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
}
