package com.tea.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public List<Memento> retieveMemento() {
        return mementos;
    }

    public void setMemento(Memento memento) {
        this.mementos.add(memento);
    }
}
