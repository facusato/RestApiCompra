//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.23 a las 05:07:35 PM ART 
//


package com.unla.RestApiCompra.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unla.RestApiCompra.stub package. 
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

    private final static QName _List_QNAME = new QName("django.soap.example", "list");
    private final static QName _ConfirmarIdentidad_QNAME = new QName("django.soap.example", "confirmar_identidad");
    private final static QName _ConfirmarIdentidadResponse_QNAME = new QName("django.soap.example", "confirmar_identidadResponse");
    private final static QName _ConsultarSaldo_QNAME = new QName("django.soap.example", "consultar_saldo");
    private final static QName _ConsultarSaldoResponse_QNAME = new QName("django.soap.example", "consultar_saldoResponse");
    private final static QName _Sum_QNAME = new QName("django.soap.example", "sum");
    private final static QName _SumResponse_QNAME = new QName("django.soap.example", "sumResponse");
    private final static QName _TransferirSaldo_QNAME = new QName("django.soap.example", "transferir_saldo");
    private final static QName _TransferirSaldoResponse_QNAME = new QName("django.soap.example", "transferir_saldoResponse");
    private final static QName _ListResponse_QNAME = new QName("django.soap.example", "listResponse");
    private final static QName _ConsultarEstadoPorCodSeguim_QNAME = new QName("django.soap.example", "consultarEstadoPorCodSeguim");
    private final static QName _ConsultarEstadoPorCodSeguimResponse_QNAME = new QName("django.soap.example", "consultarEstadoPorCodSeguimResponse");
    private final static QName _GenerarCodSeguimiento_QNAME = new QName("django.soap.example", "generarCodSeguimiento");
    private final static QName _GenerarCodSeguimientoResponse_QNAME = new QName("django.soap.example", "generarCodSeguimientoResponse");
    private final static QName _Cuentas_QNAME = new QName("template_app.soap", "Cuentas");
    private final static QName _CuentasArray_QNAME = new QName("template_app.soap", "CuentasArray");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unla.RestApiCompra.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link ConfirmarIdentidad }
     * 
     */
    public ConfirmarIdentidad createConfirmarIdentidad() {
        return new ConfirmarIdentidad();
    }

    /**
     * Create an instance of {@link ConfirmarIdentidadResponse }
     * 
     */
    public ConfirmarIdentidadResponse createConfirmarIdentidadResponse() {
        return new ConfirmarIdentidadResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldo }
     * 
     */
    public ConsultarSaldo createConsultarSaldo() {
        return new ConsultarSaldo();
    }

    /**
     * Create an instance of {@link ConsultarSaldoResponse }
     * 
     */
    public ConsultarSaldoResponse createConsultarSaldoResponse() {
        return new ConsultarSaldoResponse();
    }

    /**
     * Create an instance of {@link Sum }
     * 
     */
    public Sum createSum() {
        return new Sum();
    }

    /**
     * Create an instance of {@link SumResponse }
     * 
     */
    public SumResponse createSumResponse() {
        return new SumResponse();
    }

    /**
     * Create an instance of {@link TransferirSaldo }
     * 
     */
    public TransferirSaldo createTransferirSaldo() {
        return new TransferirSaldo();
    }

    /**
     * Create an instance of {@link TransferirSaldoResponse }
     * 
     */
    public TransferirSaldoResponse createTransferirSaldoResponse() {
        return new TransferirSaldoResponse();
    }

    /**
     * Create an instance of {@link ListResponse }
     * 
     */
    public ListResponse createListResponse() {
        return new ListResponse();
    }

    /**
     * Create an instance of {@link ConsultarEstadoPorCodSeguim }
     * 
     */
    public ConsultarEstadoPorCodSeguim createConsultarEstadoPorCodSeguim() {
        return new ConsultarEstadoPorCodSeguim();
    }

    /**
     * Create an instance of {@link ConsultarEstadoPorCodSeguimResponse }
     * 
     */
    public ConsultarEstadoPorCodSeguimResponse createConsultarEstadoPorCodSeguimResponse() {
        return new ConsultarEstadoPorCodSeguimResponse();
    }

    /**
     * Create an instance of {@link GenerarCodSeguimiento }
     * 
     */
    public GenerarCodSeguimiento createGenerarCodSeguimiento() {
        return new GenerarCodSeguimiento();
    }

    /**
     * Create an instance of {@link GenerarCodSeguimientoResponse }
     * 
     */
    public GenerarCodSeguimientoResponse createGenerarCodSeguimientoResponse() {
        return new GenerarCodSeguimientoResponse();
    }

    /**
     * Create an instance of {@link Cuentas }
     * 
     */
    public Cuentas createCuentas() {
        return new Cuentas();
    }

    /**
     * Create an instance of {@link CuentasArray }
     * 
     */
    public CuentasArray createCuentasArray() {
        return new CuentasArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "list")
    public JAXBElement<List> createList(List value) {
        return new JAXBElement<List>(_List_QNAME, List.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarIdentidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmarIdentidad }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "confirmar_identidad")
    public JAXBElement<ConfirmarIdentidad> createConfirmarIdentidad(ConfirmarIdentidad value) {
        return new JAXBElement<ConfirmarIdentidad>(_ConfirmarIdentidad_QNAME, ConfirmarIdentidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarIdentidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmarIdentidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "confirmar_identidadResponse")
    public JAXBElement<ConfirmarIdentidadResponse> createConfirmarIdentidadResponse(ConfirmarIdentidadResponse value) {
        return new JAXBElement<ConfirmarIdentidadResponse>(_ConfirmarIdentidadResponse_QNAME, ConfirmarIdentidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "consultar_saldo")
    public JAXBElement<ConsultarSaldo> createConsultarSaldo(ConsultarSaldo value) {
        return new JAXBElement<ConsultarSaldo>(_ConsultarSaldo_QNAME, ConsultarSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "consultar_saldoResponse")
    public JAXBElement<ConsultarSaldoResponse> createConsultarSaldoResponse(ConsultarSaldoResponse value) {
        return new JAXBElement<ConsultarSaldoResponse>(_ConsultarSaldoResponse_QNAME, ConsultarSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sum }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "sum")
    public JAXBElement<Sum> createSum(Sum value) {
        return new JAXBElement<Sum>(_Sum_QNAME, Sum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "sumResponse")
    public JAXBElement<SumResponse> createSumResponse(SumResponse value) {
        return new JAXBElement<SumResponse>(_SumResponse_QNAME, SumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferirSaldo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferirSaldo }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "transferir_saldo")
    public JAXBElement<TransferirSaldo> createTransferirSaldo(TransferirSaldo value) {
        return new JAXBElement<TransferirSaldo>(_TransferirSaldo_QNAME, TransferirSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferirSaldoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferirSaldoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "transferir_saldoResponse")
    public JAXBElement<TransferirSaldoResponse> createTransferirSaldoResponse(TransferirSaldoResponse value) {
        return new JAXBElement<TransferirSaldoResponse>(_TransferirSaldoResponse_QNAME, TransferirSaldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "listResponse")
    public JAXBElement<ListResponse> createListResponse(ListResponse value) {
        return new JAXBElement<ListResponse>(_ListResponse_QNAME, ListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoPorCodSeguim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoPorCodSeguim }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "consultarEstadoPorCodSeguim")
    public JAXBElement<ConsultarEstadoPorCodSeguim> createConsultarEstadoPorCodSeguim(ConsultarEstadoPorCodSeguim value) {
        return new JAXBElement<ConsultarEstadoPorCodSeguim>(_ConsultarEstadoPorCodSeguim_QNAME, ConsultarEstadoPorCodSeguim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoPorCodSeguimResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoPorCodSeguimResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "consultarEstadoPorCodSeguimResponse")
    public JAXBElement<ConsultarEstadoPorCodSeguimResponse> createConsultarEstadoPorCodSeguimResponse(ConsultarEstadoPorCodSeguimResponse value) {
        return new JAXBElement<ConsultarEstadoPorCodSeguimResponse>(_ConsultarEstadoPorCodSeguimResponse_QNAME, ConsultarEstadoPorCodSeguimResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarCodSeguimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarCodSeguimiento }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "generarCodSeguimiento")
    public JAXBElement<GenerarCodSeguimiento> createGenerarCodSeguimiento(GenerarCodSeguimiento value) {
        return new JAXBElement<GenerarCodSeguimiento>(_GenerarCodSeguimiento_QNAME, GenerarCodSeguimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarCodSeguimientoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerarCodSeguimientoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "django.soap.example", name = "generarCodSeguimientoResponse")
    public JAXBElement<GenerarCodSeguimientoResponse> createGenerarCodSeguimientoResponse(GenerarCodSeguimientoResponse value) {
        return new JAXBElement<GenerarCodSeguimientoResponse>(_GenerarCodSeguimientoResponse_QNAME, GenerarCodSeguimientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cuentas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cuentas }{@code >}
     */
    @XmlElementDecl(namespace = "template_app.soap", name = "Cuentas")
    public JAXBElement<Cuentas> createCuentas(Cuentas value) {
        return new JAXBElement<Cuentas>(_Cuentas_QNAME, Cuentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentasArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuentasArray }{@code >}
     */
    @XmlElementDecl(namespace = "template_app.soap", name = "CuentasArray")
    public JAXBElement<CuentasArray> createCuentasArray(CuentasArray value) {
        return new JAXBElement<CuentasArray>(_CuentasArray_QNAME, CuentasArray.class, null, value);
    }

}
