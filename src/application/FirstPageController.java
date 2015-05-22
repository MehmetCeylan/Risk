import java.net.URL;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.control.*;

public class FirstPageController extends AnchorPane implements Initializable{
	private Main application;
	private int UserNumber = 0;
	
	@FXML
    TextArea textArea;	
	@FXML
    TextField playerNumber;
    @FXML
    Text player1;
    @FXML
    Text player2;
    @FXML
    Text player3;
    @FXML
    Text player4;
    @FXML
    Text player5;
    @FXML
    Text player6;
    @FXML
    ComboBox<String> colorPlayer1;
    @FXML
    ComboBox<String> colorPlayer2;
    @FXML
    ComboBox<String> colorPlayer3;
    @FXML
    ComboBox<String> colorPlayer4;
    @FXML
    ComboBox<String> colorPlayer5;
    @FXML
    ComboBox<String> colorPlayer6;
	
	public FirstPageController ()
	{
	}
	
    public void setApp(Main application){
        this.application = application;
    }
    
	@Override
    public void initialize(URL location, ResourceBundle resources) {
		textArea.setText("");
    }
	
	public void processOK(ActionEvent event)
	{
		if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
			textArea.setText("");
        } else {
            if (Integer.parseInt(playerNumber.getText()) < 2 || Integer.parseInt(playerNumber.getText()) > 6 ) {
            	textArea.setText("User number must be between 2 to 6");
            }
            else {
            	UserNumber = Integer.parseInt(playerNumber.getText());
            	switch (Integer.parseInt(playerNumber.getText()))
            	{
            	case 2 :
            		player1.setVisible(true);
            		player2.setVisible(true);
            		colorPlayer1.setVisible(true);
            		colorPlayer2.setVisible(true);
            		break;
            	case 3 :
            		player1.setVisible(true);
            		player2.setVisible(true);
            		player3.setVisible(true);
            		colorPlayer1.setVisible(true);
            		colorPlayer2.setVisible(true);
            		colorPlayer3.setVisible(true);
            		break;
            	case 4 :
            		player1.setVisible(true);
            		player2.setVisible(true);
            		player3.setVisible(true);
            		player4.setVisible(true);
            		colorPlayer1.setVisible(true);
            		colorPlayer2.setVisible(true);
            		colorPlayer3.setVisible(true);
            		colorPlayer4.setVisible(true);
            		break;
            	case 5 :
            		player1.setVisible(true);
            		player2.setVisible(true);
            		player3.setVisible(true);
            		player4.setVisible(true);
            		player5.setVisible(true);
            		colorPlayer1.setVisible(true);
            		colorPlayer2.setVisible(true);
            		colorPlayer3.setVisible(true);
            		colorPlayer4.setVisible(true);
            		colorPlayer5.setVisible(true);
            		break;
            	case 6 :
            		player1.setVisible(true);
            		player2.setVisible(true);
            		player3.setVisible(true);
            		player4.setVisible(true);
            		player5.setVisible(true);
            		player6.setVisible(true);
            		colorPlayer1.setVisible(true);
            		colorPlayer2.setVisible(true);
            		colorPlayer3.setVisible(true);
            		colorPlayer4.setVisible(true);
            		colorPlayer5.setVisible(true);
            		colorPlayer6.setVisible(true);
            		break;
            	}
            }
        }
	}
	
	public int mapColor(String color)
	{
		switch(color)
		{
		case "Red" :
			return 0;
		case "Blue" :
			return 1;
		case "Green" :
			return 2;
		case "Yellow" :
			return 3;
		case "Brown" :
			return 4;
		case "Purple" :
			return 5;
		}
		return -1;
	}
	
	public void processGAME(ActionEvent event)
	{
		int[] playerArray;
		if (application == null){
            // We are running in isolated FXML, possibly in Scene Builder.
            // NO-OP.
			textArea.setText("");
        } else {
        	switch (UserNumber)
        	{
        	case 2 :
        		playerArray = new int[2];
        		playerArray[0] = mapColor(colorPlayer1.getValue());
        		playerArray[1] = mapColor(colorPlayer2.getValue());
        		break;
        	case 3 :
        		playerArray = new int[3];
        		playerArray[0] = mapColor(colorPlayer1.getValue());
        		playerArray[1] = mapColor(colorPlayer2.getValue());
        		playerArray[2] = mapColor(colorPlayer3.getValue());
        		break;
        	case 4 :
        		playerArray = new int[4];
        		playerArray[0] = mapColor(colorPlayer1.getValue());
        		playerArray[1] = mapColor(colorPlayer2.getValue());
        		playerArray[2] = mapColor(colorPlayer3.getValue());
        		playerArray[3] = mapColor(colorPlayer4.getValue());
        		break;
        	case 5 :
        		playerArray = new int[5];
        		playerArray[0] = mapColor(colorPlayer1.getValue());
        		playerArray[1] = mapColor(colorPlayer2.getValue());
        		playerArray[2] = mapColor(colorPlayer3.getValue());
        		playerArray[3] = mapColor(colorPlayer4.getValue());
        		playerArray[4] = mapColor(colorPlayer5.getValue());
        		break;
        	case 6 :
        		playerArray = new int[6];
        		playerArray[0] = mapColor(colorPlayer1.getValue());
        		playerArray[1] = mapColor(colorPlayer2.getValue());
        		playerArray[2] = mapColor(colorPlayer3.getValue());
        		playerArray[3] = mapColor(colorPlayer4.getValue());
        		playerArray[4] = mapColor(colorPlayer5.getValue());
        		playerArray[4] = mapColor(colorPlayer6.getValue());
        		break;
        	default :
        		playerArray = new int[0];
        	}
        	application.gotoMap(playerArray);
		}
	}
}
