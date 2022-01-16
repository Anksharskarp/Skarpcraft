package io.github.anksharskarp.minecraftmanhunt.commands;

import io.github.anksharskarp.minecraftmanhunt.MinecraftManhunt;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HunterCommand implements CommandExecutor {

    private MinecraftManhunt plugin;

    public HunterCommand(MinecraftManhunt plugin) {
        this.plugin = plugin;
        plugin.getCommand("manhunt").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        /*
        Command: /manhunt PLAYER_NAME
         */

        this.plugin.hunted = args[0];

        return true;
    }
}
