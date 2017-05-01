
package serviceSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateAuteur complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateAuteur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteur" type="{http://services.mspi.issatso.org/}auteur" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAuteur", propOrder = {
    "auteur"
})
public class UpdateAuteur {

    protected Auteur auteur;

    /**
     * Obtient la valeur de la propri�t� auteur.
     * 
     * @return
     *     possible object is
     *     {@link Auteur }
     *     
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * D�finit la valeur de la propri�t� auteur.
     * 
     * @param value
     *     allowed object is
     *     {@link Auteur }
     *     
     */
    public void setAuteur(Auteur value) {
        this.auteur = value;
    }

}
