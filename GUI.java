import javax.swing.*;
class GUI
{
	public static void main(String args[])
	{
		JFrame frm = new JFrame();
		Container con = frm.getContentPane();
		FlowLayout flw = new FlowLayout();
		con.setLayout(flw);
		JButton btn1=new JButton("Click Me 1");
		JButton btn2=new JButton("Click ME 2");
		con.add(btn1);
		con.add(btn2);
		frm.setSize(200,400);
		frm.setVisible(true);
		frm.setDefaltCloseOperator(JFrame.EXIT_ON_CLOSE);
	}

}
