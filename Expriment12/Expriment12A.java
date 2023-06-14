package Expriment12;
import java.awt.event.*;

import javax.swing.*;


class GUI {
    JFrame main;
    JButton okButton;
    JPanel mainContainer;
    JPanel detailPanel;
    JTextField usernameField;
    JPasswordField passwordField;
    JPanel displayPanel;
    JLabel displayText;

    String name;
    String pass;

    public void render(){
        main = new JFrame("Login");
        main.setSize(600, 100);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainContainer =new JPanel();
        mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.Y_AXIS));
        detailPanel = new JPanel();

        JLabel loginLabel = new JLabel("Login:");
        detailPanel.add(loginLabel);

        usernameField = new JTextField(12);
        detailPanel.add(usernameField);

        JLabel passwardLabel = new JLabel("Password:");
        detailPanel.add(passwardLabel);

        passwordField = new JPasswordField(12);
        detailPanel.add(passwordField);

        okButton = new JButton("OK");
        okButton.addActionListener(new OkButtonHandler());
        detailPanel.add(okButton);
        
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ResetButtonHandler());
        detailPanel.add(resetButton);


        displayPanel = new JPanel();
        displayText = new JLabel("");
        displayPanel.add(displayText);

        mainContainer.add(detailPanel);
        mainContainer.add(displayPanel);

        main.add(mainContainer);
    }

    public void run(){
        main.setVisible(true);
    } 

    class OkButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            name = usernameField.getText();
            pass = new String(passwordField.getPassword());
            displayText.setText(name+": "+pass);
        }
    }

    class ResetButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           usernameField.setText("");
           passwordField.setText("");
            
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
