package com.tea.memento;

/**
 * @author teaho2015<at/>gmail.com
 * @date 2022-08
 */
public class TestMain {

    public static void main(String[] args) {

        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("ON");
        System.out.println(originator.getState());
        caretaker.setMemento(originator.CrateMemento());
        originator.setState("OFF");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.retieveMemento());
        System.out.println(originator.getState());

    }
}
