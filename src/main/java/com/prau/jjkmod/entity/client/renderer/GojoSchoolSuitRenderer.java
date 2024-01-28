package com.prau.jjkmod.entity.client.renderer;

import com.prau.jjkmod.entity.client.armor.GojoSchoolSuitModel;
import com.prau.jjkmod.entity.client.armor.YutaSuitModel;
import com.prau.jjkmod.item.GojoSchoolSuitItem;
import com.prau.jjkmod.item.YutaSuitItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class GojoSchoolSuitRenderer extends GeoArmorRenderer<GojoSchoolSuitItem> {
	public GojoSchoolSuitRenderer() {
		super(new GojoSchoolSuitModel());

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