package io.github.anksharskarp.minecraftmanhunt.listeners;

import io.github.anksharskarp.minecraftmanhunt.MinecraftManhunt;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public class RespawnListener implements Listener {
    private MinecraftManhunt plugin;

    public RespawnListener(MinecraftManhunt plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void PlayerRespawn(PlayerRespawnEvent event) {
        Player p = event.getPlayer();
        p.getInventory().addItem(new ItemStack(Material.COMPASS));
    }
}
