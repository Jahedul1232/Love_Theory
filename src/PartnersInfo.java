
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
                              
public class PartnersInfo extends JFrame {
	
	private JTextField name,nameInput,age,sacrifice,similar;
	private JComboBox ag;
	private JRadioButton yesAns,noAns,yes,no;
	private JButton doneButton;
	private String ages[]= {"<15","15-17","18-20","21-23","24-26",">26"};
	private int valueage = 0 ;
	private int	valuevisits = 0;
	private String sacrificeAns= "";
	private ButtonGroup radioGroup;
	
	public PartnersInfo(String myage,String visits) {
		super("Partners Info");
		//System.out.println(visits);
		init(myage,visits);
		
	 
	}
	public void init(String myage,String visits) {
		 Container C = getContentPane();
			C.setLayout(new FlowLayout());
			
			name= new JTextField("Your partners name is:",12);
			name.setBounds(5,5,20,10);
			name.setEditable(false);
			C.add(name);
			nameInput= new JTextField(10);
			nameInput.setBounds(5,5,20,10); 
			C.add(nameInput);  
			
			sacrifice= new JTextField("Did Your partner sacrifice anything for u?",22);
			sacrifice.setBounds(5,5,30,10);
			sacrifice.setEditable(false);
			C.add(sacrifice);
			
			yesAns = new JRadioButton("Yes",false);
			C.add(yesAns);
			noAns = new JRadioButton("No",false);
			C.add(noAns);
			
		/*		if(yesAns.isSelected()) {
					sacrificeAns = yesAns.getText();
			}
			else
			{ 
				sacrificeAns = noAns.getText();
			}*/
	     	  	ButtonHandler handler = new ButtonHandler();
	     	  	yesAns.addItemListener(handler);
	     	  	noAns.addItemListener(handler);
				
				//radioGroup = new ButtonGroup();
				//radioGroup.add(male);
				//radioGroup.add(female);

	     	  	similar= new JTextField("Does ur partner have thing similar to u?",20);
	     	  	similar.setBounds(5,5,30,10);
	     	  	similar.setEditable(false);
				C.add(similar);
				
				yes = new JRadioButton("Yes",false);
				C.add(yes);
				no = new JRadioButton("No",false);
				C.add(no);
				
				yes.addItemListener(handler);
	     	  	no.addItemListener(handler);
				radioGroup = new ButtonGroup();
				radioGroup.add(yes);
				radioGroup.add(no);
				
			
			age= new JTextField("Enter ur partners age",25);
			age.setBounds(5,5,20,10);
			age.setEditable(false);
			C.add(age);
			
			//System.out.println(visits+myage);
			ag= new JComboBox<>(ages);
			ag.setMaximumRowCount(3);
			ag.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
			this.add(ag);
			
			 //for ages
			 if(myage == "<15") 
				 valueage = 15;
			 else if(myage == "15-17")
				 valueage = 17;
			 else if(myage == "18- 20")
				 valueage = 20;
			 else if(myage == "21-23")
				 valueage = 23;
			 else if(myage == "24-26")
				 valueage = 26;
			 else if(myage == ">26")
				 valueage = 29;  
			   
			 //for visits
			 if(visits == "  often") 
				 valuevisits = 25;
			 else if(visits == "once a week")
				 valuevisits = 23;
			 else if(visits == "once a month")
				 valuevisits = 18;
			 else if(visits == "  rare")
				 valuevisits = 12;
			 else if(visits == "very rare")
				 valuevisits = 8; 
			  
			 
			doneButton = new JButton("Done");
			doneButton.setBounds(20,50,30,10);
			doneButton.setBackground(new Color(59, 89, 182));
			doneButton.setForeground(Color.WHITE);
			   // logButton.setFocusPainted(false);
			doneButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			add(doneButton,BorderLayout.SOUTH);
			doneButton.addActionListener(new ActionListener() {
				 
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					String partnersages=ag.getSelectedItem().toString();
					Result result = new Result(nameInput.getText(),partnersages,valueage,valuevisits);
					result.setSize(400, 200);
					result.setVisible(true);
					result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					result.setLocationRelativeTo(null);
				}  
			}); 
			this.add(doneButton);
			
			 addWindowListener(new WindowAdapter() {
			    	@Override
			    	public void windowClosing(WindowEvent event) {
			    		if(JOptionPane.showConfirmDialog(C,"Are you sure you want to close this window?","close window",
			    				JOptionPane.YES_NO_OPTION,JOptionPane.OK_OPTION)==JOptionPane.YES_OPTION) {
			    			System.exit(0);
			    		}
			    		
			    
			    		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			    	}
				});
			}
}
