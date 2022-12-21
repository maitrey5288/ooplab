import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class print_Gui_21 {
   public static void main(String[] args) {
       JFrame f=new JFrame("Swing");
       final JButton b=new JButton("Click");
       b.setBounds(50,100,100, 30);
       final JTextField f1 = new JTextField();
       final JTextField f2 = new JTextField();
       f1.setBounds(50, 10, 200, 20);
       f2.setBounds(50,60,200,20);
       final JLabel l3 = new JLabel(" ");
       l3.setBounds(20, 150, 400, 14);
       f.add(b);
       f.add(f1);//adding button in JFrame
       f.add(f2);
       f.add(l3);
       b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               l3.setText(f1.getText() + "   "+ f2.getText());
           }
       });
       f.setSize(400,300);
       f.setLayout(null);
       f.setVisible(true);
   }
}
