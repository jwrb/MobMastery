package com.i2.mobdamage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import java.io.PrintStream;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class MobDamage extends JavaPlugin {

    MobDamageListener mobListener = new MobDamageListener(this);
    public final Logger logger = Logger.getLogger("Minecraft");
    public static MobDamage plugin;

    public void onDisable() {
        PluginDescriptionFile pdfile = this.getDescription();
        this.logger.info("MobDamage has been disabled");
    }

    public void onEnable() {
        plugin = this;
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.mobListener, this);
        loadConfig();
        setupPermissions();
        this.logger.info("MobDamage has been enabled");
    }

    private void setupPermissions() {
        Plugin PEX = getServer().getPluginManager().getPlugin("PermissionsEx");
        Plugin PermissionsBukkit = getServer().getPluginManager().getPlugin("PermissionsBukkit");
        PluginDescriptionFile pdfFile = getDescription();

        if (PEX != null) {
            this.logger.info("[MobDamage] Found " + ((PermissionsEx) PEX).getDescription().getName() + " Version " + PEX.getDescription().getVersion());
            this.logger.info("[" + pdfFile.getName() + "]" + " version " + pdfFile.getVersion() + " is enabled!");
            return;
        }
        if (PermissionsBukkit != null) {
            this.logger.info("[MobDamage] Found PermissionsBukkit Version " + PermissionsBukkit.getDescription().getVersion());
            this.logger.info("[" + pdfFile.getName() + "]" + " version " + pdfFile.getVersion() + " is enabled!");
            return;
        }
        getServer().getPluginManager().disablePlugin(this);
    }

    private void loadConfig() {
        getConfig().addDefault("MobHealth.Pig", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Cow", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Spider", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.CaveSpider", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Zombie", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Skeleton", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Creeper", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Ocelot", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Bat", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Chicken", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Mooshroom", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Sheep", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Squid", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Villager", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Enderman", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Wolf", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.ZombiePigman", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Blaze", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Ghast", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.MagmaCube", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Silverfish", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Slime", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.Witch", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.WitherSkeleton", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.ZombieVillager", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.IronGolem", Integer.valueOf(-1));
        getConfig().addDefault("MobHealth.SnowGolem", Integer.valueOf(-1));
        
        getConfig().addDefault("MobDamage.Pig", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Cow", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Spider", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.CaveSpider", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Zombie", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Skeleton", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Creeper", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Ocelot", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Bat", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Chicken", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Mooshroom", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Sheep", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Squid", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Villager", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Enderman", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Wolf", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.ZombiePigman", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Blaze", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Ghast", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.MagmaCube", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Silverfish", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Slime", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.Witch", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.WitherSkeleton", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.ZombieVillager", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.IronGolem", Integer.valueOf(-1));
        getConfig().addDefault("MobDamage.SnowGolem", Integer.valueOf(-1));
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = null;
        String pname = "(Console)";
        if ((sender instanceof Player)) {
            player = (Player) sender;
            pname = player.getName();
        }
        if (((player == null) || (player.hasPermission("mobdamage.reload")))
                && (commandLabel.equalsIgnoreCase("mobdamage"))) {
            if ((args.length == 0)) {
                        respond(player, ChatColor.RED + "[MobDamage] Version 1.1 " + ChatColor.BLUE + "by island219 & Blabba_Labba");
                    }
            if ((args.length == 1)
                    && (args[0].equalsIgnoreCase("reload"))) {
                reloadConfig();
                respond(player, ChatColor.RED + "[MobDamage] Config reloaded.");
                this.logger.info("[MobDamage] " + pname + " reloaded the config.");
            }

            return true;
        }

        player.sendMessage(ChatColor.RED + "[MobDamage] Permission denied.");
        return false;
    }
    
    private void respond(Player player, String message) {
        if (player == null) {
            System.out.println(message);
        } else {
            player.sendMessage(message);
        }
    }
}