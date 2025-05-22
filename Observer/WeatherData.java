/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projobserver;

import java.util.ArrayList;

/**
 *
 * @author Artur Pereira Neto &lt; artur.neto@ifnmg.edu.br &gt;
 */
public class WeatherData implements Subject {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
        private ArrayList observers;
        private float temperature;
        private float humidity;
        private float pressure;
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public WeatherData() {
        observers = new ArrayList();
    }
//</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="Implementação da interface Subject">
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
        observers.remove(i);
        }
    }
    
    
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
        Observer observer = (Observer)observers.get(i);
        observer.update(temperature, humidity, pressure);
        }
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Notificação dos Observadores">
    public void measurementsChanged() {
        notifyObservers();
    }   
//</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Método para receber dados de atualização">
     public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }    
//</editor-fold>


}
    
        
