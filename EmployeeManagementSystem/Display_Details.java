import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display_Details extends JFrame implements ActionListener
{
static JLabel emp_id,emp_name,dept_name,doj,ques,dom,query;
static JButton b,c; 
static JTextField d,e,dm,doj_date,dept,ma;

public Display_Details()
{
setLayout(null);
emp_id = new JLabel("Employee ID"); 
emp_id.setBounds(30,20,100,50);

d = new JTextField();
d.setBounds(190,30,210,25);

emp_name = new JLabel("Employee Name");
emp_name.setBounds(30,80,100,50);

e = new JTextField();
e.setBounds(190,90,210,25);
e.setEditable(false);

dept_name = new JLabel("Department");
dept_name.setBounds(30,140,100,50);

dept = new JTextField();
dept.setBounds(190,150,210,25);
dept.setEditable(false);


doj = new JLabel("Date Of Joining");
doj.setBounds(30,200,210,50);

doj_date = new JTextField();
doj_date.setBounds(190,210,210,25);
doj_date.setEditable(false);


ques = new JLabel("Are You M/S");
ques.setBounds(30,260,130,50);

ma = new JTextField();
ma.setBounds(190,270,210,25);
ma.setEditable(false);

dom = new JLabel("Date Of Marriage");
dom.setBounds(30,320,100,50);

dm = new JTextField();
dm.setBounds(190,330,210,25);
dm.setEditable(false);

b = new JButton("Search");
b.setBounds(145,390,100,30);

c = new JButton("Reset");
c.setBounds(255,390,100,30);

query = new JLabel("");
query.setBounds(30,420,100,50);

b.addActionListener(this);
c.addActionListener(this);

add(emp_id);
add(d);
add(emp_name);
add(e);
add(dept_name);
add(dept);
add(doj);
add(doj_date);
add(ques);
add(ma);
add(dom);
add(dm);
add(b);
add(c);
add(query);

setSize(500,500);
setTitle("Display Details");
setVisible(true);
setResizable(false);
}

public void actionPerformed(ActionEvent event)
{

if(event.getSource()==b)
{
for(int i=0; i<6; i++)
{
if(d.getText().equals(Employee_Form.x[i][0]))
{
for(int j=0; j<6; j++)
{
if(j==0)
{
d.setText(Employee_Form.id);
}
else if(j==1)
{
e.setText(Employee_Form.name);
}
else if(j==2)
{
dept.setText(Employee_Form.dept1);
}
else if(j==3)
{
doj_date.setText(Employee_Form.doj4);
}
else if(j==4)
{
ma.setText(Employee_Form.ma1);
}
else if(j==5)
{
dm.setText(Employee_Form.ma2);
}
}
}
else
{
query.setText("No Records Found");
}
}
}


if(event.getSource()==c)
{
d.setText("");
e.setText("");
dept.setText("");
doj_date.setText("");
ma.setText("");
dm.setText("");
dm.setEditable(false);
query.setText("");
}

}
}
