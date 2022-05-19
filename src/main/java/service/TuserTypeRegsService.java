
package service;

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
@WebService(name = "TuserTypeRegsService", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TuserTypeRegsService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DELETE_USER_TYPE_REG")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DELETE_USER_TYPE_REG", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.DELETEUSERTYPEREG")
    @ResponseWrapper(localName = "DELETE_USER_TYPE_REGResponse", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.DELETEUSERTYPEREGResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/DELETE_USER_TYPE_REGRequest", output = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/DELETE_USER_TYPE_REGResponse")
    public boolean deleteUSERTYPEREG(
        @WebParam(name = "arg0", targetNamespace = "")
        TuserTypeRegDto arg0);

    /**
     * 
     * @return
     *     returns java.util.List<service.TuserTypeRegDto>
     */
    @WebMethod(operationName = "LIST_USER_TYPE_REGS")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "LIST_USER_TYPE_REGS", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.LISTUSERTYPEREGS")
    @ResponseWrapper(localName = "LIST_USER_TYPE_REGSResponse", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.LISTUSERTYPEREGSResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/LIST_USER_TYPE_REGSRequest", output = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/LIST_USER_TYPE_REGSResponse")
    public List<TuserTypeRegDto> listUSERTYPEREGS();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "INSERT_USER_TYPE_REGS")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "INSERT_USER_TYPE_REGS", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.INSERTUSERTYPEREGS")
    @ResponseWrapper(localName = "INSERT_USER_TYPE_REGSResponse", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.INSERTUSERTYPEREGSResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/INSERT_USER_TYPE_REGSRequest", output = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/INSERT_USER_TYPE_REGSResponse")
    public boolean insertUSERTYPEREGS(
        @WebParam(name = "arg0", targetNamespace = "")
        TuserTypeRegDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "UPDATE_USER_TYPE_REGS")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UPDATE_USER_TYPE_REGS", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.UPDATEUSERTYPEREGS")
    @ResponseWrapper(localName = "UPDATE_USER_TYPE_REGSResponse", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.UPDATEUSERTYPEREGSResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/UPDATE_USER_TYPE_REGSRequest", output = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/UPDATE_USER_TYPE_REGSResponse")
    public boolean updateUSERTYPEREGS(
        @WebParam(name = "arg0", targetNamespace = "")
        TuserTypeRegDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.TuserTypeRegDto
     */
    @WebMethod(operationName = "SEARCH_USER_TYPE_REGS")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SEARCH_USER_TYPE_REGS", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.SEARCHUSERTYPEREGS")
    @ResponseWrapper(localName = "SEARCH_USER_TYPE_REGSResponse", targetNamespace = "http://typeUserService.usersinfoService.service.clinicawebservice.com/", className = "service.SEARCHUSERTYPEREGSResponse")
    @Action(input = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/SEARCH_USER_TYPE_REGSRequest", output = "http://typeUserService.usersinfoService.service.clinicawebservice.com/TuserTypeRegsService/SEARCH_USER_TYPE_REGSResponse")
    public TuserTypeRegDto searchUSERTYPEREGS(
        @WebParam(name = "arg0", targetNamespace = "")
        TuserTypeRegDto arg0);

}