package me.intronate67.ServerCompass;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerCompassMain extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public int version = (int) 1.0;
	public String author = "intronate67";
	
	@Override
	public void onEnable(){
		getLogger().info("ServerCompass" + version + " has been enabled!");
		if(!new File(this.getDataFolder(), "config.yml").exists()){
			this.saveDefaultConfig();
		}
		
	}
	@Override
	public void onDisable(){
		getLogger().info("ServerCompass" + version + " has been disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args){
		Player player = (Player) sender;

		return false;
	}
}
