package Expriment12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

class Calculator extends JFrame {

  private String[] symbols = {
      "9", "8", "7", "+",
      "6", "5", "4", "-",
      "3", "2", "1", "*",
      "0", "C", ".", "/", 
              "=",
  };

  private JPanel mainPanel;
  private JPanel displayPanel;
  private JTextField displayTextField;
  private JLabel completeDisplayText;
  private JPanel buttonPanel;
  private JButton[] symbolButtons;

  float lhs, rhs;
  char functor;

  class ButtonListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      char operator = e.getActionCommand().charAt(0);
      if ((operator >= '0' && operator <= '9') || operator == '.') {
        displayTextField.setText(displayTextField.getText() + operator);
      } else if (operator == '+') {
        saveAsFirstNumber();
        functor = operator;
      } else if (operator == '-') {
        saveAsFirstNumber();
        functor = operator;
      } else if (operator == '*') {
        saveAsFirstNumber();
        functor = operator;
      } else if (operator == '/') {
        saveAsFirstNumber();
        functor = operator;
      } else if (operator == '=') {
        showTotal();
      } else if (operator == 'C') {
        displayTextField.setText("");
        completeDisplayText.setText("");
        lhs = 0;
        rhs = 0;
      }
    }

    public void saveAsFirstNumber() {
      lhs = Float.parseFloat(displayTextField.getText());
      displayTextField.setText("");
    }

    public void saveAsSecondNumber() {
      rhs = Float.parseFloat(displayTextField.getText());
    }

    public void showTotal() {
      saveAsSecondNumber();
      float answer = 0;
      switch (functor) {
        case '+':
          answer = lhs + rhs;
          break;
        case '-':
          answer = lhs - rhs;
          break;
        case '*':
          answer = lhs * rhs;
          break;
        case '/':
          answer = lhs / rhs;
          break;
      }
      lhs = answer;
      rhs = 0;
      displayTextField.setText(""+lhs);
    }
  }

  Calculator() {
    super("Calculator");
    this.setSize(350, 450);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void setup() {
    mainPanel = new JPanel();
    displayPanel = new JPanel();
    buttonPanel = new JPanel();
    symbolButtons = new JButton[symbols.length];
    completeDisplayText = new JLabel();
    ButtonListner listner = new ButtonListner();

    displayTextField = new JTextField(20);
    displayTextField.setEditable(true);
    displayPanel.add(displayTextField);
    displayPanel.setMaximumSize(new DimensionUIResource(300, 50));

    // SymbolButtons
    for (int i = 0; i < symbolButtons.length; i++) {
      symbolButtons[i] = new JButton(symbols[i]);
      symbolButtons[i].setPreferredSize(new DimensionUIResource(70, 70));
      symbolButtons[i].addActionListener(listner);
      buttonPanel.add(symbolButtons[i]);
    }
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    mainPanel.add(displayPanel);
    displayPanel.add(completeDisplayText);
    mainPanel.add(buttonPanel);

    this.add(mainPanel);
  }
}

public class Expriment12B {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setup();
    calculator.setVisible(true);
  }
}
