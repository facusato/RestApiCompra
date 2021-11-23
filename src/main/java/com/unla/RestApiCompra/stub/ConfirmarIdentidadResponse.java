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
 * <p>Clase Java para confirmar_identidadResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="confirmar_identidadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="confirmar_identidadResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmar_identidadResponse", propOrder = {
    "confirmarIdentidadResult"
})
public class ConfirmarIdentidadResponse {

    @XmlElement(name = "confirmar_identidadResult")
    protected String confirmarIdentidadResult;

    /**
     * Obtiene el valor de la propiedad confirmarIdentidadResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmarIdentidadResult() {
        return confirmarIdentidadResult;
    }

    /**
     * Define el valor de la propiedad confirmarIdentidadResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmarIdentidadResult(String value) {
        this.confirmarIdentidadResult = value;
    }

}
