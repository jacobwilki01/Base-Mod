package com.cjwilk.basemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BaseMod.ID, name = BaseMod.Name, version = BaseMod.Version, useMetadata = true)
public class BaseMod
{
    public static final String ID = "basemod";

    public static final String Name = "CJWilk's Base Mod";

    public static final String Version = "0.0.1";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
}
