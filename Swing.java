import javax.swing.*;
//import java.awt.event.*;

public class Swing{

	String city[]={"None","Mumbai","Delhi","Chennai","Bangalore"};
	JFrame f=new JFrame();
	JButton b= new JButton("Submit");
	JLabel lname=new JLabel("Name");
	JLabel lcity=new JLabel("City:");
	JLabel lgender= new JLabel("Gender :");
	JLabel lpassword=new JLabel("Password");
	JLabel lpno=new JLabel("Phone Number");
	JRadioButton rb1=new JRadioButton("Male");
	JRadioButton rb2=new JRadioButton("Female");
	JCheckBox cb=new JCheckBox("Terms and Conditions");
	JPasswordField pf=new JPasswordField();
	JTextField name=new JTextField();
	JTextField pno=new JTextField();
	JComboBox li=new JComboBox(city);



	Swing(){
		
		f.setSize(800,800);
		f.setLayout(null);
		f.setVisible(true);

		lname.setBounds(150,100,100,30);
		f.add(lname);

		name.setBounds(300,100,200,30);
		f.add(name);

		lpno.setBounds(150,150,100,30);
		f.add(lpno);

		pno.setBounds(300,150,200,30);
		f.add(pno);

		lpassword.setBounds(150,200,100,30);
		f.add(lpassword);

		pf.setBounds(300,200,200,30);
		f.add(pf);

		lcity.setBounds(100,300,75,30);
		f.add(lcity);

		li.setBounds(200,300,150,30);
		f.add(li);

		lgender.setBounds(400,300,75,30);
		f.add(lgender);

		rb1.setBounds(500,300,150,30);
		f.add(rb1);
		rb2.setBounds(500,350,150,30);
		f.add(rb2);

		cb.setBounds(250,600,150,30);
		f.add(cb);

		b.setBounds(250,650,100,30);
		f.add(b);


	}

	public static void main(String[] args) {
		Swing s=new Swing();
	}
}