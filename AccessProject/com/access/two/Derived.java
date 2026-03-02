package com.access.two;

import com.access.one.Base;

public class Derived extends Base {

    public void testAccess() {

        publicMethod();      // Accessible
        protectedMethod();   // Accessible (because of inheritance)

        // defaultMethod();  // NOT Accessible
        // privateMethod();  // NOT Accessible
    }

    public static void main(String[] args) {

        Derived d = new Derived();
        d.testAccess();
    }
}