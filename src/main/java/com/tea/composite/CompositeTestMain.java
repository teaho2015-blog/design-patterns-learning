/**
 * @author teaho2015@gmail.com
 * since 2017/4/6
 */
package com.tea.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTestMain {
    public static void main(String[] args) {

        Component component=new CompositeComponent("root");
        Component child=new CompositeComponent("level1-child-node");
        Component child_1=new Leaf("level1-child-node==>leaf1");
        Component child_2=new Leaf("level1-child-node==>leaf2");
        child.add(child_1);
        child.add(child_2);
        Component child2=new CompositeComponent("level1-child-node2");
        component.add(child);
        component.add(child2);
        component.foreach();
    }

}
abstract class Component {

    String name;

    public Component(String s){

        this.name=s;
    }
    public void add(Component c) {
        throw new UnsupportedOperationException();
    }
    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public abstract void foreach();
}

//组合类
class CompositeComponent extends Component{
    private List<Component> child=new ArrayList<Component>();

    public CompositeComponent(String s) {
        super(s);
    }

    @Override
    public void add(Component c) {
        child.add(c);

    }

    @Override
    public void foreach() {
        System.out.println("节点名:\t"+name);
        for (Component c : child) {
            c.foreach();
        }
    }

    @Override
    public void remove(Component c) {
        child.remove(c);
    }

}

class Leaf extends Component{

    public Leaf(String s) {
        super(s);

    }

    @Override
    public void foreach() {
        System.out.println("叶子 leaf name: "+this.name);
    }
}

