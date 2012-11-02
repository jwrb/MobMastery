package com.i2.mobmastery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import java.io.PrintStream;
import java.util.logging.Level;
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

public class MobMastery extends JavaPlugin {

    MobMasteryListener mobListener = new MobMasteryListener(this);
    public final Logger logger = Logger.getLogger("Minecraft");
    public static MobMastery plugin;

    public void onDisable() {
        PluginDescriptionFile pdfile = this.getDescription();
        this.logger.info("MobMastery has been disabled");
    }

    public void onEnable() {
        plugin = this;
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.mobListener, this);
        loadConfig();
        setupPermissions();
        this.logger.info("MobMastery has been enabled");
    }

    private void setupPermissions() {
        Plugin PEX = getServer().getPluginManager().getPlugin("PermissionsEx");
        Plugin PermissionsBukkit = getServer().getPluginManager().getPlugin("PermissionsBukkit");
        PluginDescriptionFile pdfFile = getDescription();

        if (PEX != null) {
            this.logger.info("[MobMastery] Found " + ((PermissionsEx) PEX).getDescription().getName() + " Version " + PEX.getDescription().getVersion());
            this.logger.info("[" + pdfFile.getName() + "]" + " version " + pdfFile.getVersion() + " is enabled!");
            return;
        }
        if (PermissionsBukkit != null) {
            this.logger.info("[MobMastery] Found PermissionsBukkit Version " + PermissionsBukkit.getDescription().getVersion());
            this.logger.info("[" + pdfFile.getName() + "]" + " version " + pdfFile.getVersion() + " is enabled!");
            return;
        }
        getServer().getPluginManager().disablePlugin(this);
    }

    private void loadConfig() {

        getConfig().addDefault("CentrePoint.X", Integer.valueOf(0));
        getConfig().addDefault("CentrePoint.Y", Integer.valueOf(0));

        String[] mobs = {"Pig", "Cow", "Spider", "CaveSpider", "Zombie", "Skeleton",
            "Creeper", "Ocelot", "Bat", "Chicken", "Bat", "Chicken", "Mooshroom",
            "Sheep", "Squid", "Villager", "Enderman", "Wolf", "ZombiePigman", "Blaze", "Ghast",
            "MagmaCube","Silverfish","Slime","Witch","WitherSkeleton","ZombieVillager","IronGolem","SnowGolem"};
    	for(String mob:mobs

    
        ) {
    		getConfig().addDefault("MobMastery." + mob + ".Damage", Integer.valueOf(-1));
        getConfig().addDefault("MobMastery." + mob + ".Health", Integer.valueOf(-1));
        getConfig().addDefault("MobMastery." + mob + ".Speed", Integer.valueOf(-1));
        getConfig().addDefault("MobMastery." + mob + ".Variance", Integer.valueOf(0));
        getConfig().addDefault("MobMastery." + mob + ".ProgressiveDifficulty.Health.Rate", Integer.valueOf(0));
        getConfig().addDefault("MobMastery." + mob + ".ProgressiveDifficulty.Damage.Rate", Integer.valueOf(0));
        getConfig().addDefault("MobMastery." + mob + ".ProgressiveDifficulty.Speed.Rate", Integer.valueOf(0));
    }

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
                && (commandLabel.equalsIgnoreCase("mobmastery"))/*|| (commandLabel.equalsIgnoreCase("mda"))*/) {
            if ((args.length == 0)) {
                respond(player, ChatColor.RED + "[MobMastery] Version 1.1.1 " + ChatColor.BLUE + "by island219 & Blabba_Labba");
            }
            if ((args.length == 1)
                    && (args[0].equalsIgnoreCase("reload"))) {
                reloadConfig();
                respond(player, ChatColor.RED + "[MobMastery] Config reloaded.");
                this.logger.log(Level.INFO, "[MobMastery] {0} reloaded the config.", pname);
            }
            if ((args.length == 3)
                    && (args[0].equalsIgnoreCase("sh"))/*|| (args[0].equalsIgnoreCase("sethealth"))*/) {
                    if (args.length < 3) {
                        respond(player, ChatColor.RED + "[MobMastery] Please provide a Mob and value");
                    }
                    if (this.getConfig().contains("MobMastery." + args[1] + ".Health")) {
                                this.getConfig().set("MobMastery." + args[1] + ".Health", Integer.valueOf(args[2]));
                                respond(player, ChatColor.RED + "[MobMastery] Damage value set.");
                                saveConfig();
                                reloadConfig();
                    }
                    else {
                        respond(player, ChatColor.RED + "[MobMastery] Incorrect Mob Name, Please consult config file.");
                    }  
            }
            if ((args.length == 3)
                    && (args[0].equalsIgnoreCase("sd"))/*|| (args[0].equalsIgnoreCase("sethealth"))*/) {
                    if (args.length < 3) {
                        respond(player, ChatColor.RED + "[MobMastery] Please provide a Mob and value");
                    }
                    if (this.getConfig().contains("MobMastery." + args[1] + ".Damage")) {
                                this.getConfig().set("MobMastery." + args[1] + ".Damage", Integer.valueOf(args[2]));
                                respond(player, ChatColor.RED + "[MobMastery] Damage value set.");
                                saveConfig();
                                reloadConfig();
                        if (args.length < 3) {
                        respond(player, ChatColor.RED + "[MobMastery] Please provide a Mob and value");
                        }
                    }
                    else {
                        respond(player, ChatColor.RED + "[MobMastery] Incorrect Mob Name, Please consult config file.");
                    }    
            }
            return true;
        }

        player.sendMessage(ChatColor.RED + "[MobMastery] Permission denied.");
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