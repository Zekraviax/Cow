package com.cafecraft.cow_mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;

@SuppressWarnings("EntityConstructor")
public class CowModEntity extends CowEntity {

    public CowModEntity(EntityType<? extends CowEntity> entityType, World world) {
        super((EntityType<? extends CowEntity>) entityType, world);
    }

    public static DefaultAttributeContainer.Builder createCowAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2D);
    }
}
