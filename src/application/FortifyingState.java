
public class FortifyingState extends MapController implements GameState {

	@Override
	public void select(int territory, Player owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fortify(int territory, Player owner, int army) {
		if (map_list[territory].getOwner() == owner)
		{
			if (owner.getDeployedArmy() != 0)
			{
				map_list[territory].setArmy(map_list[territory].getArmy() + army);
				owner.setDeployedArmy(owner.getDeployedArmy() - army);
				if (owner.getDeployedArmy() == 0)
				{
					owner.setState(new AttackingState());
				}
			}
		}
		else 
		{
			textArea.setText("This territory is not your territory");
		}
		
	}


}
