package com.glenjendary.freeze;

/* Freeze Created by Glenjendary on 4/07/2017. */

import com.glenjendary.freeze.commands.Freeze;
import com.glenjendary.freeze.events.FreezeServer;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    public void onEnable() {

        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        registerCommands();
        registerEvents();
        registerPermissions();

        logger.info(pdfFile.getName() + " has been enabled with version "
                + pdfFile.getVersion());
    }

    public void registerCommands() {
       getCommand("sfreeze").setExecutor(new Freeze(this));

    }

    public void registerEvents() {

        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new FreezeServer(this), this);

    }

    public void registerPermissions() {

        PluginManager pm = getServer().getPluginManager();
        pm.addPermission(new Permission("sfreeze.bypass"));
        pm.addPermission(new Permission("sfreeze.all"));

    }

    public void onDisable() {

        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        logger.info(pdfFile.getName() + " has been disabled with version "
                + pdfFile.getVersion());
    }
}
