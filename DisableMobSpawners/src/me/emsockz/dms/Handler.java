package me.emsockz.dms;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SpawnerSpawnEvent;

public class Handler implements Listener {

	@EventHandler
	public static void onSpawn(SpawnerSpawnEvent e) {
		e.setCancelled(true);
	}
	
}
