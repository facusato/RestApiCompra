//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.23 a las 05:07:35 PM ART 
//


package com.unla.RestApiCompra.stub;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultar_saldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultar_saldo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nroTarjeta" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="monto_compra" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultar_saldo", propOrder = {
    "nroTarjeta",
    "montoCompra"
})
public class ConsultarSaldo {

    protected BigInteger nroTarjeta;
    @XmlElement(name = "monto_compra")
    protected Float montoCompra;

    /**
     * Obtiene el valor de la propiedad nroTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Define el valor de la propiedad nroTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNroTarjeta(BigInteger value) {
        this.nroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCompra.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMontoCompra() {
        return montoCompra;
    }

    /**
     * Define el valor de la propiedad montoCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMontoCompra(Float value) {
        this.montoCompra = value;
    }

}
