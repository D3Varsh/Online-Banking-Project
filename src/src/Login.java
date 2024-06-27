import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField text1;
    JPasswordField password1;

    JButton button1, button2,button3;

    // Now Creating a constructor for the Login.java
    Login() {

        // Title for the login page
        super("Bank Management System");

        // We are setting the size of the page.
        setSize(850, 480);

        // Location of the frame
        setLocation(450, 200);

        // Setting the layout manager to null for absolute positioning
        setLayout(null);

        // Setting the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the background color for the content pane
        getContentPane().setBackground(Color.BLACK);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(200, 50, 450, 40);
        add(label1);

        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 150, 375, 30);
        add(label2);

        text1 = new JTextField(15);
        text1.setBounds(300, 150, 230, 30);
        text1.setFont(new Font("Arial", Font.BOLD, 14));
        add(text1);

        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 200, 375, 30);
        add(label3);

        password1 = new JPasswordField(15);
        password1.setBounds(300, 200, 230, 30);
        password1.setFont(new Font("Arial", Font.BOLD, 14));
        add(password1);


        button1  = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setBounds(300,300,100, 20);
        button1.addActionListener(this);
        add(button1);

        button2  = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setBounds(450,300,100, 20);
        button2.addActionListener(this);
        add(button2);

        button3  = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setBounds(350,360,150, 20);
        button3.addActionListener(this);
        add(button3);

        // Whenever we create a frame it will always be invisible you have to set visibility to true
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                
            } else if (e.getSource() == button2) {
                text1.setText("");
                password1.setText("");
                
            }
            else if (e.getSource() == button3) {

            }

        }catch(Exception E){
                E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Creating an object
        new Login();
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */


}
