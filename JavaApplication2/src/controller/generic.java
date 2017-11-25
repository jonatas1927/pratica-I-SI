/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author thielke
 */
public abstract class generic<T> {

    Session session = HibernateUtil.getSessionFactory().openSession();

    /**
     *
     * @Function where go save the object on database;
     *
     * @param obj Object where go try save;
     * @return if Object save with success go return true, else go return false;
     */
    public boolean save(T obj) {
        try {
            session.getTransaction();
            session.getTransaction().begin();
            session.save(obj);
            session.getTransaction().commit();
//            session.close();
            return true;
        } catch (Error e) {
            return false;
        }
    }

    /**
     * @function where go come all rows by database
     * @param nameClass variable with name of class
     * @return list with all rows by class
     */
    public List<T> getAll(String nameClass) {
        session.getTransaction();
        Query q = session.createQuery("FROM " + nameClass);
        List<T> list = q.list();
//        session.close();
        return list;
    }

    /**
     * @gunction where go come a row by database on what id = variable
     * @param id variable where id = primary key on table
     * @param nameClass variable where say class
     * @return list with one row or zero
     */
    public T findByID(Integer id, String nameClass) {
        System.out.println("id: "+id);
        session.getTransaction();
        Query q = session.createQuery("FROM " + nameClass + " WHERE id = :p1");
        q.setParameter("p1", id);
        List<T> list = q.list();
//        return list;
//System.out.println("list" +list.get(0).toString());
        return list.get(0);
    }

    public boolean delete(T obj) {
        try {
            session.getTransaction();
            session.getTransaction().begin();
            session.delete(obj);
            session.getTransaction().commit();
//            session.close();

            return true;
        } catch (Error e) {
            return false;
        }
    }

    public boolean update(T obj) {
        try {

            session.getTransaction();
            session.getTransaction().begin();
            session.update(obj);
            session.getTransaction().commit();
//            session.close();
            return true;
        } catch (Error e) {
            return false;
        }
    }

    public T findByColum(String value, String Colum, String nameClass) {
        session.getTransaction();
        Query q = session.createQuery("FROM " + nameClass + " WHERE " + Colum + " = :p1");
        q.setParameter("p1", value);
        List<T> list = q.list();
//        return list;
        return list.get(0);
    }

    public List<T> ArrToSearch(String nameClass, List<String> arrInfo) {
        session.getTransaction();
        int Params = 0;
        List<String> listParams = new ArrayList<String>();
        String query = " FROM " + nameClass + " where ";
        for (int i = 0; i < arrInfo.size(); i++) {
            if (i == 0) {
                query += " " + arrInfo.get(i) + " LIKE :p" + Params + " ";
                listParams.add(arrInfo.get(i + 1));
            } else {
                query += " AND " + arrInfo.get(i) + " LIKE :p" + Params + " ";
                listParams.add(arrInfo.get(i + 1));
            }
            Params++;
            i++;
        }
        System.out.println(query);
        Query q = session.createQuery(query);
        for (int i = 0; i < listParams.size(); i++) {
            q.setParameter("p" + i, "%" + listParams.get(i) + "%");
            System.out.println("p" + i + "   ---  " + listParams.get(i));
        }
        System.out.println(q.getNamedParameters());
        List<T> list = q.list();
        return list;
    }

}
