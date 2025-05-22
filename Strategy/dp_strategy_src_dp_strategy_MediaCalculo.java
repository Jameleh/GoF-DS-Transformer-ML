package dp_strategy;

public class MediaCalculo {
	public static void main(String[] args) {
		
		Disciplina disciplina = new Disciplina(new Aritmetica());
        
		disciplina.setNome("Matemática");
        disciplina.setP1(7.0);
        disciplina.setP2(3.0);
        disciplina.CalcularMedia();
        
        System.out.println(String.format("Nome: %s\nP1:%.2f\nP2:%.2f\nMedia:%.2f\nSituacao: %s", disciplina.getNome(), disciplina.getP1(),disciplina.getP2(), disciplina.getMedia(), disciplina.Situacao()));
	}
}