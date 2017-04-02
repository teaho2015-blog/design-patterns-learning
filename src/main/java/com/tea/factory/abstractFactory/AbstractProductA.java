/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.abstractFactory;

public abstract class AbstractProductA {
    String name;
    String material1;
    String meterial2;

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
        display.append(material1 + "\n");
        display.append(meterial2 + "\n");
        return display.toString();
    }
}
