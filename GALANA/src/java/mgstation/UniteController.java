/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgstation;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Andrew
 */
@Named(value = "uniteController")
@SessionScoped
public class UniteController implements Serializable {

    /**
     * Creates a new instance of UniteController
     */
    public UniteController() {
    }
    
}
