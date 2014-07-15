package com.example.examplemod;

import net.minecraft.init.Blocks;
import buildcraft.api.power.PowerHandler;
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
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());

        // buildcraft reference test
        System.out.println("BuildCraft in colorBlind mode?  >> "+PowerHandler.Type.PIPE);
    }
}
