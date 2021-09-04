package com.isuru.misterymod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Misterymod.MODID, value = Side.CLIENT)
public class TimeModule {

    @SubscribeEvent
    public void renderTime(){
        FontRenderer renderer = Minecraft.getMinecraft().fontRenderer;
        long time = Minecraft.getSystemTime();
        renderer.drawString("Time: " + time, 11, 11, -1);
    }
}
