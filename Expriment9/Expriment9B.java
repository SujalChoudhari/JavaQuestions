/*
 * WAP to create a package called vol having Cylinder class and volume (). 
 * WAP that imports this package to calculate volume of a Cylinder.
 */

import vol.Cylinder;

public class Expriment9B {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.read();

        System.out.println("The Volume is " + c.volume());

    }
}
