package abl.actions;

import game.Bot;
import game.GameEngine;

import java.awt.Color;
import java.awt.Point;
/**
 * Sets color of the chaser. 
 */
public class SetColor extends BaseAction {

	/**
	 * Sets color of the bot.
	 * args[0] - int red
	 * args[1] - int blue
	 * args[2] - int green
	 * args[3] - int id
	 */
	public void execute(Object[] args) {
		for(Bot b:GameEngine.getInstance().getBots()) {
			if(b.getId() == (Integer)args[3]) {
				Color botColor = b.getColor();
				b.setColor(new Color((botColor.getRed()+1)%255, (botColor.getGreen()+1)%255, (botColor.getBlue()+1)%255));
			}
		}
	}
}
