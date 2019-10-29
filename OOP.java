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
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Upcasting
        Smartphone testApple      = new Apple();
        Smartphone testSamsung    = new Samsung();
        Smartphone testSmartphone = new Smartphone(5.7, true, 2, "Android");
        
        /** 
         * Run-time polymorphism
         * Calls functions of objects being referred to - Function overriding
         */
        
        System.out.println(testApple.getNumOfCameras());
        System.out.println(testSamsung.getNumOfCameras());
        System.out.println(testSmartphone.getNumOfCameras());
        
        testApple.setNumOfCameras(1);
        testSamsung.setNumOfCameras(2);
        testSmartphone.setNumOfCameras(3);
        
        System.out.println(testApple.getNumOfCameras());
        System.out.println(testSamsung.getNumOfCameras());
        System.out.println(testSmartphone.getNumOfCameras());
        
        // Downcasting - Allows calling of functions other than the overriden ones for Apple type objects
        Smartphone anotherTestSmartphone = new Apple(5.7, true, 2, "Android", false, false);
        // anotherTestSmartphone.setMetalBody(true); - Allows doing this
        // anotherTestSmartphone.setAppleCare(true); - Won't allow doing this
        
        //Downcasting happening here
        Apple anotherTestApple = (Apple) anotherTestSmartphone;
        
        // Now it allows calling other methods
        anotherTestApple.setTouchId(true);
        anotherTestApple.setAppleCare(true);
        
        System.out.println(anotherTestApple.istouchID());
        System.out.println(anotherTestApple.isAppleCare());
        
        /**
         * Compile-time Polymorphism
         * Determined by function overloading
         */
        
        Smartphone finalApple      = new Apple(5.5, true, 3, "iOS 13", true, true);
        Smartphone finalSamsung    = new Samsung(6.0, true, 3, "Android Pie", true, "Infinity-O");
        Smartphone finalSmartphone = new Smartphone(5.5, true, 2, "Stock Android");
        
        finalApple.setScreenSize(0, 0);
        finalSamsung.setScreenSize(0, 0);
        finalSmartphone.setScreenSize(0, 0);
    }
}
