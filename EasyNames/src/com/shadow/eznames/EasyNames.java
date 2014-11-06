package com.shadow.eznames;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.shadow.eznames.commands.EasyCommands;

public class EasyNames extends JavaPlugin implements Listener{

	@Override
	public void onEnable(){
		
		getCommand("ez").setExecutor(new EasyCommands());
		getServer().getPluginManager().registerEvents(this, this);
		System.out.println("EasyNames beta enabled!");
		File config = new File(getDataFolder(), File.separator + "config.yml");
		
		if(!config.exists()){
			
			
			getConfig().options().copyDefaults(true);
			saveConfig();
		}
	}
	@Override
	public void onDisable(){
		System.out.println("EasyNames disabled");
	}
	@EventHandler
	public void joinEvent(PlayerJoinEvent e){
		Player player = e.getPlayer();
		player.sendMessage(ChatColor.GREEN + "Hey you! Do /ez help to view E-Z Names commands!");
	}
	
}
