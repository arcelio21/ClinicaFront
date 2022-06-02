package com.clinicacliente.controller;

import com.clinicacliente.model.UsuarioValidacion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.*;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@Named(value = "index")
@SessionScoped
public class IndexBean implements Serializable  {

    private static final long serialVersionUID=1l;
    private static Logger logger= LogManager.getRootLogger();

    @Inject
    private UsuarioValidacion usuarioValidacion;



    public void cleanValue(ComponentSystemEvent event){
        this.usuarioValidacion.setIdenCard("");
        this.usuarioValidacion.setPass("");
        this.usuarioValidacion.setFullaName("");
        logger.debug("LIMPIANDO OBJ");
    }

    public void setUsuarioValidacion(UsuarioValidacion usuarioValidacion){
        this.usuarioValidacion=usuarioValidacion;
    }

    public UsuarioValidacion getUsuarioValidacion() {
        return usuarioValidacion;
    }

    public String validarUser(){

        String redireccion="ErrorValidacion";
        if(!this.usuarioValidacion.getIdenCard().equals("") || !this.usuarioValidacion.getPass().equals("")){
            TusuarioRegsService tusuarioRegsService=new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
            TuserregDto userValidate=new TuserregDto();
            userValidate.setIdenCard(this.usuarioValidacion.getIdenCard());
            userValidate.setPass(this.usuarioValidacion.getPass());
            TuserregDto validacionUser=tusuarioRegsService.validateCredencial(userValidate);
            if(validacionUser!=null){
                this.usuarioValidacion.setFullaName(validacionUser.getNameUser()+" "+validacionUser.getLastName());
                redireccion="Administrador/homeAdmin?faces-redirect=true";
            }
        }else {
            redireccion="index";
            return  redireccion;
        }


        return redireccion;
    }

    public boolean validarRango(){


        return true;
    }


}
