/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinerji.model;

/**
 *
 * @author hyan-
 */
public class CargoGerente implements Cargo {
    
    private static final Salario SALARIO = new Salario(20000, 3000);
    private static final float BENEFICIO = 0; //0%
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
