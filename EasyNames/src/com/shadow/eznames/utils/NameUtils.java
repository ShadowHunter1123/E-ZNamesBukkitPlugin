package com.shadow.eznames.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class NameUtils {

	public static void changePlayerName(Player player, String newName){
		player.setDisplayName(newName);
		player.setCustomName(newName);
		player.setCustomNameVisible(true);
	}
	public static void changeItemInPlayerHandName(Player player, String name){
	     ItemStack is = player.getItemInHand();
	     ItemMeta im = is.getItemMeta();
	    im.setDisplayName(name);
	    is.setItemMeta(im);
	     
	}
	public static void changeItemName(ItemStack is, String name){
	    
	     ItemMeta im = is.getItemMeta();
	    im.setDisplayName(name);
	    is.setItemMeta(im);
	     
	}
	public static void reset(Player player){
		player.setDisplayName(player.getName());
	   player.setCustomName(player.getName());
	player.setCustomNameVisible(true);
	}
	
	
}
