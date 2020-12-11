import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.JOptionPane;

public class LoveGuru extends JFrame{
	JLabel label,label2;
	JButton mineButton;
	JFrame frame;
	public LoveGuru(String name) {
		init(name);
		//System.out.println(pass);
		
	}
	
	public void init(String name) {
		setLayout(new GridLayout(4, 1));
		label = new JLabel("                              Welcome.... "+name.toUpperCase());
		label.setBounds(10,5,10,20);
		label.setFont(new Font("TimesRoman", Font.BOLD, 15));
		add(label,BorderLayout.CENTER);
		this.add(label);
		
		label2 = new JLabel("  Love GURU wants to know about you and your partner.....");
		label2.setBounds(10, 30, 30, 50);
		label2.setFont(new Font("TimesRoman", Font.BOLD, 14));
		//add(label2,BorderLayout.CENTER);
		this.add(label2);
		
		mineButton = new JButton("Input Your Info");
		mineButton.setBounds(10,35,15,20);
		mineButton.setBackground(new Color(59, 89, 182));
		mineButton.setForeground(Color.WHITE);
		   // logButton.setFocusPainted(false);
		mineButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		mineButton.setToolTipText("Give your information to help love-guru");
		HandlerClass handler = new HandlerClass();
		mineButton.addMouseListener(handler);
		mineButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				MyInfo my= new MyInfo();
				my.setSize(400,200);
				my.setVisible(true);
				my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				my.setLocationRelativeTo(null);
			}
		});
		this.add(mineButton);
		
		 addWindowListener(new WindowAdapter() {
		    	@Override
		    	public void windowClosing(WindowEvent event) {
		    		if(JOptionPane.showConfirmDialog(frame,"Are you sure you want to close this window?","close window",
		    				JOptionPane.YES_NO_OPTION,JOptionPane.OK_OPTION)==JOptionPane.YES_OPTION) {
		    			System.exit(0);
		    		}
		    		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		    	}
			});
		    
		
	/*	partnersButton = new JButton("Input Your Partners Info");
		partnersButton.setBounds(10,60,20,20);
		partnersButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				PartnersInfo partner = new PartnersInfo();
				partner.setSize(300,150);
				partner.setVisible(true);
				partner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		this.add(partnersButton);*/
		
	}
	class HandlerClass extends MouseAdapter{

		public void mouseEntered(MouseEvent event) {
			mineButton.setBackground(Color.GRAY);
		}
		public void mouseExited(MouseEvent event) {
			mineButton.setBackground(new Color(50, 80, 170));
		}
		
	}

}
