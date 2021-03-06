
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
@WebService(name = "TaddressService", targetNamespace = "http://addressService.service.clinicawebservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TaddressService {


    /**
     * 
     * @return
     *     returns java.util.List<service.TaddressDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAddress", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.ListAddress")
    @ResponseWrapper(localName = "listAddressResponse", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.ListAddressResponse")
    @Action(input = "http://addressService.service.clinicawebservice.com/TaddressService/listAddressRequest", output = "http://addressService.service.clinicawebservice.com/TaddressService/listAddressResponse")
    public List<TaddressDto> listAddress();

    /**
     * 
     * @param arg0
     * @return
     *     returns service.TaddressDto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchAddressById", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.SearchAddressById")
    @ResponseWrapper(localName = "searchAddressByIdResponse", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.SearchAddressByIdResponse")
    @Action(input = "http://addressService.service.clinicawebservice.com/TaddressService/searchAddressByIdRequest", output = "http://addressService.service.clinicawebservice.com/TaddressService/searchAddressByIdResponse")
    public TaddressDto searchAddressById(
        @WebParam(name = "arg0", targetNamespace = "")
        TaddressDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteAddress", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.DeleteAddress")
    @ResponseWrapper(localName = "deleteAddressResponse", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.DeleteAddressResponse")
    @Action(input = "http://addressService.service.clinicawebservice.com/TaddressService/deleteAddressRequest", output = "http://addressService.service.clinicawebservice.com/TaddressService/deleteAddressResponse")
    public boolean deleteAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        TaddressDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertAddress", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.InsertAddress")
    @ResponseWrapper(localName = "insertAddressResponse", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.InsertAddressResponse")
    @Action(input = "http://addressService.service.clinicawebservice.com/TaddressService/insertAddressRequest", output = "http://addressService.service.clinicawebservice.com/TaddressService/insertAddressResponse")
    public boolean insertAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        TaddressDto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateAddress", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.UpdateAddress")
    @ResponseWrapper(localName = "updateAddressResponse", targetNamespace = "http://addressService.service.clinicawebservice.com/", className = "service.UpdateAddressResponse")
    @Action(input = "http://addressService.service.clinicawebservice.com/TaddressService/updateAddressRequest", output = "http://addressService.service.clinicawebservice.com/TaddressService/updateAddressResponse")
    public boolean updateAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        TaddressDto arg0);

}
