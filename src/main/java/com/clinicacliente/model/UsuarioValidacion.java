package com.clinicacliente.model;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UsuarioValidacion implements Serializable {
    private static final long serialVersionUID=1l;

    private String user="";
    private String pass="";

    public UsuarioValidacion(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public UsuarioValidacion() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UsuarioValidacion{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
