package games;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import searchAlgorithms.BinarySearchTrial;
/**
 *This is a compilation of the GUI and recursion lessons creating a game where a user chooses a number between 0 and 20
 * I have created an ArrayList<Integer> containing 1- numbers selected at random. The program reads the input and 
 * runs it against the arraylist created to see if it matches any of the 10 numbers selected. 
 * 
 * @author zac
 */
public class PickANumber{
    private JLabel item1;
    private JLabel item2;
    private JTextField item3;
    private JButton item4;
    
    public static void main(String[] args) {
        new PickANumber().run();
    }
    
    public void run(){
        //swing look and feel for windows or mac
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        //set values to given instance variables       
        item1 = new JLabel("I have a list of 10 random numbers less than 20");       
        item2 = new JLabel("Type your guess, then press enter!");
        item1.setHorizontalAlignment(SwingConstants.CENTER);
        item2.setHorizontalAlignment(SwingConstants.CENTER);
        
        //create a JPanel for the JLabels
        JPanel panelLabel = new JPanel();
            panelLabel.setLayout(new GridLayout(2,1,0,10));
            panelLabel.add(item1);
            panelLabel.add(item2);            
         
        //create the JTextField
        item3 = new JTextField(3);
        
        //create the JPanel for the textfield
        JPanel panelText = new JPanel();
            panelText.setLayout(new GridLayout(1,1,0,0));
            panelText.add(item3);
            
        //create item4 button using the newButton method below
        item4 = newButton("Submit", 90, 30);
        
        //add a panel for the button
        JPanel butPanel = new JPanel();
            butPanel.add(Box.createVerticalGlue());
            butPanel.add(item4);
            
        //create a panel to hold the panels for text and label
        JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            mainPanel.add(panelLabel);
            mainPanel.add(panelText);
            mainPanel.add(butPanel);
            
        //create another panel using the mainPanel centered
        JPanel finalPanel = new JPanel();
            finalPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
            finalPanel.add(mainPanel);
            
        //create the JFrame to hold the info
        JFrame frame = new JFrame();
            frame.setSize(400,200);
            frame.add(finalPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        item4.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent pEvent){
                        BinarySearchTrial bnt = new BinarySearchTrial();
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(1); 
                        a.add(2); 
                        a.add(3); 
                        a.add(4); 
                        a.add(6); 
                        a.add(7);
                        a.add(11);
                        a.add(14);
                        a.add(16);
                        a.add(18);         
                        if(pEvent.getSource() == item4){
                        int input = Integer.parseInt(item3.getText());            
                        JOptionPane.showMessageDialog(null,bnt.recursiveBinarySearch(a, input, 0, a.size()-1));
                    }
                }
            }
        );       
        //This code would be used if we didnt wanr to create an anonymous class like above
            //theChoice choice = new theChoice();
            //item4.addActionListener(choice);
    }

    private JButton newButton(String pName, int pWidth, int pHeight) {
        JButton button = new JButton(pName);
        button.setPreferredSize(new Dimension(pWidth, pHeight));
     return button;
    }
  //---------------------------------------------------------------              
  //actionPerformed method, only used if not using the anoymyous class above.  
    public class theChoice implements ActionListener{
         
         

         public void actionPerformed(ActionEvent event){
                    
            BinarySearchTrial bnt = new BinarySearchTrial();
            ArrayList<Integer> a = new ArrayList<>();
            a.add(1); 
            a.add(2); 
            a.add(3); 
            a.add(4); 
            a.add(6); 
            a.add(7);
            a.add(11);
            a.add(14);
            a.add(16);
            a.add(18);         
            if(event.getSource() == item4){
                int input = Integer.parseInt(item3.getText());            
                JOptionPane.showMessageDialog(null,bnt.recursiveBinarySearch(a, input, 0, a.size()-1));
            }                     
         }
     }       
}

