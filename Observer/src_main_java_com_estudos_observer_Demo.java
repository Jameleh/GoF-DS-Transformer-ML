package com.estudos.observer;

import com.estudos.observer.editor.Editor;
import com.estudos.observer.listener.EmailNotificationListener;
import com.estudos.observer.listener.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file2.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
