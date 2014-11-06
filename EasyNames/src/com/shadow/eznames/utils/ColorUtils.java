package com.shadow.eznames.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ColorUtils {
	
	public static void itemNameColorChange(ChatColor color, ItemStack is){
		
		ItemMeta im = is.getItemMeta();
	
		im.setDisplayName(color + is.getItemMeta().getDisplayName());
	 
	
		is.setItemMeta(im);
	}
	public static void playerNameColorChange(Player player, ChatColor color){
		
		
		if(player.getDisplayName() == null){
			player.setDisplayName(color + player.getName() + ChatColor.WHITE);
		}else{player.setDisplayName(color + player.getDisplayName() + ChatColor.WHITE);}
		
		
			
		   if(player.getCustomName() == null)
			player.setCustomName(color + player.getName());
		   else{player.setCustomName(color + player.getCustomName());}
			player.setCustomNameVisible(true);
			
		}
	}


