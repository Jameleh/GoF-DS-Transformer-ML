package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrar(String nomeFuncionario, String nomeCargo, String funcaoCargo, double salarioCargo) {
        Cargo cargo = CargoFactory.getCargos(nomeCargo, funcaoCargo, salarioCargo);
        Funcionario funcionario = new Funcionario(nomeFuncionario, cargo);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> result = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            result.add(funcionario.obterFuncionario());
        }
        return result;
    }


}