package de.gelox.effects.effects;

import de.gelox.effects.MainC;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Created by Marco_2 on 18.10.2014.
 */
public class superthunder implements Listener, CommandExecutor {


    public MainC plugin;

    public superthunder(MainC plugin) {
        this.plugin = plugin;
    }


    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        return true;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {

        Player p = e.getPlayer();
        Location loc = p.getLocation();

        String w = p.getWorld().getName();



    }
}
