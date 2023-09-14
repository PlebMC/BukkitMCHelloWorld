package hello.lone;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Lone extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getLogger().info("HelloPlugin is enabled!");
        getCommand("hello").setExecutor(this);
    }

    @Override
    public void onDisable() {
        getLogger().info("HelloPlugin is disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("hello")) {
            sender.sendMessage("Hello World!");
            return true;
        }
        return false;
    }
}

