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
public class Samsung extends Smartphone{
    protected
            boolean note;
            String displayType;
    
    public Samsung(){
    }
    
    public Samsung(double screenSize, boolean metalBody, int numOfCameras, String os, boolean note, String displayType) {
        super(screenSize, metalBody, numOfCameras, os);
        this.note        = note;
        this.displayType = displayType;
    }
    
    @Override
    void setScreenSize(double screenSize, int temp) {
        System.out.println("Overloaded Screen Size in Class Samsung...");
    }
    
    @Override
    void setScreenSize(double screenSize) {
        System.out.println("Setting Screen Size in Class Samsung...");
        this.screenSize = screenSize;
    }
    
    @Override
    void setMetalBody(Boolean metalBody) {
        System.out.println("Setting Metal Body in Class Samsung...");
        this.metalBody = metalBody;
    }
    
    @Override
    void setNumOfCameras(int numOfCameras) {
        System.out.println("Setting Number of Cameras in Class Samsung...");
        this.numOfCameras = numOfCameras;
    }
    
    @Override
    void setOs(String os) {
        System.out.println("Setting OS in Class Samsung...");
        this.os = os;
    }
    
    void setNote(boolean note) {
        System.out.println("Setting Note in Class Samsung...");
        this.note = note;
    }
    
    void setDisplayType(String displayType) {
        System.out.println("Setting Apple Care in Class Samsung...");
        this.displayType = displayType;
    }
    
    @Override
    double getScreenSize() {
        System.out.println("Getting Screen Size from Class Samsung: ");
        return this.screenSize;
    }
    
    @Override
    boolean isMetalBody() {
        System.out.println("Getting Metal Body from Class Samsung: ");
        return this.metalBody;
    }
    
    @Override
    int getNumOfCameras() {
        System.out.println("Getting Number of Cameras from Class Samsung: ");
        return this.numOfCameras;
    }
    
    @Override
    String getOs() {
        System.out.println("Getting OS from Class Samsung: ");
        return this.os;
    }
    
    boolean isNote() {
        System.out.println("Getting Note from Class Samsung: ");
        return this.note;
    }
    
    String getDisplayType() {
        System.out.println("Getting Apple Care from Class Samsung: ");
        return this.displayType;
    }
}
