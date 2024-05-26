/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Lecturer_Package;
import GUI_Template.*;
import Java_Assignment.Session;
import ProjManagerPackage.*;
import StuPackage.StuData_IO;
import java.awt.Color;
import javax.swing.SwingUtilities;
import AdminPackage.addLect;
import Lecturer_Package.Admin;
import Lecturer_Package.Lecturer;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Lect_ViewPresentation extends javax.swing.JPanel {
private Lecture_mainframe lectmainframe;
private List<Lecturer> lecturers;
    /**
     * Creates new form Lect_ViewPresentation
     */
    public Lect_ViewPresentation(Lecture_mainframe lectmainframe) {
           if (Session.isLoggedIn()) {
    
    String username = Session.getUserID();
    System.out.println("Logged in as: " + username);
} else {
    
    System.out.println("No user logged in.");
}
        lecturers = Admin.readLectData("LecData.txt");
        initComponents();
        this.lectmainframe= lectmainframe;
         
        String UserName = Session.getUserID();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewPresent3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnViewConsult = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(932, 530));

        btnViewPresent3.setBackground(new java.awt.Color(255, 51, 51));
        btnViewPresent3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnViewPresent3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewPresent3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel5.setText("View Presentation");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/present.png"))); // NOI18N

        javax.swing.GroupLayout btnViewPresent3Layout = new javax.swing.GroupLayout(btnViewPresent3);
        btnViewPresent3.setLayout(btnViewPresent3Layout);
        btnViewPresent3Layout.setHorizontalGroup(
            btnViewPresent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViewPresent3Layout.createSequentialGroup()
                .addGroup(btnViewPresent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnViewPresent3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(btnViewPresent3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        btnViewPresent3Layout.setVerticalGroup(
            btnViewPresent3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnViewPresent3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28))
        );

        btnViewConsult.setBackground(new java.awt.Color(255, 51, 51));
        btnViewConsult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        btnViewConsult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewConsultMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel6.setText("View Consultation");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/StuConsultation2.png"))); // NOI18N

        javax.swing.GroupLayout btnViewConsultLayout = new javax.swing.GroupLayout(btnViewConsult);
        btnViewConsult.setLayout(btnViewConsultLayout);
        btnViewConsultLayout.setHorizontalGroup(
            btnViewConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnViewConsultLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(44, 44, 44))
            .addGroup(btnViewConsultLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnViewConsultLayout.setVerticalGroup(
            btnViewConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnViewConsultLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnViewPresent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnViewConsult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewPresent3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewConsult, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPresent3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewPresent3MouseClicked
     if (lecturers != null && RoleChecker.isSupervisor(Session.getUserID(), lecturers)) {
            lectmainframe.changeTab(6); 
        } else {
            JOptionPane.showMessageDialog(this, "Access denied. Only supervisors can view the presentation table.");
        }
       
    }//GEN-LAST:event_btnViewPresent3MouseClicked

    private void btnViewConsultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewConsultMouseClicked
        if (lecturers != null && RoleChecker.isSecondMarker(Session.getUserID(), lecturers)) {
            lectmainframe.changeTab(7); // Show consultation table tab
        } else {
            JOptionPane.showMessageDialog(this, "Access denied. Only second markers can view the consultation table.");
        }
    }//GEN-LAST:event_btnViewConsultMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnViewConsult;
    private javax.swing.JPanel btnViewPresent3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
