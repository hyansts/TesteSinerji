package sinerji.model;

/**
 *
 * @author hyan-
 */
public class Data {
    private final int mes;
    private final int ano;
    
    
    public boolean mesmaData(Data _data) {
        return (this.mes == _data.mes && this.ano == _data.ano);
    }
    
    public Data(int _mes, int _ano) {
        this.mes = _mes;
        this.ano = _ano;
    }
    
    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
