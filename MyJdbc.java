import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyJdbc {
	static final String DB_URL = "jdbc:mysql://localhost:3307/1824005";
	static final String USER = "";
	static final String PASS = "";

	public static void main(String[] args) {
		JFrame f= new JFrame("Registration Form");
		JLabel l1,l2,name,dob,course,gender,marks;
		JTextField t1,t2,t3;
		l1=new JLabel("Somaiya University");
		l1.setBounds(130,10,250,30);
		l1.setFont(new Font("Serif", Font.PLAIN, 24));
		l2=new JLabel("Admission Form 2018-19");
		l2.setFont(new Font("Serif", Font.PLAIN, 20));
		l2.setBounds(120,40,250,30);
		f.add(l1);
		f.add(l2);
		name=new JLabel("Name: ");
		name.setBounds(50,90,50,30);
		name.setFont(new Font("Serif", Font.PLAIN, 16));
		f.add(name);
		t1=new JTextField(" Name");
		t1.setBounds(100,90,200,30);
		f.add(t1);
		dob=new JLabel("DOB: ");
		dob.setBounds(50,140,50,30);
		dob.setFont(new Font("Serif", Font.PLAIN, 16));
		f.add(dob);
		t2=new JTextField(" DD/MM/YYYY");
		t2.setBounds(100,140,200,30);
		f.add(t2);

		gender=new JLabel("Gender: ");
		gender.setBounds(50,190,60,30);
		gender.setFont(new Font("Serif", Font.PLAIN, 16));
		f.add(gender);

		JRadioButton r1=new JRadioButton(" Male");
		JRadioButton r2=new JRadioButton(" Female");
		r1.setBounds(120,190,60,30);
		r2.setBounds(180,190,70,30);
		r1.setActionCommand("M");
		r2.setActionCommand("F");
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		f.add(r1);
		f.add(r2);

		course=new JLabel("Course/s: ");
		course.setBounds(50,240,80,30);
		course.setFont(new Font("Serif", Font.PLAIN, 16));
		f.add(course);
		JCheckBox civil = new JCheckBox("Civil");
		civil.setBounds(120,240,50,30);
		f.add(civil);
		JCheckBox mech = new JCheckBox("Mech");
		mech.setBounds(170,240,60,30);
		f.add(mech);
		JCheckBox it = new JCheckBox("I.T");
		it.setBounds(230,240,50,30);
		f.add(it);
		JCheckBox cse = new JCheckBox("CSE");
		cse.setBounds(280,240,50,30);
		f.add(cse);
		
		marks=new JLabel("Marks: ");
		marks.setBounds(50,290,80,30);
		marks.setFont(new Font("Serif", Font.PLAIN, 16));
		f.add(marks);
		t3=new JTextField(" Percentage (%)");
		t3.setBounds(100,290,100,30);
		f.add(t3);

		JButton submit,clear,exit;
		submit = new JButton("Submit");
		submit.setBounds(150,360,90,30);
		f.add(submit);
		clear = new JButton("Clear");
		clear.setBounds(50,360,90,30);
		f.add(clear);
		exit = new JButton("Exit");
		exit.setBounds(250,360,90,30);
		f.add(exit);
		
		JLabel er = new JLabel("");
		er.setBounds(130,410,200,30);
		er.setFont(new Font("Serif", Font.PLAIN, 16));
		f.add(er);
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		submit.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
            	int flag=0;
            	if(t1.getText().equals(" Name")) flag=1;
            	if(t2.getText().equals(" DD/MM/YYYY")) flag=2;
            	if(t3.getText().equals(" Percentage (%)")) flag=3;
            	if(flag == 0){
	            	Connection conn = null;
					Statement stmt = null;
					try{
						Class.forName("com.mysql.jdbc.Driver");
						System.out.println("Connecting to database...");
						conn = DriverManager.getConnection(DB_URL,USER,PASS);
						System.out.println("Creating statement...");
						stmt = conn.createStatement();
						String sql,n,dt,g;
						float m=0;
						int civilchk=0,mechchk=0,csechk=0,itchk=0;
						n = t1.getText();
						dt = t2.getText();
						m = Integer.parseInt(t3.getText());
						g = bg.getSelection().getActionCommand();
						if(civil.isSelected())
							civilchk = 1;
						if(mech.isSelected())
							mechchk = 1;
						if(it.isSelected())
							itchk = 1;
						if(cse.isSelected())
							csechk = 1;
						sql = "INSERT INTO `admission` VALUES ('"+n+"','"+dt+"','"+g+"',"+m+","+civilchk+","+mechchk+","+itchk+","+csechk+");";
						stmt.executeUpdate(sql);
						stmt.close();
						conn.close();
					}catch(SQLException se){
						se.printStackTrace();
					}catch(Exception se){
						se.printStackTrace();
					}finally{
						try{
							if(stmt!=null)
							stmt.close();
						}catch(SQLException se2){}
						try{
							if(conn!=null)
								conn.close();
						}catch(SQLException se){
							se.printStackTrace();
						}
						er.setText("Form Successfully Filed !");
						f.remove(t1);
						f.remove(t2);
						f.remove(t3);
						f.remove(name);
						f.remove(dob);
						f.remove(gender);
						f.remove(marks);
						f.remove(r1);
						f.remove(r2);
						f.remove(submit);
						f.remove(clear);
						f.remove(cse);
						f.remove(it);
						f.remove(mech);
						f.remove(civil);
						f.remove(course);
						f.repaint();
						exit.setBounds(150,360,90,30);
					}
				}
				else{
					System.out.println(flag);
					switch (flag) {
						case 1 : er.setText("Enter the Name !");
								 break;
						case 2 : er.setText("Enter the DOB !");
								 break;
						case 3 : er.setText("Enter the Marks !");
								 break;
					}

				}
		   	}  
    	});
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t1.setText(" Name");
				t2.setText(" DD/MM/YYYY");
				t3.setText(" Percentage (%)");
				civil.setSelected(false);
				mech.setSelected(false);
				it.setSelected(false);
				cse.setSelected(false);	
			}
		});
		t1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				t1.setText("");
				er.setText("");
				//t1.setFocus();
			}
		});
		t2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				t2.setText("");
				er.setText("");
			}
		});
		t3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				t3.setText("");
				er.setText("");
			}
		});
		t1.addFocusListener(new FocusAdapter(){
			public void focusLost(FocusEvent e) {
				if(t1.getText().equals(""))
					t1.setText(" Name");
			}
		});
		t2.addFocusListener(new FocusAdapter(){
			public void focusLost(FocusEvent e) {
				if(t2.getText().equals(""))
					t2.setText(" DD/MM/YYYY");
			}
		});
		t3.addFocusListener(new FocusAdapter(){
			public void focusLost(FocusEvent e) {
				if(t3.getText().equals(""))
					t3.setText(" Percentage (%)");
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450,550);
		f.setLayout(null);
		f.setVisible(true);
	}
}