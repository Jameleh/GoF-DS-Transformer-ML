package com.mycompany.flyweight.classes;

import com.mycompany.flyweight.interfaces.EmailTemplate;

public class TemplateHTML implements EmailTemplate {

    private String layout;
    
    public TemplateHTML(String layout){
        this.layout = layout;
    }
    
    @Override
    public void render(String conteudo) {
        System.out.println("Layout: " + layout);
        System.out.println("Conteudo: " + conteudo);
    }
}
