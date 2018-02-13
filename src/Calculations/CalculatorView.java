package Calculations;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class CalculatorView extends JFrame {
	private JTextField firstNum=new JTextField(10);
	private JTextField secondNum=new JTextField(10);
	private JTextField Result=new JTextField(10);
	private JLabel l1=new JLabel("First Number");
	private JLabel l2=new JLabel("Second Number");
	private JLabel l3=new JLabel("Result");
	private JButton Calc=new JButton("Calc");
	private String[] s= {"+","-","*","/","%","Square Root"};
	private JComboBox list= new JComboBox(s);
	
	public CalculatorView() {
		// TODO Auto-generated constructor stub
		JPanel userPanel= new JPanel();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(550, 150);
		Result.setEditable(false);
		
		userPanel.add(l1);
		userPanel.add(firstNum);
		userPanel.add(list);
		userPanel.add(l2);
		userPanel.add(secondNum);
		userPanel.add(l3);
		userPanel.add(Result);
		userPanel.add(Calc);
		this.add(userPanel);
		this.setResizable(false);

	}
	public double getFirstNum() {
		double l=0;
		try {
		 l=Double.parseDouble(firstNum.getText());
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this,"Please enter a number");
		}
		return l;
	}
	public double getScondNum() {
		double l=0;
		try {
		 l=Double.parseDouble(secondNum.getText());
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this,"Please enter a number");
		}
		return l;
	}
	public void setResult(double r) {
		Result.setText(r+" ");
	}
	public JComboBox getList() {
		return list;
	}
	public void addCalculateListener(ActionListener Listener) {
		Calc.addActionListener(Listener);
	}
	

}
