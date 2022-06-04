package com.clinicacliente.controller.administrador.address;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.TprovinceDto;
import service.TprovinceService;
import service.TprovinceServiceImplService;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("provinces")
@ViewScoped
public class Provinces implements Serializable {

    private static long serialVersionUID=1l;
    private static Logger log= LogManager.getRootLogger();
    private List<TprovinceDto> tprovinceList;
    private TprovinceDto editProvince;


    public Provinces() {
        TprovinceService tprovinceService=new TprovinceServiceImplService().getTprovinceServiceImplPort();
        this.tprovinceList=tprovinceService.listProvinces();
    }

    /*
    * RESTABLECER VALOR DE EDITPROVINCE
    * */
    public  void resetEditProvince(){
        this.editProvince=new TprovinceDto();
    }

    /*
    * ASIGNAR PROVINCIA A EDITAR
    * */
    public void selectEdit(TprovinceDto province){
        this.editProvince=province;
    }

    /*
    * METODO QUE ACTUALIZA EL NOMBRE DE UNA PROVINCIA
    * */
    public void updateProvince(){

        TprovinceService tprovinceService=new TprovinceServiceImplService().getTprovinceServiceImplPort();
        boolean validate=tprovinceService.updateProvince(this.editProvince);
        if(validate){
            this.resetEditProvince();
            Provinces.log.debug("SUCCESS UPDATE PROVINCE");
            this.addMessage("REGISTRO ACTUALIZADO");
        }else {
            this.addMessage("FALLO EN ACTUALIZACION");
        }
    }

    /*
    * METODO QUE ELIMINA UNA PROVINCIA
    * */
    public void removeProvince(TprovinceDto removeProvinceDto){
        TprovinceService tprovinceService=new TprovinceServiceImplService().getTprovinceServiceImplPort();
        boolean validate=tprovinceService.deleteProvince(removeProvinceDto);
        if(validate){
            this.tprovinceList.remove(removeProvinceDto);
            this.addMessage("REGISTRO ELIMINADO");
            Provinces.log.debug("DELETE SUCCESS CLIENT");
        }else {
            this.addMessage("ERROR EN ELIMINACION");
            Provinces.log.debug("ERROR DELETE CLIENT");
        }

    }

    /*
    * MUESTRA MENSAJE DE RESULTADO DE REALIZAR ALGUNA ACCION CON REGISTROS
    * */
    public void addMessage(String message){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
    }

    /*
    * AGREGA NUEVA PROVINCIA
    * */
    public void addProvince(){
        TprovinceService tprovinceService= new TprovinceServiceImplService().getTprovinceServiceImplPort();
        boolean validate=tprovinceService.insertProvince(this.editProvince);
        if(validate){
            this.tprovinceList.add(this.editProvince);
            this.addMessage("PROVINCIA AGREGADA");
        }else {
            this.addMessage("ERROR DE INGRESO");
        }
    }

    public List<TprovinceDto> getTprovinceList() {
        return tprovinceList;
    }

    public void setTprovinceList(List<TprovinceDto> tprovinceList) {
        this.tprovinceList = tprovinceList;
    }

    public TprovinceDto getEditProvince() {
        return editProvince;
    }

    public void setEditProvince(TprovinceDto editProvince) {
        this.editProvince = editProvince;
    }
}
