
package com.tea.memento;

public class Originator {
    private String state;
 
    public String getState() {
        return this.state;
    }
 
    public void setState(String state) {
        System.out.println("NOW STATE IS"+state);
        this.state = state;
    }
 
    public Memento CrateMemento(){
        return  new Memento(state);
    }
    public void  restoreMemento(Memento memento){
        this.state=memento.getState();
    }
}
