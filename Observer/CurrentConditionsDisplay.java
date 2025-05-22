/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projobserver;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */



public class CurrentConditionsDisplay implements Observer, DisplayElement {
        
        private float temperature;
        private float humidity;
        private Subject weatherData;
        
        
        public CurrentConditionsDisplay(Subject weatherData) {
            this.weatherData = weatherData;
            weatherData.registerObserver(this);
        }
      
        
        //<editor-fold defaultstate="collapsed" desc="Métodos da interface DisplayElements">
        public void display() {
            System.out.println("Current conditions: " + temperature+ "F degrees and " + humidity + "% humidity");
        }

//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Métodos da interface Observer">
            
            public void update(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.display();
        }
//</editor-fold>

        
        
}