package me.notmithun.diecommand;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class DieCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Die (Chat Command) Version 1.0 has started.");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "You have been killed.");
            player.setHealth(0.0);
            return true;
        } else {
            this.getLogger().log(Level.SEVERE, "Command Blocks or the Console cannot use this command.");
            return false;
        }
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Die (Chat Command) Version 1.0 has stopped.");
    }
}
