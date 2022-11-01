/**
 * @(#)Calculator.java
 *
 * Calculator application
 *
 * @author
 * @version 1.00 2022/10/31
 */
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener {
	JFrame jf;JLabel displayLabel;JButton  nineButton,eightButton,sevenButton,sixButton, fiveButton,fourButton,threeButton, twoButton,oneButton, zeroButton;
	JButton dotButton,divButton,addButton,mulButton;
	String oldvalue;
	JButton equalButton,subButton,clearButton;boolean isOperatorClicked=false;int op;float result;

    	public Calculator(){
    	 jf=new JFrame("Calulator");
    		jf.setLayout(null);
    		jf.setSize(600,600);

    		displayLabel=new JLabel(" ");
    		displayLabel.setBounds(30,50,540,40);
    		displayLabel.setBackground(Color.gray);
    		displayLabel.setOpaque(true);
    		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    		displayLabel.setForeground(Color.white);
    		jf.add(displayLabel);
    		sevenButton=new JButton("7");
    		sevenButton.setBounds(30,120,80,80);
    		sevenButton.addActionListener(this);
    		jf.add(sevenButton);
    		eightButton=new JButton("8");
    		eightButton.setBounds(120,120,80,80);
    		eightButton.addActionListener(this);
    		jf.add(eightButton);
    		nineButton=new JButton("9");
    		nineButton.setBounds(210,120,80,80);
    		nineButton.addActionListener(this);
    		jf.add(nineButton);

    		fourButton=new JButton("4");
    		fourButton.setBounds(30,210,80,80);
    		fourButton.addActionListener(this);
    		jf.add(fourButton);
    		fiveButton=new JButton("5");
    		fiveButton.setBounds(120,210,80,80);
    		fiveButton.addActionListener(this);
    		jf.add(fiveButton);
    		sixButton=new JButton("6");
    		sixButton.setBounds(210,210,80,80);
    		sixButton.addActionListener(this);
    		jf.add(sixButton);
    		oneButton=new JButton("1");
    		oneButton.setBounds(30,300,80,80);
    		oneButton.addActionListener(this);
    		jf.add(oneButton);
    		twoButton=new JButton("2");
    		twoButton.setBounds(120,300,80,80);
    		twoButton.addActionListener(this);
    		jf.add(twoButton);
    		threeButton=new JButton("3");
    		threeButton.setBounds(210,300,80,80);
    		threeButton.addActionListener(this);
    		jf.add(threeButton);
    		dotButton=new JButton(".");
    		dotButton.setBounds(30,390,80,80);
    		dotButton.addActionListener(this);
    		jf.add(dotButton);
    		zeroButton=new JButton("0");
    		zeroButton.setBounds(120,390,80,80);
    		zeroButton.addActionListener(this);
    		jf.add(zeroButton);
    		equalButton=new JButton("=");
    		equalButton.setBounds(210,390,80,80);
    		equalButton.addActionListener(this);
    		jf.add(equalButton);
    		divButton=new JButton("/");
    		divButton.setBounds(320,120,80,80);
    		divButton.addActionListener(this);
    		jf.add(divButton);
    		mulButton=new JButton("x");
    		mulButton.setBounds(320,210,80,80);
    		mulButton.addActionListener(this);
    		jf.add(mulButton);
    		subButton=new JButton("-");
    		subButton.setBounds(320,300,80,80);
    		subButton.addActionListener(this);
    		jf.add(subButton);
    		addButton=new JButton("+");
    		addButton.setBounds(320,390,80,80);
    		addButton.addActionListener(this);
    		jf.add(addButton);


    		clearButton=new JButton("clr");
    		clearButton.setBounds(410,390,80,80);
    		clearButton.addActionListener(this);
    		jf.add(clearButton);





			jf.setLocationRelativeTo(null);
    		jf.setVisible(true);
    		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	}
    	// TODO, add your application code
public static void main(String args[]){
	Calculator c=new Calculator();
}
@Override
public void actionPerformed(ActionEvent e){
	jf.getContentPane().setBackground(Color.pink);
	if(e.getSource()==sevenButton){
if(isOperatorClicked){
	displayLabel.setText("7");
	isOperatorClicked=false;
}else{
	displayLabel.setText(displayLabel.getText()+"7");
	}}
	else if(e.getSource()==eightButton){
		if(isOperatorClicked){
	displayLabel.setText("8");
	isOperatorClicked=false;
}else{

		displayLabel.setText(displayLabel.getText()+"8");
	}}
	else if(e.getSource()==nineButton){
		if(isOperatorClicked){
	displayLabel.setText("9");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"9");
	}}
	else if(e.getSource()==oneButton){
		if(isOperatorClicked){
	displayLabel.setText("1");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"1");
}}else if(e.getSource()==twoButton){
	if(isOperatorClicked){
	displayLabel.setText("2");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"2");
		}
	}else if(e.getSource()==threeButton){
		if(isOperatorClicked){
	displayLabel.setText("3");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"3");
}	}else if(e.getSource()==fourButton){
	if(isOperatorClicked){
	displayLabel.setText("4");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"4");
}}else if(e.getSource()==fiveButton){
	if(isOperatorClicked){
	displayLabel.setText("5");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"5");
}

	}else if(e.getSource()==sixButton){
		if(isOperatorClicked){
	displayLabel.setText("6");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"6");
}	}else if(e.getSource()==zeroButton){
	if(isOperatorClicked){
	displayLabel.setText("0");
	isOperatorClicked=false;
}else{
		displayLabel.setText(displayLabel.getText()+"0");
	}}
	else if(e.getSource()==dotButton){
			displayLabel.setText(displayLabel.getText()+".");
	}

	else if(e.getSource()==equalButton){
	String newvalue=displayLabel.getText();
	float oldvaluef=Float.parseFloat(oldvalue);
	float newvaluef=Float.parseFloat(newvalue);
	switch(op){
		case 1:result=oldvaluef+newvaluef;
		break;
		case 2:result=oldvaluef-newvaluef;
		break;
		case 3:result=oldvaluef/newvaluef;
		break;
		case 4:result=oldvaluef*newvaluef;
		break;

	}



	displayLabel.setText(result+"");
	}else if(e.getSource()==addButton){
		isOperatorClicked=true;
		op=1;
		oldvalue=displayLabel.getText();
	}else if(e.getSource()==subButton){
isOperatorClicked=true;
		op=2;
		oldvalue=displayLabel.getText();
		displayLabel.setText("");
	}else if(e.getSource()==divButton){
		op=3;
		oldvalue=displayLabel.getText();
		displayLabel.setText("");

	}else if(e.getSource()==mulButton){
		op=4;
		oldvalue=displayLabel.getText();
		displayLabel.setText("");
	}
	else if(e.getSource()==clearButton){
		displayLabel.setText("");
	}
}

}
