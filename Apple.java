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
public class Apple extends Smartphone{
    protected
            boolean touchId;
            boolean appleCare;
    
            
    public Apple() {
    }
    
    public Apple(double screenSize, boolean metalBody, int numOfCameras, String os, boolean touchId, boolean appleCare) {
        super(screenSize, metalBody, numOfCameras, os);
        this.touchId   = touchId;
        this.appleCare = appleCare;
    }
    
    @Override
    void setScreenSize(double screenSize, int temp) {
        System.out.println("Overloaded Screen Size in Class Apple...");
    }
    
    @Override
    void setScreenSize(double screenSize) {
        System.out.println("Setting Screen Size in Class Apple...");
        this.screenSize = screenSize;
    }
    
    @Override
    void setMetalBody(Boolean metalBody) {
        System.out.println("Setting Metal Body in Class Apple...");
        this.metalBody = metalBody;
    }
    
    @Override
    void setNumOfCameras(int numOfCameras) {
        System.out.println("Setting Number of Cameras in Class Apple...");
        this.numOfCameras = numOfCameras;
    }
    
    @Override
    void setOs(String os) {
        System.out.println("Setting OS in Class Apple...");
        this.os = os;
    }
    
    void setTouchId(boolean touchId) {
        System.out.println("Setting Touch ID in Class Apple...");
        this.touchId = touchId;
    }
    
    void setAppleCare(boolean appleCare) {
        System.out.println("Setting Apple Care in Class Apple...");
        this.appleCare = appleCare;
    }
    
    @Override
    double getScreenSize() {
        System.out.println("Getting Screen Size from Class Apple: ");
        return this.screenSize;
    }
    
    @Override
    boolean isMetalBody() {
        System.out.println("Getting Metal Body from Class Apple: ");
        return this.metalBody;
    }
    
    @Override
    int getNumOfCameras() {
        System.out.println("Getting Number of Cameras from Class Apple: ");
        return this.numOfCameras;
    }
    
    @Override
    String getOs() {
        System.out.println("Getting OS from Class Apple: ");
        return this.os;
    }
    
    boolean istouchID() {
        System.out.println("Getting Touch ID from Class Apple: ");
        return this.touchId;
    }
    
    boolean isAppleCare() {
        System.out.println("Getting Apple Care from Class Apple: ");
        return this.appleCare;
    }
}
