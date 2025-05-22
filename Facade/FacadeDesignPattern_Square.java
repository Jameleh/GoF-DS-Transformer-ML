/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesignPattern;

public class Square implements Shape {

    @Override
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder("Square::draw(");
        for (String arg : arguments) {
            sb.append(arg).append(", ");
        }
        if (arguments.length > 0) {
            sb.setLength(sb.length() - 2); 
        sb.append(")");
        System.out.println(sb.toString());
    }
}
}
