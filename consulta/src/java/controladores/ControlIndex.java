/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Andres
 */
@Named(value = "controlIndex")
@SessionScoped
public class ControlIndex implements Serializable {

    private String usuario;
    private String password;
    /**
     * Creates a new instance of ControlIndex
     */
    public ControlIndex() {
    }

    public void entrar(){
        FacesContext.getCurrentInstance().addMessage("messagess", new FacesMessage(FacesMessage.SEVERITY_INFO,"informacion: ",this.usuario));
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
