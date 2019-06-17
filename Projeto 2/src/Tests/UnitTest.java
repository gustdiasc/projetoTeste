package Tests;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTEvent;
import java.awt.Event;
import java.awt.event.FocusEvent;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import bankui2.*;


import model.Account;

public class UnitTest {
	
	createaccount createAccount;
	deposit deposit;
	home home;
	searchbyaccountnumber sban;
	withdraw withdraw;
	
	@BeforeEach
	public void setUp() {
		this.createAccount = new createaccount();
		this.deposit = new deposit();
		this.home = new home();
		this.sban = new searchbyaccountnumber();
		this.withdraw = new withdraw();
	}
	
	@Test
	public void testCreateAccount_AllValid() {
		this.createAccount.getTf1().setText("123455");
		this.createAccount.getTf2().setText("Gustavo");
		this.createAccount.getTf3().setText("123412341422");
		this.createAccount.getTf4().setText("123042");
		this.createAccount.getTf5().setText("200");
		this.createAccount.getTf6().setText("Rua francisco moretzshon");
		this.createAccount.getTf7().setText("23");
		this.createAccount.getTf8().setText("male");
		this.createAccount.getTf9().setText("gustavo.dias.c5@gmail.com");
		
		this.createAccount.getJb().doClick();
	}
	
	@Test
	public void testCreateAccount_AllInvalid() {
		this.createAccount.getTf1().setText("123451231315");
		this.createAccount.getTf2().setText("");
		this.createAccount.dispatchEvent(new FocusEvent(this.createAccount.getTf2(), FocusEvent.FOCUS_LOST));
		this.createAccount.getTf3().requestFocus();
		this.createAccount.getTf3().setText("123412341422");
		this.createAccount.getTf4().setText("123042");
		this.createAccount.getTf5().setText("0");
		this.createAccount.getTf6().setText("Rua francisco moretzshon");
		this.createAccount.getTf7().setText("23");
		this.createAccount.getTf8().setText("test");
		this.createAccount.getTf9().setText("test");
		
		this.createAccount.getJb().doClick();
	}
	
	

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
	
	@Test
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
