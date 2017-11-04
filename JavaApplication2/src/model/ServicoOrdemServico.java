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
@SequenceGenerator(name = "servico_ordem_servico_seq", sequenceName = "servico_ordem_servico_seq", allocationSize = 1)
public class ServicoOrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "servico_ordem_servico_seq")
    private int id;
    private String tempo;
    private double valor;
    @ManyToOne
    private Servico servico;
    @ManyToOne
    private OrdemServico ordemServico;

    public ServicoOrdemServico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

}
