package com.shadow.eznames.handlers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.shadow.eznames.utils.NameUtils;

public class HandlerThingy implements Listener{

	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		Player player = event.getPlayer();
		if(!player.hasPlayedBefore()){
			
		}
		else{
			if(!player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
				NameUtils.reset(player);
			}
		}
	}
}
