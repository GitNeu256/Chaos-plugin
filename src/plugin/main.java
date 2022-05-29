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
	public int fx, fy, tx, ty;

	@Override
	public void registerClientCommands(CommandHandler handler) {
		handler.<Player>register("chaos", "Started chaos", (args, player) -> {
			UnitType flare = Vars.content.units().find(b -> b.name.equals("flare"));
			UnitType toxopid = Vars.content.units().find(b -> b.name.equals("toxopid"));
			UnitType antumbra = Vars.content.units().find(b -> b.name.equals("antumbra"));
			UnitType crawler = Vars.content.units().find(b -> b.name.equals("crawler"))
			UnitType zenith = Vars.content.units().find(b -> b.name.equals("zenith"))

			for (int i = 0; i < 200; i++) {
				cx = (int)(Math.random()*Vars.world.width()*10);
				cy = (int)(Math.random()*Vars.world.height()*10);
				crawler.spawn(Team.crux, cx, cy);
			}

			for (int i = 0; i < 50; i++) {
				fx = (int)(Math.random()*Vars.world.width()*10);
				fy = (int)(Math.random()*Vars.world.height()*10);
				zx = (int)(Math.random()*Vars.world.width()*10);
				zy = (int)(Math.random()*Vars.world.height()*10);
				flare.spawn(Team.crux, zx, zy);
				zenith.spawn(Team.crux, )
			}

			for (int i = 0; i < 20; i++) {
				ax = (int)(Math.random()*Vars.world.width()*10);
				ay = (int)(Math.random()*Vars.world.height()*10);
				antumbra.spawn(Team.crux, ax, ay);
			}

			for (int i = 0; i < 10; i++) {
				tx = (int)(Math.random()*Vars.world.width()*10);
				ty = (int)(Math.random()*Vars.world.height()*10);
				toxopid.spawn(Team.crux, tx, ty);
			}
		});
	}
}
