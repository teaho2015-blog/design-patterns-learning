package com.tea.memento;

public class Caretaker {
    private Memento memento;
 
    public Memento retieveMemento() {
        return memento;
    }
 
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
