package sinerji.model;

/**
 *
 * @author hyan-
 */
public class Venda {
    private Funcionario vendedor;
    private Data dataVenda;
    private float valor;
    
    public Venda(Funcionario _vendedor, Data _dataVenda, float _valor) {
        this.vendedor = _vendedor;
        this.dataVenda = _dataVenda;
        this.valor = _valor;
    } 
    
    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
