//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.23 a las 05:07:35 PM ART 
//


package com.unla.RestApiCompra.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultar_saldoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultar_saldoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultar_saldoResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultar_saldoResponse", propOrder = {
    "consultarSaldoResult"
})
public class ConsultarSaldoResponse {

    @XmlElement(name = "consultar_saldoResult")
    protected Boolean consultarSaldoResult;

    /**
     * Obtiene el valor de la propiedad consultarSaldoResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsultarSaldoResult() {
        return consultarSaldoResult;
    }

    /**
     * Define el valor de la propiedad consultarSaldoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsultarSaldoResult(Boolean value) {
        this.consultarSaldoResult = value;
    }

}
