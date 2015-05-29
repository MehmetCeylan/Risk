
public class DeployingState implements GameState {

	MapController controller;
	public DeployingState(MapController new_controller)
	{
		controller = new_controller;
	}
	
	@Override
	public void select(int territory, Player owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deploy(int territory, Player owner, int army) {
		if (controller.map_list[territory].getOwner().getNumber() == owner.getNumber())
		{
			if (owner.getDeployedArmy() != 0)
			{
				controller.map_list[territory].setArmy(controller.map_list[territory].getArmy() + army);
				controller.textFieldArray[territory].setText(Integer.toString(controller.map_list[territory].getArmy()));
				owner.setDeployedArmy(owner.getDeployedArmy() - army);
			}
			else
			{
				controller.textArea.setText("Player finished deployed armies. Pls end state");
			}
		}
		else 
		{
			controller.textArea.setText("This territory is not your territory");
		}
		
	}

	@Override
	public void attack(int first_territory, int second_territory,
			int army, int defender_army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int first_territory, int second_territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}


}
