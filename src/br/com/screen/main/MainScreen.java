package br.com.screen.main;

import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainScreen extends JavaPlugin {

    public static MainScreen plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §a--------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §aPlugin successfully initialized, without problems apparently.");
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §aVersion: " + (plugin.getConfig().getString("plugin-version")));
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §a--------------------------------------------------------------------");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §c--------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §cPlugin/processes closed successfully!");
        Bukkit.getConsoleSender().sendMessage("§f[ScreenFishing] §c--------------------------------------------------------------------");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (command.getName().equalsIgnoreCase("pesca")) {
                TitleAPI.sendTitle((Player) sender, 15, 25, 15, "§6§lLOBBY", "§fBem-vindo! :D");
                sender.sendMessage("\n " + (plugin.getConfig().getString("join-message")) + "\n");
                sender.sendMessage("\n§f " + (plugin.getConfig().getString("join-description")) + "\n");
                sender.sendMessage("\n " + (plugin.getConfig().getString("join-website")) + "\n");
                sender.sendMessage("");
            }
        }
        return false;
    }
}
