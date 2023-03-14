package com.paneedah.mwcp;

import com.paneedah.mwcp.proxy.CommonProxy;
import com.paneedah.mwcp.utils.ModReference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.paneedah.mwcp.utils.ModReference.clientProxy;
import static com.paneedah.mwcp.utils.ModReference.serverProxy;

@Mod(modid = ModReference.id, version = ModReference.version, name = ModReference.name)
public class ModernWarfareProps {

    @Mod.Instance(ModReference.id)
    public static ModernWarfareProps instance;

    @SidedProxy(clientSide = clientProxy, serverSide = serverProxy)
    public static CommonProxy proxy;

    public ModernWarfareProps() {

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent initializationEvent) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitializationEvent) {

    }

}
