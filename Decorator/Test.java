package Proiect;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;

//Application

public class Test extends JFrame implements ActionListener 
{
	
	static JFrame fr;																			// FRAME
	static JTextField rez;																		// TEXTFIELD
	

	public static void main(String[] args) 
	{
		
		fr = new JFrame ("Home Decorator");														// Creates a new FRAME with the title "Home Decorator"
		fr.getContentPane().setBackground(new Color(128, 128, 175));							// Makes the background purple
		fr.setBounds(100, 100, 643, 601);														// Sets the size of the window 
		fr.setLayout(null);																		// We can position our components anywhere
		fr.setVisible(true);																	// Makes the frame visible
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);										// When we Close the window it doesn't appear in the task manager either
		fr.getContentPane().setLayout(null);													// Makes the objects visible
		
		
		
		rez = new JTextField("Decorati-va propria sufragerie!");								// Creates object of type textfield where we display results
		rez.setEditable(false);																	// The text can not be edited by the user
		rez.setBounds(51, 46, 539, 48);															// Defining the size of the text box
		fr.getContentPane().add(rez);															// Adding the object rez to the frame
		rez.setColumns(10);																		// Maximum space 
		
		DefaultListModel<String> c = new DefaultListModel<>();									// Object of type list
		
		c.addElement("Coltar");																	// Adding elements 
		c.addElement("Simpla -2 pers");
		c.addElement("Simpla -4 pers");
		c.addElement("Fara");
		
		JList canapea = new JList(c);															// Creating list Canapea
		
		canapea.setBackground(new Color(192, 192, 192));	 									// Setting the background colour of the list 
		canapea.setFont(new Font("Tahoma", Font.PLAIN, 15));									// Setting font of the title of elements in the list
		canapea.setBounds(51, 219, 111, 80);													// Setting size of the list
		fr.getContentPane().add(canapea);														// Adding the list to the frame
		
		
		//The previous comments apply for all the lists created (Televizor, Scaune, Masa, Masuta_cafea, Ornamente, Fotolii)
		
		DefaultListModel<String> t = new DefaultListModel<>();
		
		t.addElement("Mic");
		t.addElement("Mediu");
		t.addElement("Mare");
		t.addElement("Fara");
		
		JList televizor = new JList(t);

		televizor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		televizor.setBackground(Color.LIGHT_GRAY);
		televizor.setBounds(195, 219, 111, 80);
		fr.getContentPane().add(televizor);
		
		DefaultListModel<String> m = new DefaultListModel<>();
		
		m.addElement("Sticla");
		m.addElement("Lemn");
		m.addElement("Marmura");
		m.addElement("Fara");
		
		JList masa = new JList(m);
		
		masa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		masa.setBackground(Color.LIGHT_GRAY);
		masa.setBounds(340, 219, 111, 80);
		fr.getContentPane().add(masa);
		
		DefaultListModel<String> o = new DefaultListModel<>();
		
		o.addElement("Semineu");
		o.addElement("Flori");
		o.addElement("Tablouri");
		o.addElement("Fara");
		
		JList ornament = new JList(o);
		
		ornament.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ornament.setBackground(Color.LIGHT_GRAY);
		ornament.setBounds(485, 219, 111, 80);
		fr.getContentPane().add(ornament);
		
		DefaultListModel<String> f = new DefaultListModel<>();
		
		f.addElement("Simple");
		f.addElement("Cu masaj");
		f.addElement("De piele");
		f.addElement("Fara");
		
		JList fotolii = new JList(f);
		
		fotolii.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fotolii.setBackground(Color.LIGHT_GRAY);
		fotolii.setBounds(51, 407, 111, 80);
		fr.getContentPane().add(fotolii);
		
		DefaultListModel<String> mc = new DefaultListModel<>();
		
		mc.addElement("Patrata");
		mc.addElement("Rotunda");
		mc.addElement("Ovala");
		mc.addElement("Fara");
		
		JList masuta_cafea = new JList(mc);
		
		masuta_cafea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		masuta_cafea.setBackground(Color.LIGHT_GRAY);
		masuta_cafea.setBounds(195, 407, 111, 80);
		fr.getContentPane().add(masuta_cafea);
		
		DefaultListModel<String> s = new DefaultListModel<>();
		
		s.addElement("Lemn");
		s.addElement("Plastic");
		s.addElement("Sticla");
		s.addElement("Fara");
		
		JList scaune = new JList(s);
		
		scaune.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scaune.setBackground(Color.LIGHT_GRAY);
		scaune.setBounds(340, 407, 111, 80);
		fr.getContentPane().add(scaune);
		
		// The next objects of type TextField are used so that the users knows what he is choosing
		// We set the messages that are displayed
		// The user can not edit them
		// We set the size of each 
		// We add all the objects to the frame
		
		TextField titlu1 = new TextField();
		titlu1.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu1.setText("Tip Canapea ");
		titlu1.setEditable(false);
		titlu1.setBounds(51, 175, 111, 21);
		fr.getContentPane().add(titlu1);
		
		TextField titlu3 = new TextField();
		titlu3.setText("Tip Televizor ");
		titlu3.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu3.setEditable(false);
		titlu3.setBounds(195, 175, 111, 21);
		fr.getContentPane().add(titlu3);
		
		TextField titlu5 = new TextField();
		titlu5.setText("Tip Masa");
		titlu5.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu5.setEditable(false);
		titlu5.setBounds(340, 175, 111, 21);
		fr.getContentPane().add(titlu5);
		
		TextField titlu7 = new TextField();
		titlu7.setText("Tip Ornamente");
		titlu7.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu7.setEditable(false);
		titlu7.setBounds(485, 175, 111, 21);
		fr.getContentPane().add(titlu7);
		
		TextField titlu2 = new TextField();
		titlu2.setText("Tip Fotolii");
		titlu2.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu2.setEditable(false);
		titlu2.setBounds(51, 369, 111, 21);
		fr.getContentPane().add(titlu2);
		
		TextField titlu4 = new TextField();
		titlu4.setText("Tip Masa cafea");
		titlu4.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu4.setEditable(false);
		titlu4.setBounds(195, 369, 111, 21);
		fr.getContentPane().add(titlu4);
		
		TextField titlu6 = new TextField();
		titlu6.setText("Tip Scaune");
		titlu6.setFont(new Font("Calibri", Font.BOLD, 12));
		titlu6.setEditable(false);
		titlu6.setBounds(340, 369, 111, 21);
		fr.getContentPane().add(titlu6);
		
		JButton calculeaza = new JButton("Calculeaza");									// Creates the button 'Calculeaza' and when it's pressed the result it will be displayed in the rez textfield
		calculeaza.setFont(new Font("Tahoma", Font.PLAIN, 15));							// Setting the font of the text in the button
		calculeaza.setBackground(new Color(250, 160, 160));								// Setting the colour of the button
		calculeaza.setBounds(485, 395, 111, 36);										// Setting the size of the button
		fr.getContentPane().add(calculeaza);											// Adds the button to the frame
		calculeaza.addActionListener(new ActionListener() 								// Creating actionListener for the button 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(canapea.getSelectedIndex() != -1)									// If an option is selected 
				{  
					int p = 0;															// Variable p stores the price
					String data = (String) canapea.getSelectedValue();					// String data holds the name of the option selected
					
					// Switch statements to add to the price the correct values according to the options selected 
					switch(data)														
					{
					case "Coltar":
						p = p + 1200;
						break;
					case "Simpla -2 pers": 
						p = p + 1000;
						break;
					case "Simpla -4 pers":
						p = p + 1600;
						break;
					case "Fara":
						p = p + 0;
						break;
					default:
						p = p + 0;
					}
					
					data = (String) fotolii.getSelectedValue();
					
					switch(data)
					{
					case "Simple":
						p = p + 500;
						break;
					case "Cu masaj":
						p = p+ 1000;
						break;
					case "De piele":
						p = p + 800;
						break;
					case "Fara":
						p = p + 0;
						break;
					default: p = p + 0;
					}
					
					data = (String) televizor.getSelectedValue();
					
					switch(data)
					{
					case "Mic":
						p = p + 700;
						break;
					case "Mediu":
						p = p + 1200;
						break;
					case "Mare":
						p = p + 2200;
						break;
					case "Fara":
						p = p + 0;
						break;
					default: p = p + 0;
					}
					
					data = (String) scaune.getSelectedValue();
					
					switch(data)
					{
					case "Lemn":
						p = p + 360;
						break;
					case "Plastic":
						p = p + 250;
						break;
					case "Sticla":
						p = p + 550;
						break;
					case "Fara":
						p = p + 0;
						break;
					default: p = p + 0;
					}
					
					data = (String) masa.getSelectedValue();
					
					switch(data)
					{
					case "Sticla":
						p = p + 700;
`						break;
					case "Lemn":
						p = p + 400;
						break;
					case "Marmura":
						p = p + 1000;
						break;
					case "Fara":
						p = p + 0;
						break;
					default: p = p + 0;
					}
					
					data = (String) masuta_cafea.getSelectedValue();
					
					switch(data)
					{
					case "Patrata":
						p = p + 300;
						break;
					case "Rotunda":
						p = p + 350;
						break;
					case "Ovala":
						p = p + 400;
						break;
					case "Fara":
						p = p + 0;
						break;
					default: p = p + 0;
					}
					
					data = (String) ornament.getSelectedValue();
					
					switch(data)
					{
					case "Semineu":
						p = p + 2000;
						break;
					case "Flori":
						p = p + 400;
						break;
					case "Tablouri":
						p = p + 800;
						break;
					case "Fara":
						p = p + 0;
						break;
					default: p = p + 0;
					}
					p = p + 1000;
					//We display the final price in the rez TextField 
					rez.setText("Pretul redecorarii este " + p);
				}  
				
			}
			
		});
		
		
		Test te = new Test();
		
		JButton sterge = new JButton("Sterge");												// Creating the button 'Sterge' that erases the text from rez when it's pressed
		sterge.setFont(new Font("Tahoma", Font.PLAIN, 15));									// Setting the font of the name of the button
		sterge.setBackground(new Color(250, 160, 160));										// Setting the colour of the button
		sterge.setBounds(485, 451, 111, 36);												// Setting the size of the button
		fr.getContentPane().add(sterge);													// Adding the button to the frame
		sterge.addActionListener(te);														// Adding the action listener
		
	}
	// End of main
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String s = e.getActionCommand();
	
		if (s == "Sterge")
		{
			rez.setText(" ");
		}
		
		// When the button is pressed the text erases
		
	}
}
