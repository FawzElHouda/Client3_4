
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _Division_QNAME = new QName("http://service/", "Division");
    private final static QName _DivisionResponse_QNAME = new QName("http://service/", "DivisionResponse");
    private final static QName _Multiplication_QNAME = new QName("http://service/", "Multiplication");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://service/", "MultiplicationResponse");
    private final static QName _Soustraction_QNAME = new QName("http://service/", "Soustraction");
    private final static QName _SoustractionResponse_QNAME = new QName("http://service/", "SoustractionResponse");
    private final static QName _Somme_QNAME = new QName("http://service/", "somme");
    private final static QName _SommeResponse_QNAME = new QName("http://service/", "sommeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     * @return
     *     the new instance of {@link Division }
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     * @return
     *     the new instance of {@link DivisionResponse }
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     * @return
     *     the new instance of {@link Multiplication }
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     * @return
     *     the new instance of {@link MultiplicationResponse }
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Soustraction }
     * 
     * @return
     *     the new instance of {@link Soustraction }
     */
    public Soustraction createSoustraction() {
        return new Soustraction();
    }

    /**
     * Create an instance of {@link SoustractionResponse }
     * 
     * @return
     *     the new instance of {@link SoustractionResponse }
     */
    public SoustractionResponse createSoustractionResponse() {
        return new SoustractionResponse();
    }

    /**
     * Create an instance of {@link Somme }
     * 
     * @return
     *     the new instance of {@link Somme }
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     * @return
     *     the new instance of {@link SommeResponse }
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "Division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "DivisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "Multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "MultiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "Soustraction")
    public JAXBElement<Soustraction> createSoustraction(Soustraction value) {
        return new JAXBElement<>(_Soustraction_QNAME, Soustraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "SoustractionResponse")
    public JAXBElement<SoustractionResponse> createSoustractionResponse(SoustractionResponse value) {
        return new JAXBElement<>(_SoustractionResponse_QNAME, SoustractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<>(_Somme_QNAME, Somme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "sommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

}
