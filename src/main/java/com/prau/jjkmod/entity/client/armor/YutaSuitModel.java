package com.prau.jjkmod.entity.client.armor;

import com.prau.jjkmod.JJKMod;
import com.prau.jjkmod.item.YutaSuitItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YutaSuitModel extends AnimatedGeoModel<YutaSuitItem> {
    @Override
    public ResourceLocation getModelLocation(YutaSuitItem object) {
        return new ResourceLocation(JJKMod.MOD_ID, "geo/yutasuit.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(YutaSuitItem object) {
        return new ResourceLocation(JJKMod.MOD_ID, "textures/models/armor/yutasuit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(YutaSuitItem animatable) {
        return new ResourceLocation(JJKMod.MOD_ID, "animations/armor_animation.json");
    }
}