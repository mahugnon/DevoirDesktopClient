
package serviceSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour commentaire complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commentaire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auteurBean" type="{http://services.mspi.issatso.org/}auteur" minOccurs="0"/>
 *         &lt;element name="contenu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCommentaire" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://services.mspi.issatso.org/}message" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commentaire", propOrder = {
    "auteurBean",
    "contenu",
    "idCommentaire",
    "message"
})
public class Commentaire {

    protected Auteur auteurBean;
    protected String contenu;
    protected int idCommentaire;
    protected Message message;

    /**
     * Obtient la valeur de la propri�t� auteurBean.
     * 
     * @return
     *     possible object is
     *     {@link Auteur }
     *     
     */
    public Auteur getAuteurBean() {
        return auteurBean;
    }

    /**
     * D�finit la valeur de la propri�t� auteurBean.
     * 
     * @param value
     *     allowed object is
     *     {@link Auteur }
     *     
     */
    public void setAuteurBean(Auteur value) {
        this.auteurBean = value;
    }

    /**
     * Obtient la valeur de la propri�t� contenu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * D�finit la valeur de la propri�t� contenu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContenu(String value) {
        this.contenu = value;
    }

    /**
     * Obtient la valeur de la propri�t� idCommentaire.
     * 
     */
    public int getIdCommentaire() {
        return idCommentaire;
    }

    /**
     * D�finit la valeur de la propri�t� idCommentaire.
     * 
     */
    public void setIdCommentaire(int value) {
        this.idCommentaire = value;
    }

    /**
     * Obtient la valeur de la propri�t� message.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * D�finit la valeur de la propri�t� message.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
    }

}
