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
	@Override
	public void registerClientCommands(CommandHandler handler) {
		handler.<Player>register("chaos", "Started chaos", (args, player) -> {
			UnitType mono = Vars.content.units().find(b -> b.name.equals("mono"));
			mono.spawn(crux.team(), player.x * 3 - player.x, player.y * 3 - player.y);

		});
	}
}
