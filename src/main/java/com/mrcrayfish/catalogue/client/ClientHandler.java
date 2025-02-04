package com.mrcrayfish.catalogue.client;

import com.mrcrayfish.catalogue.client.screen.CatalogueModListScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmlclient.gui.screen.ModListScreen;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = "catalogue", value = Dist.CLIENT)
public class ClientHandler
{
    @SubscribeEvent
    public static void onOpenScreen(GuiOpenEvent event)
    {
        if(event.getGui() instanceof ModListScreen)
        {
            event.setGui(new CatalogueModListScreen());
        }
    }
}
