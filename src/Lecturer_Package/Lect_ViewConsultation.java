/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Lecturer_Package;

import Java_Assignment.Session;
import ProjManagerPackage.StuAssesElem.TableActionCellEditor_EditButton;
import ProjManagerPackage.StuAssesElem.TableActionCellRender_EditButton;
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
import Lecturer_Package.presentationReq;
import ProjManagerPackage.StuAssesElem.TableActionEvent_EditButton;
import javax.swing.JTable;
/**
 *
 * @author User
 */
public class Lect_ViewConsultation extends javax.swing.JPanel {
private Lecture_mainframe lectmainframe;
    /**
     * Creates new form Lect_ViewConsultation
     */
    public Lect_ViewConsultation(Lecture_mainframe lectmainframe) {
         this.lectmainframe = lectmainframe;
        initComponents();
        populateConsultationTable(ConsultTbl,Session.getUserID());
            
           ConsultTbl.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender_EditButton());
        ConsultTbl.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor_EditButton(event));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ConsultTbl = new javax.swing.JTable();

        ConsultTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student", "Supervisor", "Intake", "Date", "Time", "Status", "Action"
            }
        ));
        ConsultTbl.setRowHeight(50);
        jScrollPane1.setViewportView(ConsultTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
 TableActionEvent_EditButton event = new TableActionEvent_EditButton() {
    @Override
    public void onEdit(int row) {
      
        
        
       
        int modelRow = ConsultTbl.convertRowIndexToModel(row);

        
        String[] statusOptions = {"Pending", "Rejected", "Accepted"};
        JComboBox<String> cbStatus = new JComboBox<>(statusOptions);

        // Get the current status of the selected row
        String currentStatus = (String) ConsultTbl.getValueAt(modelRow, 5);
        cbStatus.setSelectedItem(currentStatus);

        int option = JOptionPane.showConfirmDialog(ConsultTbl, cbStatus, "Edit Status", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            // Get the selected status from the combo box
            String newStatus = (String) cbStatus.getSelectedItem();
            // Update the status in the table
            ConsultTbl.setValueAt(newStatus, modelRow, 5);

            // Update the status in the file
            Admin.updateStatusInConsult(modelRow, newStatus);
        } else {
            JOptionPane.showMessageDialog(ConsultTbl, "Please select a row to edit.");
        }
    }
};
  public  void populateConsultationTable(JTable presentationTable,String supervisor) {
    DefaultTableModel model = (DefaultTableModel) ConsultTbl.getModel();

    // Clear existing rows in the table model
    model.setRowCount(0);

    // Read data from presentation_data.txt file
    try (BufferedReader reader = new BufferedReader(new FileReader("ConsultationData.txt"))) {
        String line;
         while ((line = reader.readLine()) != null) {
            
            String[] parts = line.split(",");

            
           if (parts.length >= 6 && parts[1].trim().equalsIgnoreCase(supervisor)) {

    model.addRow(new Object[]{parts[0], parts[1], parts[2], parts[3],parts[4],parts[5]});
}
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error reading presentation data file.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ConsultTbl;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
