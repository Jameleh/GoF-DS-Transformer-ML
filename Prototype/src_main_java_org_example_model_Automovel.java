package org.example.model;

public class Automovel implements Cloneable{ //Implementamos a interface Cloneable, porque ela vai nos permitir clonar exatemente um objeto sem precisar de interdenpedencia com outras classes.
   //Atributos e seus getters e setters.
    private String marca;
    private String modelo;
    private String tipo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Automovel clone() throws CloneNotSupportedException{ //Método que implementamos da interface Cloneable.
        return (Automovel) super.clone(); //Utilizamos o clone para copiar exatamente o objeto só que sem suas dependencias. / E fazemos o casting para Autmóvel.
    }
}
