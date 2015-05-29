
public class TransferState implements GameState{
	
	MapController controller;
	public TransferState(MapController new_controller)
	{
		controller = new_controller;
	}

	@Override
	public void select(int territory, Player owner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deploy(int territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int first_territory, int second_territory, int army, int defender_army) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(int first_territory, int second_territory, Player owner, int army) {
		if (controller.map_list[second_territory].getOwner().getNumber() == owner.getNumber() && controller.map_list[first_territory].getOwner().getNumber() == owner.getNumber())
		{
			if (controller.map_list[first_territory].getArmy() > 1 && controller.map_list[first_territory].getArmy() > army)
			{
				controller.map_list[second_territory].setArmy(controller.map_list[second_territory].getArmy() + army);
				controller.textFieldArray[second_territory].setText(Integer.toString(controller.map_list[second_territory].getArmy()));
				controller.map_list[first_territory].setArmy(controller.map_list[first_territory].getArmy() - army);
				controller.textFieldArray[first_territory].setText(Integer.toString(controller.map_list[first_territory].getArmy()));
			}
			else
			{
				controller.textArea.setText("First territory army number smaller than 1 or you want to tranfer army number bigger than first territory army");
			}
		}
		else 
		{
			controller.textArea.setText("You can transfer armies on only your territories");
		}// TODO Auto-generated method stub
		
	}

}
