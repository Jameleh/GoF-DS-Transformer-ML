package com.mycompany.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class TemplateFactory {
    
    private Map<String, TemplateHTML> templates = new HashMap<>();    
    
    public TemplateHTML getTemplate(String layout){
        if(!templates.containsKey(layout)){
            templates.put(layout, new TemplateHTML(layout));
            System.out.println("Criando um novo template para o layout... " + layout);
        } else {
            System.out.println("Aproveitando o template para o layout... " + layout);
        }
        return templates.get(layout);
    }
}
