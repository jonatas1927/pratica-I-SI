/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thielke
 */
public class ServicoOrdemServico {

    private int id;
    private String tempo;
    private double valor;
    private Servico servico;
    private OrdermServico ordemServico;

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

    public OrdermServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdermServico ordemServico) {
        this.ordemServico = ordemServico;
    }

}
