package controller;

import java.util.ArrayList;
import java.util.List;
import model.ProdutoOrdemServico;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Dionatan
 */
public class ProdutoOrdemServicoDAO extends generic<ProdutoOrdemServico> {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<ProdutoOrdemServico> listarPorOrdem(int id) {
        List<ProdutoOrdemServico> lista = new ArrayList<ProdutoOrdemServico>();

        Transaction sessao = session.getTransaction();
        String sql = "select id as codigo from produtoordemservico where ordemservico_id =  " + id + "";
        Query query = session.createSQLQuery(sql);
        List<Integer> results = query.list();
        for (Integer m : results) {
            System.out.println("mmmmmmmmmmmmmmm" + m);
            lista.add(findByID(m, "ProdutoOrdemServico"));
        }
        return lista;
    }

}
