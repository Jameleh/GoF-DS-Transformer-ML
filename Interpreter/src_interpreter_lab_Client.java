package interpreter.lab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Client {
	
	private Context con;
	
	public Client(Context ct) {
		this.con = ct;	
	}

	public static void main(String[] args) {
		
		Client res = new Client(new Context());
		
		int _width = 500;
		int _height = 600;
		
		JFrame win = new JFrame("Text Editor");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(_width, _height);
		win.setVisible(true);
		
		JPanel pane = new JPanel();
		JTextArea txt = new JTextArea();
		txt.setBounds(10, 10, _width-30, 3*_height/4);
		
		
		JButton butt = new JButton();
		butt.setText("Fix");
		butt.setBounds(_width/2 - _width/10, _height - _height/8 , _width/5, _height/20 );
		
		butt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String text = txt.getText();
				txt.setText(res.interpret(text));
				
			}
			
		});
		
		pane.setLayout(null);
		pane.add(butt);
		pane.add(txt);
		win.add(pane);		
		
	}

	private String interpret(String text) {
		
		String res = "";
		Expression exp;
		
		exp = new ManySpaces(text);
		res = exp.interpret(con);
		
		exp = new HyphenDash(res);
		res = exp.interpret(con);
		
		exp = new AmissSpaces(res);
		res = exp.interpret(con);
		
		exp = new Quotes(res);
		res = exp.interpret(con);
		
		exp = new LineFeeds(res);
		res = exp.interpret(con);
		
		exp = new Tabs(res);
		res = exp.interpret(con);
		
		return res;
		
	}
}
