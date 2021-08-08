package com.cafecraft.cow_mod.client;

import com.cafecraft.cow_mod.CowMod;
import com.cafecraft.cow_mod.entity.CowModEntityModel;
import com.cafecraft.cow_mod.entity.CowModEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class CowModClient implements ClientModInitializer {
    public static final EntityModelLayer COW_MOD_ENTITY_LAYER = new EntityModelLayer(new Identifier("cow_mod", "cow"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(CowMod.COW_MOD_ENTITY, (context) -> {
            return new CowModEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(COW_MOD_ENTITY_LAYER, CowModEntityModel::getTexturedModelData);
    }
}
