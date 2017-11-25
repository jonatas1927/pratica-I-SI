package controller;

import java.util.ArrayList;
import java.util.List;
//import model.ProdutoOrdemServico;
import model.ServicoOrdemServico;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Dionatan
 */
public class ServicoOrdemServicoDAO extends generic<ServicoOrdemServico> {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<ServicoOrdemServico> listarPorOrdemServico(int id) {
        List<ServicoOrdemServico> lista = new ArrayList<ServicoOrdemServico>();

        Transaction sessao = session.getTransaction();
        String sql = "select id as codigo from servicoordemservico where servico_id =  " + id + "";
        Query query = session.createSQLQuery(sql);
        List<Integer> results = query.list();
        for (Integer m : results) {
            System.out.println("mmmmmmmmmmmmmmm" + m);
            lista.add(findByID(m, "ServicoOrdemServico"));
        }
        return lista;
    }
}
