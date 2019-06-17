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

	public static boolean checkGender(String gender) {
		if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))
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
	
	public long getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public long getAadhar() {
		return aadhar;
	}

	public String getPanNo() {
		return panNo;
	}

	public long getAmount() {
		return amount;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
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
