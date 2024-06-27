import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener{
    JLabel label1, label2, label3, label4, label5, label6, label7, label8,label9,label10,label11,label12;
    JRadioButton r1, r2, r3;
    JTextField textField1, textField2, textField3, textField4,textField5,textField6,textField7,textField8;
    JDateChooser dob;
    JButton next;
    // JDateChooser dateChooser;
    Random ran = new Random();

    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(1200, 1000);
        setLocation(360, 40);
        setVisible(true);

        label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(180, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        label3 = new JLabel("FIRST NAME:");
        label3.setBounds(80, 140, 200, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        textField1 = new JTextField(12);
        textField1.setBounds(300, 140, 400, 30);
        textField1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField1);

        label4 = new JLabel("LAST NAME:");
        label4.setBounds(80, 200, 200, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label4);

        textField2 = new JTextField(12);
        textField2.setBounds(300, 200, 400, 30);
        textField2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField2);

        label5 = new JLabel("PHONE NUMBER:");
        label5.setBounds(80, 260, 200, 30);
        label5.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label5);

        textField3 = new JTextField(12);
        textField3.setBounds(300, 260, 400, 30);
        textField3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField3);

        label6 = new JLabel("DATE OF BIRTH:");
        label6.setBounds(80, 320, 200, 30);
        label6.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label6);

        dob = new JDateChooser();
        dob.setBounds(300,320,400,30);
        add(dob);

        label7 = new JLabel("GENDER:");
        label7.setBounds(80, 390, 200, 30);
        label7.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label7);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("arial",Font.BOLD,12));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,390,150,30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("arial",Font.BOLD,12));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,390,150,30);
        add(r2);

        r3 = new JRadioButton("OTHER");
        r3.setFont(new Font("arial",Font.BOLD,12));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(600,390,150,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        label8 = new JLabel("EMAIL ADDRESS:");
        label8.setBounds(80, 480, 200, 30);
        label8.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label8);

        textField4 = new JTextField(12);
        textField4.setBounds(300, 480, 400, 30);
        textField4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField4);

        label9 = new JLabel("ADDRESS:");
        label9.setBounds(80, 540, 200, 30);
        label9.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label9);

        textField5 = new JTextField(12);
        textField5.setBounds(300, 540, 400, 30);
        textField5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField5);

        label10 = new JLabel("CITY: ");
        label10.setBounds(80, 600, 200, 30);
        label10.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label10);

        textField6 = new JTextField(12);
        textField6.setBounds(300, 600, 400, 30);
        textField6.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField6);

        label11 = new JLabel("PROVINCE: ");
        label11.setBounds(80, 660, 200, 30);
        label11.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label11);

        textField7 = new JTextField(12);
        textField7.setBounds(300, 660, 400, 30);
        textField7.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField7);

        label12 = new JLabel("POSTAL CODE: ");
        label12.setBounds(80, 720, 200, 30);
        label12.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label12);

        textField8 = new JTextField(12);
        textField8.setBounds(300, 720, 400, 30);
        textField8.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textField8);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620,760,80,30);
        next.addActionListener(this);
        add(next);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Signup();
    }
}
