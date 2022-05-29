package plugin;

import arc.util.*;
import arc.*;
import arc.graphics.*;

import mindustry.mod.*;
import mindustry.Vars;
import mindustry.gen.*;
import mindustry.game.*;
import mindustry.net.*;
import mindustry.game.EventType.*;
import mindustry.content.*;
import mindustry.type.*;
import mindustry.entities.*;

import java.util.*;

public class main extends Plugin {
	public int score;

	@Override
	public void registerClientCommands(CommandHandler handler) {
		handler.<Player>register("chaos", "Started chaos", (args, player) -> {
			UnitType flare = Vars.content.units().find(b -> b.name.equals("flare"));
			if (score < 10){
				flare.spawn(Team.crux, player.x * 2 - player.x, player.y * 21.5 - player.y);
				score++;
			}
			score = 0;
		});
	}
}
