package Cal;

public class calculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorModel Model1=new CalculatorModel();
		CalculatorView View1=new CalculatorView();
		CalculatorController theController=new CalculatorController(Model1, View1);
		View1.setVisible(true);
	}

}
