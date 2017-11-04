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
@SequenceGenerator(name = "produto_ordem_servico_seq", sequenceName = "produto_ordem_servico_seq", allocationSize = 1)
public class ProdutoOrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_ordem_servico_seq")
    private int id;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private OrdemServico ordemServico;
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

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
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
