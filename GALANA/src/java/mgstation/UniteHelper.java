/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgstation;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Andrew
 */
public class UniteHelper {
  Session session = null;

    public  UniteHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }   
    
    public List getUnite(int startID, int endID) {
    List<Unite> UniteList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Unite");
        UniteList = (List<Unite>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return UniteList;
}
    public List getUniteByID(int UniteId){
    List<Unite> UniteList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Unite as unite where unite.uniteid='" + UniteId + "')");
        UniteList = (List<Unite>) q.list();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return UniteList;
}
}
