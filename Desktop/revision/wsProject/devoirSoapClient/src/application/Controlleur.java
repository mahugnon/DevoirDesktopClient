package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import serviceSoap.Auteur;
import serviceSoap.Message;
import serviceSoap.SoapService;
import serviceSoap.SoapServiceService;

public class Controlleur implements Initializable{
	@FXML
	TextArea contenu;
	@FXML
	TextField email;
	private SoapService service;
	@FXML
	Label success;
	@FXML
	Label echec;
	@FXML
	Button envoyer;
	@FXML
	Button annuler;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		service = new SoapServiceService().getSoapServicePort();	
	}
	public void savePost(ActionEvent event){
		if(event.getSource()==envoyer){
			if(email.getText()=="")
			echec.setText("L'email saisit n'est pas enregistré");
			Auteur auteur=service.findOneAuteur(email.getText());
			if(auteur==null){
				echec.setText("L'email saisit n'est pas enregistré");
			}else {
				Message m=new Message();
				
				m.setAuteurBean(auteur);
				m.setContenu(contenu.getText());
				service.addMessage(m);
				success.setText("Succes publication ....!!");
				contenu.setText("");
				email.setText("");
			}
		}
	 if(event.getSource()==annuler){
		 contenu.setText("");
		 email.setText("");
		 success.setText("");
		 echec.setText("");
		 System.exit(0);
	 }
		
			
		
	}

}
