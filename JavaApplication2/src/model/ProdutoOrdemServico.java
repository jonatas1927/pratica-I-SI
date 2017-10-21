/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author thielke
 */
@Entity
public class ProdutoOrdemServico {

    @Id
    private int id;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private OrdermServico ordemServico;
    private double custo;
    private double quantidade;
    private double precoProduto;

    public ProdutoOrdemServico() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public OrdermServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdermServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

}
