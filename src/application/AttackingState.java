import java.util.Arrays;

public class AttackingState implements GameState{

	MapController controller;
	
	public AttackingState(MapController new_controller)
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
	public void attack(int first_territory, int second_territory,
			int army, int defender_army) {
		if (controller.map[first_territory][second_territory] == 1)
		{
			if (controller.map_list[second_territory].getOwner().getNumber() != controller.map_list[first_territory].getOwner().getNumber())
			{
				if (controller.map_list[second_territory].getOwner().getNumber() >= defender_army)
				{
					Dice dice = new Dice(6);
					int[] attacking_rolls = new int[army];
					int[] defending_rolls = new int[defender_army];
					
					for (int i = 0; i < army; i++)
					{
						attacking_rolls[i] = dice.roll();
						controller.attackingDiceArray[i].setText(Integer.toString(attacking_rolls[i]));
					}
					
					for (int i = 0; i < defender_army; i++)
					{
						defending_rolls[i] = dice.roll();
						controller.defenderDiceArray[i].setText(Integer.toString(defending_rolls[i]));
					}
					
					Arrays.sort(attacking_rolls);
					Arrays.sort(defending_rolls);
					
					int attacker_won = 0;
					int defender_won = 0;
					int attacking_rols_lenght = attacking_rolls.length;
					
					for (int i = defending_rolls.length - 1 ; i > 0; i--)
					{
						if (attacking_rolls[attacking_rols_lenght - 1] > defending_rolls[i])
						{
							attacker_won++;
						}
						else
						{
							defender_won++;
						}
						attacking_rols_lenght--;
						if (attacking_rols_lenght < 0)
						{
							break;
						}
					}
					
					controller.map_list[first_territory].setArmy(controller.map_list[first_territory].getArmy() + (attacker_won - defender_won));
					
					if ((attacker_won - defender_won) > 0)
					{
						controller.map_list[second_territory].setArmy(controller.map_list[second_territory].getArmy() - (attacker_won - defender_won));
					}
				}
			}
		}
		
	}

	@Override
	public void transfer(int first_territory, int second_territory, Player owner, int army) {
		// TODO Auto-generated method stub
		
	}

}
