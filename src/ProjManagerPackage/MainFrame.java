package ProjManagerPackage;

import Java_Assignment.LoginPage;
import ProjManagerPackage.AssignSupvElem.LectData_IO;
import StuPackage.StuData_IO;
import java.awt.Color;

/**
 *
 * @author PC
 */
public class MainFrame extends javax.swing.JFrame {

    // Color for side nav bar tab
    private Color navDefaultColor = new Color(122, 162, 227);
    private Color navSelectedColor = new Color(106, 212, 221);
    
    
    public MainFrame() {
        initComponents();
        getContentPane().setBackground(new Color(248, 246, 227));
        
        
        /* Get the project manager name */
        String ProjMngName = "Shahab";
        AccName.setText(ProjMngName);
        
        
        /* Set the tab panel */
        //Dashboard Panel Section
        Dashboard Tab1 = new Dashboard(this);
        TabPanel.addTab("tab1", Tab1);
        

        //Student Assessment Panel Section
        StuAssTab_IntakeBased Tab2 = new StuAssTab_IntakeBased(this);
        TabPanel.addTab("tab2", Tab2);
        
        StuAssTab_StuBased Tab3 = new StuAssTab_StuBased(this);
        TabPanel.addTab("tab3", Tab3);
        
        
        //Assign Supervisor Panel Section
        AssignAdvsTab Tab4 = new AssignAdvsTab(this);
        TabPanel.addTab("tab4", Tab4);
    
        AssignAdvsTab_LectRoleList Tab5 = new AssignAdvsTab_LectRoleList(this);
        TabPanel.addTab("tab5", Tab5);
  
        
        //Account Management Panel Section
        AccMgmtTab Tab6 = new AccMgmtTab(this);
        TabPanel.addTab("tab6", Tab6);
        
        AccMgmtTab_LectAcc Tab7 = new AccMgmtTab_LectAcc(this);
        TabPanel.addTab("tab7", Tab7);
        
        AccMgmtTab_StuIntake Tab8 = new AccMgmtTab_StuIntake(this);
        TabPanel.addTab("tab8", Tab8);
        
        
        //Report Status Panel Section
        RptStatus_StuIntake Tab9 = new RptStatus_StuIntake(this);
        TabPanel.addTab("tab9", Tab9);
        
        RptStatus_StuList currentTab2 = new RptStatus_StuList(this);
        TabPanel.addTab("currentTab2", currentTab2);//Need to move to external method
        
        //Set the Dashboard Panel as the default panel
        TabPanel.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideNavBar = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        DashboardPane = new javax.swing.JPanel();
        navDashboard = new javax.swing.JLabel();
        StuAssessmentPane = new javax.swing.JPanel();
        navStuAssessment = new javax.swing.JLabel();
        AssignAdvisorsPane = new javax.swing.JPanel();
        navAssignAdvisors = new javax.swing.JLabel();
        AccManagementPane = new javax.swing.JPanel();
        navAccMangement = new javax.swing.JLabel();
        ReportStatusPane = new javax.swing.JPanel();
        navReportStatus = new javax.swing.JLabel();
        topNavBar = new javax.swing.JPanel();
        PanelTitle = new javax.swing.JLabel();
        AccName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        CoverTabPane = new javax.swing.JPanel();
        TabPanel = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 246, 227));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideNavBar.setBackground(new java.awt.Color(122, 162, 227));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo(White).png"))); // NOI18N

        DashboardPane.setBackground(new java.awt.Color(106, 212, 221));

        navDashboard.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        navDashboard.setForeground(new java.awt.Color(255, 255, 255));
        navDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProjMngDashboard.png"))); // NOI18N
        navDashboard.setText("Dashboard");
        navDashboard.setIconTextGap(15);
        navDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DashboardPaneLayout = new javax.swing.GroupLayout(DashboardPane);
        DashboardPane.setLayout(DashboardPaneLayout);
        DashboardPaneLayout.setHorizontalGroup(
            DashboardPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(navDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DashboardPaneLayout.setVerticalGroup(
            DashboardPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        StuAssessmentPane.setBackground(new java.awt.Color(122, 162, 227));

        navStuAssessment.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        navStuAssessment.setForeground(new java.awt.Color(255, 255, 255));
        navStuAssessment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navStuAssessment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProjMngStuAsse.png"))); // NOI18N
        navStuAssessment.setText("Student Assessment");
        navStuAssessment.setDoubleBuffered(true);
        navStuAssessment.setIconTextGap(15);
        navStuAssessment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navStuAssessmentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout StuAssessmentPaneLayout = new javax.swing.GroupLayout(StuAssessmentPane);
        StuAssessmentPane.setLayout(StuAssessmentPaneLayout);
        StuAssessmentPaneLayout.setHorizontalGroup(
            StuAssessmentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StuAssessmentPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navStuAssessment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StuAssessmentPaneLayout.setVerticalGroup(
            StuAssessmentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StuAssessmentPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navStuAssessment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        AssignAdvisorsPane.setBackground(new java.awt.Color(122, 162, 227));

        navAssignAdvisors.setBackground(new java.awt.Color(106, 212, 221));
        navAssignAdvisors.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        navAssignAdvisors.setForeground(new java.awt.Color(255, 255, 255));
        navAssignAdvisors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navAssignAdvisors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProjMngSupervisor.png"))); // NOI18N
        navAssignAdvisors.setText("Assign Advisors");
        navAssignAdvisors.setIconTextGap(15);
        navAssignAdvisors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navAssignAdvisorsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AssignAdvisorsPaneLayout = new javax.swing.GroupLayout(AssignAdvisorsPane);
        AssignAdvisorsPane.setLayout(AssignAdvisorsPaneLayout);
        AssignAdvisorsPaneLayout.setHorizontalGroup(
            AssignAdvisorsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssignAdvisorsPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(navAssignAdvisors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AssignAdvisorsPaneLayout.setVerticalGroup(
            AssignAdvisorsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssignAdvisorsPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navAssignAdvisors, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        AccManagementPane.setBackground(new java.awt.Color(122, 162, 227));

        navAccMangement.setBackground(new java.awt.Color(122, 162, 227));
        navAccMangement.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        navAccMangement.setForeground(new java.awt.Color(255, 255, 255));
        navAccMangement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navAccMangement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProjMngAcc.png"))); // NOI18N
        navAccMangement.setText("Account Management");
        navAccMangement.setIconTextGap(15);
        navAccMangement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navAccMangementMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AccManagementPaneLayout = new javax.swing.GroupLayout(AccManagementPane);
        AccManagementPane.setLayout(AccManagementPaneLayout);
        AccManagementPaneLayout.setHorizontalGroup(
            AccManagementPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccManagementPaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(navAccMangement)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AccManagementPaneLayout.setVerticalGroup(
            AccManagementPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccManagementPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navAccMangement, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        ReportStatusPane.setBackground(new java.awt.Color(122, 162, 227));

        navReportStatus.setBackground(new java.awt.Color(122, 162, 227));
        navReportStatus.setFont(new java.awt.Font("Dubai Medium", 0, 20)); // NOI18N
        navReportStatus.setForeground(new java.awt.Color(255, 255, 255));
        navReportStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        navReportStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProjMngReport.png"))); // NOI18N
        navReportStatus.setText("Report Status");
        navReportStatus.setIconTextGap(15);
        navReportStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navReportStatusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ReportStatusPaneLayout = new javax.swing.GroupLayout(ReportStatusPane);
        ReportStatusPane.setLayout(ReportStatusPaneLayout);
        ReportStatusPaneLayout.setHorizontalGroup(
            ReportStatusPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportStatusPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(navReportStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReportStatusPaneLayout.setVerticalGroup(
            ReportStatusPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportStatusPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(navReportStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout sideNavBarLayout = new javax.swing.GroupLayout(sideNavBar);
        sideNavBar.setLayout(sideNavBarLayout);
        sideNavBarLayout.setHorizontalGroup(
            sideNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideNavBarLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addComponent(DashboardPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(StuAssessmentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AssignAdvisorsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AccManagementPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ReportStatusPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideNavBarLayout.setVerticalGroup(
            sideNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavBarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(DashboardPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(StuAssessmentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(AssignAdvisorsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(AccManagementPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(ReportStatusPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(sideNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        topNavBar.setBackground(new java.awt.Color(151, 231, 225));

        PanelTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        PanelTitle.setForeground(new java.awt.Color(255, 255, 255));
        PanelTitle.setText("Dashboard");

        AccName.setFont(new java.awt.Font("Dubai Medium", 0, 28)); // NOI18N
        AccName.setForeground(new java.awt.Color(255, 255, 255));
        AccName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AccName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ProjMngUser.png"))); // NOI18N
        AccName.setIconTextGap(10);

        lblLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout.png"))); // NOI18N
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topNavBarLayout = new javax.swing.GroupLayout(topNavBar);
        topNavBar.setLayout(topNavBarLayout);
        topNavBarLayout.setHorizontalGroup(
            topNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topNavBarLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(PanelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
                .addComponent(AccName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topNavBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(20, 20, 20))
        );
        topNavBarLayout.setVerticalGroup(
            topNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topNavBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogout)
                .addGap(3, 3, 3)
                .addGroup(topNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(topNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 975, -1));

        CoverTabPane.setBackground(new java.awt.Color(248, 246, 227));

        javax.swing.GroupLayout CoverTabPaneLayout = new javax.swing.GroupLayout(CoverTabPane);
        CoverTabPane.setLayout(CoverTabPaneLayout);
        CoverTabPaneLayout.setHorizontalGroup(
            CoverTabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        CoverTabPaneLayout.setVerticalGroup(
            CoverTabPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(CoverTabPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 940, 30));

        TabPanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        getContentPane().add(TabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 94, -1, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void navDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navDashboardMouseClicked
        DashboardPane.setBackground(navSelectedColor);
        StuAssessmentPane.setBackground(navDefaultColor);
        AssignAdvisorsPane.setBackground(navDefaultColor);
        AccManagementPane.setBackground(navDefaultColor);
        ReportStatusPane.setBackground(navDefaultColor);
        
        PanelTitle.setText("Dashboard");
        changedTab(0);
    }//GEN-LAST:event_navDashboardMouseClicked

    private void navStuAssessmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navStuAssessmentMouseClicked
        DashboardPane.setBackground(navDefaultColor);
        StuAssessmentPane.setBackground(navSelectedColor);
        AssignAdvisorsPane.setBackground(navDefaultColor);
        AccManagementPane.setBackground(navDefaultColor);
        ReportStatusPane.setBackground(navDefaultColor);
        
        PanelTitle.setText("Student Assessment");
        changedTab(1);
    }//GEN-LAST:event_navStuAssessmentMouseClicked

    private void navAssignAdvisorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAssignAdvisorsMouseClicked
        DashboardPane.setBackground(navDefaultColor);
        StuAssessmentPane.setBackground(navDefaultColor);
        AssignAdvisorsPane.setBackground(navSelectedColor);
        AccManagementPane.setBackground(navDefaultColor);
        ReportStatusPane.setBackground(navDefaultColor);
        
        PanelTitle.setText("Assign Advisors");
        changedTab(3);
    }//GEN-LAST:event_navAssignAdvisorsMouseClicked

    private void navAccMangementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navAccMangementMouseClicked
        DashboardPane.setBackground(navDefaultColor);
        StuAssessmentPane.setBackground(navDefaultColor);
        AssignAdvisorsPane.setBackground(navDefaultColor);
        AccManagementPane.setBackground(navSelectedColor);
        ReportStatusPane.setBackground(navDefaultColor);
        
        PanelTitle.setText("Account Management");
        changedTab(5);
    }//GEN-LAST:event_navAccMangementMouseClicked

    private void navReportStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navReportStatusMouseClicked
        DashboardPane.setBackground(navDefaultColor);
        StuAssessmentPane.setBackground(navDefaultColor);
        AssignAdvisorsPane.setBackground(navDefaultColor);
        AccManagementPane.setBackground(navDefaultColor);
        ReportStatusPane.setBackground(navSelectedColor);
        
        PanelTitle.setText("Report Status");
        changedTab(8);
    }//GEN-LAST:event_navReportStatusMouseClicked

    /* Logout Button */
    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginPage login = new LoginPage();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblLogoutMouseClicked

    /**
     * @param args the command line arguments
     */
    
    //Change panel tab method
    public static void changedTab(int TabIndex){
        TabPanel.setSelectedIndex(TabIndex);
    }
    
    
    //Create new temperory panel tab - AssignAdvsTab_IntakeList
    public static void createIntakeListPane(MainFrame mainFrame){
        AssignAdvsTab_IntakeList lastTab = new AssignAdvsTab_IntakeList(mainFrame);
        TabPanel.addTab("IntakeListtab", lastTab);
    }
    
    //Create new temperory panel tab - AssignAdvsTab_IntakeAdvsAllot
    public static void createIntakeAdvsAllotPane(MainFrame mainFrame, String selectedIntake){
        AssignAdvsTab_IntakeAdvsAllot lastTab = new AssignAdvsTab_IntakeAdvsAllot(mainFrame, selectedIntake);
        TabPanel.addTab("IntakeAdvsAllot_tab", lastTab);
    }
    
    //Create new temperory panel tab - AssignAdvsTab_StuAdvsList
    public static void createStuAdvsListPane(MainFrame mainFrame, String selectedIntake, String selectedAsses){
        AssignAdvsTab_StuAdvsList lastTab = new AssignAdvsTab_StuAdvsList(mainFrame, selectedIntake, selectedAsses);
        TabPanel.addTab("StuAdvsList_tab", lastTab);
    }
    
    //Create new temperory panel tab - AccMgmtTab_StuAcc
    public static void createStuAccMgmtPane(MainFrame mainFrame, String selectedIntake){
        AccMgmtTab_StuAcc lastTab = new AccMgmtTab_StuAcc(mainFrame, selectedIntake);
        TabPanel.addTab("StuAccMgmt_Tab", lastTab);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StuData_IO.readFrTxt();
                LectData_IO.readFrTxt();
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel AccManagementPane;
    private javax.swing.JLabel AccName;
    public javax.swing.JPanel AssignAdvisorsPane;
    private javax.swing.JPanel CoverTabPane;
    public javax.swing.JPanel DashboardPane;
    public javax.swing.JLabel PanelTitle;
    public javax.swing.JPanel ReportStatusPane;
    public javax.swing.JPanel StuAssessmentPane;
    public static javax.swing.JTabbedPane TabPanel;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel navAccMangement;
    private javax.swing.JLabel navAssignAdvisors;
    private javax.swing.JLabel navDashboard;
    private javax.swing.JLabel navReportStatus;
    private javax.swing.JLabel navStuAssessment;
    private javax.swing.JPanel sideNavBar;
    private javax.swing.JPanel topNavBar;
    // End of variables declaration//GEN-END:variables
}
