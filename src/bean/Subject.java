package bean;

public class Subject implements java.io.Serializable {

//	例
//	private int id;
//	private String name;
//変数をプライベートで宣言。データ型に注意
	private String school_cd;
	private String cd;
	private String name;



	public String getSchool_cd() {
		return school_cd;
	}
	public String getCd() {
		return cd;
	}
	public String getName() {
		return name;
	}
	public void setSchool_cd(String school_cd) {
		this.school_cd = school_cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	public void setName(String name) {
		this.name = name;
	}
}
