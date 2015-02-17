package com.example.examplemod;

import java.io.File;
import java.util.Arrays;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    public static final String TEST1 = "@TEST1@";
    public static final String TEST2 = "@TEST2@";
    
    @EventHandler
    public void init(FMLInitializationEvent event) throws Exception
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());

        // buildcraft reference test
        //System.out.println("BuildCraft in colorBlind mode?  >> "+PowerHandler.Type.PIPE);

        File srgDir = new File(System.getProperty("net.minecraftforge.gradle.GradleStart.srgDir"));
        System.out.println("FILE: "+srgDir);
        System.out.println(Arrays.toString(srgDir.list()));

        File csvDir = new File(System.getProperty("net.minecraftforge.gradle.GradleStart.csvDir"));
        System.out.println("FILE: "+csvDir);
        System.out.println(Arrays.toString(csvDir.list()));
    }
}
