package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame  implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;
    String formno;


    Signup3(String formno){

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details:");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Ralewey",Font.BOLD,16));
        r1.setBounds(100,180,150,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Ralewey",Font.BOLD,16));
        r2.setBounds(350,180,300,30);
        r2.setBackground(new Color(215,252,252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Ralewey",Font.BOLD,16));
        r3.setBounds(100,220,250,30);
        r3.setBackground(new Color(215,252,252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Ralewey",Font.BOLD,16));
        r4.setBounds(350,220,250,30);
        r4.setBackground(new Color(215,252,252));
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD,12));
        l5.setBounds(100, 330, 200, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD,22));
        l6.setBounds(330, 300, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and statement)");
        l7.setBounds(330, 330, 500, 20);
        add(l7);

        JLabel l8 = new JLabel("Pin:");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD,22));
        l9.setBounds(330, 370, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD,12));
        l10.setBounds(100, 400, 200, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100, 450, 200, 30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Ralewey",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Ralewey",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Ralewey",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alert");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Ralewey",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Chequ Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Ralewey",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Ralewey",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(660, 10, 100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,48));
        l13.setBounds(760, 10, 60,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("ralewey", Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        s.setBounds(820,560,100,30);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("ralewey", Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.addActionListener(this);
        c.setBounds(650,560,100,30);
        add(c);


        setLayout(null);
        setSize(1000, 1200);
        setVisible(true);
        setLocation(100,10);
        getContentPane().setBackground(new Color(215,252,252));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposite Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposite Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = " " + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin ="" + Math.abs(first3);
        // badhi value get kayri
        String fac = "";
        if (c1.isSelected()){
            fac = fac+ "ATM CARD";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alert";
        } else if (c5.isSelected()) {
            fac = fac+"chequ Book";
        } else if (c6.isSelected()) {
            fac= fac+"E-statement";
        }

        try {
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values('"+formno+"', '"+atype+"', '"+cardno+"', '"+pin+"', '"+fac+"')";
                    String q2 = "insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : "+cardno+"\n pin : "+pin );
                    setVisible(false);
                    new Deposit(pin);

                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup3("");
    }

}
