package frase.interfaces;

import frase.impl.Observador;

public interface iObservavel
{
    public void registraObservador(Observador obs);
    public void removeObservador(Observador obs);
    public void notificaObservadores();
}
