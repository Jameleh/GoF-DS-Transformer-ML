package com.mycompany.flyweight;

import com.mycompany.flyweight.classes.TemplateFactory;
import com.mycompany.flyweight.interfaces.EmailTemplate;

public class Flyweight {

    public static void main(String[] args) {
        
        TemplateFactory factory = new TemplateFactory();
        
        EmailTemplate template1 = factory.getTemplate("Promocional");
        template1.render("Ola fulano, aproveite nossas ofertas com desconto");
        
        EmailTemplate template2 = factory.getTemplate("Promocional");
        template2.render("Aproveite a promoção de final de semana");
        
        EmailTemplate template3 = factory.getTemplate("Notificação");
        template3.render("Seu pedido foi enviado");
        
        EmailTemplate template4 = factory.getTemplate("Notificação");
        template4 = factory.getTemplate("Sua senha foi alterada");
    }
}
