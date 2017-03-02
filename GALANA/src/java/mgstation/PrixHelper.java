/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgstation;

import org.hibernate.Session;

/**
 *
 * @author Andrew
 */
public class PrixHelper {
 Session session = null;

    public PrixHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }   
}
