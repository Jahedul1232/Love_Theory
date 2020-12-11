import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Result extends JFrame{
	
	JLabel label,label1,label2;
	private int result = 55;
	int valuesage = 0;
	public Result(String name,String partnersage,int myage,int valuevisit) {
		super("Love Guru");
		 if(partnersage == "<15") 
			    valuesage = 15;
			    else if(partnersage == "15-17")
			    valuesage = 17;
			    else if(partnersage == "18- 20")
			    valuesage = 20; 
			    else if(partnersage == "21-23")
			    valuesage = 23; 
			    else if(partnersage == "24-26")
			    valuesage = 26;
			    else if(partnersage == ">26")
			    valuesage = 29;
			    //comparing of ages.....

			    if(valuesage == myage)
			    result += 20;
			    else if(Math.abs(valuesage- myage)>=3)
			    result += 18;
			    else if(Math.abs(valuesage- myage)>=6 )
			    result += 14;
			    else if(Math.abs(valuesage- myage)>=9 )
			    result += 10;
			    else 
			    result +=7;
			    
			    result +=valuevisit;
			   // System.out.println(valuevisit);
		init( name,result);	 
	}
	public void init(String names,int result) {
		Container c= getContentPane(); 
		setLayout(new GridLayout(3,1));
		label= new JLabel("   Love Guru thinks Your connection with "+names.toUpperCase()+" is ");
		label.setBounds(5, 10, 50, 15);
		 label.setFont(new Font("TimesRoman", Font.BOLD, 15));
	    c.add(label,BorderLayout.CENTER);
	    
	    label1 = new JLabel("                          "+result+"%");
	    label1.setBounds(20,100, 20, 20);
	    label1.setFont(new Font("TimesRoman", Font.BOLD, 25));
	    c.add(label1,BorderLayout.CENTER);
	    
	    label2= new JLabel("-------------------------- Thank you for using---------------------------");
	    label2.setBounds(20,100, 20, 20);
	    label2.setFont(new Font("TimesRoman", Font.BOLD, 15));
	    c.add(label2,BorderLayout.CENTER);
	  // System.out.println(ages); 
	    addWindowListener(new WindowAdapter() {
	    
	    	@Override
	    	public void windowClosing(WindowEvent event) {
	    		if(JOptionPane.showConfirmDialog(c,"Are you sure you want to close this window?","close window",
	    				JOptionPane.YES_NO_OPTION,JOptionPane.OK_OPTION)==JOptionPane.YES_OPTION) {
	    			System.exit(0);
	    		}
	    		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    		setBackground(Color.RED);
	    	}
		});
	    
	  /*   if(ages == "<15") 
	    valuesage = 15;
	    else if(ages == "15-17")
	    valuesage = 17;
	    else if(ages == "18- 20")
	    valuesage = 20;
	    else if(ages == "21-23")
	    valuesage = 23;
	    else if(ages == "24-26")
	    valuesage = 26;
	    else if(ages == ">26")
	    valuesage = 29;
	    //comparing of ages.....

	    if(valuesage == myage)
	    result = 20;
	    else if(Math.abs(valuesage- myage)<=2)
	    result = 18;
	    else if(Math.abs(valuesage- myage)<=5 )
	    result = 15;
	    else if(Math.abs(valuesage- myage)<=10 )
	    result = 10;
	    else {
	    result =7;*/
	    }
	    
	}

