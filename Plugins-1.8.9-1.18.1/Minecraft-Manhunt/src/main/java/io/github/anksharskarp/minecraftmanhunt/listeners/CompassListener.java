package io.github.anksharskarp.minecraftmanhunt.listeners;

import io.github.anksharskarp.minecraftmanhunt.MinecraftManhunt;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class CompassListener implements Listener {
    private MinecraftManhunt plugin;

    public CompassListener(MinecraftManhunt plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void CompassClick(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        Material held = event.getItem().getType();
        Action act = event.getAction();

        if((!(p.getName().equals(this.plugin.hunted)) && held == Material.COMPASS && (act == Action.RIGHT_CLICK_AIR || act == Action.RIGHT_CLICK_BLOCK))) {
            //Creates a new player instance from the name of the hunted player
            Player target = p.getServer().getPlayer(this.plugin.hunted);
            //Sets the target of the compass to the player's location
            p.setCompassTarget(target.getLocation());
            p.sendMessage("You are tracking " + this.plugin.hunted);
        }
    }
}
