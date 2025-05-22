package br.com.mferreira.factory;

public abstract class Carro {
        private String color;
        private Integer cavalosPotencia;
        private Boolean tanqueCheio;

        public Carro(String color, Integer cavalosPotencia, Boolean tanqueCheio) {
                this.color = color;
                this.cavalosPotencia = cavalosPotencia;
                this.tanqueCheio = tanqueCheio;
        }

        public void iniciarMotor(){
                System.out.println("O motor foi iniciado! O motor tem "+cavalosPotencia+
                        " Cavalos de potencia e está com tanque "+tanqueCheio  + " e o carro é "+ getClass().getSimpleName());
        }

}
