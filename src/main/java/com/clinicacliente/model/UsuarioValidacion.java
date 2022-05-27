package com.clinicacliente.model;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UsuarioValidacion implements Serializable {
    private static final long serialVersionUID=1l;

    private String idenCard="";
    private String pass="";
    private String fullaName="";



    public UsuarioValidacion(String idenCard, String pass, String fullaName) {
        this.idenCard = idenCard;
        this.pass = pass;
        this.fullaName = fullaName;
    }

    public UsuarioValidacion() {
    }

    public String getIdenCard() {
        return idenCard;
    }

    public void setIdenCard(String idenCard) {
        this.idenCard = idenCard;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullaName() {
        return fullaName;
    }

    public void setFullaName(String fullaName) {
        this.fullaName = fullaName;
    }

    @Override
    public String toString() {
        return "UsuarioValidacion{" +
                "idenCard='" + idenCard + '\'' +
                ", pass='" + pass + '\'' +
                ", fullaName='" + fullaName + '\'' +
                '}';
    }
}
