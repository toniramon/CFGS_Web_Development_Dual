package org.lasencinas.chapter16;

public class SimplestInheritanceTest {
    public static void main(String[] args) {
        // Create an object of the Manager class
        Manager mgr = new Manager();

        // Set the name of the Manager.
        mgr.setName("Leslie Zanders");

        // Get the name of the Manager
        String mgrName = mgr.getName();

        // Display the manager name.
        System.out.println("Manager Name: " + mgrName);

    }
}
