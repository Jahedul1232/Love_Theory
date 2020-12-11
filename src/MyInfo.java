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

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javafx.scene.control.ComboBox;

public class MyInfo extends JFrame{
    
	private JTextField gender,age,visit,question1,question2;
	private JRadioButton male,female,yesAns,noAns,question2op2;
	private JButton partnersButton;
	public JComboBox ag,vis;
	private String ages[]= {"  <15","15-17","18-20","21-23","24-26","  >26"};
	//private String genderAns;
	//private String question1Ans = "";
	
	private String visits[]= {"  often","once a week","once a month","  rare","very rare"};
	private ButtonGroup radioGroup;
	//private JLabel 
	
	public MyInfo() {
		super("Your Info:");
		init();
		
	}
	public void init() {
	     Container C = getContentPane();
		C.setLayout(new FlowLayout());
		//gender radioButton
		
		gender= new JTextField("   Gender",5);
		gender.setBounds(5,5,20,10);
		gender.setEditable(false);
		add(gender);
		male = new JRadioButton("male");
		C.add(male);
		
		female = new JRadioButton("female",false);
		C.add(female);
	
		//question1 radiobuuton
		question1 = new JTextField();
		question1.setText("Did you sacrifice anything for your partner?");
		question1.setEditable(false);
		C.add(question1);
		yesAns = new JRadioButton("Yes",false);
		C.add(yesAns);
		noAns = new JRadioButton("No",false);
		C.add(noAns);
		
		/*if(yesAns.isSelected()) {
			question1Ans = yesAns.getText();
		}
		else
		{ 
			question1Ans = noAns.getText();
		}*/
		
		ButtonHandler handler = new ButtonHandler();
		male.addItemListener(handler);
		female.addItemListener(handler); 
		
		radioGroup = new ButtonGroup();
		radioGroup.add(male);
		radioGroup.add(female);
		
		
	  // for(AbstractButton button : radioGroup.getElements()) {
		   
		//   if(button.isSelected())
			//   question1Ans = button.getText();
	//   }
		//System.out.println(genderAns);
		//javax.swing.JOptionPane.showMessageDialog(MyInfo.this, genderAns);
		
		//age checkbox
		age= new JTextField("   Ur age",6);
		age.setBounds(5,25,10,20);
		age.setEditable(false);
		add(age);
		ag = new JComboBox<>(ages);
		ag.setMaximumRowCount(3);
		ag.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				//String myage=ag.getSelectedItem().toString();
				
				
			}
		});
		C.add(ag);

		//Visit combo
		visit = new JTextField("You visit ur partner",10);
		visit.setEditable(false);
		this.add(visit);
	    
		vis = new JComboBox(visits);
		vis.setMaximumRowCount(3);
		vis.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		this.add(vis);
		
		partnersButton = new JButton("Input ur Prtners Info");
		partnersButton.setBounds(10,10,20,20);
		partnersButton.setBackground(new Color(59, 89, 182));
		partnersButton.setForeground(Color.WHITE);
		   // logButton.setFocusPainted(false);
		partnersButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		partnersButton.setToolTipText("Give information to match");
		add(partnersButton,BorderLayout.SOUTH);
		partnersButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    //information collecting and sending......
				String myage=ag.getSelectedItem().toString();
				
				String visit=vis.getSelectedItem().toString();
				//System.out.println(visit);
			   
			/*	if(male.isSelected()) {
					String genderAns= gender.getSelectedText();
				}
				else if(female.isSelected())
				{
					String genderAns= gender.getSelectedText();
				}
				*/
				//System.out.println(genderAns);
				String genderAns = gender.getText();
				
				PartnersInfo info = new PartnersInfo(myage,visit);
				info.setSize(400,200);
				
				info.setVisible(true);
				info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				info.setLocationRelativeTo(null);
			}
		});
		this.add(partnersButton);
		
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
        class ButtonHandler implements ItemListener{
    	public void itemStateChanged(ItemEvent e) {
    		
    		//gender.repaint();
        // genderAns = gender.getSelectedItem().toString();
    		
    		// if(e.getStateChange()==1)
    			// handler.genderAns = "male";
                
    			
    		
    	}
    }



