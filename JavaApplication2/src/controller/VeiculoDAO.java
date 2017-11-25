package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import model.Veiculo;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Dionatan
 */
public class VeiculoDAO extends generic<Veiculo> {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Veiculo> findByCliente(int codigo) {
        ClienteDAO DAO = new ClienteDAO();
        Transaction sessao = session.getTransaction();
//        Query q = session.createQuery("FROM Veiculo as v  left join fetch  v.cliente as c ON c = :p1 ");
//        q.setParameter("p1", DAO.findByID(codigo, "Cliente"));
//        String sql = "SELECT * FROM veiculo where cliente_id = :p1";
//        SQLQuery q = session.createSQLQuery(sql);
//        q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//        q.setParameter("p1", codigo);
//        List<Veiculo> lista = null;
//        List<Object> list = q.list();
//     
        try {
            String sql = "SELECT * FROM veiculo where cliente_id = :idCliente";
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity(Veiculo.class);
            List employees = query.list();

            for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
                Veiculo veiculo = (Veiculo) iterator.next();
                System.out.print("First Name: " + veiculo.getModelo());
//                System.out.print("  Last Name: " + employee.getLastName());
//                System.out.println("  Salary: " + employee.getSalary());
            }
            sessao.commit();
        } catch (HibernateException e) {
            if (sessao != null) {
                System.out.println(sessao);
                sessao.rollback();
            }
            e.printStackTrace();
        }
        List<Veiculo> lista = null;
        return lista;
    }

    public List<Veiculo> listEmployeesScalar(int id) {
        List<Veiculo> lista = new ArrayList<Veiculo>();

        Transaction sessao = session.getTransaction();
        String sql = "SELECT id as codigo from veiculo where cliente_id = " + id + "";
        Query query = session.createSQLQuery(sql);
        List<Integer> results = query.list();
        for (Integer m : results){
            System.out.println("mmmmmmmmmmmmmmm"+m);
            lista.add(findByID(m, "Veiculo"));
        } 
        return lista;
    }
}
