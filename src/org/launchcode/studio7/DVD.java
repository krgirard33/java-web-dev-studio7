package org.launchcode.studio7;

public class DVD implements OpticalDisk {
    String power = "Off";
    String drawer = "Closed";
    String title = "";
    Double storageCapacity = 0.0;
    Double maxStorage = 4700.0;

    public DVD(String title, Double storageCapacity) {
        this.title = title;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void powerUp() {
        if (power.equals("Off")) {
            power = "On";
        } else {
            power = "Off";
        }
        System.out.println("Power: " + power);
    }

    @Override
    public void spinDisk() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {
        double write = RandomNumber.getRandom();
        storageCapacity = storageCapacity - write;
        System.out.println("Wrote "+write+" megs of data to DVD.\nThere is "+storageCapacity+" of space left.");
    }

    @Override
    public void readData() {
        System.out.println("Plays movie");
    }

    @Override
    public void moveArm() {
        System.out.println("The arm slowly scans");
    }

    @Override
    public void openDrawer() {
        if (drawer.equals("Closed")) {
            drawer = "Open";
        } else {
            drawer = "Closed";
        }
        System.out.println("Drawer is: " + drawer);
    }

    @Override
    public void reportInfo() {
        System.out.println("Title: "+title+
                "\nStorage capacity left: "+storageCapacity+
                "\nDrawer is: "+drawer+
                "\nPower is: " + power);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
