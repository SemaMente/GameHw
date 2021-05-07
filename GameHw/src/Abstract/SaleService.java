package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {
	void sale(Game game, Campaign campaign, User user);

}
