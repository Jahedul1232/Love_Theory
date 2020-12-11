import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.sql.Array;

//import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import java.util.Arrays;

//import oracle.jrockit.jfr.JFRStats;

public class LoginPage extends JFrame{
	private JTextField namefield,username,passname;
	private JPasswordField passfield;
	private JButton logButton;
	JFrame frame;
	
	public LoginPage() {
		super("log in page");
		init();
	}
	public void init() {
		
		Container c = getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		c.setLayout(new GridLayout(3,2,0,15));
		
		username= new JTextField("               Username");
		username.setBounds(10,10,10,20);
		username.setEditable(false);
		//username.setSelectedTextColor(Color.WHITE);
		//username.setBackground(Color.cyan);
		c.add(username);
		
		namefield = new JTextField(" ");
		//namefield.setEditable(true);
		namefield.setBounds(35,10,20,20);
	    c.add(namefield);
	    
	    passname= new JTextField("               Password");
	    passname.setBounds(5,30,20,20);
	    passname.setEditable(false);
	   // passname.setBackground(Color.blue);
	    add(passname);
	   // String p = passfield.getText();
	    
	    passfield = new JPasswordField(20);
	    passfield.setBounds(35,30,20,20);
	    add(passfield); 
	 //   Handler handler = new Handler();
	   // passfield.addActionListener(handler);
	    
	 /*   addWindowListener(new WindowAdapter() {
	    	@Override
	    	public void windowClosing(WindowEvent event) {
	    		if(JOptionPane.showConfirmDialog(frame,"Are you sure you want to close this window?","close window",
	    				JOptionPane.YES_NO_OPTION,JOptionPane.OK_OPTION)==JOptionPane.YES_OPTION) {
	    			System.exit(0);
	    		}
	    		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    	}
		});*/
	    
	    
	    logButton = new JButton("Log in");
	   // logButton.setBounds(20, 50, 20, 10);
	    logButton.setBackground(new Color(59, 89, 182));
	    logButton.setForeground(Color.WHITE);
	   // logButton.setFocusPainted(false);
	    logButton.setFont(new Font("Tahoma", Font.BOLD, 12));
	    logButton.setToolTipText("Click here to log in");
	   // System.out.println(p);
	  //  String p=new String (passfield.getText());
	    // System.out.println(p);
	    logButton.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			    String p =namefield.getText();
				String s = passfield.getText();
				if(s.contentEquals("jahed")) 
				{
					
					//for null username
					 if(p.equals(" ")) 
						{ 
							JOptionPane.showMessageDialog(null, "Please fill every option", "Empty username",JOptionPane.ERROR_MESSAGE);
						}
					 else  
					 {
				LoveGuru guru = new LoveGuru(namefield.getText());
				guru.setSize(400,200);
				guru.setVisible(true);
				System.out.println(p);
				guru.setLocationRelativeTo(null);
				guru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 }
					 
					 
				}
				else
					{
						JOptionPane.showMessageDialog(null, "Invalid Password Try Again", "Log-in Error",JOptionPane.ERROR_MESSAGE);
					}
			}
			
		});
	    
	    c.add(logButton,BorderLayout.CENTER);
	    
	    
	     
	}
}
    class Show{
    	
    	public static void main(String[] args) {
    	LoginPage p = new LoginPage();
    	p.setSize(400,200);
    	p.setVisible(true);
    	//p.setBackground(Color.BLACK);
    	p.setLocationRelativeTo(null);
    }
  }



