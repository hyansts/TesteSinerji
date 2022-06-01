package sinerji.model;

/**
 *
 * @author hyan-
 */
public class CargoVendedor implements Cargo{
    
    private static final Salario SALARIO = new Salario(12000, 1800);
    private static final float BENEFICIO = 0.3f; //30%
    private static final String TIPO = "Vendedor"; 

    @Override
    public Salario getSalario() {
        return SALARIO;
    }

    @Override
    public float getBeneficio() {
        return BENEFICIO;
    }

    @Override
    public String getTipo() {
       return TIPO;
    }
}
