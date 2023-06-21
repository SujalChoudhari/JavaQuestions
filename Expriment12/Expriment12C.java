package Expriment12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

class Form extends JFrame {
    private JPanel mMainPanel;
    private JLabel mNameLabel;
    private JTextField mNameTextField;
    private JLabel mGenderLabel;
    private JRadioButton mMaleRadioButton;
    private JRadioButton mFemaleRadioButton;
    private JLabel mInterestLabel;
    private JCheckBox mMusiCheckBox;
    private JCheckBox mSwimmingCheckBox;
    private JLabel mPlaceLabel;
    private JComboBox<String> mCountryComboBox;
    private JLabel mDetailsLabel;
    private JTextArea mDetailsTextArea;

    Form(){
        mMainPanel = new JPanel();
        mNameLabel = new JLabel("Name:");
        mNameTextField = new JTextField("",13);
        mGenderLabel = new JLabel("Gender:");
        mMaleRadioButton = new JRadioButton("Male",false);
        mFemaleRadioButton = new JRadioButton("Female",true);
        mInterestLabel = new JLabel("Interest:");
        mMusiCheckBox = new JCheckBox("Music");
        mSwimmingCheckBox = new JCheckBox("Swimming");
        mPlaceLabel = new JLabel("Place:");
        mCountryComboBox = new JComboBox<String>();
        mDetailsLabel = new JLabel("Details:");
        mDetailsTextArea = new JTextArea();
    }

    public void init(){
        this.setSize(new Dimension(600,500));
        this.add(mMainPanel);
        mMainPanel.add(mNameLabel);
        mMainPanel.add(mNameTextField);
        mMainPanel.add(mGenderLabel);
        mMainPanel.add(mMaleRadioButton);
        mMainPanel.add(mFemaleRadioButton);
        mMainPanel.add(mInterestLabel);
        mMainPanel.add(mMusiCheckBox);
        mMainPanel.add(mSwimmingCheckBox);
        mMainPanel.add(mPlaceLabel);
        mMainPanel.add(mCountryComboBox);
        mMainPanel.add(mDetailsLabel);
        mMainPanel.add(mDetailsTextArea);
    }



    

}

public class Expriment12C {
    public static void main(String[] args) {
        Form form = new Form();
        form.init();
        form.setVisible(true);
    }
}
