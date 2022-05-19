package com.clinicacliente.controller;

import com.clinicacliente.model.UsuarioValidacion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.*;


import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "index")
@RequestScoped
public class IndexBean  {

    //private static final long serialVersionUID=1l;
    private static Logger logger= LogManager.getRootLogger();

    //@Inject
   //private TusuarioregDto tusuarioregDto;

    @Inject
    private UsuarioValidacion usuarioValidacion;

   //@Inject
    //private TusuarioRegsService tusuarioRegsService;

    public void setUsuarioValidacion(UsuarioValidacion usuarioValidacion){
        this.usuarioValidacion=usuarioValidacion;
    }

    public String validarUser(){

        String redireccion="ErrorValidacion";
        TusuarioRegsService tusuarioRegsService=new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
        logger.debug(this.usuarioValidacion.getUser() + this.usuarioValidacion.getPass());
        TuserregDto userValidate=new TuserregDto();
        userValidate.setIdenCard(this.usuarioValidacion.getUser());
        userValidate.setPass(this.usuarioValidacion.getPass());
        boolean validacionUser=tusuarioRegsService.validateCredencial(userValidate);
        if(validacionUser){
            redireccion="Administrador/homeAdmin";
        }

        return redireccion;
    }
}
