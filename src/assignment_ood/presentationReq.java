/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assignment_ood;

import ProjManagerPackage.StuAssessElem.TableActionCellEditor;
import ProjManagerPackage.StuAssessElem.TableActionCellRender;
import ProjManagerPackage.StuAssessElem.TableActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author User
 */
public class presentationReq extends javax.swing.JPanel {
private Lecture_mainframe lectmainframe;
    /**
     * Creates new form presentationReq
     */
    public presentationReq(Lecture_mainframe lectmainframe) {
        this.lectmainframe = lectmainframe;
        initComponents();
        populatePresentationTable();
        
        
     
        presentationTable.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        presentationTable.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        


    }
    
    TableActionEvent event = new TableActionEvent() {
    @Override
    public void onEdit(int row) {
        // Get the selected row
         int selectedRow = presentationTable.convertRowIndexToModel(presentationTable.getSelectedRow());
    if (selectedRow != -1) {
            // Create a combo box with status options
            String[] statusOptions = {"Pending", "Rejected", "Accepted"};
            JComboBox<String> cbStatus = new JComboBox<>(statusOptions);

            // Get the current status of the selected row
            String currentStatus = (String) presentationTable.getValueAt(selectedRow, 3);
            cbStatus.setSelectedItem(currentStatus); // Set the combo box to the current status

            // Display a dialog with the combo box for editing status
            int option = JOptionPane.showConfirmDialog(presentationTable, cbStatus, "Edit Status", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                // Get the selected status from the combo box
                String newStatus = (String) cbStatus.getSelectedItem();
                // Update the status in the table
                presentationTable.setValueAt(newStatus, selectedRow, 3);
                // Optionally, update the status in the file or perform any other actions needed
                // Admin.updateStatusInFile(selectedRow, newStatus);
                Admin.updateStatusInFile(selectedRow, newStatus);
              
            }
        } else {
            JOptionPane.showMessageDialog(presentationTable, "Please select a row to edit.");
        }
    }
};
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        presentationTable = new javax.swing.JTable();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/leftArrow(Black).png"))); // NOI18N
        jLabel1.setText("Back");

        presentationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student", "Lecturer", "Date", "Status", "Action"
            }
        ));
        presentationTable.setRowHeight(50);
        jScrollPane1.setViewportView(presentationTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void populatePresentationTable() {
    DefaultTableModel model = (DefaultTableModel) presentationTable.getModel();

    // Clear existing rows in the table model
    model.setRowCount(0);

    // Read data from presentation_data.txt file
    try (BufferedReader reader = new BufferedReader(new FileReader("presentation_data.txt"))) {
        String line;
        List<String[]> rows = new ArrayList<>(); // Store rows temporarily
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split(",");
            rows.add(rowData); // Add rows to the list
        }

        // Add rows from the list to the model
        for (String[] row : rows) {
            model.addRow(row);
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error reading presentation data file.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable presentationTable;
    // End of variables declaration//GEN-END:variables
}
