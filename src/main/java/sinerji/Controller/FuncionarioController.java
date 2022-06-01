
package sinerji.Controller;

import java.util.ArrayList;
import sinerji.Util.Util;
import sinerji.model.Data;
import sinerji.model.Funcionario;
import sinerji.model.Venda;
/**
 *
 * @author hyan-
 */
public class FuncionarioController {
    
        public float valorTotalMensal(ArrayList<Funcionario> funcionarios, Data dataAtual) {
        try {   
            Util util = new Util();    
            float total = 0;

            for(Funcionario fun : funcionarios ) {
                float valor = fun.getCargo().getSalario().getValor();
                float bonusAnual = fun.getCargo().getSalario().getBonusAnual();
                float beneficio = fun.getCargo().getBeneficio();
                Data dataContrato = fun.getDataContratacao();

                float salario = valor + (bonusAnual*util.anosDeServico(dataContrato, dataAtual));
                total += salario + (beneficio*salario);
            }

            return total;
        }
        
        catch (NullPointerException e) {
            System.out.println("Nenhum funcionário encontrado: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        
        return 0;
    }

        public float valorSalarioMensal(ArrayList<Funcionario> funcionarios, Data dataAtual) {
        try{    
            Util util = new Util();    
            float total = 0;

            for(Funcionario fun : funcionarios ) {
                float valor = fun.getCargo().getSalario().getValor();
                float bonusAnual = fun.getCargo().getSalario().getBonusAnual();
                Data dataContrato = fun.getDataContratacao();

                total += valor + (bonusAnual*util.anosDeServico(dataContrato, dataAtual));
            }

            return total;
        }
        catch (NullPointerException e) {
            System.out.println("Nenhum funcionário encontrado: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        return 0;
    }        
     
        public float valorBeneficioMensal(ArrayList<Funcionario> funcionarios, Data dataAtual) {
        try {    
            Util util = new Util();    
            float total = 0;

            for(Funcionario fun : funcionarios ) {
                float valor = fun.getCargo().getSalario().getValor();
                float bonusAnual = fun.getCargo().getSalario().getBonusAnual();
                float beneficio = fun.getCargo().getBeneficio();
                Data dataContrato = fun.getDataContratacao();

                float salario = valor + (bonusAnual*util.anosDeServico(dataContrato, dataAtual));
                total += beneficio*salario;
            }

            return total;
        }
        
        catch (NullPointerException e) {
            System.out.println("Nenhum funcionário encontrado: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        
        return 0;
    } 
        
    public Funcionario valorMaisAltoMensal(ArrayList<Funcionario> funcionarios, Data dataAtual) {
        try {   
            Util util = new Util();    
            float maiorValor = 0;
            Funcionario funcionarioComMaiorValor = null;

            for(Funcionario fun : funcionarios ) {
                float valor = fun.getCargo().getSalario().getValor();
                float bonusAnual = fun.getCargo().getSalario().getBonusAnual();
                float beneficio = fun.getCargo().getBeneficio();
                Data dataContrato = fun.getDataContratacao();

                float salario = valor + (bonusAnual*util.anosDeServico(dataContrato, dataAtual));
                float total = salario + (beneficio*salario);
                if(maiorValor < total) {
                    maiorValor = total; 
                    funcionarioComMaiorValor = fun;
                }
            }

            return funcionarioComMaiorValor;
        }
        catch (NullPointerException e) {
            System.out.println("Nenhum funcionário encontrado: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        
        return null;
    }

        public String beneficioMaisAltoMensal(ArrayList<Funcionario> funcionarios, Data dataAtual) {
        try {   
            Util util = new Util();    
            float maiorbeneficio = 0;
            Funcionario funcionarioComMaiorBeneficio = null;

            for(Funcionario fun : funcionarios ) {
                float valor = fun.getCargo().getSalario().getValor();
                float bonusAnual = fun.getCargo().getSalario().getBonusAnual();
                float beneficio = fun.getCargo().getBeneficio();
                Data dataContrato = fun.getDataContratacao();

                float salario = valor + (bonusAnual*util.anosDeServico(dataContrato, dataAtual));
                float total = beneficio*salario;
                if(maiorbeneficio < total) {
                    maiorbeneficio = total; 
                    funcionarioComMaiorBeneficio = fun;
                }
            }
        return funcionarioComMaiorBeneficio.getNome();
        }
        
        catch (NullPointerException e) {
            System.out.println("Nenhum funcionário encontrado: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        
        return null;
    }
        
        public Venda melhorVendedorMensal(ArrayList<Venda> vendas, Data dataAtual) {
        try {      
            float maiorValor = 0;
            Venda melhorVenda = null;

            for(Venda venda : vendas ) {
                float valor = venda.getValor();

                if(venda.getDataVenda().mesmaData(dataAtual)) {
                    if(maiorValor < valor) {
                       maiorValor = valor;
                       melhorVenda = venda;
                    }             
                }      
            }

            return melhorVenda;
        }
        catch (NullPointerException e) {
            System.out.println("Nenhuma venda encontrada: "+e.getMessage());
        }
        
        catch (Exception e) {
            System.out.println("Houve um erro erro inesperado: "+e.getMessage());
        }
        
        return null;
    }        
        
}
