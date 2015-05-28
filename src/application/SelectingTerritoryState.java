public class SelectingTerritoryState implements GameState {

	MapController controller;
	public SelectingTerritoryState(MapController new_controller)
	{
		controller = new_controller;
	}
	
	@Override
	public void select(int territory, Player owner) {
		if (controller.ownerCheck())
		{
			owner.setState(new FortifyingState(controller));
		}
		else if (controller.map_list[territory].getOwner() == null)
		{
			controller.map_list[territory].setOwner(owner);
			controller.map_list[territory].setArmy(1);
			controller.textFieldArray[territory].setText("1");
			controller.textFieldArray[territory].setStyle(controller.map_color(owner.getColor()));
			owner.setDeployedArmy(owner.getDeployedArmy() - 1);
			if (controller.ownerCheck())
			{
				owner.setState(new FortifyingState(controller));
			}
		}
		else
		{
			controller.textArea.setText("Territory has a owner");
		}
	}

	@Override
	public void fortify(int territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Territory first_territory, Territory second_territory,
			int army) {
		// TODO Auto-generated method stub
		
	}
}
