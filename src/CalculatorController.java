import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		// TODO Auto-generated constructor stub
		theView=view;
		theModel=model;
		
		theView.addCalculateListener(new CalculateListener());
	}

	class CalculateListener implements ActionListener {
		double first;
		double second;
		double result;
		JComboBox operations;
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			first= theView.getFirstNum();
			second=theView.getScondNum();
			operations=theView.getList();
			if (operations.getSelectedIndex()==0) 
			result=theModel.add(first, second);
			else if (operations.getSelectedIndex()==1)
			result=theModel.sub(first, second);
			else if (operations.getSelectedIndex()==2)
			result=theModel.mul(first, second);
			else if (operations.getSelectedIndex()==3)
			result=theModel.div(first, second, theView);
			else if (operations.getSelectedIndex()==4)
			result=theModel.mod(first, second, theView);
			else if (operations.getSelectedIndex()==5)
			result=theModel.squaroot(first, theView);
			theView.setResult(result);
		}
		
	}
}
