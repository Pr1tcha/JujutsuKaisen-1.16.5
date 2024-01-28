package com.prau.jjkmod.entity.client.renderer;

import com.prau.jjkmod.entity.client.armor.YutaSuitModel;
import com.prau.jjkmod.item.YutaSuitItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class YutaSuitRenderer extends GeoArmorRenderer<YutaSuitItem> {
	public YutaSuitRenderer() {
		super(new YutaSuitModel());

		this.headBone = "armorHead";
		this.bodyBone = "armorBody";
		this.rightArmBone = "armorRightArm";
		this.leftArmBone = "armorLeftArm";
		this.rightLegBone = "armorRightLeg";
		this.leftLegBone = "armorLeftLeg";
		this.rightBootBone = "armorRightBoot";
		this.leftBootBone = "armorLeftBoot";
	}

}