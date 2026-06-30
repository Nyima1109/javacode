package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LayoutDemo extends JFrame implements ActionListener{
JTextField t1, t2, t3, result;
JButton btn;

LayoutDemo() {
    // Frame settings
    setTitle("Sum of Three Numbers");
    setSize(350, 300);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Labels
    JLabel l1 = new JLabel("Enter First Number:");
    JLabel l2 = new JLabel("Enter Second Number:");
    JLabel l3 = new JLabel("Enter Third Number:");
    JLabel l4 = new JLabel("Sum:");

    // Text fields
    t1 = new JTextField();
    t2 = new JTextField();
    t3 = new JTextField();
    result = new JTextField();
    result.setEditable(false);

    // Button
    btn = new JButton("Add");

    // Set bounds
    l1.setBounds(20, 20, 150, 25);
    t1.setBounds(180, 20, 120, 25);

    l2.setBounds(20, 60, 150, 25);
    t2.setBounds(180, 60, 120, 25);

    l3.setBounds(20, 100, 150, 25);
    t3.setBounds(180, 100, 120, 25);

    btn.setBounds(120, 140, 80, 30);

    l4.setBounds(20, 190, 150, 25);
    result.setBounds(180, 190, 120, 25);

    // Add components
    add(l1); add(t1);
    add(l2); add(t2);
    add(l3); add(t3);
    add(btn);
    add(l4); add(result);

    // Button action
    btn.addActionListener(this);

    setVisible(true);
}

// Action event
public void actionPerformed(ActionEvent e) {
    int a = Integer.parseInt(t1.getText());
    int b = Integer.parseInt(t2.getText());
    int c = Integer.parseInt(t3.getText());

    int sum = a + b + c;
    result.setText(String.valueOf(sum));
}

public static void main(String[] args) {
    new LayoutDemo();
}
}

