
package serviceSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getMessagesByAuteur complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getMessagesByAuteur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emailAuteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessagesByAuteur", propOrder = {
    "emailAuteur"
})
public class GetMessagesByAuteur {

    protected String emailAuteur;

    /**
     * Obtient la valeur de la propri�t� emailAuteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAuteur() {
        return emailAuteur;
    }

    /**
     * D�finit la valeur de la propri�t� emailAuteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAuteur(String value) {
        this.emailAuteur = value;
    }

}
