package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Campaign campaign, User user) {
		System.out.print("The user named " + user.getFirstName() + " bought the game named " + game.getGameName()
				+ "for" + game.getGamePrice() + "units with a " + campaign.getCampaignName() + " campaign");
	}

}
