/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.factoryMethod;

public abstract class Product {
    String name;
    String meterial1;
    String meterial2;
    String meterial3;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("preparing " + name);
    }

    public void make() {
        System.out.println("making " + name);
    }

    public void pack() {
        System.out.println("pack " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(meterial1 + "\n");
        display.append(meterial2 + "\n");
        display.append(meterial3 + "\n");
        return display.toString();
    }
}
