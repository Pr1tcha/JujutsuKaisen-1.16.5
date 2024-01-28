package com.prau.jjkmod.entity.client.armor;

import com.prau.jjkmod.JJKMod;
import com.prau.jjkmod.item.GojoSchoolSuitItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GojoSchoolSuitModel extends AnimatedGeoModel<GojoSchoolSuitItem> {
    @Override
    public ResourceLocation getModelLocation(GojoSchoolSuitItem object) {
        return new ResourceLocation(JJKMod.MOD_ID, "geo/gojoschoolsuit.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GojoSchoolSuitItem object) {
        return new ResourceLocation(JJKMod.MOD_ID, "textures/models/armor/gojoschoolsuit_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GojoSchoolSuitItem animatable) {
        return new ResourceLocation(JJKMod.MOD_ID, "animations/armor_animation.json");
    }
}