package com.clinicacliente.controller.administrador.listUser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.TuserTypeRegsService;
import service.TuserregDto;
import service.TusuarioRegsService;
import service.TusuarioRegsServiceImplService;

import javax.annotation.PostConstruct;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
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
    private HtmlDataTable myDataTable; //GUARDAR LOS DATOS INGRESADOS EN EL DATATABLE JSF


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


    /*
    * METODO QUE ACTUALIZA EL VALOR DEL USUARIO ELEGIDO PARA EDITAR
    * */
    public void updateUser(){
        log.debug(this.userSelect.getNameUser());
        TusuarioRegsService tusuarioRegsService=new TusuarioRegsServiceImplService().getTusuarioRegsServiceImplPort();
        boolean validate=tusuarioRegsService.updateUserReg(this.userSelect);
        if(validate){


            for(TuserregDto tuserregDto : this.tuserregDtoList){
                if(tuserregDto.getIdenCard().equals(this.userSelect.getIdenCard())){
                    tuserregDto=this.userSelect;
                    break;
                }
            }
            this.reInitUserSelec();

            log.debug("OBJ REINICIADO");
        }else {
            log.debug("ERROR UPDATE");
        }
    }

    public void reInitUserSelec(){
        this.userSelect=null;
        log.debug("DATOS DE OBJ USERSELECT VACIADOS");
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

    public HtmlDataTable getMyDataTable() {
        return myDataTable;
    }

    public void setMyDataTable(HtmlDataTable myDataTable) {
        this.myDataTable = myDataTable;
    }

    public TuserregDto getUserSelect() {
        return userSelect;
    }

    public void setUserSelect(TuserregDto userSelect) {
        this.userSelect = userSelect;
    }
}
