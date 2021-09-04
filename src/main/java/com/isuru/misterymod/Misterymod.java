package com.isuru.misterymod;

import com.isuru.misterymod.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = Misterymod.MODID,
    name = Misterymod.NAME,
    version = Misterymod.VERSION,
    acceptedMinecraftVersions = Misterymod.MC_VERSION)
public class Misterymod {

  public static final String MODID = "misterymod";
  public static final String NAME = "Misterymod Sample";
  public static final String VERSION = "1.0";
  public static final String MC_VERSION = "[1.12.2]";

  public static final Logger LOGGER = LogManager.getLogger(Misterymod.MODID);

  public static final String CLIENT = "com.isuru.misterymod.proxy.ClientProxy";
  public static final String SERVER = "com.isuru.misterymod.proxy.ServerProxy";

  @SidedProxy(clientSide = Misterymod.CLIENT, serverSide = Misterymod.SERVER)
  public static IProxy proxy;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    proxy.preInit(event);
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
    LOGGER.info(Misterymod.NAME + " says hi!");
    proxy.init(event);
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    proxy.postInit(event);
  }
}
