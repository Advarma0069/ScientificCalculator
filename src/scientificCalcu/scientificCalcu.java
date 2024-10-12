package scientificCalcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class scientificCalcu {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificCalcu window = new scientificCalcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scientificCalcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 48, 333, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRoot.setBounds(10, 154, 66, 60);
		frame.getContentPane().add(btnRoot);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 7, 400, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnOneX = new JButton("1/x");
		btnOneX.setEnabled(false);
		btnOneX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnOneX.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOneX.setBounds(10, 213, 66, 60);
		frame.getContentPane().add(btnOneX);
		
		JButton btnXY = new JButton("x^y");
		btnXY.setEnabled(false);
		btnXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnXY.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnXY.setBounds(10, 273, 66, 60);
		frame.getContentPane().add(btnXY);
		
		JButton btnX3 = new JButton("x^3");
		btnX3.setEnabled(false);
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX3.setBounds(10, 333, 66, 60);
		frame.getContentPane().add(btnX3);
		
		JButton btnX2 = new JButton("x^2");
		btnX2.setEnabled(false);
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX2.setBounds(10, 392, 66, 60);
		frame.getContentPane().add(btnX2);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnN.setBounds(10, 452, 66, 60);
		frame.getContentPane().add(btnN);
		
		JButton btnExp = new JButton("e^x");
		btnExp.setEnabled(false);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExp.setBounds(76, 154, 66, 60);
		frame.getContentPane().add(btnExp);
		
		JButton btnLOG = new JButton("log");
		btnLOG.setEnabled(false);
		btnLOG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLOG.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLOG.setBounds(76, 213, 66, 60);
		frame.getContentPane().add(btnLOG);
		
		JButton btnPercent = new JButton(" %");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(76, 273, 66, 60);
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(76, 333, 66, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(76, 392, 66, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(76, 452, 66, 60);
		frame.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSin.setBounds(144, 154, 66, 60);
		frame.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSinh.setBounds(144, 213, 66, 60);
		frame.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(144, 273, 66, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(144, 333, 66, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(144, 392, 66, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(144, 452, 66, 60);
		frame.getContentPane().add(btn2);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCos.setBounds(211, 154, 66, 60);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCosh.setBounds(211, 213, 66, 60);
		frame.getContentPane().add(btnCosh);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setEnabled(false);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace=str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(211, 273, 66, 60);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(211, 333, 66, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(211, 392, 66, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(211, 452, 66, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnTan = new JButton("tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTan.setBounds(277, 154, 66, 60);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTanh.setBounds(277, 213, 66, 60);
		frame.getContentPane().add(btnTanh);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setEnabled(false);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(277, 273, 66, 60);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSubstract = new JButton("-");
		btnSubstract.setEnabled(false);
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSubstract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubstract.setBounds(277, 333, 66, 60);
		frame.getContentPane().add(btnSubstract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(277, 392, 66, 60);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(277, 452, 66, 60);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPlusDivideSubtract = new JButton("+/-");
		btnPlusDivideSubtract.setEnabled(false);
		btnPlusDivideSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusDivideSubtract.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlusDivideSubtract.setBounds(10, 513, 66, 60);
		frame.getContentPane().add(btnPlusDivideSubtract);
		
		JButton btn00 = new JButton("00");
		btn00.setEnabled(false);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(76, 513, 66, 60);
		frame.getContentPane().add(btn00);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(144, 513, 66, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(211, 513, 66, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y") {
					double resultt=1;
					for(int i=0; i<second; i++) {
						resultt=first*resultt;
					}
					
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(277, 513, 66, 60);
		frame.getContentPane().add(btnEqual);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				btnDot.setEnabled(true);
				btnPlus.setEnabled(true);
				btnSubstract.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnPercent.setEnabled(true);
				btnPlusDivideSubtract.setEnabled(true);
				
				btnN.setEnabled(true);
				btnXY.setEnabled(true);
				btnX3.setEnabled(true);
				btnX2.setEnabled(true);
				btnOneX.setEnabled(true);
				btnRoot.setEnabled(true);
				
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);
				btnLOG.setEnabled(true);
				btnExp.setEnabled(true);
				
				btnClear.setEnabled(true);
				btnBackspace.setEnabled(true);
				btn00.setEnabled(true);
				btn0.setEnabled(true);
				btnEqual.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(6, 114, 70, 36);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton(" Off");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				btnDot.setEnabled(false);
				btnPlus.setEnabled(false);
				btnSubstract.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnDivide.setEnabled(false);
				btnPercent.setEnabled(false);
				btnPlusDivideSubtract.setEnabled(false);
				
				btnN.setEnabled(false);
				btnXY.setEnabled(false);
				btnX3.setEnabled(false);
				btnX2.setEnabled(false);
				btnOneX.setEnabled(false);
				btnRoot.setEnabled(false);
				
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
				btnLOG.setEnabled(false);
				btnExp.setEnabled(false);
				
				btnClear.setEnabled(false);
				btnBackspace.setEnabled(false);
				btn00.setEnabled(false);
				btn0.setEnabled(false);
				btnEqual.setEnabled(false);
				
				
				
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnOff.setBounds(76, 114, 66, 36);
		frame.getContentPane().add(rdbtnOff);
	}
}
