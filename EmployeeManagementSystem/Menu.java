import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener
{
JButton a,b,c;
JLabel d;

public Menu()
{
setLayout(null);
d = new JLabel("EMPLOYEE FORM");
d.setBounds(60,10,250,100);
Font f = new Font("Arial",Font.BOLD,20);
d.setFont(f);
a = new JButton("ENTER DATA");
a.setBounds(70,100,150,25);
b = new JButton("DISPLAY DATA");
b.setBounds(70,150,150,25);
c = new JButton("EXIT");
c.setBounds(70,200,150,25);
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
add(d);
add(a);
add(b);
add(c);
setSize(300,300);
setVisible(true);
setTitle("Main Menu");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setResizable(false);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==a)
{
Employee_Form obj = new Employee_Form();
}

if(e.getSource()==b)
{
Display_Details obj1 = new Display_Details();
}

if(e.getSource()==c)
{
System.exit(0);
}
}

public static void main(String args[])
{
Menu obj2 = new Menu();
}
}