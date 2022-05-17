
package com.clinicacliente.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TtypeUserService", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TtypeUserService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertTypeUser", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.InsertTypeUser")
    @ResponseWrapper(localName = "insertTypeUserResponse", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.InsertTypeUserResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/insertTypeUserRequest", output = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/insertTypeUserResponse")
    public boolean insertTypeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        TtypeUserDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateTypeUser", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.UpdateTypeUser")
    @ResponseWrapper(localName = "updateTypeUserResponse", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.UpdateTypeUserResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/updateTypeUserRequest", output = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/updateTypeUserResponse")
    public boolean updateTypeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        TtypeUserDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteTypeUser", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.DeleteTypeUser")
    @ResponseWrapper(localName = "deleteTypeUserResponse", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.DeleteTypeUserResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/deleteTypeUserRequest", output = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/deleteTypeUserResponse")
    public boolean deleteTypeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        TtypeUserDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.clinicacliente.service.TtypeUserDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchTypeUserById", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.SearchTypeUserById")
    @ResponseWrapper(localName = "searchTypeUserByIdResponse", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.SearchTypeUserByIdResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/searchTypeUserByIdRequest", output = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/searchTypeUserByIdResponse")
    public TtypeUserDto searchTypeUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        TtypeUserDto arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.clinicacliente.service.TtypeUserDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listTypeUser", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.ListTypeUser")
    @ResponseWrapper(localName = "listTypeUserResponse", targetNamespace = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/", className = "com.clinicacliente.service.ListTypeUserResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/listTypeUserRequest", output = "http://typeUserService.usersinfoService.service.cliniacajavaee.com/TtypeUserService/listTypeUserResponse")
    public List<TtypeUserDto> listTypeUser();

}
