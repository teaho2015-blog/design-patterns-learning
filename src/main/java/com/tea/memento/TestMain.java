package com.tea.memento;

/**
 * @author teaho2015<at />gmail.com
 * @date 2022-08
 */
public class TestMain {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("state1");
        caretaker.setMemento(originator.createMemento());
        originator.setState("state2");
        caretaker.setMemento(originator.createMemento());
        originator.setState("state3");
        caretaker.setMemento(originator.createMemento());

        originator.restoreMemento(caretaker.retieveMemento().get(1));
        System.out.println("restore state to : " + originator.getState());

    }
}
