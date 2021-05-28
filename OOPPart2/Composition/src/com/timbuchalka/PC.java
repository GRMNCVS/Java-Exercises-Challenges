package com.timbuchalka;

/**
 * Created by keanehubertang on 8/3/15.
 */
public class PC {
    private Case theCaseField;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCaseField = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCaseField.pressPowerButton();
        drawLogo();
        monitor.drawPixelAt(1080,720, "less than all");
        motherboard.loadProgram("Windows Me loading.");

    }

    public void drawLogo() {
        monitor.drawPixelAt(1080, 720, "muh logo");
    }

//    private Case getTheCaseGetter() {
//        return theCaseField;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
