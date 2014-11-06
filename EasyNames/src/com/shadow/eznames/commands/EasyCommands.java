package com.shadow.eznames.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.shadow.eznames.utils.ColorUtils;
import com.shadow.eznames.utils.NameUtils;
import com.shadow.eznames.utils.PrefixAndSuffixUtils;

public class EasyCommands implements CommandExecutor{
    //Yes I know there are a lot of easier ways to do this, and a lot of useless crap
	//But I was a nub when I started this
	//and when I got back to finish it was easier to copy and paste
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	String bracketmessage = "Added bracket tag to player ";
	
	String cbracketmessage = "Added curly bracket tag to player ";
	//such if statement much stuff
 
		if(args[0].equalsIgnoreCase("nick")){
		//if(label.equalsIgnoreCase("nick")){
		   if(sender instanceof Player){
		      Player player = (Player)sender;
		   if(args.length > 2){
			   Player target = Bukkit.getPlayer(args[1]);
			if(target != null){
		      if(args.length == 3){
		    	 
		    	  String str = args[2];
		    	  NameUtils.changePlayerName(player, str);
		    	  player.sendMessage("Changed " + target.getName() + "'s name to " + str);
		      }else if(args.length == 4){
		    	  String str = args[2];
		    	  String str2 = args[3];
		    	  NameUtils.changePlayerName(player, str + " " + str2);
		    	  player.sendMessage("Changed " + target.getName() + "'s name to " + str + " " + str2);
		      }else if(args.length == 5){
		    	  String str = args[2];
		    	  String str2 = args[3];
		    	  String str3 = args[4];
		    	  NameUtils.changePlayerName(player, str + " " + str2 + " " + str3);
		    	  player.sendMessage("Changed " + target.getName() + "'s name to " + str + " " + str2 + " " + str3);
		      }
		      }else{
		    	  player.sendMessage("Target not found.");
		      }
		   }
		      else{
		    	  player.sendMessage(ChatColor.RED + "Not enough or too many args");
		      }
		   
		   
		   }
		 
		}
		if(args[0].equalsIgnoreCase("colorName")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				if(player.hasPermission("ez.colorname")){
				if(args.length > 2){
					Player target = Bukkit.getPlayer(args[1]);
					if(target != null){
						if(args.length == 3){
							if(args[2].equalsIgnoreCase("green")){
						       ColorUtils.playerNameColorChange(target, ChatColor.GREEN);
							   player.sendMessage("Set target's name color to green.");
						}
							else if(args[2].equalsIgnoreCase("gold")){
							       ColorUtils.playerNameColorChange(target, ChatColor.GOLD);
								   player.sendMessage("Set target's name color to gold.");
							}
							else if(args[2].equalsIgnoreCase("black")){
								ColorUtils.playerNameColorChange(target, ChatColor.BLACK);
								   player.sendMessage("Set target's name color to black.");
							}
							else if(args[2].equalsIgnoreCase("blue")){
								ColorUtils.playerNameColorChange(target, ChatColor.BLUE);
								   player.sendMessage("Set target's name color to blue.");
							}
							else if(args[2].equalsIgnoreCase("italic")){
								ColorUtils.playerNameColorChange(target, ChatColor.ITALIC);
								   player.sendMessage("Set target's name font to italic.");
							}
							else if(args[2].equalsIgnoreCase("red")){
								ColorUtils.playerNameColorChange(target, ChatColor.RED);
								   player.sendMessage("Set target's name color to red.");
							}
							else if(args[2].equalsIgnoreCase("bold")){
								ColorUtils.playerNameColorChange(target, ChatColor.BOLD);
								   player.sendMessage("Set target's name font to bold.");
							}else if(args[2].equalsIgnoreCase("yellow")){
							       ColorUtils.playerNameColorChange(target, ChatColor.YELLOW);
								   player.sendMessage("Set target's name color to yellow.");
							}
							else if(args[2].equalsIgnoreCase("dred")){
								ColorUtils.playerNameColorChange(target, ChatColor.DARK_RED);
								   player.sendMessage("Set target's name color to dark red.");
							}
							else if(args[2].equalsIgnoreCase("gray")){
								ColorUtils.playerNameColorChange(target, ChatColor.GRAY);
								   player.sendMessage("Set target's name color to gray.");
							}
							else if(args[2].equalsIgnoreCase("dpurple")){
								ColorUtils.playerNameColorChange(target, ChatColor.DARK_PURPLE);
								   player.sendMessage("Set target's name color to dark purple.");
							}
							else if(args[2].equalsIgnoreCase("dgreen")){
								ColorUtils.playerNameColorChange(target, ChatColor.DARK_GREEN);
								   player.sendMessage("Set target's name color to dark green.");
							}
							else if(args[2].equalsIgnoreCase("dblue")){
								ColorUtils.playerNameColorChange(target, ChatColor.DARK_BLUE);
								   player.sendMessage("Set target's name color to dark blue.");
							}
							else if(args[2].equalsIgnoreCase("magic")){
							       ColorUtils.playerNameColorChange(target, ChatColor.MAGIC);
								   player.sendMessage("Set target's name color to magic.");
							}
							else if(args[2].equalsIgnoreCase("purple")){
								ColorUtils.playerNameColorChange(target, ChatColor.LIGHT_PURPLE);
								   player.sendMessage("Set target's name color to black.");
							}
							else if(args[2].equalsIgnoreCase("aqua")){
								ColorUtils.playerNameColorChange(target, ChatColor.AQUA);
								   player.sendMessage("Set target's name color to blue.");
							}
							else if(args[2].equalsIgnoreCase("daqua")){
								ColorUtils.playerNameColorChange(target, ChatColor.DARK_AQUA);
								   player.sendMessage("Set target's name font to italic.");
							}
							else if(args[2].equalsIgnoreCase("strikethrough")){
								ColorUtils.playerNameColorChange(target, ChatColor.STRIKETHROUGH);
								   player.sendMessage("Set target's name color to red.");
							}
							else if(args[2].equalsIgnoreCase("underline")){
								ColorUtils.playerNameColorChange(target, ChatColor.UNDERLINE);
								player.sendMessage("Underlined " + target.getName() + "'s name.");
							}
							else if(args[2].equalsIgnoreCase("reset")){
								ColorUtils.playerNameColorChange(target, ChatColor.RESET);
								player.sendMessage("Set target's name color to reset.");
							}
							}
						
					}else{
						player.sendMessage("Target not found.");
					}
				}
				}
			}
		}
		try{
		if(args[0].equalsIgnoreCase("tag") || args[0].equalsIgnoreCase("t")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				if(player.hasPermission("ez.tag")){
				if(args.length > 2){
				  if(args[1].equalsIgnoreCase("underscore") || args[0].equalsIgnoreCase("us") ||  args[2].equalsIgnoreCase("scoreunder") || args[2].equalsIgnoreCase("under") || args[2].equalsIgnoreCase("uns")){
					if(args.length > 3){
						if(args[2].equalsIgnoreCase("pre") || args[2].equalsIgnoreCase("before") || args[2].equalsIgnoreCase("prefix") || args[2].equalsIgnoreCase("prfx") || args[2].equalsIgnoreCase("pf")){
							Player target = Bukkit.getPlayer(args[3]);
							String str = args[4];
							if(target == null){player.sendMessage("Target not found.");}
							else if(target != null){
							if(args[5].equalsIgnoreCase("green")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.GREEN);
								player.sendMessage("Added green underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("aqua")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.AQUA);
								player.sendMessage("Added aqua underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("gold")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.GOLD);
								player.sendMessage("Added gold underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("red")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.RED);
								player.sendMessage("Added red underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("blue")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.BLUE);
								player.sendMessage("Added blue underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("yellow")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.YELLOW);
								player.sendMessage("Added yellow underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dred")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.DARK_RED);
								player.sendMessage("Added dark red underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dgray")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.DARK_GRAY);
								player.sendMessage("Added dark gray underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("magic")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.MAGIC);
								player.sendMessage("Added strikethrough underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("strikethrough")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.STRIKETHROUGH);
								player.sendMessage("Added strikethrough underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("daqua")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.DARK_AQUA);
								player.sendMessage("Added dark aqua underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dgreen")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.DARK_GREEN);
								player.sendMessage("Added dark green underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("black")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.BLACK);
								player.sendMessage("Added black underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dblue")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.DARK_BLUE);
								player.sendMessage("Added dark blue underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("bold")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.BOLD);
								player.sendMessage("Added bold underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("italic")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.ITALIC);
								player.sendMessage("Added italic underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("underline")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.UNDERLINE);
								player.sendMessage("Added underlined underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("gray")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.GRAY);
								player.sendMessage("Added gray underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("purple")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.LIGHT_PURPLE);
								player.sendMessage("Added purple underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dpurple")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.DARK_PURPLE);
								player.sendMessage("Added dark purple underscore tag to player " + target.getName());
							}
							else if(args[5].equalsIgnoreCase("reset")){
								PrefixAndSuffixUtils.addUnderscoreBeforeNameTag(target, str, ChatColor.RESET);
								player.sendMessage("Added reset underscore tag to player " + target.getName());
							}else{
								System.out.println("Error with command. Did you mistype?");
							}
							
						}	
					}
					
						else if(args[2].equalsIgnoreCase("post") || args[2].equalsIgnoreCase("after") || args[2].equalsIgnoreCase("suffix") || args[2].equalsIgnoreCase("suff") || args[2].equalsIgnoreCase("a")){
							Player target = Bukkit.getPlayer(args[3]);
							String str = args[4];
							
							if(target != null && args[5] != null){
								if(args[5].equalsIgnoreCase("green")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.GREEN);
									player.sendMessage("Added green underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("gold")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.GOLD);
									player.sendMessage("Added gold underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("blue")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.BLUE);
									player.sendMessage("Added blue underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("red")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.RED);
									player.sendMessage("Added red underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("black")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.BLACK);
									player.sendMessage("Added black underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("aqua")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.AQUA);
									player.sendMessage("Added aqua underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dblue")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.DARK_BLUE);
									player.sendMessage("Added dark blue underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("daqua")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.DARK_AQUA);
									player.sendMessage("Added dark aqua underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dgreen")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.DARK_GREEN);
									player.sendMessage("Added dark green underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dgray")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.DARK_GRAY);
									player.sendMessage("Added dark gray underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dpurple")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.DARK_PURPLE);
									player.sendMessage("Added dark purple underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dred")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.DARK_RED);
									player.sendMessage("Added dark red underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("magic")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.MAGIC);
									player.sendMessage("Added aqua underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("italic")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.ITALIC);
									player.sendMessage("Added italic underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("purple")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.LIGHT_PURPLE);
									player.sendMessage("Added purple underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("gray")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.GRAY);
									player.sendMessage("Added gray underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("bold")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.BOLD);
									player.sendMessage("Added bold underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("reset")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.RESET);
									player.sendMessage("Added reset underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("strikethrough")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.STRIKETHROUGH);
									player.sendMessage("Added strikethrough underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("underline")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.UNDERLINE);
									player.sendMessage("Added underlined underscore tag to player " + target.getName());
								}
								else if(args[5].equalsIgnoreCase("yellow")){
									PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.YELLOW);
									player.sendMessage("Added yellow underscore tag to player " + target.getName());
								}else{}
							}else{
								PrefixAndSuffixUtils.addUnderScoreAfterNameTag(target, str, ChatColor.WHITE);
								player.sendMessage("Added underscore tag to player " + target.getName());
							}
							
							
							
						}
				  }
				}else if (args[1].equalsIgnoreCase("brackets") || args[1].equalsIgnoreCase("brack") || args[1].equalsIgnoreCase("brck") || args[1].equalsIgnoreCase("[]")){
			
				 if(args[2].equalsIgnoreCase("post") || args[2].equalsIgnoreCase("after") || args[2].equalsIgnoreCase("suffix") || args[2].equalsIgnoreCase("suff") || args[2].equalsIgnoreCase("a")){
					Player target = Bukkit.getPlayer(args[3]);
					String str = args[4];
					
					if(target != null && args[5] != null){
						if(args[5].equalsIgnoreCase("green")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.GREEN);
							player.sendMessage(bracketmessage + target.getName());
						}
						else if(args[5].equalsIgnoreCase("gold")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.GOLD);
							player.sendMessage("Added gold bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("blue")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.BLUE);
							player.sendMessage("Added blue bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("red")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.RED);
							player.sendMessage("Added red bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("black")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.BLACK);
							player.sendMessage("Added black bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("aqua")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.AQUA);
							player.sendMessage("Added aqua bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dblue")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.DARK_BLUE);
							player.sendMessage("Added dark blue bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("daqua")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.DARK_AQUA);
							player.sendMessage("Added dark aqua bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dgreen")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.DARK_GREEN);
							player.sendMessage("Added dark green bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dgray")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.DARK_GRAY);
							player.sendMessage("Added dark gray bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dpurple")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.DARK_PURPLE);
							player.sendMessage("Added dark purple bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dred")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.DARK_RED);
							player.sendMessage("Added dark red bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("magic")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.MAGIC);
							player.sendMessage("Added magic bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("italic")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.ITALIC);
							player.sendMessage("Added italic bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("purple")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.LIGHT_PURPLE);
							player.sendMessage("Added purple bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("gray")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.GRAY);
							player.sendMessage("Added gray bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("bold")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.BOLD);
							player.sendMessage("Added bold bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("reset")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.RESET);
							player.sendMessage("Added reset bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("strikethrough")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.STRIKETHROUGH);
							player.sendMessage("Added strikethrough bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("underline")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.UNDERLINE);
							player.sendMessage("Added underlined bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("yellow")){
							PrefixAndSuffixUtils.addBracketsAfterNameTag(target, str, ChatColor.YELLOW);
							player.sendMessage("Added yellow bracket tag to player " + target.getName());
						}else{}
					}
				 }else if(args[2].equalsIgnoreCase("pre") || args[2].equalsIgnoreCase("before") || args[2].equalsIgnoreCase("prefix") || args[2].equalsIgnoreCase("prfx") || args[2].equalsIgnoreCase("pf")){
						Player target = Bukkit.getPlayer(args[3]);
						String str = args[4];
						if(target == null){player.sendMessage("Target not found.");}
						else if(args[5] != null && target != null){
						if(args[5].equalsIgnoreCase("green")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.GREEN);
							player.sendMessage("Added green bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("aqua")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.AQUA);
							player.sendMessage("Added aqua bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("gold")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.GOLD);
							player.sendMessage("Added gold bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("red")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.RED);
							player.sendMessage("Added red bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("blue")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.BLUE);
							player.sendMessage("Added blue bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("yellow")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.YELLOW);
							player.sendMessage("Added yellow bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dred")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.DARK_RED);
							player.sendMessage("Added dark red bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dgray")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.DARK_GRAY);
							player.sendMessage("Added dark gray bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("magic")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.MAGIC);
							player.sendMessage("Added strikethrough bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("strikethrough")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.STRIKETHROUGH);
							player.sendMessage("Added strikethrough bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("daqua")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.DARK_AQUA);
							player.sendMessage("Added dark aqua bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dgreen")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.DARK_GREEN);
							player.sendMessage("Added dark green bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("black")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.BLACK);
							player.sendMessage("Added black bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dblue")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.DARK_BLUE);
							player.sendMessage("Added dark blue bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("bold")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.BOLD);
							player.sendMessage("Added bold bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("italic")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.ITALIC);
							player.sendMessage("Added italic bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("underline")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.UNDERLINE);
							player.sendMessage("Added underlined bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("gray")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.GRAY);
							player.sendMessage("Added gray bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("purple")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.LIGHT_PURPLE);
							player.sendMessage("Added purple bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dpurple")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.DARK_PURPLE);
							player.sendMessage("Added dark purple bracket tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("reset")){
							PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.RESET);
							player.sendMessage("Added reset bracket tag to player " + target.getName());
						}else{}
						
					}	else{
						PrefixAndSuffixUtils.addBracketsBeforeNameTag(target, str, ChatColor.WHITE);
						player.sendMessage("Added bracket tag to player " + target.getName());
					}
				 }
		}else if (args[1].equalsIgnoreCase("parentheses") || args[1].equalsIgnoreCase("()")|| args[1].equalsIgnoreCase("par")){
			 if(args[2].equalsIgnoreCase("post") || args[2].equalsIgnoreCase("after") || args[2].equalsIgnoreCase("suffix") || args[2].equalsIgnoreCase("suff") || args[2].equalsIgnoreCase("a")){
				Player target = Bukkit.getPlayer(args[3]);
				String str = args[4];
				
				if(target != null && args[5] != null){
					if(args[5].equalsIgnoreCase("green")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.GREEN);
						player.sendMessage("Added green parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("gold")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.GOLD);
						player.sendMessage("Added gold parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("blue")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.BLUE);
						player.sendMessage("Added blue parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("red")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.RED);
						player.sendMessage("Added red parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("black")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.BLACK);
						player.sendMessage("Added black parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("aqua")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.AQUA);
						player.sendMessage("Added aqua parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("dblue")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.DARK_BLUE);
						player.sendMessage("Added dark blue parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("daqua")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.DARK_AQUA);
						player.sendMessage("Added dark aqua parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("dgreen")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.DARK_GREEN);
						player.sendMessage("Added dark green parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("dgray")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.DARK_GRAY);
						player.sendMessage("Added dark gray parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("dpurple")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.DARK_PURPLE);
						player.sendMessage("Added dark purple parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("dred")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.DARK_RED);
						player.sendMessage("Added dark red parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("magic")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.MAGIC);
						player.sendMessage("Added aqua parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("italic")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.ITALIC);
						player.sendMessage("Added italic parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("purple")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.LIGHT_PURPLE);
						player.sendMessage("Added purple parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("gray")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.GRAY);
						player.sendMessage("Added gray parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("bold")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.BOLD);
						player.sendMessage("Added bold parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("reset")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.RESET);
						player.sendMessage("Added reset parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("strikethrough")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.STRIKETHROUGH);
						player.sendMessage("Added strikethrough parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("underline")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.UNDERLINE);
						player.sendMessage("Added underlined parentheses tag to player " + target.getName());
					}
					else if(args[5].equalsIgnoreCase("yellow")){
						PrefixAndSuffixUtils.addParenthesesAfterNameTag(target, str, ChatColor.YELLOW);
						player.sendMessage("Added yellow parentheses tag to player " + target.getName());
					}else{}
				}
				}else if(args[2].equalsIgnoreCase("pre") || args[2].equalsIgnoreCase("before") || args[2].equalsIgnoreCase("prefix") || args[2].equalsIgnoreCase("prfx") || args[2].equalsIgnoreCase("pf")){
					Player target = Bukkit.getPlayer(args[3]);
					String str = args[4];
					if(target == null){player.sendMessage("Target not found.");}
					else if(target != null){
						if(args[5].equalsIgnoreCase("green")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.GREEN);
							player.sendMessage("Added green parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("gold")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.GOLD);
							player.sendMessage("Added gold parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("blue")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.BLUE);
							player.sendMessage("Added blue parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("red")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.RED);
							player.sendMessage("Added red parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("black")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.BLACK);
							player.sendMessage("Added black parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("aqua")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.AQUA);
							player.sendMessage("Added aqua parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dblue")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.DARK_BLUE);
							player.sendMessage("Added dark blue parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("daqua")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.DARK_AQUA);
							player.sendMessage("Added dark aqua parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dgreen")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.DARK_GREEN);
							player.sendMessage("Added dark green parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dgray")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.DARK_GRAY);
							player.sendMessage("Added dark gray parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dpurple")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.DARK_PURPLE);
							player.sendMessage("Added dark purple parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("dred")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.DARK_RED);
							player.sendMessage("Added dark red parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("magic")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.MAGIC);
							player.sendMessage("Added aqua parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("italic")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.ITALIC);
							player.sendMessage("Added italic parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("purple")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.LIGHT_PURPLE);
							player.sendMessage("Added purple parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("gray")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.GRAY);
							player.sendMessage("Added gray parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("bold")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.BOLD);
							player.sendMessage("Added bold parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("reset")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.RESET);
							player.sendMessage("Added reset parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("strikethrough")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.STRIKETHROUGH);
							player.sendMessage("Added strikethrough parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("underline")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.UNDERLINE);
							player.sendMessage("Added underlined parentheses tag to player " + target.getName());
						}
						else if(args[5].equalsIgnoreCase("yellow")){
							PrefixAndSuffixUtils.addParenthesesBeforeNameTag(target, str, ChatColor.YELLOW);
							player.sendMessage("Added yellow parentheses tag to player " + target.getName());
						}else{}
					
				}	
			 }
			 }else if (args[1].equalsIgnoreCase("curlybrackets") || args[1].equalsIgnoreCase("{}")|| args[1].equalsIgnoreCase("cbrackets") || args[1].equalsIgnoreCase("cb")){
				 if(args[2].equalsIgnoreCase("post") || args[2].equalsIgnoreCase("after") || args[2].equalsIgnoreCase("suffix") || args[2].equalsIgnoreCase("suff") || args[2].equalsIgnoreCase("a")){
						Player target = Bukkit.getPlayer(args[3]);
						String str = args[4];
						
						if(target != null && args[5] != null){
							if(args[5].equalsIgnoreCase("green")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.GREEN);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("gold")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.GOLD);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("blue")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.BLUE);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("red")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.RED);
								player.sendMessage(cbracketmessage+ target.getName());
							}
							else if(args[5].equalsIgnoreCase("black")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.BLACK);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("aqua")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.AQUA);
								player.sendMessage(cbracketmessage+ target.getName());
							}
							else if(args[5].equalsIgnoreCase("dblue")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.DARK_BLUE);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("daqua")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.DARK_AQUA);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dgreen")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.DARK_GREEN);
								player.sendMessage(cbracketmessage+ target.getName());
							}
							else if(args[5].equalsIgnoreCase("dgray")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.DARK_GRAY);
								player.sendMessage(cbracketmessage+ target.getName());
							}
							else if(args[5].equalsIgnoreCase("dpurple")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.DARK_PURPLE);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("dred")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.DARK_RED);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("magic")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.MAGIC);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("italic")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.ITALIC);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("purple")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.LIGHT_PURPLE);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("gray")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.GRAY);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("bold")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.BOLD);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("reset")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.RESET);
								player.sendMessage(cbracketmessage + target.getName());
							}
							else if(args[5].equalsIgnoreCase("strikethrough")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.STRIKETHROUGH);
								player.sendMessage(cbracketmessage+ target.getName());
							}
							else if(args[5].equalsIgnoreCase("underline")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.UNDERLINE);
								player.sendMessage(cbracketmessage+ target.getName());
							}
							else if(args[5].equalsIgnoreCase("yellow")){
								PrefixAndSuffixUtils.addCurlyBracketsAfterNameTag(target, str, ChatColor.YELLOW);
								player.sendMessage(cbracketmessage + target.getName());
							}else{}
						}
						}else if(args[2].equalsIgnoreCase("pre") || args[2].equalsIgnoreCase("before") || args[2].equalsIgnoreCase("prefix") || args[2].equalsIgnoreCase("prfx") || args[2].equalsIgnoreCase("pf")){
							Player target = Bukkit.getPlayer(args[3]);
							String str = args[4];
							if(target == null){player.sendMessage("Target not found.");}
							else if( target != null){
								if(args[5].equalsIgnoreCase("green")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.GREEN);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("gold")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.GOLD);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("blue")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.BLUE);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("red")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.RED);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("black")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.BLACK);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("aqua")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.AQUA);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dblue")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.DARK_BLUE);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("daqua")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.DARK_AQUA);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("dgreen")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.DARK_GREEN);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("dgray")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.DARK_GRAY);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dpurple")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.DARK_PURPLE);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("dred")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.DARK_RED);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("magic")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.MAGIC);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("italic")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.ITALIC);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("purple")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.LIGHT_PURPLE);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("gray")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.GRAY);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("bold")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.BOLD);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("reset")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.RESET);
									player.sendMessage(cbracketmessage+ target.getName());
								}
								else if(args[5].equalsIgnoreCase("strikethrough")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.STRIKETHROUGH);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("underline")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.UNDERLINE);
									player.sendMessage(cbracketmessage + target.getName());
								}
								else if(args[5].equalsIgnoreCase("yellow")){
									PrefixAndSuffixUtils.addCurlyBracketsBeforeNameTag(target, str, ChatColor.YELLOW);
									player.sendMessage(cbracketmessage + target.getName());
								}else{}
							
						}	
					 }
					 }
				}
			}}
		}
		}catch(NullPointerException e){
			System.out.println("Caught command exception.");
		}
		if(args[0].equalsIgnoreCase("reset")){
			if(sender instanceof Player){
				
				Player player = (Player)sender;
				if(player.hasPermission("ez.reset"))
				if(args.length > 1){
					Player target = Bukkit.getPlayer(args[1]);
					if(target != null){
					if(args[1] != null){
			     target.setCustomName(args[1]);
			     target.setDisplayName(args[1]);
			     target.setCustomNameVisible(true);
			     player.sendMessage("Reset " + target.getName() + "'s name.");
					}
				}else{ player.sendMessage("Target not found."); }
				}
			}
		
		
	

	}
		if(args[0].equalsIgnoreCase("nameitem")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				if(player.hasPermission("ez.nameitem")){
				String str = args[1];
				NameUtils.changeItemInPlayerHandName(player, str);
			}
			}
		}
		if(args[0].equalsIgnoreCase("coloritemname")){
			if(sender instanceof Player){
				Player player = (Player)sender;
				if(player.hasPermission("ez.coloritemname")){
			if(args[1].equalsIgnoreCase("green")){
				ColorUtils.itemNameColorChange(ChatColor.GREEN, player.getItemInHand());
			}	
				else if(args[1].equalsIgnoreCase("gold")){
					ColorUtils.itemNameColorChange(ChatColor.GOLD, player.getItemInHand());
				    
				}
				else if(args[1].equalsIgnoreCase("black")){
					ColorUtils.itemNameColorChange(ChatColor.BLACK, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("blue")){
					ColorUtils.itemNameColorChange(ChatColor.BLUE, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("italic")){
					ColorUtils.itemNameColorChange(ChatColor.ITALIC, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("red")){
					ColorUtils.itemNameColorChange(ChatColor.RED, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("bold")){
					ColorUtils.itemNameColorChange(ChatColor.BOLD, player.getItemInHand());
				}else if(args[1].equalsIgnoreCase("yellow")){
					ColorUtils.itemNameColorChange(ChatColor.YELLOW, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("dred")){
					ColorUtils.itemNameColorChange(ChatColor.DARK_RED, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("gray")){
					ColorUtils.itemNameColorChange(ChatColor.GRAY, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("dpurple")){
					ColorUtils.itemNameColorChange(ChatColor.DARK_PURPLE, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("dgreen")){
					ColorUtils.itemNameColorChange(ChatColor.DARK_GREEN, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("dblue")){
					ColorUtils.itemNameColorChange(ChatColor.DARK_BLUE, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("magic")){
					ColorUtils.itemNameColorChange(ChatColor.MAGIC, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("purple")){
					ColorUtils.itemNameColorChange(ChatColor.LIGHT_PURPLE, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("aqua")){
					ColorUtils.itemNameColorChange(ChatColor.AQUA, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("daqua")){
					ColorUtils.itemNameColorChange(ChatColor.DARK_AQUA, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("strikethrough")){
					ColorUtils.itemNameColorChange(ChatColor.STRIKETHROUGH, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("underline")){
					ColorUtils.itemNameColorChange(ChatColor.UNDERLINE, player.getItemInHand());
				}
				else if(args[1].equalsIgnoreCase("reset")){
					ColorUtils.itemNameColorChange(ChatColor.RESET, player.getItemInHand());
				}else{}
			}
			}
			
		}   
			if(args[0].equalsIgnoreCase("help")){
				if(sender instanceof Player){
					Player player = (Player)sender;
					if(player.hasPermission("ez.help")){
					player.sendMessage(ChatColor.GREEN + "Commands: ");
					player.sendMessage(ChatColor.GREEN + "/ez colors << views all color options");
					player.sendMessage(ChatColor.GREEN + "/ez tag {tagtype} {pre/post} {targetplayer} {tag} [color] << will add a tag to player's name");
					player.sendMessage(ChatColor.GREEN + "/ez nick {targetplayer} {nickname} << sets a nickname");
					player.sendMessage(ChatColor.GREEN + "/ez reset {targetplayer} << will reset target player's nickname to their real name.");
					player.sendMessage(ChatColor.GREEN + "/ez colorname {targetplayer} {color} << colors target player's name (may be a bit buggy with nicknames)");
					player.sendMessage(ChatColor.GREEN + "/ez tag {tagtype} {pre/post} {playername} {tag} [color]");
					player.sendMessage(ChatColor.GREEN + "/ez tagtypes << view tagtypes");
					player.sendMessage(ChatColor.GREEN + "/ez nameitem << name the item in your hand");
					player.sendMessage(ChatColor.GREEN + "/ez coloritemname << change the color of the item in your hand");
				}
				}
			}	
			if(args[0].equalsIgnoreCase("colors")){
				if(sender instanceof Player){
					Player player = (Player)sender;
					if(player.hasPermission("ez.colors")){
					player.sendMessage(ChatColor.GREEN + "Colors/Fonts: ");
					player.sendMessage(ChatColor.RED + "red");
					player.sendMessage(ChatColor.BLUE + "blue");
					player.sendMessage(ChatColor.GREEN + "green");
					player.sendMessage(ChatColor.AQUA + "aqua");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "purple");
					player.sendMessage(ChatColor.GOLD + "gold");
					player.sendMessage(ChatColor.YELLOW + "yellow");
					player.sendMessage("Magic: " + ChatColor.MAGIC + "magic");
					player.sendMessage(ChatColor.BLACK + "black");
					player.sendMessage(ChatColor.DARK_RED + "dred");
					player.sendMessage(ChatColor.DARK_BLUE + "dblue");
					player.sendMessage(ChatColor.DARK_AQUA + "daqua");
					player.sendMessage(ChatColor.DARK_GREEN + "dgreen");
					player.sendMessage(ChatColor.GRAY + "gray");
					player.sendMessage(ChatColor.DARK_GRAY + "dgray");
					player.sendMessage(ChatColor.ITALIC + "italic");
					player.sendMessage(ChatColor.BOLD + "bold");
					player.sendMessage(ChatColor.STRIKETHROUGH + "strikethrough");
					player.sendMessage(ChatColor.UNDERLINE + "underline");
					player.sendMessage(ChatColor.RESET + "reset");
				}
				}
			}
			if(args[0].equalsIgnoreCase("tagtypes")){
				if(sender instanceof Player){
					Player player = (Player)sender;
					if(player.hasPermission("ez.tagtypes")){
					player.sendMessage(ChatColor.GREEN + "TagTypes: ");
					player.sendMessage(ChatColor.GREEN + "Underscore _ can be used in command as: underscore, uns, us, scoreunder");
					player.sendMessage(ChatColor.GREEN + "Parentheses() can be used in command as: parentheses, (), par");
					player.sendMessage(ChatColor.GREEN + "Brackets [] can be used in command as: brackets, brck, brack, []");
					player.sendMessage(ChatColor.GREEN + "Curly Brackets {} can be used in command as: curlybrackets, cbrackets, cb, {}");
				}
				}
			}
		
		
		
		
		return false;
			
			}
		}
