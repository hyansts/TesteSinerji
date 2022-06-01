/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinerji.model;

/**
 *
 * @author hyan-
 */
public class Funcionario {
    private String nome;
    private Cargo cargo;
    private Data dataContratacao;
    
    public Funcionario(String _nome, Cargo _cargo, Data _dataContratacao) {
        this.nome = _nome;
        this.cargo = _cargo;
        this.dataContratacao = _dataContratacao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Data getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Data dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
}
