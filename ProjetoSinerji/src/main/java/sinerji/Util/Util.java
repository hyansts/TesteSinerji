/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinerji.Util;

import sinerji.model.Data;

/**
 *
 * @author hyan-
 */
public class Util {
    public static final Data DATA_ATUAL = new Data(3,2022);
    
    public int anosDeServico(Data inicio, Data fim) {
        int anos = fim.getAno() - inicio.getAno() - 1;
        if( (12 - inicio.getMes() + fim.getMes()) >= 12)
            anos += 1;
        return anos;
    }
}
