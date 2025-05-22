package org.example.control;

import org.example.model.Cliente;
import org.example.model.ModelFacade;

import java.util.List;

public class ClienteServices {
    public List<Cliente> ListarTodosClientes() {
        return ModelFacade.listarTodosClientes();
    }
}
