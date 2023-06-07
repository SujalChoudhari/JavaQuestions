package Expriment12;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

class Calculator extends JFrame {

  private String[] symbols = { ".", "+", "-", "/", "*", "=", "CE" };

  private JPanel mainPanel;
  private JPanel displayPanel;
  private JTextField displayTextField;
  private JLabel completeDisplayText;
  private JPanel buttonPanel;
  private JButton[] numberButtons;
  private JButton[] symbolButtons;

  String lhs,rhs;

  class ButtonListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      char operator = e.getActionCommand().charAt(0);
      if ((operator >= '0' && operator <= '9') || operator == '.') {
        displayTextField.setText(displayTextField.getText() + operator);
        completeDisplayText.setText(completeDisplayText.getText() + operator);
      }
      else if(operator == '+'){
        lhs = displayTextField.getText();
      }
    }
  }

  Calculator() {
    super("Calculator");
    this.setSize(350, 350);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void setup() {
    mainPanel = new JPanel();
    displayPanel = new JPanel();
    buttonPanel = new JPanel();
    numberButtons = new JButton[10];
    symbolButtons = new JButton[symbols.length];
    completeDisplayText = new JLabel();
    ButtonListner listner = new ButtonListner();

    displayTextField = new JTextField(20);
    displayTextField.setEditable(true);
    displayPanel.add(displayTextField);
    displayPanel.add(completeDisplayText);
    displayPanel.setMaximumSize(new DimensionUIResource(300, 50));

    for (int i = 0; i < numberButtons.length; i++) {
      numberButtons[i] = new JButton("" + i);
      numberButtons[i].setPreferredSize(new DimensionUIResource(60, 60));
      numberButtons[i].addActionListener(listner);
      buttonPanel.add(numberButtons[i]);
    }

    // SymbolButtons
    for (int i = 0; i < symbolButtons.length; i++) {
      symbolButtons[i] = new JButton(symbols[i]);
      symbolButtons[i].setPreferredSize(new DimensionUIResource(60, 60));
      symbolButtons[i].addActionListener(listner);
      buttonPanel.add(symbolButtons[i]);
    }
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    mainPanel.add(displayPanel);
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
