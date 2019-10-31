package Model;

public class Student {
	private int code;
	private String name;
	private double grade;
	private String birthday;
	private String address;
	private String note;
	
	public Student() {}
	
	public Student(int code, String name, double grade, String birthday, String address, String note) {
		super();
		this.code = code;
		this.name = name;
		this.grade = grade;
		this.birthday = birthday;
		this.address = address;
		this.note = note;
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", grade=" + grade + ", birthday=" + birthday + ", address="
				+ address + ", note=" + note + "]";
	}

}
