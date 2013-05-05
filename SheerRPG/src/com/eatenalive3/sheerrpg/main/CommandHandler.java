package com.eatenalive3.sheerrpg.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.eatenalive3.sheerrpg.commands.Test;

public abstract class CommandHandler {
	public static boolean execute(CommandSender sender, Command command, String l, String[] args) {
		if (l.equalsIgnoreCase("test"))
			new Test(sender, args);	
		return true;
	}
}
