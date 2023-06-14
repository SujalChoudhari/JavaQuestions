package Expriment12;
import java.awt.event.*;

import javax.swing.*;


class GUI {
   private JFrame mMain;
   private JPanel mMainContainer;
   private JPanel mDetailPanel;
   private JPanel mDisplayPanel;
   private JTextField mUsernameField;
   private JPasswordField mPasswordField;
   private JLabel mDisplayText;
   private JButton mOkButton;

    private String mName;
    private String mPass;

    public void render(){
        mMain = new JFrame("Login");
        mMainContainer =new JPanel();
        mDetailPanel = new JPanel();
        mMain.setSize(600, 100);
        mUsernameField = new JTextField(12);
        mPasswordField = new JPasswordField(12);
        mOkButton = new JButton("OK");
        mDisplayPanel = new JPanel();
        mDisplayText = new JLabel("");
        
        JLabel passwardLabel = new JLabel("Password:");
        JLabel loginLabel = new JLabel("Login:");
        JButton resetButton = new JButton("Reset");
        
        mOkButton.addActionListener(new OkButtonHandler());
        resetButton.addActionListener(new ResetButtonHandler());
        mMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mMainContainer.setLayout(new BoxLayout(mMainContainer, BoxLayout.Y_AXIS));
        
        mDetailPanel.add(loginLabel);
        mDetailPanel.add(mUsernameField);
        mDetailPanel.add(passwardLabel);
        mDetailPanel.add(mPasswordField);
        mDetailPanel.add(mOkButton);
        mDetailPanel.add(resetButton);
        mDisplayPanel.add(mDisplayText);
        mMainContainer.add(mDetailPanel);
        mMainContainer.add(mDisplayPanel);
        mMain.add(mMainContainer);
    }

    public void run(){
        mMain.setVisible(true);
    } 

    class OkButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            mName = mUsernameField.getText();
            mPass = new String(mPasswordField.getPassword());
            mDisplayText.setText(mName+": "+mPass);
        }
    }

    class ResetButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           mUsernameField.setText("");
           mPasswordField.setText("");
            
        }
    }
}

// Swing program to create a login form
public class Expriment12A {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.render();
        gui.run();
    }
}
