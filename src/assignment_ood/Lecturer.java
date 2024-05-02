/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_ood;

import java.util.List;


public class Lecturer {
    private String lectName;
    private String lectid;
     private boolean isProjectManager;
     private boolean isSecondMarker;
     private boolean isSupervisor;
     private List<Lecturer> lecturers;
     private String password;
    public Lecturer(String name, String lectid, boolean isProjectManager, boolean isSecondMarker, boolean isSupervisor,String password) {
        this.lectName = name;
        this.lectid = lectid;
        this.isProjectManager = isProjectManager;
        this.isSecondMarker = isSecondMarker;
        this.isSupervisor = isSupervisor;
        this.password = password;
    }
    public Lecturer(String name, String lectid) {
    this.lectName = name;
    this.lectid = lectid;
    this.isProjectManager = false; // Assuming default value for isProjectManager
}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsSecondMarker() {
        return isSecondMarker;
    }

    public void setIsSecondMarker(boolean isSecondMarker) {
        this.isSecondMarker = isSecondMarker;
    }

    public boolean isIsSupervisor() {
        return isSupervisor;
    }

    public void setIsSupervisor(boolean isSupervisor) {
        this.isSupervisor = isSupervisor;
    }

    public String getName() {
        return lectName;
    }

    public void setName(String name) {
        this.lectName = name;
    }

    public String getId() {
        return lectid;
    }

    public void setId(String id) {
        this.lectid = id;
    }

    public boolean isIsProjectManager() {
        return isProjectManager;
    }

    public void setIsProjectManager(boolean isProjectManager) {
        this.isProjectManager = isProjectManager;
    }
     
     
     public void assignProjectManagerRole() {
        isProjectManager = true;
    }
     public void removeProjectManagerRole() {
        isProjectManager = false;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "lectName=" + lectName + ", lectid=" + lectid + ", isProjectManager=" + isProjectManager + ", isSecondMarker=" + isSecondMarker + ", isSupervisor=" + isSupervisor + ", lecturers=" + lecturers + ",password=" + password +'}';
    }
}

