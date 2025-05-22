package org.example.model;

import java.util.List;

public class ModelFacade {
    public static List<Cliente> listarTodosClientes(){
        return DataBase.clientes;
    }
}
