package com.cafecraft.cow_mod.entity;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;

public class CowModEntityModel extends EntityModel<CowModEntity> {

    private final ModelPart body;
    private final ModelPart tail;
    private final ModelPart udders;
    private final ModelPart neck;
    private final ModelPart neck_r1;
    private final ModelPart head;
    private final ModelPart head_r1;
    private final ModelPart jaw;
    private final ModelPart jaw_r1;
    private final ModelPart horns;
    private final ModelPart horns_r1;
    private final ModelPart ears;
    private final ModelPart ear_left;
    private final ModelPart ear_right;
    private final ModelPart legs;
    private final ModelPart front_leg_right;
    private final ModelPart front_leg_left;
    private final ModelPart back_leg_left;
    private final ModelPart back_leg_right;

    public CowModEntityModel(ModelPart modelPart) {
        this.body = modelPart.getChild(EntityModelPartNames.BODY);

        this.legs = this.body.getChild("legs");
        this.back_leg_right = this.legs.getChild("back_leg_right");
        this.back_leg_left = this.legs.getChild("back_leg_left");
        this.front_leg_left = this.legs.getChild("front_leg_left");
        this.front_leg_right = this.legs.getChild("front_leg_right");
        this.neck = this.body.getChild("neck");
        this.head = this.neck.getChild("head");
        this.ears = this.head.getChild("ears");
        this.ear_right = this.ears.getChild("ear_right");
        this.ear_left = this.ears.getChild("ear_left");
        this.horns = this.head.getChild("horns");
        this.horns_r1 = this.horns.getChild("horns_r1");
        this.jaw = this.head.getChild("jaw");
        this.jaw_r1 = this.jaw.getChild("jaw_r1");
        this.head_r1 = this.head.getChild("head_r1");
        this.neck_r1 = this.neck.getChild("neck_r1");
        this.udders = this.body.getChild("udders");
        this.tail = this.body.getChild("tail");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        ModelPartData modelPartData1 = modelPartData.addChild("body", ModelPartBuilder.create()
                .uv(0,11)
                .cuboid(-5.0F, -14.0F, -8.0F, 9.0F, 7.0F, 14.0F)
                ,ModelTransform.pivot(1.0F,24.0F,0.0F));

        modelPartData1.addChild("tail", ModelPartBuilder.create()
                .uv(48,0)
                .cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F)
                ,ModelTransform.pivot(-0.5F,-14.0F,6.0F));
        modelPartData1.addChild("udders", ModelPartBuilder.create()
                .uv(18,3)
                .cuboid(-2.0F, 3.0F, 3.0F, 3.0F, 2.0F, 3.0F)
                ,ModelTransform.pivot(0.0F,-10.0F,-1.0F));

        ModelPartData modelPartData2 = modelPartData1.addChild("neck", ModelPartBuilder.create()
                ,ModelTransform.pivot(0.0F,-11.0F,-6.0F));
        modelPartData2.addChild("neck_r1", ModelPartBuilder.create()
                .uv(44,8)
                .cuboid(-3.0F, -3.5976F, -2.7604F, 5.0F, 5.0F, 5.0F)
                ,ModelTransform.pivot(0.0F,0.0F,0.0F));

        ModelPartData modelPartData3 = modelPartData2.addChild("head", ModelPartBuilder.create()
                ,ModelTransform.pivot(0.0F,-4.0F,-2.0F));
        modelPartData3.addChild("head_r1", ModelPartBuilder.create()
                .uv(0,0)
                .cuboid(-3.0F, -3.6088F, -6.7934F, 5.0F, 3.0F, 8.0F)
                ,ModelTransform.pivot(0.0F,1.0F,1.0F));

        ModelPartData modelPartData4 = modelPartData3.addChild("jaw", ModelPartBuilder.create()
                ,ModelTransform.pivot(0.0F,1.0F,1.0F));
        modelPartData4.addChild("jaw_r1", ModelPartBuilder.create()
                .uv(0,32)
                .cuboid(-3.0F, -2.6088F, -6.7934F, 5.0F, 2.0F, 8.0F)
                ,ModelTransform.pivot(0.0F,0.0F,0.0F));

        ModelPartData modelPartData5 = modelPartData3.addChild("horns", ModelPartBuilder.create()
                ,ModelTransform.pivot(0.0F,15.0F,8.0F));
        modelPartData5.addChild("horns_r1", ModelPartBuilder.create()
                .uv(0,56)
                .cuboid(-7.5F, -1.0F, 0.0F, 15.0F, 1.0F, 7.0F)
                ,ModelTransform.pivot(-0.5F,-17.0F,-9.0F));

        ModelPartData modelPartData6 = modelPartData3.addChild("ears", ModelPartBuilder.create()
                ,ModelTransform.pivot(0.0F,15.0F,8.0F));
        modelPartData6.addChild("ear_left", ModelPartBuilder.create()
                .uv(32,22)
                .cuboid(0.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F)
                ,ModelTransform.pivot(2.0F,-17.0F,-9.0F));
        modelPartData6.addChild("ear_right", ModelPartBuilder.create()
                .uv(32,19)
                .cuboid(-3.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, true)
                ,ModelTransform.pivot(-3.0F,-17.0F,-9.0F));

        ModelPartData modelPartData7 = modelPartData1.addChild("legs", ModelPartBuilder.create(),
                ModelTransform.pivot(0.0F,0.0F,0.0F));
        modelPartData7.addChild("front_leg_right", ModelPartBuilder.create()
                .uv(52,34)
                .cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, true)
                ,ModelTransform.pivot(-4.0F,-7.0F,-7.0F));
        modelPartData7.addChild("front_leg_left", ModelPartBuilder.create()
                .uv(52,54)
                .cuboid(-2.0F, 0.0F, -2.0F, 3.0F, 7.0F, 3.0F)
                ,ModelTransform.pivot(3.0F,-7.0F,-6.0F));
        modelPartData7.addChild("back_leg_left", ModelPartBuilder.create()
                .uv(52,44)
                .cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F)
                ,ModelTransform.pivot(2.0F,-7.0F,5.0F));
        modelPartData7.addChild("back_leg_right", ModelPartBuilder.create()
                .uv(52,54)
                .cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, true)
                ,ModelTransform.pivot(-4.0F,-7.0F,5.0F));
        return TexturedModelData.of(modelData,64,64);
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        setRotationAngle(neck_r1, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(head_r1, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(jaw_r1, 0.7854F, 0.0F, 0.0F);
        setRotationAngle(horns_r1, 0.7854F, 0.0F, 0.0F);

        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public static void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

    @Override
    public void setAngles(CowModEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }
}