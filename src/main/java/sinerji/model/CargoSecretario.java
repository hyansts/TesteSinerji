package sinerji.model;

/**
 *
 * @author hyan-
 */
public class CargoSecretario implements Cargo{
    
    private static final Salario SALARIO = new Salario(7000, 1000);
    private static final float BENEFICIO = 0.2f; //20%
    private static final String TIPO = "Secretário"; 

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
