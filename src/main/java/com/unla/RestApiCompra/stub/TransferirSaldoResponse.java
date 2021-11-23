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
 * <p>Clase Java para transferir_saldoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transferir_saldoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transferir_saldoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferir_saldoResponse", propOrder = {
    "transferirSaldoResult"
})
public class TransferirSaldoResponse {

    @XmlElement(name = "transferir_saldoResult")
    protected String transferirSaldoResult;

    /**
     * Obtiene el valor de la propiedad transferirSaldoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferirSaldoResult() {
        return transferirSaldoResult;
    }

    /**
     * Define el valor de la propiedad transferirSaldoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferirSaldoResult(String value) {
        this.transferirSaldoResult = value;
    }

}
