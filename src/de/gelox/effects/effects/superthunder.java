package de.gelox.effects.effects;

import de.gelox.effects.MainC;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
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

        if(!(args.length == 1)) {
            cs.sendMessage(plugin.getPrefix() + "/superthunder");
        }
        return true;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {

        if(plugin.getConfig().getBoolean("superthunder")) {

            Player p = e.getPlayer();
            Location loc = p.getLocation();

            String w = loc.getWorld().getName();

            Bukkit.getWorld(w).strikeLightningEffect(loc);

            Bukkit.getWorld(w).setTime(16000);


            Location location = new Location(p.getWorld(), 0, 0, 0); // New Location in the right World you want

            location.setX( location.getX() + Math.random() * 100 * 2 - 534); // This get a Random with a MaxRange
            location.setZ( location.getZ() + Math.random() * 323 * 2 - 234);

            location.setY( p.getWorld().getHighestBlockAt(location.getBlockX(), location.getBlockZ() ).getY() ); // Get the Highest Block of the Location for Save Spawn.

        }
    }
}


















