import java.awt.*;
import java.awt.event.*;
class Calculate implements ActionListener
{
	Calculate()
	{
		Frame f=new Frame("Calculator");
		f.setLayout(null);
		f.setSize(500,500);
		Label l1=new Label("Enter First No.");
		l1.setBounds(10,50,100,20);
		f.add(l1);
		Label l2=new Label("Enter Second No.");
		l2.setBounds(10,80,100,20);
		f.add(l2);
		TextField t1=new TextField();
		t1.setBounds(120,50,50,20);
		f.add(t1);
		TextField t2=new TextField();
		t2.setBounds(120,80,50,20);
		f.add(t2);
		Button b1=new Button("+");
		b1.setBounds(10,110,20,20);
		f.add(b1);
		Button b2=new Button("-");
		b2.setBounds(40,110,20,20);
		f.add(b2);
		Button b3=new Button("*");
		b3.setBounds(70,110,20,20);
		f.add(b3);
		Button b4=new Button("/");
		b4.setBounds(100,110,20,20);
		f.add(b4);
		Label l3=new Label("Result is");
		l3.setBounds(10,150,50,20);
		f.add(l3);
		TextField t3=new TextField();
		t3.setBounds(70,150,50,20);
		f.add(t3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();
		if(ob==b1)
		t3.setText(t1.getText()+t2.getText());
	}
	public static void main(String z[])
	{
		new Calculate();
	}
}
		