package com.shadow.eznames;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.shadow.eznames.commands.EasyCommands;
import com.shadow.eznames.handlers.HandlerThingy;

public class EasyNames extends JavaPlugin{

	@Override
	public void onEnable(){
		
		getCommand("ez").setExecutor(new EasyCommands());
		getServer().getPluginManager().registerEvents(new HandlerThingy(), this);
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
	
}
