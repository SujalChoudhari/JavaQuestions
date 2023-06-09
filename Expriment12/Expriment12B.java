package Expriment12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonListener implements ActionListener {
  private JTextField mCompleteDisplayText;
  private JTextField mDisplayTextField;
  private char mFunctor;
  private float mRight;
  private float mLeft;

  public ButtonListener(JTextField displayTextField) {
    mDisplayTextField = displayTextField;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    char operator = e.getActionCommand().charAt(0);
    if (Character.isDigit(operator) || operator == '.') {
      mDisplayTextField.setText(mDisplayTextField.getText() + operator);
    } else {
      performOperation(operator);
    }
  }

  private void performOperation(char operator) {
    switch (operator) {
      case '+':
      case '-':
      case '*':
      case '/':
        saveAsFirstNumber();
        mFunctor = operator;
        break;
      case '=':
        showTotal();
        break;
      case 'C':
        resetCalculator();
        break;
    }
  }

  private void saveAsFirstNumber() {
    mLeft = Float.parseFloat(mDisplayTextField.getText());
    mDisplayTextField.setText("");
  }

  private void saveAsSecondNumber() {
    mRight = Float.parseFloat(mDisplayTextField.getText());
  }

  private void showTotal() {
    saveAsSecondNumber();
    float answer = calculateResult();
    mLeft = answer;
    mRight = 0;
    mDisplayTextField.setText(String.valueOf(mLeft));
  }

  private float calculateResult() {
    switch (mFunctor) {
      case '+':
        return mLeft + mRight;
      case '-':
        return mLeft - mRight;
      case '*':
        return mLeft * mRight;
      case '/':
        return mLeft / mRight;
      default:
        return 0;
    }
  }

  private void resetCalculator() {
    mDisplayTextField.setText("");
    mCompleteDisplayText.setText("");
    mLeft = 0;
    mRight = 0;
  }
}

class Calculator extends JFrame {

  private String[] mSymbols = {
      "9", "8", "7", "+",
      "6", "5", "4", "-",
      "3", "2", "1", "*",
      "0", "C", ".", "/",
      "=",
  };

  private JPanel mMainPanel;
  private JPanel mDisplayPanel;
  private JTextField mDisplayTextField;
  private JPanel mButtonPanel;
  private JButton[] mButtons;

  float mLeft, mRight;
  char mFunctor;

  Calculator() {
    super("Calculator");
    this.setSize(350, 450);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void setup() {
    mMainPanel = new JPanel();
    mDisplayPanel = new JPanel();
    mButtonPanel = new JPanel();
    mDisplayTextField = new JTextField(20);
    mButtons = new JButton[mSymbols.length];
    ButtonListener listner = new ButtonListener(mDisplayTextField);
    mDisplayPanel.setMaximumSize(new Dimension(300, 50));
    mDisplayTextField.setEditable(true);
    mDisplayPanel.add(mDisplayTextField);

    for (int i = 0; i < mButtons.length; i++) {
      mButtons[i] = new JButton(mSymbols[i]);
      mButtons[i].setPreferredSize(new Dimension(70, 70));
      mButtons[i].addActionListener(listner);
      mButtonPanel.add(mButtons[i]);
    }
    mMainPanel.setLayout(new BoxLayout(mMainPanel, BoxLayout.PAGE_AXIS));
    mMainPanel.add(mDisplayPanel);
    mMainPanel.add(mButtonPanel);

    this.add(mMainPanel);
  }
}

public class Expriment12B {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.setup();
    calculator.setVisible(true);
  }
}
