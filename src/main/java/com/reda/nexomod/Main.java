package com.reda.nexomod;

import com.reda.nexomod.ct.Tabs;
import com.reda.nexomod.proxy.CommonProxy;
import com.reda.nexomod.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID,version = References.VERSION,name = References.NAME)
public class Main
{

    public static final CreativeTabs nexotabs = new Tabs("nexotabs",1); //Main Tab

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = References.CLIENT,serverSide = References.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public static void postinit(FMLPostInitializationEvent event) {}


}
