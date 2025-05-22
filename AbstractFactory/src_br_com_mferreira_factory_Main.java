package br.com.mferreira.factory;
//Criação de fábrica de carros e consessionária;
//Para conssionária, digite o nome [Honda ou Toyata] e o boolean é False;
//Para Carro, digite o nome [Civic ou Corola] e o boolean é true;


public class Main {
        public static void main(String[] args){
            Customer customerOne = new Customer("corola", true);
            AbstractFactory factory = getAbstractFactory(customerOne);
            Carro carro1 = factory.criarCarro(customerOne.getGradeRequest());
            carro1.iniciarMotor();
    }

    public static AbstractFactory getAbstractFactory (Customer cliente){
            if(cliente.getHasCompanyContract()){
                return new CarroFactory();
            } else {
                return new ConcessionariaFactory();
            }
    };



}