package com.company.weekNine;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calculator {
    public static void main(String[] args) {
        new CalculatorLayout();
    }
}
class CalculatorLayout extends JFrame implements ActionListener{
    JFrame actualWindow;
    JPanel resultLayout, buttonLayout, infoLayout;

    JTextField resultTxt;
    JButton[] btnDigits = new JButton[10];
    JButton btnPlus, btnMinus, btnMul, btnDiv, btnEqual, btnDot, btnClear;

    char eventFrom;

    JLabel expression, appTitle;

    double operand1 = 0, operand2 = 0;
    String operator = "=";

    CalculatorLayout() {

        Font txtFont = new Font("SansSerif", Font.BOLD, 20);
        Font titleFont = new Font("SansSerif", Font.BOLD, 30);
        Font expressionFont = new Font("SansSerif", Font.BOLD, 15);

        actualWindow = new JFrame("Calculator");
        resultLayout = new JPanel();
        buttonLayout = new JPanel();
        infoLayout = new JPanel();

        actualWindow.setLayout(new GridLayout(3, 1));
        buttonLayout.setLayout(new GridLayout(4, 4));
        infoLayout.setLayout(new GridLayout(3, 1));
        actualWindow.setResizable(false);

        appTitle = new JLabel("Calculator");
        appTitle.setFont(titleFont);
        expression = new JLabel("Result");
        expression.setFont(expressionFont);
        resultTxt = new JTextField(15);
        resultTxt.setEditable(false);
        resultTxt.setBorder(null);
        resultTxt.setPreferredSize(new Dimension(15, 50));
        resultTxt.setFont(txtFont);
        resultTxt.setHorizontalAlignment(SwingConstants.RIGHT);

        resultLayout.add(appTitle);
        resultLayout.add(resultTxt);
        resultLayout.add(expression);


        for(int i = 0; i < 10; i++) {
            btnDigits[i] = new JButton(""+i);
            btnDigits[i].addActionListener(this);
            buttonLayout.add(btnDigits[i]);
        }

        btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        btnMul = new JButton("*");
        btnMul.addActionListener(this);
        btnDiv = new JButton("/");
        btnDiv.addActionListener(this);
        btnDot = new JButton(".");
        btnDot.addActionListener(this);
        btnEqual = new JButton("=");
        btnEqual.addActionListener(this);
        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);


        buttonLayout.add(btnPlus);
        buttonLayout.add(btnMinus);
        buttonLayout.add(btnMul);
        buttonLayout.add(btnDiv);
        buttonLayout.add(btnDot);
        buttonLayout.add(btnEqual);
        infoLayout.add(btnClear);

        actualWindow.add(resultLayout);
        actualWindow.add(buttonLayout);
        actualWindow.add(infoLayout);

        actualWindow.setSize(300, 500);
        actualWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        eventFrom = e.getActionCommand().charAt(0);
        String buildNumber;

        if(Character.isDigit(eventFrom)) {
            buildNumber = resultTxt.getText() + eventFrom;
            resultTxt.setText(buildNumber);
        } else if(e.getActionCommand().equals(".")) {
            buildNumber = resultTxt.getText() + eventFrom;
            resultTxt.setText(buildNumber);
        }
        else if(eventFrom != '=' && !e.getActionCommand().equals("Clear")){
            operand1 = Double.parseDouble(resultTxt.getText());
            operator = e.getActionCommand();
            expression.setText(operand1 + " " + operator);
            resultTxt.setText("");
        } else if(e.getActionCommand().equals("Clear")) {
            resultTxt.setText("");
            expression.setText("");
        }
        else {
            operand2 = Double.parseDouble(resultTxt.getText());
            expression.setText(expression.getText() + " " + operand2);

            switch(operator) {
                case "+":
                    resultTxt.setText(""+(operand1 + operand2));
                    break;
                case "-":
                    resultTxt.setText(""+(operand1 - operand2));
                    break;
                case "*":
                    resultTxt.setText(""+(operand1 * operand2));
                    break;
                case "/": 	try {
                    if(operand2 == 0)
                        throw new ArithmeticException();
                    resultTxt.setText(""+(operand1 / operand2)); break;
                } catch(ArithmeticException ae) {
                    JOptionPane.showMessageDialog(actualWindow, "Divisor can not be ZERO");
                }
            }
        }
    }
}


