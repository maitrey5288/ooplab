
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class two_Buttons_Gui_28

{
   public static void main(String[] args) {
       MultiWindow window1 = new MultiWindow();
       window1.setVisible(true);
   }
}

class MultiWindow extends JFrame implements ActionListener {

   public static final int WIDTH = 400;
   public static final int HEIGHT = 300;
   public static final int FLOAT_WIDTH = 500;
   public static final int FLOAT_HEIGHT = 150;

   private JButton floatOneButton;

   private JButton floatTwoButton;

   /**

    * Creates a new instance of MultiWindow

    */

   public MultiWindow() {

       super();

// This window is sized so that it will not be hidden by the floating window

// that is created

       setSize(WIDTH, HEIGHT);

       setTitle("Multiple windows Demo");

       setLayout(new BorderLayout());

       floatOneButton = new JButton("Create Window Type 1");

       floatTwoButton = new JButton("Create Window Type 2");

       floatOneButton.addActionListener(this);

       floatTwoButton.addActionListener(this);

       getContentPane().add(floatOneButton, BorderLayout.EAST);

       getContentPane().add(floatTwoButton, BorderLayout.WEST);

//setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//        WindowDestroyer listener = new WindowDestroyer();
//
//        addWindowListener(listener);

   }

   public void actionPerformed(ActionEvent e) {

       if (e.getSource()==floatOneButton) {

           RedGreenWindow x = new RedGreenWindow();

           x.setVisible(true);

       } else if (e.getSource()==floatTwoButton) {

           BlackWhiteWindow x = new  BlackWhiteWindow();

           x.setVisible(true);

       } else

           System.out.println("Error in interface.");

   }

   private class FloatingWindowHandler extends WindowAdapter {

       private JFrame myWindow;

       public FloatingWindowHandler(JFrame aWindow){

           myWindow = aWindow;

       }

       public void windowClosing(WindowEvent e) {

           myWindow.dispose();

       }

   }

// The first kind of window

   private class RedGreenWindow extends JFrame

           implements ActionListener {

       private JButton colorButton;

       private boolean isRed = true;

       public RedGreenWindow(){

           super();

           setSize(FLOAT_WIDTH, FLOAT_HEIGHT);

           setTitle("A Red/Green Window");

           setLayout(new BorderLayout());

           setForeground(Color.RED);

           colorButton = new JButton("Change");

           colorButton.addActionListener(this);

           add(colorButton, BorderLayout.WEST);

           FloatingWindowHandler listener = new FloatingWindowHandler(this);

           addWindowListener(listener);

       }

       public void actionPerformed(ActionEvent e) {

           if (e.getActionCommand().equals("Change")) {

//System.out.println("Change button pressed");

//System.out.println("Change applied to " + this);

               if(isRed){

                   this.getContentPane().setBackground(Color.GREEN);

                   isRed = false;

               } else {

                   this.getContentPane().setBackground(Color.RED);

                   isRed = true;

               }

               this.setForeground(Color.RED);

           } else

               System.out.println("Error in  red/green events");

       }

   }

// The second kind of window

   private class BlackWhiteWindow extends JFrame

           implements ActionListener {

       private JButton blackButton;

       private JButton whiteButton;

       public BlackWhiteWindow(){

           super();

           setSize(FLOAT_WIDTH, FLOAT_HEIGHT);

           setTitle("A Black/White Window");

           setLayout(new BorderLayout());

           setForeground(Color.GRAY);

           blackButton = new JButton("Black");

           blackButton.addActionListener(this);

           add(blackButton, BorderLayout.NORTH);

           whiteButton = new JButton("White");

           whiteButton.addActionListener(this);

           add(whiteButton, BorderLayout.SOUTH);

           FloatingWindowHandler listener = new FloatingWindowHandler(this);

           addWindowListener(listener);

       }

       public void actionPerformed(ActionEvent e) {

           if (e.getActionCommand().equals("White")) {

//System.out.println("White button pressed");

//System.out.println("Change applied to " + this);

               this.getContentPane().setBackground(Color.WHITE);

           } else if (e.getActionCommand().equals("Black")) {

//System.out.println("White button pressed");

//System.out.println("Change applied to " + this);

               this.getContentPane().setBackground(Color.BLACK);
           }   else
               System.out.println("Error in  Black/White events");
       }

   }

}
