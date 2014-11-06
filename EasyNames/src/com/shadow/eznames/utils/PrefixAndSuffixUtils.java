package com.shadow.eznames.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PrefixAndSuffixUtils {
	
   String tagColor;
	public static void addUnderscoreBeforeNameTag(Player player, String tag, ChatColor color){
		//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
    		player.setDisplayName(color + tag + ChatColor.WHITE + "_" + player.getName());
    		//}else{
    			
    		//}
    		//if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
    	    player.setCustomName(color + tag + ChatColor.WHITE + "_" + player.getName());
    	//}else{
    		//player.setCustomName(color + tag + ChatColor.WHITE + "_" + player.getCustomName());
    //	}
    	    
    	    player.setCustomNameVisible(true);
    	}
   
	public static void addUnderScoreAfterNameTag(Player player, String tag, ChatColor color){
		//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
    		player.setDisplayName( player.getName()  + "_" + color + tag + ChatColor.WHITE);
    		//}else{
    		//	player.setDisplayName( player.getDisplayName()  + "_" + color + tag + ChatColor.WHITE);
    		//}
    		//if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
    	   player.setCustomName( player.getName()   + "_" + color + tag + ChatColor.WHITE);
    	//}else{
    	//	player.setCustomName(player.getCustomName()  + "_" + color + tag + ChatColor.WHITE);
    //	}
    	    
    	    player.setCustomNameVisible(true);
    	}
	
		

   

    public static void addParenthesesBeforeNameTag(Player player, String tag, ChatColor color){
		
    	//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
    		player.setDisplayName("(" + color + tag + ChatColor.WHITE + ")" + player.getName());
    	//	}else{
    			//player.setDisplayName("(" + color + tag + ChatColor.WHITE + ")" + player.getDisplayName());
    	//	}
    	//	if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
    	    player.setCustomName("(" + color + tag + ChatColor.WHITE + ")" + player.getName());
    	//}else{
    	//	player.setCustomName("(" + color + tag + ChatColor.WHITE + ")" + player.getCustomName());
    	//}
    	    
    	    player.setCustomNameVisible(true);
    	}
    
	
  
    public static void addParenthesesAfterNameTag(Player player, String tag, ChatColor color){
    	//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
    		player.setDisplayName( player.getName()  + "(" + color + tag + ChatColor.WHITE + ")" );
    		//}else{
    			//player.setDisplayName( player.getDisplayName()  + "(" + color + tag + ChatColor.WHITE + ")" );
    		//}
    		//if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
    	    player.setCustomName( player.getName()   + "(" + color + tag + ChatColor.WHITE + ")" );
    	//}else{
    	//	player.setCustomName(player.getCustomName()  + "(" + color + tag + ChatColor.WHITE + ")" );
    //	}
    	    
    	    player.setCustomNameVisible(true);
    	}
	
    public static void addBracketsBeforeNameTag(Player player, String tag, ChatColor color){
    	//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
    		player.setDisplayName("[" + color + tag + ChatColor.WHITE + "]" + player.getName());
    	//	}else{
    			//player.setDisplayName("[" + color + tag + ChatColor.WHITE + "]" + player.getDisplayName());
    		//}
    		//if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
    	    //player.setCustomName("[" + color + tag + ChatColor.WHITE + "]" + player.getName());
    	//}else{
    		player.setCustomName("[" + color + tag + ChatColor.WHITE + "]" + player.getCustomName());
    	//}
    	    
        player.setCustomNameVisible(true);
    	}
    
	
    public static void addBracketsAfterNameTag(Player player, String tag, ChatColor color){
    	//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
    		player.setDisplayName( player.getName()  + "[" + color + tag + ChatColor.WHITE + "]" );
    		//}else{
    			//player.setDisplayName( player.getDisplayName()  + "[" + color + tag + ChatColor.WHITE + "]" );
    		//}
    		//if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
    	    player.setCustomName( player.getName()   + "[" + color + tag + ChatColor.WHITE + "]" );
    	//}else{
    		//player.setCustomName(player.getCustomName()  + "[" + color + tag + ChatColor.WHITE + "]" );
    	//}
    	    
    	    player.setCustomNameVisible(true);
    	}
	
 public static void addCurlyBracketsBeforeNameTag(Player player, String tag, ChatColor color){
		//if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
		player.setDisplayName("{" + color + tag + ChatColor.WHITE + "}" + player.getName());
		//}else{
			//player.setDisplayName("{" + color + tag + ChatColor.WHITE + "}" + player.getDisplayName());
	//	}
	//	if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
	    player.setCustomName("{" + color + tag + ChatColor.WHITE + "}" + player.getName());
	//}else{
		//player.setCustomName("{" + color + tag + ChatColor.WHITE + "}" + player.getCustomName());
	//}
	    
	    player.setCustomNameVisible(true);
	}
 public static void addCurlyBracketsAfterNameTag(Player player, String tag, ChatColor color){
	 //if(player.getDisplayName().equals(ChatColor.WHITE + player.getName())){
			player.setDisplayName( player.getName() + "{" + color + tag + ChatColor.WHITE + "}" );
		//	}else{
				//player.setDisplayName( player.getDisplayName() + "{" + color + tag + ChatColor.WHITE + "}" );
			//}
			//if(player.getCustomName().equals(ChatColor.WHITE + player.getName())){
		    player.setCustomName(player.getName() + "{" + color + tag + ChatColor.WHITE + "}" );
		//}else{
			//player.setCustomName( player.getCustomName()  + "{" + color + tag + ChatColor.WHITE + "}" );
		//}
		    
		    player.setCustomNameVisible(true);
		}
	}
	


