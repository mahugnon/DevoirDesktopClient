
package serviceSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updateCommentaire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updateCommentaire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commentaire" type="{http://services.mspi.issatso.org/}commentaire" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCommentaire", propOrder = {
    "commentaire"
})
public class UpdateCommentaire {

    protected Commentaire commentaire;

    /**
     * Obtient la valeur de la propriété commentaire.
     * 
     * @return
     *     possible object is
     *     {@link Commentaire }
     *     
     */
    public Commentaire getCommentaire() {
        return commentaire;
    }

    /**
     * Définit la valeur de la propriété commentaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Commentaire }
     *     
     */
    public void setCommentaire(Commentaire value) {
        this.commentaire = value;
    }

}
