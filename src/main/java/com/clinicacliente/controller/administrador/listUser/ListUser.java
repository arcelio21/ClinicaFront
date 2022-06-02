package com.clinicacliente.controller.administrador.listUser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.TuserregDto;
import service.TusuarioRegsService;
import service.TusuarioRegsServiceImplService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named(value = "listuser")
@ViewScoped
public class ListUser implements Serializable {
    private static long serialVersionUID=1l;

    private static final Logger log= LogManager.getRootLogger();
    private List<TuserregDto> tuserregDtoList=new ArrayList<>();//SE ENCARGAR DE ALMACENAR LOS USUARIOS QUE SE TRAE DE LA BD
    private TuserregDto newUser;//GUARDAR LOS DATOS QUE SE INGRESEN PARA UN NUEVO USAURIO
    private TuserregDto userSelect; //ALMACENAR LOS USUARIOS QUE SE VAN A  EDITAR O ELIMINAR
    private TuserregDto backupUser;
    private String filterIndecard="";



    public ListUser() {
    }

    /*
    * ESTE METODO SE EJECUTA JUSTO DESPUES DEL CONSTRUCTOR
    * FUNCION: ACCEDER AL WEB SERVICE PARA OBTENER LOS DATOS DE LOS USUARIOS CREADO PARA SER MOSTRADO EN PANTALLA
    * */
    @PostConstruct
    public void init(){
        TusuarioRegsService tusuarioRegsService = new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
        this.tuserregDtoList=tusuarioRegsService.listUsersRegs();
    }
    /*
    * METODO QUE INSERTA USUARIO A BD Y VALIDA SI FUE EXITOSA, DE SER EXITOSA
    * AGREGA EL OBJ DE USUARIO AL ARREGLO
    * */
    public void userRegAdd(){
        TusuarioRegsService tusuarioRegsService= new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
        boolean validatInsert=tusuarioRegsService.insertUsersRegs(this.newUser);
        if(validatInsert){
            log.debug("INSERT SUCCESS JSF");
            this.tuserregDtoList.add(this.newUser);

            this.initUser();
            this.addMessage("Registro creado");
        }else {
            log.debug("ERROR INSERT JSF");
            this.initUser();
        }
    }

    /*
     * METODO QUE VACIA EL VALOR DEL OBJ QUE GUARDA LA INFO DE UN NUEVO USUARIO
     * */
    public void initUser(){
        this.newUser=new TuserregDto();
        log.debug("NUEVO OBJ DE USUARIO CREADO");
    }

    /*
    * SE EDITARA EL USUARIO QUE SE SELECCIONE, OBTENIENDO LA IFORMACION DE 'myDataTable' y pasandose a 'userSelect'
    * */
    public void editUser(TuserregDto userSelect){
        this.userSelect=userSelect;
    }

    public void updatePass(){
        System.out.println("Valor de pass: "+this.userSelect.getPass());
        /*String pass=this.userSelect.getPass();
        this.userSelect.setPass(pass);*/
    }
    /*
    * METODO QUE ACTUALIZA EL VALOR DEL USUARIO ELEGIDO PARA EDITAR
    * */
    public void updateUser(){
        TusuarioRegsService tusuarioRegsService=new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
        boolean validate=tusuarioRegsService.updateUserReg(this.userSelect);
        if(validate){

            this.reInitUserSelec();
            this.addMessage("Registro Actualizado");

        }else {
            log.debug("ERROR UPDATE");
        }

    }

    public void reInitUserSelec(){
        this.userSelect=null;
        log.debug("DATOS DE OBJ USERSELECT VACIADOS");
    }


    /*
    * METODO PARA ELIMINAR REGISTRO DE UN USUARIOS
    * */
    public void removeUser(TuserregDto userRemove){
        TusuarioRegsService tusuarioRegsService= new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
        boolean validateRemove=tusuarioRegsService.deleteUserReg(userRemove);
        if(validateRemove){
            log.debug("DELETE SUCCESS");
            this.tuserregDtoList.remove(userRemove); //ELIMINANDO EL USUARIO DE LA LISTA
            this.addMessage("Registro Eliminado");
        }else {
            log.debug("DELETE ERROR");
        }
    }

    /*
    * BUSCARA LOS DATOS DE LA PERSONA INGRESADA
    * */
    public void filerUserByIdenCard(){

        if(!this.filterIndecard.isEmpty()){
            for (TuserregDto userTest:this.tuserregDtoList) {
                if(userTest.getIdenCard().equals(this.filterIndecard)){
                    this.backupUser=userTest;
                    break;
                }
            }
        }else if(this.backupUser!=null) {
            this.backupUser=null;
        }else {
            this.backupUser=null;
        }
    }

    /*
    * MUESTRA UN MENSAJE EN PANTALLA LUEGO REALIZAR ALGUNA ACCION
    * */
    public void addMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
    }

    public void setTuserregDtoList(List<TuserregDto> tuserregDtoList) {
        this.tuserregDtoList = tuserregDtoList;
    }

    public List<TuserregDto> getTuserregDtoList() {
        return tuserregDtoList;
    }

    public TuserregDto getNewUser() {
        return newUser;
    }

    public void setNewUser(TuserregDto newUser) {
        this.newUser = newUser;
    }


    public TuserregDto getUserSelect() {
        return userSelect;
    }

    public void setUserSelect(TuserregDto userSelect) {
        this.userSelect = userSelect;
    }

    public String getFilterIndecard() {
        return filterIndecard;
    }

    public void setFilterIndecard(String filterIndecard) {
        this.filterIndecard = filterIndecard;
    }

    public TuserregDto getBackupUser() {
        return backupUser;
    }

    public void setBackupUser(TuserregDto backupUser) {
        this.backupUser = backupUser;
    }
}
