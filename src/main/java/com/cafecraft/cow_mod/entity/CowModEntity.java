package com.cafecraft.cow_mod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

@SuppressWarnings("EntityConstructor")
public class CowModEntity extends PathAwareEntity {

    public CowModEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
