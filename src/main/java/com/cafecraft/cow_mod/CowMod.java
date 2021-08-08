package com.cafecraft.cow_mod;

import com.cafecraft.cow_mod.entity.CowModEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CowMod implements ModInitializer {

    public static final EntityType<CowModEntity> COW_MOD_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("cow_mod", "cow"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CowModEntity::new).dimensions(EntityDimensions.fixed(2.1F, 2.1F)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(COW_MOD_ENTITY, CowModEntity.createMobAttributes());
    }
}
