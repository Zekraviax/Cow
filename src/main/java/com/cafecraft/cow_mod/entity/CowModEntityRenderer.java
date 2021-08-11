package com.cafecraft.cow_mod.entity;

import com.cafecraft.cow_mod.client.CowModClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CowModEntityRenderer extends MobEntityRenderer<CowModEntity, CowModEntityModel> {
    public CowModEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CowModEntityModel(context.getPart(CowModClient.COW_MOD_ENTITY_LAYER)), 1.F);
    }

    public void render(CowModEntity cowModEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(cowModEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    protected void scale(CowModEntity cowModEntity, MatrixStack matrixStack, float amount) {
        matrixStack.scale(2, 2, 2);
        super.scale(cowModEntity, matrixStack, 1.0f);
    }

    @Override
    public Identifier getTexture(CowModEntity entity) {
        return new Identifier("cow_mod", "textures/entity/auroch_chocolate.png");
    }
}
