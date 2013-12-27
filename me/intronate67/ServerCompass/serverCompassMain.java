package me.intronate67.ServerCompass;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerCompassMain extends JavaPlugin implements Listener{
	
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
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onLogin(PlayerLoginEvent event){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args){
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("getcompass")){
			if(player.getInventory().contains(Material.COMPASS)){
				player.sendMessage(ChatColor.RED + "You already have the compass.");
			}else{
				getServer().dispatchCommand(getServer().getConsoleSender(), "give " + sender + "345 1 1");
			}
		}
		return false;
	}
}
