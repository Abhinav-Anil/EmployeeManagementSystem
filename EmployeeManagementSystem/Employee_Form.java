import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employee_Form extends JFrame implements ActionListener
{
static JLabel emp_id,emp_name,dept_name,doj,ques,dom,query;
static JComboBox dept,doj_dd,doj_mm,doj_yyyy;
static JRadioButton ma,um;
static JButton b,c; 
static JTextField d,e,dm;
ButtonGroup bg;
public static int z,y;
public static String id,name,dept1,doj1,doj2,doj3,doj4,ma1,ma2;
public static String x[][] = new String[6][6];

public Employee_Form()
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

dept_name = new JLabel("Department");
dept_name.setBounds(30,140,100,50);

String[] f = {"CSE","MECH","ECE","CIVIL","CHEMICAL"};
dept = new JComboBox(f);
dept.setBounds(190,150,100,25);

doj = new JLabel("Date Of Joining");
doj.setBounds(30,200,100,50);

String g[] = new String[31];
for(int i=0; i<31;i++)
{
z = i+1;
g[i] = Integer.toString(z);
}

doj_dd = new JComboBox(g);
doj_dd.setBounds(190,210,50,25);

String[] h = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
doj_mm = new JComboBox(h);
doj_mm.setBounds(250,210,70,25);

String[] j = {"2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"};
doj_yyyy = new JComboBox(j);
doj_yyyy.setBounds(330,210,70,25);

ques = new JLabel("Are You M/S");
ques.setBounds(30,260,130,50);

ma = new JRadioButton("Married");
ma.setBounds(190,270,100,25);

um = new JRadioButton("Single");
um.setBounds(300,270,100,25);

bg = new ButtonGroup();

dom = new JLabel("Date Of Marriage");
dom.setBounds(30,320,100,50);

dm = new JTextField();
dm.setBounds(190,330,210,25);
dm.setEditable(false);

b = new JButton("Submit");
b.setBounds(145,390,100,30);

c = new JButton("Reset");
c.setBounds(255,390,100,30);

query = new JLabel();
query.setBounds(50,430,200,30);

ma.addActionListener(this);
um.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);

add(emp_id);
add(d);
add(emp_name);
add(e);
add(dept_name);
add(dept);
add(doj);
add(doj_dd);
add(doj_mm);
add(doj_yyyy);
add(ques);
bg.add(ma);
bg.add(um);
add(ma);
add(um);
add(dom);
add(dm);
add(b);
add(c);
add(query);

setSize(500,500);
setTitle("Employee Details");
setVisible(true);
setResizable(false);
}


public void actionPerformed(ActionEvent event)
{
if(ma.isSelected()==true)
{
dm.setEditable(true);
ma1 = "Married";
ma2 = dm.getText();
}
else
{
dm.setEditable(false);
ma1 = "Single";
ma2 = "";
}

if(event.getSource()==b)
{
id = d.getText();
name = e.getText();
dept1 =(String)dept.getSelectedItem();
doj1 = (String)doj_dd.getSelectedItem();
doj2 = (String)doj_mm.getSelectedItem();
doj3 = (String)doj_yyyy.getSelectedItem();
doj4 = doj1.concat("/"+doj2).concat("/"+doj3);

for(int i=0; i<6; i++)
{
for(int j=0; j<6; j++)
{
if(j==0)
{
x[i][j] = id;
}
else if(j==1)
{
x[i][j] = name;
}
else if(j==2)
{
x[i][j] = dept1;
}
else if(j==3)
{
x[i][j] = doj4;
}
else if(j==4)
{
x[i][j] = ma1;
}
else if(j==5)
{
x[i][j] = ma2;
}
}
}
query.setText("All Data Has Been Saved");
}

if(event.getSource()==c)
{
d.setText("");
e.setText("");
dm.setText("");
dm.setEditable(false);
query.setText("");
}

}
}

