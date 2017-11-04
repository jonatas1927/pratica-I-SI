/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author thielke
 */
@Entity
@SequenceGenerator(name = "veiculo_seq", sequenceName = "veiculo_seq", allocationSize = 1)
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo_seq")
    private int id;
    private String modelo;
    private String cor;
    private String ano;
    @ManyToOne
    private MarcaVeiculo marcaVeiculo;
    @ManyToOne
    private Cliente cliente;

    public Veiculo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public MarcaVeiculo getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(MarcaVeiculo marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
