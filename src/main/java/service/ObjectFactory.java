
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteVillage_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "deleteVillage");
    private final static QName _DeleteVillageResponse_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "deleteVillageResponse");
    private final static QName _InsertVillage_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "insertVillage");
    private final static QName _InsertVillageResponse_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "insertVillageResponse");
    private final static QName _ListVillages_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "listVillages");
    private final static QName _ListVillagesResponse_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "listVillagesResponse");
    private final static QName _SearchVillageById_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "searchVillageById");
    private final static QName _SearchVillageByIdResponse_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "searchVillageByIdResponse");
    private final static QName _UpdateVillage_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "updateVillage");
    private final static QName _UpdateVillageResponse_QNAME = new QName("http://AddressEx.addressService.service.clinicawebservice.com/", "updateVillageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteVillage }
     * 
     */
    public DeleteVillage createDeleteVillage() {
        return new DeleteVillage();
    }

    /**
     * Create an instance of {@link DeleteVillageResponse }
     * 
     */
    public DeleteVillageResponse createDeleteVillageResponse() {
        return new DeleteVillageResponse();
    }

    /**
     * Create an instance of {@link InsertVillage }
     * 
     */
    public InsertVillage createInsertVillage() {
        return new InsertVillage();
    }

    /**
     * Create an instance of {@link InsertVillageResponse }
     * 
     */
    public InsertVillageResponse createInsertVillageResponse() {
        return new InsertVillageResponse();
    }

    /**
     * Create an instance of {@link ListVillages }
     * 
     */
    public ListVillages createListVillages() {
        return new ListVillages();
    }

    /**
     * Create an instance of {@link ListVillagesResponse }
     * 
     */
    public ListVillagesResponse createListVillagesResponse() {
        return new ListVillagesResponse();
    }

    /**
     * Create an instance of {@link SearchVillageById }
     * 
     */
    public SearchVillageById createSearchVillageById() {
        return new SearchVillageById();
    }

    /**
     * Create an instance of {@link SearchVillageByIdResponse }
     * 
     */
    public SearchVillageByIdResponse createSearchVillageByIdResponse() {
        return new SearchVillageByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateVillage }
     * 
     */
    public UpdateVillage createUpdateVillage() {
        return new UpdateVillage();
    }

    /**
     * Create an instance of {@link UpdateVillageResponse }
     * 
     */
    public UpdateVillageResponse createUpdateVillageResponse() {
        return new UpdateVillageResponse();
    }

    /**
     * Create an instance of {@link TvillageDto }
     * 
     */
    public TvillageDto createTvillageDto() {
        return new TvillageDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVillage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVillage }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "deleteVillage")
    public JAXBElement<DeleteVillage> createDeleteVillage(DeleteVillage value) {
        return new JAXBElement<DeleteVillage>(_DeleteVillage_QNAME, DeleteVillage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVillageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVillageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "deleteVillageResponse")
    public JAXBElement<DeleteVillageResponse> createDeleteVillageResponse(DeleteVillageResponse value) {
        return new JAXBElement<DeleteVillageResponse>(_DeleteVillageResponse_QNAME, DeleteVillageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertVillage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertVillage }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "insertVillage")
    public JAXBElement<InsertVillage> createInsertVillage(InsertVillage value) {
        return new JAXBElement<InsertVillage>(_InsertVillage_QNAME, InsertVillage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertVillageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertVillageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "insertVillageResponse")
    public JAXBElement<InsertVillageResponse> createInsertVillageResponse(InsertVillageResponse value) {
        return new JAXBElement<InsertVillageResponse>(_InsertVillageResponse_QNAME, InsertVillageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListVillages }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListVillages }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "listVillages")
    public JAXBElement<ListVillages> createListVillages(ListVillages value) {
        return new JAXBElement<ListVillages>(_ListVillages_QNAME, ListVillages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListVillagesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListVillagesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "listVillagesResponse")
    public JAXBElement<ListVillagesResponse> createListVillagesResponse(ListVillagesResponse value) {
        return new JAXBElement<ListVillagesResponse>(_ListVillagesResponse_QNAME, ListVillagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVillageById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchVillageById }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "searchVillageById")
    public JAXBElement<SearchVillageById> createSearchVillageById(SearchVillageById value) {
        return new JAXBElement<SearchVillageById>(_SearchVillageById_QNAME, SearchVillageById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchVillageByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchVillageByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "searchVillageByIdResponse")
    public JAXBElement<SearchVillageByIdResponse> createSearchVillageByIdResponse(SearchVillageByIdResponse value) {
        return new JAXBElement<SearchVillageByIdResponse>(_SearchVillageByIdResponse_QNAME, SearchVillageByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVillage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVillage }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "updateVillage")
    public JAXBElement<UpdateVillage> createUpdateVillage(UpdateVillage value) {
        return new JAXBElement<UpdateVillage>(_UpdateVillage_QNAME, UpdateVillage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVillageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVillageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://AddressEx.addressService.service.clinicawebservice.com/", name = "updateVillageResponse")
    public JAXBElement<UpdateVillageResponse> createUpdateVillageResponse(UpdateVillageResponse value) {
        return new JAXBElement<UpdateVillageResponse>(_UpdateVillageResponse_QNAME, UpdateVillageResponse.class, null, value);
    }

}
