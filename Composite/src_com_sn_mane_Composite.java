package com.sn.mane;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    List<Component> children = new ArrayList<>();
    @Override
    void operation() {
        children.forEach(Component::operation);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int index) {
        return children.get(index);
    }
}
