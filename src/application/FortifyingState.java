
public class FortifyingState implements GameState {

	MapController controller;
	public FortifyingState(MapController new_controller)
	{
		controller = new_controller;
	}
	
	@Override
	public void select(int territory, Player owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fortify(int territory, Player owner, int army) {
		if (controller.map_list[territory].getOwner() == owner)
		{
			if (owner.getDeployedArmy() != 0)
			{
				controller.map_list[territory].setArmy(controller.map_list[territory].getArmy() + army);
				owner.setDeployedArmy(owner.getDeployedArmy() - army);
				if (owner.getDeployedArmy() == 0)
				{
					owner.setState(new AttackingState(controller));
				}
			}
		}
		else 
		{
			controller.textArea.setText("This territory is not your territory");
		}
		
	}

	@Override
	public void attack(Territory first_territory, Territory second_territory,
			int army) {
		// TODO Auto-generated method stub
		
	}


}
