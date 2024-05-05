/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ProjManagerPackage;

import ProjManagerPackage.AssignSupvElem.CrossIcon;
import ProjManagerPackage.AssignSupvElem.LectData_IO;
import ProjManagerPackage.AssignSupvElem.TickIcon;
import ProjManagerPackage.AssignSupvElem.TickCrossIcon_TableActionCellRender;
import ProjManagerPackage.StuAssessElem.ModernScrollBarUI;
import ProjManagerPackage.StuAssessElem.TableActionCellEditor;
import ProjManagerPackage.StuAssessElem.TableActionCellRender;
import ProjManagerPackage.StuAssessElem.TableActionEvent;
import ProjManagerPackage.StuAssessElem.TableHeader;
import assignment_ood.Lecturer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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
public class AssignAdvsTab_LectRoleList extends javax.swing.JPanel {

    private MainFrame mainFrame;
    
    public AssignAdvsTab_LectRoleList(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        //Customize Table Modification
        /* Set the scrollbar to customize scrollbar*/
        fixTable(jScrollPane1);
        
        /* Set the header to customize header */
        LectRoleTable.getTableHeader().setReorderingAllowed(false);
        LectRoleTable.getTableHeader().setResizingAllowed(false);
        LectRoleTable.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(o + "");
                return header;
            }
        });

        
        //Insert lecturer data into table
        LectRoleTable.getColumnModel().getColumn(2).setCellRenderer(new TickCrossIcon_TableActionCellRender());
        LectRoleTable.getColumnModel().getColumn(3).setCellRenderer(new TickCrossIcon_TableActionCellRender());
        
        for (Lecturer lect :LectData_IO.LectData){
            String LectName = lect.lectName;
            String LectID = lect.lectid;
            Boolean isSupervisor = lect.isSupervisor;
            Boolean isSecondMarker = lect.isSecondMarker;
            
            Object[] InsertRow = {LectName, LectID};

            DefaultTableModel model = (DefaultTableModel) LectRoleTable.getModel();
            model.addRow(InsertRow);
            
            // Set the appropriate icon based on the value of isSupervisor and isSecondMarker
            // in the corresponding columns (2 and 3)
            if (isSupervisor) {
                model.setValueAt(true, model.getRowCount() - 1, 2);
            } else {
                model.setValueAt(false, model.getRowCount() - 1, 2);
            }

            if (isSecondMarker) {
                model.setValueAt(true, model.getRowCount() - 1, 3);
            } else {
                model.setValueAt(false, model.getRowCount() - 1, 3);
            }
        }

        
        /*Set the edit button and its function*/
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                //Get the student id of selected student
                String selectedLectID = (String) LectRoleTable.getValueAt(row, 1);
                mainFrame.dispose();
                
                AssignAdvsFrame_LectRole editPage = new AssignAdvsFrame_LectRole(selectedLectID);
                editPage.setVisible(true);
            }
        };
        
        //Insert edit button into table
        LectRoleTable.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        LectRoleTable.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
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
        LectRoleTable = new javax.swing.JTable();
        btbBack = new javax.swing.JLabel();
        TabTitle = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LectRoleTable.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        LectRoleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Supervisor", "Second Marker", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LectRoleTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LectRoleTable.setRowHeight(40);
        jScrollPane1.setViewportView(LectRoleTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 886, 440));

        btbBack.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        btbBack.setForeground(new java.awt.Color(0, 0, 0));
        btbBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/leftArrow(Black).png"))); // NOI18N
        btbBack.setText("Back...");
        btbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbBackMouseClicked(evt);
            }
        });
        add(btbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TabTitle.setFont(new java.awt.Font("Dubai Medium", 0, 28)); // NOI18N
        TabTitle.setText("Lecturer List");
        add(TabTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbBackMouseClicked
        mainFrame.changedTab(3);
    }//GEN-LAST:event_btbBackMouseClicked

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
    private javax.swing.JTable LectRoleTable;
    private javax.swing.JLabel TabTitle;
    private javax.swing.JLabel btbBack;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
