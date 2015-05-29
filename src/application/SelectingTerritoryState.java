public class SelectingTerritoryState implements GameState {

	MapController controller;
	public SelectingTerritoryState(MapController new_controller)
	{
		controller = new_controller;
	}
	
	@Override
	public void select(int territory, Player owner) {
		if (controller.map_list[territory].getOwner() == null)
		{
			controller.map_list[territory].setOwner(owner);
			controller.map_list[territory].setArmy(1);
			controller.textFieldArray[territory].setText("1");
			controller.textFieldArray[territory].setStyle(controller.map_color(owner.getColor()));
			owner.setDeployedArmy(owner.getDeployedArmy() - 1);
			owner.setOwned_territory(1);
		}
		else
		{
			controller.textArea.setText("Territory has a owner");
		}
	}

	@Override
	public void deploy(int territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int first_territory, int second_territory, Player owner,
			int army, int defender_army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int first_territory, int second_territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}
}
