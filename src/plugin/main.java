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
import java.lang.*;

public class main extends Plugin {
	@Override
	public void registerClientCommands(CommandHandler handler) {
		handler.<Player>register("chaos", "Started chaos", (args, player) -> {
			UnitType flare = Vars.content.units().find(b -> b.name.equals("flare"));
			UnitType toxopid = Vars.content.units().find(b -> b.name.equals("toxopid"));
			for (int i = 0; i < 10; i++) {
				flare.spawn(Team.crux, (int)(Math.random()*Vars.world.width()*10, (int)(Math.random()*Vars.world.height())*10));
				toxopid.spawn(Team.crux, (int)(Math.random()*Vars.world.width())*10, (int)(Math.random()*Vars.world.height()*10));
			}
		});
	}
}
