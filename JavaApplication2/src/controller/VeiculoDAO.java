package controller;

import java.io.Serializable;
import java.util.List;
import model.Veiculo;
import org.hibernate.Query;

/**
 *
 * @author Dionatan
 */
public class VeiculoDAO extends generic<Veiculo> {

    public List<Veiculo> findByCliente(int codigo) {
        ClienteDAO DAO = new ClienteDAO();
        session.getTransaction();
        Query q = session.createQuery("FROM Veiculo as v  left join fetch  v.cliente as c ON c = :p1 ");
        q.setParameter("p1", DAO.findByID(codigo, "Cliente"));
        List<Object> lista = q.list();
        for (Object m : lista) {
//             System.out.println(m.getClass());
        }
        List<Veiculo> list = q.list();
        return list;
    }

}
