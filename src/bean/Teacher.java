package bean;

public class Teacher implements java.io.Serializable {

//	例
//	private int id;
//	private String name;
//変数をプライベートで宣言。データ型に注意
	private String id;
	private String password;
	private String name;
	private String school_id;



	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getSchool_id() {
		return school_id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}
}
