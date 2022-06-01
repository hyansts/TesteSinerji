package sinerji.DataSet;

import java.util.ArrayList;
import sinerji.model.CargoGerente;
import sinerji.model.Funcionario;
import sinerji.model.CargoSecretario;
import sinerji.model.CargoVendedor;
import sinerji.model.Data;

/**
 *
 * @author hyan-
 */
public class ListaFuncionarios {
    
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public ListaFuncionarios() {
        funcionarios.add(
                new Funcionario ("Jorge Carvalho", new CargoSecretario(), new Data(1,2018)));
        funcionarios.add(
                new Funcionario ("Maria Souza", new CargoSecretario(), new Data(12,2015)));        
        funcionarios.add(
                new Funcionario ("Ana Silva", new CargoVendedor(), new Data(12,2021)));
        funcionarios.add(
                new Funcionario ("João Mendes", new CargoVendedor(), new Data(12,2021)));
        funcionarios.add(
                new Funcionario ("Juliana Alves", new CargoGerente(), new Data(7,2017)));
        funcionarios.add(
                new Funcionario ("Bento Albino", new CargoGerente(), new Data(3,2014)));
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public ArrayList<Funcionario> getFuncionariosComBeneficio() {
        try {
            ArrayList<Funcionario> funBeneficio = new ArrayList<>();
            for(Funcionario fun : funcionarios) {
                if(fun.getCargo().getBeneficio() > 0) {
                    funBeneficio.add(fun);
                }
            } 
            return funBeneficio;
        }
        
        catch (NullPointerException e) {
            System.out.println("Nenhum funcionário encontrado: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        
        return null;
    }
    
}
