package Expriment12;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form extends JFrame {
    private JPanel mMainPanel;
    private JLabel mNameLabel;
    private JTextField mNameTextField;
    private JLabel mGenderLabel;
    private JPanel mGenderPanel;

    private ButtonGroup mGenderButtonGroup;
    private JRadioButton mMaleRadioButton;
    private JRadioButton mFemaleRadioButton;

    private JLabel mInterestLabel;
    private JPanel mInterestPanel;
    private JCheckBox mMusiCheckBox;
    private JCheckBox mSwimmingCheckBox;
    private JLabel mPlaceLabel;
    private JComboBox<String> mCountryComboBox;
    private JLabel mDetailsLabel;
    private JTextArea mDetailsTextArea;

    private JButton mSubmitButton;
    private JButton mExitButton;

    Form(String title) {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mMainPanel = new JPanel();
        mNameLabel = new JLabel("Name:");
        mNameTextField = new JTextField("", 2);
        mGenderLabel = new JLabel("Gender:");
        mGenderPanel = new JPanel();

        mGenderButtonGroup = new ButtonGroup();
        mMaleRadioButton = new JRadioButton("Male", false);
        mFemaleRadioButton = new JRadioButton("Female", true);

        mInterestLabel = new JLabel("Interest:");
        mInterestPanel = new JPanel();
        mMusiCheckBox = new JCheckBox("Music");
        mSwimmingCheckBox = new JCheckBox("Swimming");
        mPlaceLabel = new JLabel("Place:");
        mCountryComboBox = new JComboBox<String>();
        mDetailsLabel = new JLabel("Details:");
        mDetailsTextArea = new JTextArea("");

        mSubmitButton = new JButton("Submit");
        mExitButton = new JButton("Exit");
    }

    public void init() {
        this.setSize(new Dimension(600, 500));
        this.add(mMainPanel);
        mMainPanel.setLayout(new GridLayout(6,2,30,5));
        mMainPanel.setBorder(new EmptyBorder(30, 70, 30, 70));
        mMainPanel.add(mNameLabel);
        mMainPanel.add(mNameTextField);
        mMainPanel.add(mGenderLabel);
        mMainPanel.add(mGenderPanel);
        mGenderPanel.add(mMaleRadioButton);
        mGenderPanel.add(mFemaleRadioButton);
        mGenderButtonGroup.add(mMaleRadioButton);
        mGenderButtonGroup.add(mFemaleRadioButton);
        mMainPanel.add(mInterestLabel);
        mMainPanel.add(mInterestPanel);
        mInterestPanel.add(mMusiCheckBox);
        mInterestPanel.add(mSwimmingCheckBox);
        mMainPanel.add(mPlaceLabel);
        mMainPanel.add(mCountryComboBox);
        mCountryComboBox.addItem("India");
        mCountryComboBox.addItem("USA");
        mCountryComboBox.addItem("UK");
        mCountryComboBox.addItem("Canada");
        mCountryComboBox.addItem("Bangladesh");
        mCountryComboBox.addItem("Sri Lanka");
        mCountryComboBox.addItem("Nepal");
        mMainPanel.add(mDetailsLabel);
        mMainPanel.add(mDetailsTextArea);

        mMainPanel.add(mSubmitButton);
        mMainPanel.add(mExitButton);

        mSubmitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String displayString = "";
                displayString += "Name: " + mNameTextField.getText() + "\n";
                displayString += "Gender: ";
                if(mMaleRadioButton.isSelected()) 
                    displayString += "Male\n";
                else
                    displayString += "Female\n";
                
                displayString += "Interest: ";
                if(mMusiCheckBox.isSelected())
                    displayString += "Music ";
                if(mSwimmingCheckBox.isSelected())
                    displayString += "Swimming";

                displayString += "\nPlace: " + mCountryComboBox.getSelectedItem() + "\n";
                
                mDetailsTextArea.setText(displayString);

            }
            
        });
    }

    void render() {
        this.pack();
        this.setVisible(true);
    }
}

public class Expriment12C {
    public static void main(String[] args) {
        Form form = new Form("Form");
        form.init();
        form.render();
    }
}
