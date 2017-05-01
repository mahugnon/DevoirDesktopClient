
package serviceSoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceSoap package. 
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

    private final static QName _GetMessagesByAuteur_QNAME = new QName("http://services.mspi.issatso.org/", "getMessagesByAuteur");
    private final static QName _AddAuteur_QNAME = new QName("http://services.mspi.issatso.org/", "addAuteur");
    private final static QName _UpdateAuteur_QNAME = new QName("http://services.mspi.issatso.org/", "updateAuteur");
    private final static QName _FindOneMessageResponse_QNAME = new QName("http://services.mspi.issatso.org/", "findOneMessageResponse");
    private final static QName _UpdateMessageResponse_QNAME = new QName("http://services.mspi.issatso.org/", "updateMessageResponse");
    private final static QName _Message_QNAME = new QName("http://services.mspi.issatso.org/", "message");
    private final static QName _Auteur_QNAME = new QName("http://services.mspi.issatso.org/", "auteur");
    private final static QName _FindAllMessageResponse_QNAME = new QName("http://services.mspi.issatso.org/", "findAllMessageResponse");
    private final static QName _DeleteMessage_QNAME = new QName("http://services.mspi.issatso.org/", "deleteMessage");
    private final static QName _AddCommentaire_QNAME = new QName("http://services.mspi.issatso.org/", "addCommentaire");
    private final static QName _AddAuteurResponse_QNAME = new QName("http://services.mspi.issatso.org/", "addAuteurResponse");
    private final static QName _AddCommentaireResponse_QNAME = new QName("http://services.mspi.issatso.org/", "addCommentaireResponse");
    private final static QName _DeleteCommentaire_QNAME = new QName("http://services.mspi.issatso.org/", "deleteCommentaire");
    private final static QName _UpdateMessage_QNAME = new QName("http://services.mspi.issatso.org/", "updateMessage");
    private final static QName _FindOneAuteurResponse_QNAME = new QName("http://services.mspi.issatso.org/", "findOneAuteurResponse");
    private final static QName _DeleteAuteur_QNAME = new QName("http://services.mspi.issatso.org/", "deleteAuteur");
    private final static QName _UpdateAuteurResponse_QNAME = new QName("http://services.mspi.issatso.org/", "updateAuteurResponse");
    private final static QName _GetAllAuteur_QNAME = new QName("http://services.mspi.issatso.org/", "getAllAuteur");
    private final static QName _DeleteMessageResponse_QNAME = new QName("http://services.mspi.issatso.org/", "deleteMessageResponse");
    private final static QName _FindOneAuteur_QNAME = new QName("http://services.mspi.issatso.org/", "findOneAuteur");
    private final static QName _AddMessageResponse_QNAME = new QName("http://services.mspi.issatso.org/", "addMessageResponse");
    private final static QName _AddMessage_QNAME = new QName("http://services.mspi.issatso.org/", "addMessage");
    private final static QName _UpdateCommentaireResponse_QNAME = new QName("http://services.mspi.issatso.org/", "updateCommentaireResponse");
    private final static QName _FindOneMessage_QNAME = new QName("http://services.mspi.issatso.org/", "findOneMessage");
    private final static QName _GetCommentaireByMessageResponse_QNAME = new QName("http://services.mspi.issatso.org/", "getCommentaireByMessageResponse");
    private final static QName _UpdateCommentaire_QNAME = new QName("http://services.mspi.issatso.org/", "updateCommentaire");
    private final static QName _DeleteCommentaireResponse_QNAME = new QName("http://services.mspi.issatso.org/", "deleteCommentaireResponse");
    private final static QName _FindAllMessage_QNAME = new QName("http://services.mspi.issatso.org/", "findAllMessage");
    private final static QName _GetCommentaireByMessage_QNAME = new QName("http://services.mspi.issatso.org/", "getCommentaireByMessage");
    private final static QName _Commentaire_QNAME = new QName("http://services.mspi.issatso.org/", "commentaire");
    private final static QName _GetAllAuteurResponse_QNAME = new QName("http://services.mspi.issatso.org/", "getAllAuteurResponse");
    private final static QName _DeleteAuteurResponse_QNAME = new QName("http://services.mspi.issatso.org/", "deleteAuteurResponse");
    private final static QName _FindOneCommentaireResponse_QNAME = new QName("http://services.mspi.issatso.org/", "findOneCommentaireResponse");
    private final static QName _FindOneCommentaire_QNAME = new QName("http://services.mspi.issatso.org/", "findOneCommentaire");
    private final static QName _GetMessagesByAuteurResponse_QNAME = new QName("http://services.mspi.issatso.org/", "getMessagesByAuteurResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceSoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAuteur }
     * 
     */
    public GetAllAuteur createGetAllAuteur() {
        return new GetAllAuteur();
    }

    /**
     * Create an instance of {@link DeleteMessageResponse }
     * 
     */
    public DeleteMessageResponse createDeleteMessageResponse() {
        return new DeleteMessageResponse();
    }

    /**
     * Create an instance of {@link FindOneAuteur }
     * 
     */
    public FindOneAuteur createFindOneAuteur() {
        return new FindOneAuteur();
    }

    /**
     * Create an instance of {@link FindOneAuteurResponse }
     * 
     */
    public FindOneAuteurResponse createFindOneAuteurResponse() {
        return new FindOneAuteurResponse();
    }

    /**
     * Create an instance of {@link DeleteAuteur }
     * 
     */
    public DeleteAuteur createDeleteAuteur() {
        return new DeleteAuteur();
    }

    /**
     * Create an instance of {@link UpdateAuteurResponse }
     * 
     */
    public UpdateAuteurResponse createUpdateAuteurResponse() {
        return new UpdateAuteurResponse();
    }

    /**
     * Create an instance of {@link FindOneMessage }
     * 
     */
    public FindOneMessage createFindOneMessage() {
        return new FindOneMessage();
    }

    /**
     * Create an instance of {@link GetCommentaireByMessageResponse }
     * 
     */
    public GetCommentaireByMessageResponse createGetCommentaireByMessageResponse() {
        return new GetCommentaireByMessageResponse();
    }

    /**
     * Create an instance of {@link UpdateCommentaire }
     * 
     */
    public UpdateCommentaire createUpdateCommentaire() {
        return new UpdateCommentaire();
    }

    /**
     * Create an instance of {@link DeleteCommentaireResponse }
     * 
     */
    public DeleteCommentaireResponse createDeleteCommentaireResponse() {
        return new DeleteCommentaireResponse();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link UpdateCommentaireResponse }
     * 
     */
    public UpdateCommentaireResponse createUpdateCommentaireResponse() {
        return new UpdateCommentaireResponse();
    }

    /**
     * Create an instance of {@link FindAllMessage }
     * 
     */
    public FindAllMessage createFindAllMessage() {
        return new FindAllMessage();
    }

    /**
     * Create an instance of {@link FindOneCommentaire }
     * 
     */
    public FindOneCommentaire createFindOneCommentaire() {
        return new FindOneCommentaire();
    }

    /**
     * Create an instance of {@link GetMessagesByAuteurResponse }
     * 
     */
    public GetMessagesByAuteurResponse createGetMessagesByAuteurResponse() {
        return new GetMessagesByAuteurResponse();
    }

    /**
     * Create an instance of {@link GetCommentaireByMessage }
     * 
     */
    public GetCommentaireByMessage createGetCommentaireByMessage() {
        return new GetCommentaireByMessage();
    }

    /**
     * Create an instance of {@link Commentaire }
     * 
     */
    public Commentaire createCommentaire() {
        return new Commentaire();
    }

    /**
     * Create an instance of {@link GetAllAuteurResponse }
     * 
     */
    public GetAllAuteurResponse createGetAllAuteurResponse() {
        return new GetAllAuteurResponse();
    }

    /**
     * Create an instance of {@link DeleteAuteurResponse }
     * 
     */
    public DeleteAuteurResponse createDeleteAuteurResponse() {
        return new DeleteAuteurResponse();
    }

    /**
     * Create an instance of {@link FindOneCommentaireResponse }
     * 
     */
    public FindOneCommentaireResponse createFindOneCommentaireResponse() {
        return new FindOneCommentaireResponse();
    }

    /**
     * Create an instance of {@link FindOneMessageResponse }
     * 
     */
    public FindOneMessageResponse createFindOneMessageResponse() {
        return new FindOneMessageResponse();
    }

    /**
     * Create an instance of {@link UpdateMessageResponse }
     * 
     */
    public UpdateMessageResponse createUpdateMessageResponse() {
        return new UpdateMessageResponse();
    }

    /**
     * Create an instance of {@link GetMessagesByAuteur }
     * 
     */
    public GetMessagesByAuteur createGetMessagesByAuteur() {
        return new GetMessagesByAuteur();
    }

    /**
     * Create an instance of {@link AddAuteur }
     * 
     */
    public AddAuteur createAddAuteur() {
        return new AddAuteur();
    }

    /**
     * Create an instance of {@link UpdateAuteur }
     * 
     */
    public UpdateAuteur createUpdateAuteur() {
        return new UpdateAuteur();
    }

    /**
     * Create an instance of {@link FindAllMessageResponse }
     * 
     */
    public FindAllMessageResponse createFindAllMessageResponse() {
        return new FindAllMessageResponse();
    }

    /**
     * Create an instance of {@link DeleteMessage }
     * 
     */
    public DeleteMessage createDeleteMessage() {
        return new DeleteMessage();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link AddAuteurResponse }
     * 
     */
    public AddAuteurResponse createAddAuteurResponse() {
        return new AddAuteurResponse();
    }

    /**
     * Create an instance of {@link AddCommentaireResponse }
     * 
     */
    public AddCommentaireResponse createAddCommentaireResponse() {
        return new AddCommentaireResponse();
    }

    /**
     * Create an instance of {@link DeleteCommentaire }
     * 
     */
    public DeleteCommentaire createDeleteCommentaire() {
        return new DeleteCommentaire();
    }

    /**
     * Create an instance of {@link AddCommentaire }
     * 
     */
    public AddCommentaire createAddCommentaire() {
        return new AddCommentaire();
    }

    /**
     * Create an instance of {@link UpdateMessage }
     * 
     */
    public UpdateMessage createUpdateMessage() {
        return new UpdateMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesByAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "getMessagesByAuteur")
    public JAXBElement<GetMessagesByAuteur> createGetMessagesByAuteur(GetMessagesByAuteur value) {
        return new JAXBElement<GetMessagesByAuteur>(_GetMessagesByAuteur_QNAME, GetMessagesByAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "addAuteur")
    public JAXBElement<AddAuteur> createAddAuteur(AddAuteur value) {
        return new JAXBElement<AddAuteur>(_AddAuteur_QNAME, AddAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "updateAuteur")
    public JAXBElement<UpdateAuteur> createUpdateAuteur(UpdateAuteur value) {
        return new JAXBElement<UpdateAuteur>(_UpdateAuteur_QNAME, UpdateAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findOneMessageResponse")
    public JAXBElement<FindOneMessageResponse> createFindOneMessageResponse(FindOneMessageResponse value) {
        return new JAXBElement<FindOneMessageResponse>(_FindOneMessageResponse_QNAME, FindOneMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "updateMessageResponse")
    public JAXBElement<UpdateMessageResponse> createUpdateMessageResponse(UpdateMessageResponse value) {
        return new JAXBElement<UpdateMessageResponse>(_UpdateMessageResponse_QNAME, UpdateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "auteur")
    public JAXBElement<Auteur> createAuteur(Auteur value) {
        return new JAXBElement<Auteur>(_Auteur_QNAME, Auteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findAllMessageResponse")
    public JAXBElement<FindAllMessageResponse> createFindAllMessageResponse(FindAllMessageResponse value) {
        return new JAXBElement<FindAllMessageResponse>(_FindAllMessageResponse_QNAME, FindAllMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "deleteMessage")
    public JAXBElement<DeleteMessage> createDeleteMessage(DeleteMessage value) {
        return new JAXBElement<DeleteMessage>(_DeleteMessage_QNAME, DeleteMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "addCommentaire")
    public JAXBElement<AddCommentaire> createAddCommentaire(AddCommentaire value) {
        return new JAXBElement<AddCommentaire>(_AddCommentaire_QNAME, AddCommentaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "addAuteurResponse")
    public JAXBElement<AddAuteurResponse> createAddAuteurResponse(AddAuteurResponse value) {
        return new JAXBElement<AddAuteurResponse>(_AddAuteurResponse_QNAME, AddAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "addCommentaireResponse")
    public JAXBElement<AddCommentaireResponse> createAddCommentaireResponse(AddCommentaireResponse value) {
        return new JAXBElement<AddCommentaireResponse>(_AddCommentaireResponse_QNAME, AddCommentaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCommentaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "deleteCommentaire")
    public JAXBElement<DeleteCommentaire> createDeleteCommentaire(DeleteCommentaire value) {
        return new JAXBElement<DeleteCommentaire>(_DeleteCommentaire_QNAME, DeleteCommentaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "updateMessage")
    public JAXBElement<UpdateMessage> createUpdateMessage(UpdateMessage value) {
        return new JAXBElement<UpdateMessage>(_UpdateMessage_QNAME, UpdateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findOneAuteurResponse")
    public JAXBElement<FindOneAuteurResponse> createFindOneAuteurResponse(FindOneAuteurResponse value) {
        return new JAXBElement<FindOneAuteurResponse>(_FindOneAuteurResponse_QNAME, FindOneAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "deleteAuteur")
    public JAXBElement<DeleteAuteur> createDeleteAuteur(DeleteAuteur value) {
        return new JAXBElement<DeleteAuteur>(_DeleteAuteur_QNAME, DeleteAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "updateAuteurResponse")
    public JAXBElement<UpdateAuteurResponse> createUpdateAuteurResponse(UpdateAuteurResponse value) {
        return new JAXBElement<UpdateAuteurResponse>(_UpdateAuteurResponse_QNAME, UpdateAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "getAllAuteur")
    public JAXBElement<GetAllAuteur> createGetAllAuteur(GetAllAuteur value) {
        return new JAXBElement<GetAllAuteur>(_GetAllAuteur_QNAME, GetAllAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "deleteMessageResponse")
    public JAXBElement<DeleteMessageResponse> createDeleteMessageResponse(DeleteMessageResponse value) {
        return new JAXBElement<DeleteMessageResponse>(_DeleteMessageResponse_QNAME, DeleteMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findOneAuteur")
    public JAXBElement<FindOneAuteur> createFindOneAuteur(FindOneAuteur value) {
        return new JAXBElement<FindOneAuteur>(_FindOneAuteur_QNAME, FindOneAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "addMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCommentaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "updateCommentaireResponse")
    public JAXBElement<UpdateCommentaireResponse> createUpdateCommentaireResponse(UpdateCommentaireResponse value) {
        return new JAXBElement<UpdateCommentaireResponse>(_UpdateCommentaireResponse_QNAME, UpdateCommentaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findOneMessage")
    public JAXBElement<FindOneMessage> createFindOneMessage(FindOneMessage value) {
        return new JAXBElement<FindOneMessage>(_FindOneMessage_QNAME, FindOneMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentaireByMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "getCommentaireByMessageResponse")
    public JAXBElement<GetCommentaireByMessageResponse> createGetCommentaireByMessageResponse(GetCommentaireByMessageResponse value) {
        return new JAXBElement<GetCommentaireByMessageResponse>(_GetCommentaireByMessageResponse_QNAME, GetCommentaireByMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCommentaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "updateCommentaire")
    public JAXBElement<UpdateCommentaire> createUpdateCommentaire(UpdateCommentaire value) {
        return new JAXBElement<UpdateCommentaire>(_UpdateCommentaire_QNAME, UpdateCommentaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCommentaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "deleteCommentaireResponse")
    public JAXBElement<DeleteCommentaireResponse> createDeleteCommentaireResponse(DeleteCommentaireResponse value) {
        return new JAXBElement<DeleteCommentaireResponse>(_DeleteCommentaireResponse_QNAME, DeleteCommentaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findAllMessage")
    public JAXBElement<FindAllMessage> createFindAllMessage(FindAllMessage value) {
        return new JAXBElement<FindAllMessage>(_FindAllMessage_QNAME, FindAllMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentaireByMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "getCommentaireByMessage")
    public JAXBElement<GetCommentaireByMessage> createGetCommentaireByMessage(GetCommentaireByMessage value) {
        return new JAXBElement<GetCommentaireByMessage>(_GetCommentaireByMessage_QNAME, GetCommentaireByMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commentaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "commentaire")
    public JAXBElement<Commentaire> createCommentaire(Commentaire value) {
        return new JAXBElement<Commentaire>(_Commentaire_QNAME, Commentaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "getAllAuteurResponse")
    public JAXBElement<GetAllAuteurResponse> createGetAllAuteurResponse(GetAllAuteurResponse value) {
        return new JAXBElement<GetAllAuteurResponse>(_GetAllAuteurResponse_QNAME, GetAllAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "deleteAuteurResponse")
    public JAXBElement<DeleteAuteurResponse> createDeleteAuteurResponse(DeleteAuteurResponse value) {
        return new JAXBElement<DeleteAuteurResponse>(_DeleteAuteurResponse_QNAME, DeleteAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneCommentaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findOneCommentaireResponse")
    public JAXBElement<FindOneCommentaireResponse> createFindOneCommentaireResponse(FindOneCommentaireResponse value) {
        return new JAXBElement<FindOneCommentaireResponse>(_FindOneCommentaireResponse_QNAME, FindOneCommentaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneCommentaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "findOneCommentaire")
    public JAXBElement<FindOneCommentaire> createFindOneCommentaire(FindOneCommentaire value) {
        return new JAXBElement<FindOneCommentaire>(_FindOneCommentaire_QNAME, FindOneCommentaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesByAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.mspi.issatso.org/", name = "getMessagesByAuteurResponse")
    public JAXBElement<GetMessagesByAuteurResponse> createGetMessagesByAuteurResponse(GetMessagesByAuteurResponse value) {
        return new JAXBElement<GetMessagesByAuteurResponse>(_GetMessagesByAuteurResponse_QNAME, GetMessagesByAuteurResponse.class, null, value);
    }

}
