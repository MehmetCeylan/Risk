import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;


public class MapController extends AnchorPane implements Initializable{
	private Main application;
	public int[][] map;
	public Territory[] map_list = new Territory[42];
	public Player[] player_list;
	public int PlayerArray[];
	public int counter = 0;
	public TextField[] textFieldArray;
	public TextField[] defenderDiceArray;
	public TextField[] attackingDiceArray;
	private boolean first_deploying = true;
	
	@FXML
	TextField TextField0;
	
	@FXML
	TextField TextField1;
	
	@FXML
	TextField TextField2;
	
	@FXML
	TextField TextField3;
	
	@FXML
	TextField TextField4;
	
	@FXML
	TextField TextField5;
	
	@FXML
	TextField TextField6;
	
	@FXML
	TextField TextField7;
	
	@FXML
	TextField TextField8;
	
	@FXML
	TextField TextField9;
	
	@FXML
	TextField TextField10;
	
	@FXML
	TextField TextField11;
	
	@FXML
	TextField TextField12;
	
	@FXML
	TextField TextField13;
	
	@FXML
	TextField TextField14;
	
	@FXML
	TextField TextField15;
	
	@FXML
	TextField TextField16;
	
	@FXML
	TextField TextField17;
	
	@FXML
	TextField TextField18;
	
	@FXML
	TextField TextField19;
	
	@FXML
	TextField TextField20;
	
	@FXML
	TextField TextField21;
	
	@FXML
	TextField TextField22;
	
	@FXML
	TextField TextField23;
	
	@FXML
	TextField TextField24;
	
	@FXML
	TextField TextField25;
	
	@FXML
	TextField TextField26;
	
	@FXML
	TextField TextField27;
	
	@FXML
	TextField TextField28;
	
	@FXML
	TextField TextField29;
	
	@FXML
	TextField TextField30;
	
	@FXML
	TextField TextField31;
	
	@FXML
	TextField TextField32;
	
	@FXML
	TextField TextField33;
	
	@FXML
	TextField TextField34;
	
	@FXML
	TextField TextField35;
	
	@FXML
	TextField TextField36;
	
	@FXML
	TextField TextField37;
	
	@FXML
	TextField TextField38;
	
	@FXML
	TextField TextField39;
	
	@FXML
	TextField TextField40;
	
	@FXML
	TextField TextField41;
	
	@FXML
	TextArea textArea;
	
	@FXML
	TextField first_territory;
	
	@FXML
	TextField second_territory;
	
	@FXML
	TextField army;
	
	@FXML
	TextField defender_army;
	
	@FXML
	Button play;
	
	@FXML
	TextField defence_dice1;

	@FXML
	TextField defence_dice2;
	
	@FXML
	TextField attack_dice1;
	
	@FXML
	TextField attack_dice2;
	
	@FXML
	TextField attack_dice3;
	
	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}
	
	public void setApp(Main application){
        this.application = application;
    }
	
	@Override
    public void initialize(URL location, ResourceBundle resources) {
		
    }

	public int[] getPlayerArray() {
		return PlayerArray;
	}

	public void setPlayerArray(int player[]) {
		PlayerArray = player;
	}
	
	public int startingArmy() {
		switch (PlayerArray.length)
		{
		case 2 :
			return 40;
		case 3 :
			return 35;
		case 4 :
			return 30;
		case 5 :
			return 25;
		case 6 :
			return 20;
		default :
			return 0;
		}
	}
	
	public boolean ownerCheck()
	{
		for (int i = 0; i < 42; i++)
		{
			if (map_list[i].getOwner() == null)
			{
				return false;
			}
		}
		return true;
	}
	
	public void startGame()
	{
		setMap(new int[][]
						{
						//0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1
						{ 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, //0
						{ 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //1
						{ 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //2
						{ 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //3
						{ 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //4
						{ 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //5
						{ 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //6
						{ 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //7
						{ 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //8
						{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //9
					   // 0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //0
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //1
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //2
						{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //3
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //4
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //5
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //6
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //7 
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //8
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //9
					   // 0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1	
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //0	
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //1
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //2
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //3
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //4
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //5
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //6
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //7
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //8
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, //9
					   // 0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5  6  7  8  9  0  1
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0}, //0
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0}, //1
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, //2
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}, //3
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0}, //4
						{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0}, //5
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0}, //6
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, //7
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0}, //8
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1}, //9
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1}, //0
						{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0}, //1
						});
		for (int i = 0; i < 42; i++)
		{
			map_list[i] = new Territory(i);
		}
		
		textFieldArray = new TextField[]{TextField0, TextField1, TextField2, TextField3, TextField4, TextField5, TextField6, TextField7,
										 TextField8, TextField9, TextField10, TextField11, TextField12, TextField13, TextField14, TextField15,
										 TextField16, TextField17, TextField18, TextField19, TextField20, TextField21, TextField22, TextField23,
										 TextField24, TextField25, TextField26, TextField27, TextField28, TextField29, TextField30, TextField31,
										 TextField32, TextField33, TextField34, TextField35, TextField36, TextField37, TextField38, TextField39,
										 TextField40, TextField41};
		
		defenderDiceArray = new TextField[]{defence_dice1,defence_dice2};
		
		attackingDiceArray = new TextField[]{attack_dice1,attack_dice2,attack_dice3};
		
		player_list = new Player[PlayerArray.length];
		
		for (int i = 0; i < PlayerArray.length; i++)
		{
			player_list[i] = new Player();
			player_list[i].setNumber(i);
			player_list[i].setColor(PlayerArray[i]);
			player_list[i].setState(new SelectingTerritoryState(this));
		}
		
		textArea.setText("Game Started.... Select a territory\nAll player has" + startingArmy() + "army....Player 1 Turn");
		for (int i = 0; i < player_list.length; i++)
		{
			player_list[i].setDeployedArmy(startingArmy());
		}
		
		play.setText("Select");
		play.setVisible(true);
	}
	
	public void processEndState(ActionEvent event)
	{
		if(player_list[counter].getState() instanceof DeployingState)
		{
			if(player_list[counter].getDeployedArmy() == 0)
			{
				player_list[counter].setState(new AttackingState(this));
				if (first_deploying == true)
				{
					counter++;
					if (counter > player_list.length)
					{
						counter = 0;
						first_deploying = false;
					}
				}
			}
			else
			{
				textArea.setText("Finish all your deployed armies");
			}
		}
		else if(player_list[counter].getState() instanceof AttackingState)
		{
			player_list[counter].setState(new TransferState(this));
		}
		else if(player_list[counter].getState() instanceof TransferState)
		{
			player_list[counter].setState(new DeployingState(this));
			int deployed_army = 0;
			if ( player_list[counter].getOwned_territory()/3 < 3)
			{
				deployed_army = 3;
			}
			else
			{
				deployed_army = Math.floorDiv(player_list[counter].getOwned_territory(),3);
			}
			player_list[counter].setDeployedArmy(deployed_army);
			counter++;
		}
		else if(player_list[counter].getState() instanceof SelectingTerritoryState)
		{
			if (ownerCheck())
			{
				counter = 0;
				for (int i = 0; i < player_list.length; i++)
				{
					player_list[i].setState(new DeployingState(this));
				}
			}
			else
			{
				counter++;
				if (counter >= player_list.length)
				{
					counter = 0;
				}
			}
		}
//		else if (player_list[counter].getState() instanceof EndTurnState)
//		{
//			counter++;
//		}
		
		if(player_list[counter].getState() instanceof SelectingTerritoryState)
		{
			play.setText("Select");
			textArea.setText("Player" + " " + (counter + 1) + " " + "turn \n Selecting Territory State... \n Player must select a territory and write it to in first territory area");
		}
		else if(player_list[counter].getState() instanceof DeployingState)
		{
			play.setText("Fortify");
			textArea.setText("Player" + " " + (counter + 1) + " " + "turn \n Deploying State... \n Player must select a territory "
					+ ",write it to in first territory area and write army number that which do you want to fortify \n"
					+ player_list[counter].getDeployedArmy() + " left");
		}
		else if(player_list[counter].getState() instanceof AttackingState)
		{
			play.setText("Attack");
			textArea.setText("Player" + " " + (counter + 1) + " " + "turn \n Attacking State... \n Player must select a territory to attack"
					+ ",write it to in first territory area, write territory number in second territory area which do you want to attack"
					+ "and write army number that which do you want to use when attacking");

		}
		else if(player_list[counter].getState() instanceof TransferState)
		{
			play.setText("Transfer");
			textArea.setText("Player" + " " + (counter + 1) + " " + "turn \n Fortifying State... "
					+ "\n Player must select a territory ,write it to in first territory area, write territory number in second territory are which do you want to transfer your army to"
					+ " and write army number that which do you want to transfer");

		}
	}
	
	public void play(ActionEvent event)
	{
		if (Integer.parseInt(first_territory.getText()) < 42 && Integer.parseInt(second_territory.getText()) < 42 
				&&  Integer.parseInt(army.getText()) <= player_list[counter].getDeployedArmy()) {
			player_list[counter].getState().select(Integer.parseInt(first_territory.getText()), player_list[counter]);
			player_list[counter].getState().deploy(Integer.parseInt(first_territory.getText()), player_list[counter], Integer.parseInt(army.getText()));
			player_list[counter].getState().attack(Integer.parseInt(first_territory.getText()), Integer.parseInt(second_territory.getText()), Integer.parseInt(army.getText()), Integer.parseInt(defender_army.getText()));
			player_list[counter].getState().transfer(Integer.parseInt(first_territory.getText()), Integer.parseInt(second_territory.getText()), player_list[counter], Integer.parseInt(army.getText()));
		}
		else
		{
			textArea.setText("Wrong Army Number Or Territory Number");
		}
	}
	
	public String map_color(int color)
	{
		switch(color)
		{
		case 0:
			return "-fx-control-inner-background: red;";
		case 1:
			return "-fx-control-inner-background: blue;";
		case 2:
			return "-fx-control-inner-background: green;";
		case 3:
			return "-fx-control-inner-background: yellow;";
		case 4:
			return "-fx-control-inner-background: brown;";
		case 5:
			return "-fx-control-inner-background: purple;";
		default:
			return "-fx-control-inner-background: white;";
		}
	}
}
