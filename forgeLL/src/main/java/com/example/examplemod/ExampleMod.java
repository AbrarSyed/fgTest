package com.example.examplemod;

import java.io.File;

import net.minecraft.init.Blocks;

import com.mumfrey.liteloader.LiteMod;

public class ExampleMod implements LiteMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final String TEST1 = "@TEST1@";
    public static final String TEST2 = "@TEST2@";

    public String getName()
    {
        return MODID;
    }
    
    public String getVersion()
    {
        return VERSION;
    }
    
    public void init(File config)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    public void upgradeSettings(String version, File configPath, File oldConfigPath)
    {
        // nothing
    }
}
