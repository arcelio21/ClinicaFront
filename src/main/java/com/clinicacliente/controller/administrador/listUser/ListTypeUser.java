package com.clinicacliente.controller.administrador.listUser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.TtypeUserDto;
import service.TtypeUserService;
import service.TtypeUserServiceImplService;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("typeUser")
@ViewScoped
public class ListTypeUser implements Serializable {

    private static final long serialVersionUID=1l;
    private static Logger log= LogManager.getRootLogger();
    private TtypeUserService ttypeUserService;
    private List<TtypeUserDto> ttypeUserDtoList;
    private TtypeUserDto typeUser;

    public ListTypeUser(){
        this.ttypeUserService= new TtypeUserServiceImplService().getTtypeUserServiceImplPort();
        ListTypeUser.log.info("INICIO DE BEAN");
        this.allTypeUser();
    }

    /*
    * OBTIENE LOS TIPOS DE USUARIOS
    * */
    private void allTypeUser(){
        this.ttypeUserDtoList=this.ttypeUserService.listTypeUser();
        ListTypeUser.log.info("DATOS DE TYPOS DE USUARIOS CARGADOS");
    }

    /*
    * AGREGAR NUEVO TIPO DE USUARIO
    * */
    public void addTypeUser(){
        boolean validate=this.ttypeUserService.insertTypeUser(this.typeUser);
        if(validate){
            this.ttypeUserDtoList.add(this.typeUser);
            this.resetTypeUser();
            ListTypeUser.log.info("REGISTRO AGREGADO");
        }else {
            ListTypeUser.log.info("ERROR DE INSERCION");
        }
    }

    /*
    * OBJ DE TYPO USUARIO REINICIADO
    * */
    public void resetTypeUser(){
        this.typeUser=new TtypeUserDto();
    }

    /*
    * AGREGAR NUEVO USUARIO A MODIFICA
    *
    * */
    public void modTypeUser(TtypeUserDto typeUserE){
        this.resetTypeUser();
        this.typeUser=typeUserE;
        ListTypeUser.log.info("ID ESTATUS: "+this.typeUser.getIdStatusId());
    }

    /*
    * ACTUALIZAR DATOS DE TIPO DE USUARIO
    * --DE MOMENTO LOS DATOSS NO PUEDEN SER ACTAULIZADOS YA QUE EL WS NO ESTA BIEN CREADO
    * */
    public void updateTypeUser(){
        /*boolean validate=this.ttypeUserService.updateTypeUser(this.typeUser);
        if(validate){
            this.resetTypeUser();
            ListTypeUser.log.info("DATOS ACTUALIZADOS");
        }else {
            ListTypeUser.log.info("FALLO EN ACTAULIZACION");
        }*/
    }

    /*
    * ELIMINAR TIPO DE USUARIO
    *
    * */
    public void removeTypeUser(){
        boolean validate=this.ttypeUserService.deleteTypeUser(this.typeUser);

        if(validate){
            this.ttypeUserDtoList.remove(this.typeUser);
            this.resetTypeUser();
            ListTypeUser.log.info("DATOS ELIMINADO");
        }else {
            ListTypeUser.log.info("ERROR DE ELIMINACION");
        }
    }

    public String colorStatus(int id){
        String color;
        if(id==1){
            color="#62dca9";
        }else {
            color="red";
        }

        return color;
    }

    public String showNameStatus(int id){
        String nameStatus;
        if(id==1){
            nameStatus="Activado";
        }else {
            nameStatus="Otro";
        }
        return nameStatus;
    }

    public List<TtypeUserDto> getTtypeUserDtoList() {
        return ttypeUserDtoList;
    }

    public void setTtypeUserDtoList(List<TtypeUserDto> ttypeUserDtoList) {
        this.ttypeUserDtoList = ttypeUserDtoList;
    }

    public TtypeUserDto getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TtypeUserDto typeUser) {
        this.typeUser = typeUser;
    }
}
