package library;

import javax.swing.*;  
import java.awt.event.*;  
public class Library  
{  
     Library(){  
    	 
        JFrame f= new JFrame("Library");  // Create application window
        JLabel title1;
        title1 = new JLabel("Please select a magnetic configuration and nanoparticles."); 
        title1.setBounds(0,0,500,100);
        
        final JLabel label = new JLabel();          
        label.setBounds(0,25,500,100);  // The output width and height
        JButton b=new JButton("Show");  //Display button
        b.setBounds(200,150,80,30);  // Button position and size
        final DefaultListModel<String> l1 = new DefaultListModel<>();  
        
          // Identify Magnetic Elements
          l1.addElement("Magnet A");  // We probably need to rebuild a class for these
          l1.addElement("Magnet B");  
          l1.addElement("Magnet C");  
          l1.addElement("Magnet D");  
          final JList<String> list1 = new JList<>(l1);  
          list1.setBounds(100,100, 75,75);  // List position
          
          
          DefaultListModel<String> l2 = new DefaultListModel<>();  
          l2.addElement("NP A");  
          l2.addElement("NP B");  
          l2.addElement("NP C");  
          l2.addElement("NP D");  
          final JList<String> list2 = new JList<>(l2);  
          list2.setBounds(100,200, 75,75);  // List position
          
          
          f.add(list1); f.add(list2); f.add(b); f.add(label); f.add(title1);
          f.setSize(500,450);  // Application window size
          f.setLayout(null);  
          f.setVisible(true);  
          
          b.addActionListener(new ActionListener() {  
              public void actionPerformed(ActionEvent e) {   
                 String data = "";  
                 if (list1.getSelectedIndex() != -1) {                       
                    data = "Magnetic Configuration Selected: " + list1.getSelectedValue();   
                    label.setText(data);  
                 }  
                 if(list2.getSelectedIndex() != -1){  
                    data += ", Nanoparticles Selected: ";  
                    for(Object frame :list2.getSelectedValues()){  
                       data += frame + " ";  
                    }  
                 }  
                 label.setText(data);  
              }  
           });   
     }  
}