/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author AFFAN
 */
public class Smartphone {
    protected
            String os;
            int numOfCameras;
            double screenSize;
            boolean metalBody;
    
    public Smartphone() {
    }
    
    public Smartphone(double screenSize, boolean metalBody, int numOfCameras, String os) {
        this.os           = os;
        this.metalBody    = metalBody;
        this.screenSize   = screenSize;
        this.numOfCameras = numOfCameras;
        
    }
    
    void setScreenSize(double screenSize, int temp) {
        System.out.println("Overloaded Screen Size in Class Smartphone...");
    }
    
    void setScreenSize(double screenSize) {
        System.out.println("Setting Screen Size in Class Smartphone...");
        this.screenSize = screenSize;
    }
    
    void setMetalBody(Boolean metalBody) {
        System.out.println("Setting Metal Body in Class Smartphone...");
        this.metalBody = metalBody;
    }
    
    void setNumOfCameras(int numOfCameras) {
        System.out.println("Setting Number of Cameras in Class Smartphone...");
        this.numOfCameras = numOfCameras;
    }
    
    void setOs(String os) {
        System.out.println("Setting OS in Class Smartphone...");
        this.os = os;
    }
    
    double getScreenSize() {
        System.out.println("Getting Screen Size from Class Smartphone: ");
        return this.screenSize;
    }
    
    boolean isMetalBody() {
        System.out.println("Getting Metal Body from Class Smartphone: ");
        return this.metalBody;
    }
    
    int getNumOfCameras() {
        System.out.println("Getting Number of Cameras from Class Smartphone: ");
        return this.numOfCameras;
    }
    
    String getOs() {
        System.out.println("Getting OS from Class Smartphone: ");
        return this.os;
    }
}
