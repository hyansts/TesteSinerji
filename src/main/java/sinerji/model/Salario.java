package sinerji.model;

/**
 *
 * @author hyan-
 */
public class Salario {
    private final float valor;
    private final float bonusAnual;
    
    public Salario (float _valor, float _bonusAnual) {
        this.valor = _valor;
        this.bonusAnual = _bonusAnual;
    }

    public float getValor() {
        return valor;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }
    
    
}
