
package serviceSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteAuteur complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteAuteur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAuteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteAuteur", propOrder = {
    "idAuteur"
})
public class DeleteAuteur {

    protected String idAuteur;

    /**
     * Obtient la valeur de la propriété idAuteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAuteur() {
        return idAuteur;
    }

    /**
     * Définit la valeur de la propriété idAuteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAuteur(String value) {
        this.idAuteur = value;
    }

}
