package Cal;
import java.lang.Math.*;

import javax.swing.JOptionPane;
public class CalculatorModel {
	private boolean negativ_Zero_flag=false;
	private Double Result;
	public CalculatorModel() {
		// TODO Auto-generated constructor stub
	}
	//Add
	public double add(double firstNum, double secondNum) {
		Result=firstNum+secondNum;
		return Result;
	}
	//Subtract
	public double sub(double firstNum, double secondNum) {
		Result=firstNum-secondNum;
		return Result;
	}
	//Multiply
	public double mul(double firstNum, double secondNum) {
		Result=firstNum*secondNum;
		return Result;
	}
	//Divide
	public double div(double firstNum, double secondNum, CalculatorView view) {
		if (secondNum==0) {
			negativ_Zero_flag=true;
			//JOptionPane.showMessageDialog(view, "Cannot divide by zero");
			return 0;
		}
		Result=firstNum/secondNum;
		return Result;
	}
	//Modulo
	public int mod(double firstNum, double secondNum, CalculatorView view) {
		int r;
		if (secondNum==0) {
			negativ_Zero_flag=true;
			//JOptionPane.showMessageDialog(view, "Cannot calculate modulo by zero");
			return 0;
		}
		r=(int)firstNum%(int)secondNum;
		return r;
	}
	//Square Root
	public double squaroot(double firstNum, CalculatorView view) {
		if (firstNum < 0) {
			negativ_Zero_flag=true;
			//JOptionPane.showMessageDialog(view, "Input should be positive number");
			return 0;
		}
		Result=Math.sqrt(firstNum);
		return Result;
	}
	public boolean check_flag() {
		return negativ_Zero_flag;
	}
}
