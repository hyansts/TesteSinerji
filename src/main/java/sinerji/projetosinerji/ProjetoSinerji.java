package sinerji.projetosinerji;

import sinerji.Controller.FuncionarioController;
import sinerji.DataSet.ListaFuncionarios;
import sinerji.DataSet.ListaVendedores;
import sinerji.Util.Util;

/**
 *
 * @author hyan-
 */
public class ProjetoSinerji {

    public static void main(String[] args) {
        //simula o retorno de um dataset vindo do banco de dados
        ListaFuncionarios funcionarios = new ListaFuncionarios();
        ListaVendedores vendedores = new ListaVendedores();
        
        FuncionarioController funcionarioController = new FuncionarioController();
        
        // métodos requisitados para o teste
        try {
            System.out.println( "Valor total pago (salário e benefício): " +
                funcionarioController.valorTotalMensal(funcionarios.getFuncionarios(), Util.DATA_ATUAL)
            );
            System.out.println( "Valor pago somente dos salários: " +
                funcionarioController.valorSalarioMensal(funcionarios.getFuncionarios(), Util.DATA_ATUAL)
            );
            System.out.println( "Valor pago somente dos benefícios: " +
                funcionarioController.valorBeneficioMensal(funcionarios.getFuncionariosComBeneficio(), Util.DATA_ATUAL)
            );
            System.out.println( "Funcionário com maior salário: " +
                funcionarioController.valorMaisAltoMensal(funcionarios.getFuncionarios(), Util.DATA_ATUAL).getNome()
            );
            System.out.println( "Funcionário com maior benefício: " +
                funcionarioController.beneficioMaisAltoMensal(funcionarios.getFuncionariosComBeneficio(), Util.DATA_ATUAL)
            );
        }
        catch (Exception e) {
            System.out.println("Não foi encontrado registro de salários e benefícios "
                    + "para esse conjunto de data e funcionários.");
        }
        
        try {
            System.out.println( "Melhor vendedor: " +
                funcionarioController.melhorVendedorMensal(vendedores.getVendas(), Util.DATA_ATUAL).getVendedor().getNome()
            );
        }
        catch (Exception e) {
            System.out.println("Não foi encontrado registro de vendas "
                    + "para essa combinação de data e funcionários.");
        }

    }
}
