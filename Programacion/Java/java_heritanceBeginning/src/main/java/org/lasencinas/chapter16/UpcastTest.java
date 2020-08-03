package org.lasencinas.chapter16;

public class UpcastTest {

    // Inheritance : UpcastTest

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Ken Wood");

        Manager mgr = new Manager();
        mgr.setName("Ken Furr");

        // Print names
        EmpUtil.printName(emp);
        EmpUtil.printName(mgr);

    }



}
