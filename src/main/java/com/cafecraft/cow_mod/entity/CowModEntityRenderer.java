package com.cafecraft.cow_mod.entity;

import com.cafecraft.cow_mod.client.CowModClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CowModEntityRenderer extends MobEntityRenderer<CowModEntity, CowModEntityModel> {
    public CowModEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CowModEntityModel(context.getPart(CowModClient.COW_MOD_ENTITY_LAYER)), 0.5F);
    }

    @Override
    public Identifier getTexture(CowModEntity entity) {
        return new Identifier("cow_mod", "textures/entity/auroch_chocolate.png");
    }
}
