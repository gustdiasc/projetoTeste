package bankui2;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Account;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import javax.imageio.*;

public class createaccount extends JFrame implements ActionListener {
	JButton jb, jb1;
	JTextArea ta;
	JTextField tf1, tf9, tf2, tf3, tf4, tf5, tf6, tf7, tf8;

	
	
	public JButton getJb() {
		return jb;
	}

	public JButton getJb1() {
		return jb1;
	}

	public JTextArea getTa() {
		return ta;
	}

	public JTextField getTf1() {
		return tf1;
	}

	public JTextField getTf9() {
		return tf9;
	}

	public JTextField getTf2() {
		return tf2;
	}

	public JTextField getTf3() {
		return tf3;
	}

	public JTextField getTf4() {
		return tf4;
	}

	public JTextField getTf5() {
		return tf5;
	}

	public JTextField getTf6() {
		return tf6;
	}

	public JTextField getTf7() {
		return tf7;
	}

	public JTextField getTf8() {
		return tf8;
	}
	
	private boolean verifyFields() {
		boolean result = true;
		
		if(!Account.checkStringInt(tf1.getText()) || !Account.checkAccountNumber(tf1.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a correct account number");
        	tf1.setText("");
        	result = false;
        }
		
		if(!Account.checkName(tf2.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a name with 100 or less");
        	tf2.setText("");
        	result = false;
        }
		
        if(!Account.checkAadhar(tf3.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a correct aadhar");
        	tf3.setText("");
        	result = false;
        }
		
        if(!Account.checkPanNo(tf4.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a correct pan number");
        	tf4.setText("");
        	result = false;
        }
        
        if(!Account.checkAmount(tf5.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a correct amount");
        	tf5.setText("");
        	result = false;
        }
		
        if(!Account.checkAddress(tf6.getText())) {
        	JOptionPane.showMessageDialog(null, " Type an address with size <= 100");
        	tf6.setText("");
        	result = false;
        }        
		
		if(!Account.checkAge(Integer.parseInt(tf7.getText()))) {
        	JOptionPane.showMessageDialog(null, " Type a correct age between 18 and 110");
        	tf7.setText("");
        	result = false;
        }
		
		if(!Account.checkGender(tf8.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a correct gender: male or female");
        	tf8.setText("");
        	result = false;
        }
		
		if(!Account.checkEmail(tf9.getText())) {
        	JOptionPane.showMessageDialog(null, " Type a correct email");
        	tf9.setText("");
        	result = false;
        }
		
		return result;
	}

	public createaccount() {
		Container c = getContentPane();

		c.setLayout(null);
		jb = new JButton("Submit");
		jb.addActionListener(this);
		jb.setBounds(150, 500, 100, 50);

		c.setBackground(Color.ORANGE);

		JLabel jl1 = new JLabel("account number");
		jl1.setBounds(10, 10, 130, 50);
		JLabel jl2 = new JLabel("name");
		jl2.setBounds(10, 64, 130, 50);
		JLabel jl3 = new JLabel("Aadhar number");
		jl3.setBounds(10, 118, 130, 50);
		JLabel jl4 = new JLabel("pan no");
		jl4.setBounds(10, 172, 130, 50);
		JLabel jl5 = new JLabel("amount");
		jl5.setBounds(10, 212, 130, 50);
		JLabel jl6 = new JLabel("address");
		jl6.setBounds(10, 264, 130, 50);
		JLabel jl7 = new JLabel("age");
		jl7.setBounds(10, 310, 130, 50);
		JLabel jl8 = new JLabel("gender");
		jl8.setBounds(10, 360, 130, 50);
		JLabel jl9 = new JLabel("email id");
		jl9.setBounds(10, 410, 130, 50);

		tf1 = new JTextField();
		tf1.setBounds(110, 20, 200, 40);
		tf2 = new JTextField();
		tf2.setBounds(110, 70, 200, 40);
		tf3 = new JTextField();
		tf3.setBounds(110, 120, 200, 40);
		tf4 = new JTextField();
		tf4.setBounds(110, 170, 200, 40);
		tf5 = new JTextField();
		tf5.setBounds(110, 220, 200, 40);
		tf6 = new JTextField();
		tf6.setBounds(110, 270, 200, 40);
		tf7 = new JTextField();
		tf7.setBounds(110, 320, 200, 40);
		tf8 = new JTextField();
		tf8.setBounds(110, 370, 200, 40);
		tf9 = new JTextField();
		tf9.setBounds(110, 420, 200, 40);
		
		/*tf1.setText(" ENETR AADHAR NUMBER ");
		tf2.setText(" FULL NAME ");
		tf3.setText(" AADHAR NUMBER ");
		tf4.setText(" PAN NUMBER  ");
		tf5.setText(" AMOUNT  ");
		tf6.setText(" FULL  ADDRESS   ");
		tf7.setText(" AGE  ");
		tf8.setText("  MALE OR FEMALE ");
		tf9.setText(" EMAIL ID  ");*/

		c.add(tf1);
		c.add(tf2);
		c.add(tf3);
		c.add(tf4);
		c.add(tf5);
		c.add(tf6);
		c.add(tf7);
		c.add(tf8);
		c.add(tf9);

		c.add(jb);

		c.add(jl1);
		c.add(jl2);
		c.add(jl3);
		c.add(jl4);
		c.add(jl5);
		c.add(jl6);
		c.add(jl7);
		c.add(jl8);
		c.add(jl9);

	}

	private Account createAccountObj(long accountNumber, String name, long aadharNumber, String panNo, long amount,
			String address, int age, String gender, String email) {
		Account acc = new Account(accountNumber, name, aadharNumber, panNo, amount, address, age, gender, email);
		return acc;
	}	

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jb) {
			String s1 = tf1.getText();
			long ss1 = Long.parseLong(s1);
			String s2 = tf2.getText();
			String s3 = tf3.getText();
			long ss3 = Long.parseLong(s3);
			String s4 = tf4.getText();
			String s5 = tf5.getText();
			long ss5 = Long.parseLong(s5);
			String s6 = tf6.getText();
			String s7 = tf7.getText();
			int ss7 = Integer.parseInt(s7);
			String s8 = tf8.getText();
			String s9 = tf9.getText();

			Account acc = createAccountObj(ss1, s2, ss3, s4, ss5, s6, ss7, s8, s9);
			
			if(verifyFields()) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "hr");
					PreparedStatement ps = con.prepareStatement("insert into test4 values(?,?,?,?,?,?,?,?,?)");
					ps.setLong(1, acc.getNumber());
					ps.setString(2, acc.getName());
					ps.setLong(3, acc.getAadhar());
					ps.setString(4, acc.getPanNo());
					ps.setLong(5, acc.getAmount());
					ps.setString(6, acc.getAddress());
					ps.setInt(7, acc.getAge());
					ps.setString(8, acc.getGender());
					ps.setString(9, acc.getEmail());
	
					ResultSet rs = ps.executeQuery();
	
					tf1.setText(" ENETR AADHAR NUMBER ");
					tf2.setText(" FULL NAME ");
					tf3.setText(" AADHAR NUMBER ");
					tf4.setText(" PAN NUMBER  ");
					tf5.setText(" AMOUNT  ");
					tf6.setText(" FULL  ADDRESS   ");
					tf7.setText(" AGE  ");
					tf8.setText("  MALE OR FEMALE ");
					tf9.setText(" EMAIL ID  ");
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}

	public static void main(String[] args) {
		createaccount af = new createaccount();
		af.setSize(600, 600);

		af.setTitle("create new account");
		af.setVisible(true);

	}

}
