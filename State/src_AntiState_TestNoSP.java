package AntiState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestNoSP extends JFrame
        implements ActionListener {
    // GUI attributes.
    private Button pushButton = new Button("Push Operation");
    private Button pullButton = new Button("Pull Operation");
    private Button exitButton = new Button("Exit");
    private JPanel buttonPanel = new JPanel();
    private Canvas canvas =new Canvas();
    private ContextNoSP context = null;

    public TestNoSP() {
        super("No State Pattern");
        context = new ContextNoSP();
        setupWindow();
    }

    private void setupWindow() {
        canvas.setBackground(Color.red);
        canvas.setSize(200, 100);
        pushButton.setForeground(Color.black);
        pullButton.setForeground(Color.black);
        exitButton.setForeground(Color.black);
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(pullButton);
        buttonPanel.add(pushButton);
        buttonPanel.add(exitButton);

        this.setLayout(new FlowLayout());
        /*this.add(pushButton);
        this.add(pullButton);
        this.add(exitButton);
        or we can add them all to the buttonPanel*/
        this.add(buttonPanel);
        this.add(canvas);
        pushButton.addActionListener(this);
        pullButton.addActionListener(this);
        exitButton.addActionListener(this);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Setup GUI
    }

    // Handle GUI actions.
    public void actionPerformed(ActionEvent evnt) {
        Object src = evnt.getSource();
        if (src == pushButton) {
            context.push();
            canvas.setBackground(context.getState());
        } else if (src == pullButton) {
            context.pull();
            canvas.setBackground(context.getState());
        } else if (src == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] argv) {
        TestNoSP gui = new TestNoSP();
        gui.setVisible(true);
    }
}

