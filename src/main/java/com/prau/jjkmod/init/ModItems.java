package com.prau.jjkmod.init;

import com.prau.jjkmod.JJKMod;
import com.prau.jjkmod.entity.client.renderer.YutaSuitRenderer;
import com.prau.jjkmod.item.YutaSuitItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JJKMod.MOD_ID);
        public static final RegistryObject<Item> YUTA_HELMET = ITEMS.register("yuta_helmet",
        () -> new YutaSuitItem(ArmorMaterial.DIAMOND, EquipmentSlotType.HEAD,
                new Item.Properties().tab(JJKMod.MAIN_TAB)));
    public static final RegistryObject<Item> YUTA_BODY = ITEMS.register("yuta_body",
            () -> new YutaSuitItem(ArmorMaterial.DIAMOND, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(JJKMod.MAIN_TAB)));
    public static final RegistryObject<Item> YUTA_LEGGINS = ITEMS.register("yuta_leggins",
            () -> new YutaSuitItem(ArmorMaterial.DIAMOND, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(JJKMod.MAIN_TAB)));
    public static final RegistryObject<Item> YUTA_BOOTS = ITEMS.register("yuta_boots",
            () -> new YutaSuitItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET,
                    new Item.Properties().tab(JJKMod.MAIN_TAB)));
}