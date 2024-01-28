package com.prau.jjkmod.event;

import com.prau.jjkmod.JJKMod;
import com.prau.jjkmod.entity.client.renderer.GojoSchoolSuitRenderer;
import com.prau.jjkmod.entity.client.renderer.YutaSuitRenderer;
import com.prau.jjkmod.item.GojoSchoolSuitItem;
import com.prau.jjkmod.item.YutaSuitItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = JJKMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final FMLClientSetupEvent event) {
        GeoArmorRenderer.registerArmorRenderer(YutaSuitItem.class, YutaSuitRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(GojoSchoolSuitItem.class, GojoSchoolSuitRenderer::new);
    }
}
