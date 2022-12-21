// 6.	Create Java GUI using Swing.  When click on login button,
//  it shows the credential in label as shown in the figure.

import javax.swing.*;
import java.awt.event.*;
public class login_6 {  
public static void main(String[] args) {  
JFrame f=new JFrame("User login");  
          
final JButton b=new JButton("Login");  
b.setBounds(160,100,100, 30);
final JTextField f1 = new JTextField();
final JPasswordField f2 = new JPasswordField(16);
f1.setBounds(160, 10, 200, 20);
f2.setBounds(160,60,200,20);
JLabel l1 = new JLabel("Username");
JLabel l2 = new JLabel("Password");
final JLabel l3 = new JLabel(" ");
l1.setBounds(10, 10, 100, 14);
l2.setBounds(10, 60, 100, 14);
l3.setBounds(20, 150, 400, 14);
f.add(b);
f.add(f1);//adding button in JFrame  
f.add(l1);
f.add(l2);
f.add(f2);
f.add(l3);
b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
  l3.setText("Username: " + f1.getText() + " Password: " + f2.getText());
    }
});          
f.setSize(400,300); 
f.setLayout(null);
f.setVisible(true);  
}  
}


