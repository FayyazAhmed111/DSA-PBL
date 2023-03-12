package Assignment;
import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class Problem1 extends JFrame implements ActionListener {
	
   private JTextField textField;
   private JButton button;
   private JTable table;
   private JScrollPane scrollPane;
   private DefaultTableModel tableModel;
   private Hashtable<String,Universities> tablee = new Hashtable<>();
   
   
   public void pb1(Hashtable<String, Universities> tablee) {
	   this.tablee=tablee;
      setTitle("PBL SW");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(700, 500);
      
      // Create the text field and button
      textField = new JTextField(20);
      button = new JButton("Show Details");
      button.addActionListener(this);

      // Create the table
      tableModel = new DefaultTableModel();
      tableModel.addColumn("Key");
      tableModel.addColumn("Name");
      tableModel.addColumn("Rank");
      tableModel.addColumn("Publications");
      tableModel.addColumn("Location");
      
      table = new JTable(tableModel);
      scrollPane = new JScrollPane(table);

      // Add the components to the GUI
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(textField);
      c.add(button);
      c.add(scrollPane);

      setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      String key = textField.getText();
      if(key.length()==4) {
    	  key=key.toUpperCase();
    	  if(!tablee.containsKey(key)) {
    		  JOptionPane.showMessageDialog(null, "University doesn't exsist in our data");   
    	  }
    	  else {
    		  Universities obj = (Universities) tablee.get(key);
    		  tableModel.addRow(new Object[] { key,obj.getName(),obj.getPr(),obj.getPub(),obj.getLoc()});
    		  textField.setText("");   
    	  }
      }
      else {
    	  JOptionPane.showMessageDialog(null, "Enter correct Key!");   
    	  textField.setText(""); 
      }
      }
  
}
