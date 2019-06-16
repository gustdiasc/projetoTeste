package model;

public class Account {

	private long number;
	private String name;
	private long aadhar;
	private String panNo;

	private long amount;
	private String address;
	private int age;
	private String gender;
	private String email;
	
	public Account(long number, String name, long aadhar,String panNo, long amount, String address, int age,String gender, String email) {
		super();
		this.number = number;
		this.name = name;
		this.aadhar = aadhar;
		this.amount = amount;
		this.address = address;
		this.age = age;
		this.email = email;
		this.gender = gender;
		this.panNo = panNo;
	}
	
	public Account() {}
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean checkGender(String gender) {
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
			return true;
		return false;
	}
	
	
}
