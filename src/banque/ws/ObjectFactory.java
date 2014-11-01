
package banque.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the banque.ws package. 
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

    private final static QName _AjoutCotationResponse_QNAME = new QName("http://banque/ws", "ajoutCotationResponse");
    private final static QName _GetCotationsResponse_QNAME = new QName("http://banque/ws", "getCotationsResponse");
    private final static QName _GetCotation_QNAME = new QName("http://banque/ws", "getCotation");
    private final static QName _GetCotationResponse_QNAME = new QName("http://banque/ws", "getCotationResponse");
    private final static QName _GetAll_QNAME = new QName("http://banque/ws", "getAll");
    private final static QName _GetCotations_QNAME = new QName("http://banque/ws", "getCotations");
    private final static QName _AjoutCotation_QNAME = new QName("http://banque/ws", "ajoutCotation");
    private final static QName _GetAllResponse_QNAME = new QName("http://banque/ws", "getAllResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: banque.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjoutCotation }
     * 
     */
    public AjoutCotation createAjoutCotation() {
        return new AjoutCotation();
    }

    /**
     * Create an instance of {@link GetCotation }
     * 
     */
    public GetCotation createGetCotation() {
        return new GetCotation();
    }

    /**
     * Create an instance of {@link GetCotationResponse }
     * 
     */
    public GetCotationResponse createGetCotationResponse() {
        return new GetCotationResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetCotations }
     * 
     */
    public GetCotations createGetCotations() {
        return new GetCotations();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link AjoutCotationResponse }
     * 
     */
    public AjoutCotationResponse createAjoutCotationResponse() {
        return new AjoutCotationResponse();
    }

    /**
     * Create an instance of {@link GetCotationsResponse }
     * 
     */
    public GetCotationsResponse createGetCotationsResponse() {
        return new GetCotationsResponse();
    }

    /**
     * Create an instance of {@link Cotation }
     * 
     */
    public Cotation createCotation() {
        return new Cotation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutCotationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "ajoutCotationResponse")
    public JAXBElement<AjoutCotationResponse> createAjoutCotationResponse(AjoutCotationResponse value) {
        return new JAXBElement<AjoutCotationResponse>(_AjoutCotationResponse_QNAME, AjoutCotationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "getCotationsResponse")
    public JAXBElement<GetCotationsResponse> createGetCotationsResponse(GetCotationsResponse value) {
        return new JAXBElement<GetCotationsResponse>(_GetCotationsResponse_QNAME, GetCotationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "getCotation")
    public JAXBElement<GetCotation> createGetCotation(GetCotation value) {
        return new JAXBElement<GetCotation>(_GetCotation_QNAME, GetCotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "getCotationResponse")
    public JAXBElement<GetCotationResponse> createGetCotationResponse(GetCotationResponse value) {
        return new JAXBElement<GetCotationResponse>(_GetCotationResponse_QNAME, GetCotationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCotations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "getCotations")
    public JAXBElement<GetCotations> createGetCotations(GetCotations value) {
        return new JAXBElement<GetCotations>(_GetCotations_QNAME, GetCotations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutCotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "ajoutCotation")
    public JAXBElement<AjoutCotation> createAjoutCotation(AjoutCotation value) {
        return new JAXBElement<AjoutCotation>(_AjoutCotation_QNAME, AjoutCotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://banque/ws", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

}
