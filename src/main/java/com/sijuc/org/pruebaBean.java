package com.sijuc.org;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@RequestScoped
public class pruebaBean {
    private String nombres;
    private String apell;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Hola " + nombres + " " + apell));
        
    }
    
    
}
