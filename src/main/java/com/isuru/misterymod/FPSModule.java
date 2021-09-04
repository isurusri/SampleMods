package com.isuru.misterymod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Misterymod.MODID, value = Side.CLIENT)
public class FPSModule {
  @SubscribeEvent
  public void renderFps(ModelRegistryEvent event) {
    FontRenderer renderer = Minecraft.getMinecraft().fontRenderer;
    renderer.drawString("FPS: " + Minecraft.getDebugFPS(), 3, 3, -1);
  }
}
