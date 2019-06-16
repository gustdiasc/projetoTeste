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

	public Account(long number, String name, long aadhar, String panNo, long amount, String address, int age,
			String gender, String email) {
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

	public Account() {
	}

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

	public static boolean checkGender(String gender) {
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
			return true;
		return false;
	}

	public static boolean checkAge(int age) {
		if (age < 18 || age > 110)
			return false;
		return true;

	}

	public static boolean checkStringInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	public static boolean checkStringLong(String value) {
		try {
			Long.valueOf(value);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	public static boolean checkAccountNumber(String number) {
		if (number.length() <=8 && number.length() > 0 && Long.parseLong(number) != 0) {
			System.out.println(Long.parseLong(number));
			return true;
		}
		return false;
	
	}
	
	public static boolean checkName(String name) {
		if(name.length() > 0 && name.length() <= 100)
			return true;
		return false;
	
	}
	
	public static boolean checkAadhar(String aadhar) {
		if(aadhar.length() == 12  && checkStringLong(aadhar) && Long.parseLong(aadhar) != 0)
			return true;
		return false;
	}
	
	public static boolean checkPanNo(String number) {
		if(number.length() == 10)
			return true;
		return false;
	}
	
	public static boolean checkAmount(String number) {
		if(checkStringLong(number) && Long.parseLong(number) >= 0)
			return true;
		return false;
	}
	
	public static boolean checkEmail(String email) {
		if(email.contains("@"))
				return true;
		return false;
	}
	
	public static boolean checkAddress(String address) {
		if(address.length() <= 100 && address.length() > 0)
			return true;
		return false;
	}
	

}
