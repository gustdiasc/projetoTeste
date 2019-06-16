package Tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import model.Account;

public class UnitTest {

	@Test
	public void testGender() {
		boolean result;
		result = Account.checkGender("male");
		assertTrue(result);
		result = Account.checkGender("Female");
		assertTrue(result);
		result = Account.checkGender("Male");
		assertTrue(result);
		result = Account.checkGender("female");
		assertTrue(result);
		result = Account.checkGender("homem");
		assertFalse(result);
	}
	
	@Test
	public void testAge() {
		boolean result;
		result = Account.checkAge(10);
		assertFalse(result);
		result = Account.checkAge(18);
		assertTrue(result);
		result = Account.checkAge(30);
		assertTrue(result);
		result = Account.checkAge(110);
		assertTrue(result);
		result = Account.checkAge(120);
		assertFalse(result);
	}
	
	@Test
	public void testStringInt() {
		boolean result;
		result = Account.checkStringInt("10");
		assertTrue(result);
		result = Account.checkStringInt("10EB");
		assertFalse(result);
	
	}
	
	@Test
	public void testStringLong() {
		boolean result;
		result = Account.checkStringLong("10");
		assertTrue(result);
		result = Account.checkStringLong("10EB24D");
		assertFalse(result);
	}
	
	@Test
	public void testNumberAccount() {
		boolean result;
		result = Account.checkAccountNumber("10");
		assertTrue(result);
		result = Account.checkAccountNumber("902183092183029183");
		assertFalse(result);
		result = Account.checkAccountNumber("");
		assertFalse(result);
		result = Account.checkAccountNumber("000000");
		assertFalse(result);
	}
	
	@Test
	public void testName() {
		boolean result;
		result = Account.checkName("Abidal Valys");
		assertTrue(result);
		result = Account.checkName("");
		assertFalse(result);
		result = Account.checkName("Teste oasdieisdjsd sidjsidsidj imjdisjdis asiudhasiudhsaudh oiasjdiasdojais jdsd sijdsidjisd isndjisa");
		assertFalse(result);
	}
	
	@Test
	public void testAadhar() {
		boolean result;
		result = Account.checkAadhar("214121355896");
		assertTrue(result);
		result = Account.checkAadhar("");
		assertFalse(result);
		result = Account.checkAadhar("0000000000000000");
		assertFalse(result);
		result = Account.checkAadhar("21452533AAAA");
		assertFalse(result);
		result = Account.checkAadhar("21452533");
		assertFalse(result);
	}
	
	@Test
	public void testPanNo() {
		boolean result;
		result = Account.checkPanNo("123ABC123D");
		assertTrue(result);
		result = Account.checkPanNo("123ABC123");
		assertFalse(result);
		result = Account.checkPanNo("123ABC123DDD");
		assertFalse(result);
	}
	
	@Test
	public void testAmount() {
		boolean result;
		result = Account.checkAmount("0");
		assertTrue(result);
		result = Account.checkAmount("10");
		assertTrue(result);
		result = Account.checkAmount("-20");
		assertFalse(result);
		result = Account.checkAmount("B");
		assertFalse(result);
		
	}
	
	public void testEmail() {
		boolean result;
		result = Account.checkEmail("test@email.com");
		assertTrue(result);
		result = Account.checkAmount("testgmail.com");
		assertFalse(result);
	}
	
	@Test
	public void testAddress() {
		boolean result;
		result = Account.checkAddress("Rua dois, treis");
		assertTrue(result);
		result = Account.checkAddress("");
		assertFalse(result);
		result = Account.checkAddress("Teste oasdieisdjsd sidjsidsidj imjdisjdis asiudhasiudhsaudh oiasjdiasdojais jdsd sijdsidjisd isndjisa");
		assertFalse(result);
	}
	
	
	

}
