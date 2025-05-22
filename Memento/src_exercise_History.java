package exercise;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state) {
        states.add(state);
    }

    public DocumentState pop() {
        if(states.isEmpty())
            throw new IllegalStateException();

        return states.removeLast();
    }
}