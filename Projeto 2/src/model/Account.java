package model;

public class Account {

	private String number;
	private String name;
	private String aadhar;
	private float amount;
	private String address;
	private int age;
	private String email;
	
	public Account(String number, String name, String aadhar, float amount, String address, int age, String email) {
		super();
		this.number = number;
		this.name = name;
		this.aadhar = aadhar;
		this.amount = amount;
		this.address = address;
		this.age = age;
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
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
	
	
}