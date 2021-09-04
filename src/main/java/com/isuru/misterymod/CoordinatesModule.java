package com.isuru.misterymod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Misterymod.MODID, value = Side.CLIENT)
public class CoordinatesModule extends Gui {
  int myPosX;
  int myPosY;
  int myPosZ;

  @SubscribeEvent
  private void getPlayerPos() {
    FontRenderer renderer = Minecraft.getMinecraft().fontRenderer;
    BlockPos pos = Minecraft.getMinecraft().player.getPosition();
    myPosX = pos.getX();
    myPosY = pos.getY();
    myPosZ = pos.getZ();
    renderer.drawString("X: " + myPosX, 4, 4, -1);
    renderer.drawString("Y: " + myPosY, 5, 5, -1);
    renderer.drawString("Z: " + myPosZ, 6, 6, -1);
  }
}
