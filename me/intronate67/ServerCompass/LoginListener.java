package me.intronate67.ServerCompass;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LoginListener extends JavaPlugin implements Listener {
	private Player sender;
	public LoginListener(ServerCompassMain plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	Player player = (Player) sender;
	@EventHandler
	public void normalLogin(PlayerLoginEvent event){
		getServer().dispatchCommand(getServer().getConsoleSender(), "give " + sender + "345 1 1");
	}
}
