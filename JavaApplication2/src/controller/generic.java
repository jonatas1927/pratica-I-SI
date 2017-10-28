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
            session.save(obj);
            session.close();
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
        session.close();
        return list;
    }

    /**
     * @gunction where go come a row by database on what id = variable
     * @param id variable where id = primary key on table
     * @param nameClass variable where say class
     * @return list with one row or zero
     */

    public List<T> findByID(String id, String nameClass) {
        session.getTransaction();
        Query q = session.createQuery("FROM " + nameClass + " WHERE id = :p1");
        q.setParameter("p1", id);
        List<T> list = q.list();
        return list;
    }

    public boolean delete(T obj) {
        try {
            session.getTransaction();
            session.delete(obj);
            session.close();
            return true;
        } catch (Error e) {
            return false;
        }
    }

    public boolean update(T obj) {
        try {
            session.getTransaction();
            session.update(obj);
            session.close();
            return true;
        } catch (Error e) {
            return false;
        }
    }

}
