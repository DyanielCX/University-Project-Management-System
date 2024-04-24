/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProjManagerPackage;

import ProjManagerPackage.StuAsseTabElement.IntakeBasedMethod;
import ProjManagerPackage.StuAsseTabElement.ModernScrollBarUI;
import ProjManagerPackage.StuAsseTabElement.TableActionCellEditor;
import ProjManagerPackage.StuAsseTabElement.TableActionCellRender;
import ProjManagerPackage.StuAsseTabElement.TableActionEvent;
import ProjManagerPackage.StuAsseTabElement.TableHeader;
import StuPackage.StuData_IO;
import StuPackage.Student;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class StuAssTab_IntakeBased extends javax.swing.JPanel {

    private ProjMng_MainFrame mainFrame;
    
    public StuAssTab_IntakeBased(ProjMng_MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        /* Set the scrollbar to customize scrollbar*/
        fixTable(jScrollPane1);
        
        /* Set the header to customize header */
        StuAssTable.getTableHeader().setReorderingAllowed(false);
        StuAssTable.getTableHeader().setResizingAllowed(false);
        StuAssTable.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });

        
        /*Show the student haven't been alloted assesment*/
        ArrayList<String> intakeList = IntakeBasedMethod.getIntake();
        
        for (String intake : intakeList){
            String assessment = IntakeBasedMethod.getAssessment(intake);
            
            if (assessment.equals("-")) {
                Object[] InsertRow = {intake, assessment};

                DefaultTableModel model = (DefaultTableModel) StuAssTable.getModel();
                model.addRow(InsertRow);
            }
        }
        
        /*Show the student have been alloted assesment*/
        for (String intake : intakeList){
            String assessment = IntakeBasedMethod.getAssessment(intake);
            
            if (!assessment.equals("-")) {
                Object[] InsertRow = {intake, assessment};

                DefaultTableModel model = (DefaultTableModel) StuAssTable.getModel();
                model.addRow(InsertRow);
            }
        }
        
        /*Set the edit button and its function*/
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                //Get the student id of selected student
                String StuID = (String) StuAssTable.getValueAt(row, 1);
                mainFrame.dispose();
                
                EditAssessmentFrame editPage = new EditAssessmentFrame(StuID);
                editPage.setVisible(true);
            }
        };
        
        //Insert edit button into table
        StuAssTable.getColumnModel().getColumn(2).setCellRenderer(new TableActionCellRender());
        StuAssTable.getColumnModel().getColumn(2).setCellEditor(new TableActionCellEditor(event));
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
        StuAssTable = new javax.swing.JTable();
        TabTitle = new javax.swing.JLabel();
        btbStuBased = new javax.swing.JPanel();
        lblStuBased = new javax.swing.JLabel();
        btbIntakeBased = new javax.swing.JPanel();
        lblIntakeBased = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StuAssTable.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        StuAssTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Intake", "Assessment", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StuAssTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        StuAssTable.setRowHeight(40);
        jScrollPane1.setViewportView(StuAssTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 65, 886, 465));

        TabTitle.setFont(new java.awt.Font("Dubai Medium", 0, 24)); // NOI18N
        TabTitle.setText("Intake Data");
        add(TabTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 17, -1, -1));

        btbStuBased.setBackground(new java.awt.Color(255, 255, 255));
        btbStuBased.setForeground(new java.awt.Color(255, 255, 255));
        btbStuBased.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbStuBasedMouseClicked(evt);
            }
        });

        lblStuBased.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        lblStuBased.setForeground(new java.awt.Color(0, 0, 0));
        lblStuBased.setText("Student");
        btbStuBased.add(lblStuBased);

        add(btbStuBased, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 90, 40));

        btbIntakeBased.setBackground(new java.awt.Color(106, 212, 221));
        btbIntakeBased.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbIntakeBasedMouseClicked(evt);
            }
        });

        lblIntakeBased.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        lblIntakeBased.setForeground(new java.awt.Color(255, 255, 255));
        lblIntakeBased.setText("Intake");
        btbIntakeBased.add(lblIntakeBased);

        add(btbIntakeBased, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 90, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btbIntakeBasedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbIntakeBasedMouseClicked
        mainFrame.changedTab(1);
    }//GEN-LAST:event_btbIntakeBasedMouseClicked

    private void btbStuBasedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbStuBasedMouseClicked
        mainFrame.changedTab(2);
    }//GEN-LAST:event_btbStuBasedMouseClicked

    /* Customize the scrollbar for table */
    public void fixTable (JScrollPane scroll){
        scroll.getViewport().setBackground(Color.WHITE);
        
        JScrollBar verticalScrollBar = scroll.getVerticalScrollBar();
        verticalScrollBar.setUI(new ModernScrollBarUI());

        // Set other properties of the vertical scroll bar
        verticalScrollBar.setPreferredSize(new Dimension(3, 5));
        verticalScrollBar.setForeground(new Color(71, 105, 231, 178));
        verticalScrollBar.setUnitIncrement(20);
        verticalScrollBar.setOpaque(false);
        
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StuAssTable;
    private javax.swing.JLabel TabTitle;
    private javax.swing.JPanel btbIntakeBased;
    private javax.swing.JPanel btbStuBased;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIntakeBased;
    private javax.swing.JLabel lblStuBased;
    // End of variables declaration//GEN-END:variables
}
