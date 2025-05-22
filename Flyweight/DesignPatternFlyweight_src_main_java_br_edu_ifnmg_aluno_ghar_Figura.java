package br.edu.ifnmg.aluno.ghar;

/* class Figura
 * aqui está a nossa classe figura, ela possui os atributos de 'formato' que será recebido pelo construtor e depois deus valores de x e y serão 'setados' na main
 * todos os valores que nossa classe figura vai receber são aleatórios
 */
public class Figura implements Forma{
    private String formato;
    private int x;
    private int y;
  
    public Figura(String formato) {
        this.formato = formato;
    }
  
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void escreve() {
        System.out.println("Figura: [ Formato: " + formato + ", x: " + x + ", y:" + y + " ]");
    }
}
