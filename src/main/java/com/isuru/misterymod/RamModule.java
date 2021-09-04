package com.isuru.misterymod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Misterymod.MODID, value = Side.CLIENT)
public class RamModule {
  final Runtime runtime = Runtime.getRuntime();

  @SubscribeEvent
  public void ramUsage() {
    long maxMemory = runtime.maxMemory();
    long totalMemory = runtime.totalMemory();
    long freeMemory = runtime.freeMemory();
    long usedMemory = totalMemory - freeMemory;

    FontRenderer renderer = Minecraft.getMinecraft().fontRenderer;
    renderer.drawString("MaxMemory: " + maxMemory, 7, 7, -1);
    renderer.drawString("TotalMemory: " + totalMemory, 8, 8, -1);
    renderer.drawString("FreeMemory: " + freeMemory, 9, 9, -1);
    renderer.drawString("UsedMemory: " + usedMemory, 10, 10, -1);
  }
}
