package sinerji.DataSet;

import java.util.ArrayList;
import sinerji.model.CargoVendedor;
import sinerji.model.Data;
import sinerji.model.Funcionario;
import sinerji.model.Venda;

/**
 *
 * @author hyan-
 */
public class ListaVendedores {
    private ArrayList<Venda> vendas = new ArrayList<>();
    private ArrayList<Funcionario> fun = new ArrayList<>();
    
    public ListaVendedores() {
      
        fun.add(new Funcionario ("Ana Silva", new CargoVendedor(), new Data(12,2021)));  
        fun.add(new Funcionario ("João Mendes", new CargoVendedor(), new Data(12,2021)));
        
        vendas.add(new Venda(fun.get(0), new Data(12, 2021), 5200));
        vendas.add(new Venda(fun.get(0), new Data(1, 2022), 4000));
        vendas.add(new Venda(fun.get(0), new Data(2, 2022), 4200));
        vendas.add(new Venda(fun.get(0), new Data(3, 2022), 5850));
        vendas.add(new Venda(fun.get(0), new Data(4, 2022), 7000));
        
        vendas.add(new Venda(fun.get(1), new Data(12, 2021), 3400));
        vendas.add(new Venda(fun.get(1), new Data(1, 2022), 7700));
        vendas.add(new Venda(fun.get(1), new Data(2, 2022), 5000));
        vendas.add(new Venda(fun.get(1), new Data(3, 2022), 5900));
        vendas.add(new Venda(fun.get(1), new Data(4, 2022), 6500));
    }
    
    public ArrayList<Venda> getVendas() {
        return vendas;
    }
}
