package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD batoutofhell = new CD("Bat Out of Hell",137.6);
        DVD castawayonthemoon = new DVD("Castaway On The Moon", 1623.18);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        //
        System.out.println("\nCD");
        batoutofhell.powerUp();
        batoutofhell.openDrawer();
        batoutofhell.openDrawer();
        batoutofhell.readData();
        batoutofhell.reportInfo();
        batoutofhell.spinDisk();
        batoutofhell.moveArm();
        batoutofhell.storeData();
        batoutofhell.reportInfo();

        //DVD
        System.out.println("\nDVD");
        castawayonthemoon.powerUp();
        castawayonthemoon.openDrawer();
        castawayonthemoon.openDrawer();
        castawayonthemoon.readData();
        castawayonthemoon.reportInfo();
        castawayonthemoon.spinDisk();
        castawayonthemoon.moveArm();
        castawayonthemoon.storeData();
        castawayonthemoon.reportInfo();

    }
}
