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

    /*
          DEFAULT_ATTRIBUTE_REGISTRY = ImmutableMap.builder()
          .put(EntityType.ARMOR_STAND, LivingEntity.createLivingAttributes().build())
          .put(EntityType.AXOLOTL, AxolotlEntity.createAxolotlAttributes().build())
          .put(EntityType.BAT, BatEntity.createBatAttributes().build())
          .put(EntityType.BEE, BeeEntity.createBeeAttributes().build())
          .put(EntityType.BLAZE, BlazeEntity.createBlazeAttributes().build())
          .put(EntityType.CAT, CatEntity.createCatAttributes().build())
          .put(EntityType.CAVE_SPIDER, CaveSpiderEntity.createCaveSpiderAttributes().build())
          .put(EntityType.CHICKEN, ChickenEntity.createChickenAttributes().build())
          .put(EntityType.COD, FishEntity.createFishAttributes().build())

          .put(EntityType.COW, CowEntity.createCowAttributes().build())

          .put(EntityType.CREEPER, CreeperEntity.createCreeperAttributes().build())
          .put(EntityType.DOLPHIN, DolphinEntity.createDolphinAttributes().build())
          .put(EntityType.DONKEY, AbstractDonkeyEntity.createAbstractDonkeyAttributes().build())
          .put(EntityType.DROWNED, ZombieEntity.createZombieAttributes().build()).put(EntityType.ELDER_GUARDIAN, ElderGuardianEntity.createElderGuardianAttributes().build()).put(EntityType.ENDERMAN, EndermanEntity.createEndermanAttributes().build()).put(EntityType.ENDERMITE, EndermiteEntity.createEndermiteAttributes().build()).put(EntityType.ENDER_DRAGON, EnderDragonEntity.createEnderDragonAttributes().build()).put(EntityType.EVOKER, EvokerEntity.createEvokerAttributes().build()).put(EntityType.FOX, FoxEntity.createFoxAttributes().build()).put(EntityType.GHAST, GhastEntity.createGhastAttributes().build()).put(EntityType.GIANT, GiantEntity.createGiantAttributes().build()).put(EntityType.GLOW_SQUID, GlowSquidEntity.createSquidAttributes().build()).put(EntityType.GOAT, GoatEntity.createGoatAttributes().build()).put(EntityType.GUARDIAN, GuardianEntity.createGuardianAttributes().build()).put(EntityType.HOGLIN, HoglinEntity.createHoglinAttributes().build()).put(EntityType.HORSE, HorseBaseEntity.createBaseHorseAttributes().build()).put(EntityType.HUSK, ZombieEntity.createZombieAttributes().build()).put(EntityType.ILLUSIONER, IllusionerEntity.createIllusionerAttributes().build()).put(EntityType.IRON_GOLEM, IronGolemEntity.createIronGolemAttributes().build()).put(EntityType.LLAMA, LlamaEntity.createLlamaAttributes().build()).put(EntityType.MAGMA_CUBE, MagmaCubeEntity.createMagmaCubeAttributes().build()).put(EntityType.MOOSHROOM, CowEntity.createCowAttributes().build()).put(EntityType.MULE, AbstractDonkeyEntity.createAbstractDonkeyAttributes().build()).put(EntityType.OCELOT, OcelotEntity.createOcelotAttributes().build()).put(EntityType.PANDA, PandaEntity.createPandaAttributes().build()).put(EntityType.PARROT, ParrotEntity.createParrotAttributes().build()).put(EntityType.PHANTOM, HostileEntity.createHostileAttributes().build()).put(EntityType.PIG, PigEntity.createPigAttributes().build()).put(EntityType.PIGLIN, PiglinEntity.createPiglinAttributes().build()).put(EntityType.PIGLIN_BRUTE, PiglinBruteEntity.createPiglinBruteAttributes().build()).put(EntityType.PILLAGER, PillagerEntity.createPillagerAttributes().build()).put(EntityType.PLAYER, PlayerEntity.createPlayerAttributes().build()).put(EntityType.POLAR_BEAR, PolarBearEntity.createPolarBearAttributes().build()).put(EntityType.PUFFERFISH, FishEntity.createFishAttributes().build()).put(EntityType.RABBIT, RabbitEntity.createRabbitAttributes().build()).put(EntityType.RAVAGER, RavagerEntity.createRavagerAttributes().build()).put(EntityType.SALMON, FishEntity.createFishAttributes().build()).put(EntityType.SHEEP, SheepEntity.createSheepAttributes().build()).put(EntityType.SHULKER, ShulkerEntity.createShulkerAttributes().build()).put(EntityType.SILVERFISH, SilverfishEntity.createSilverfishAttributes().build()).put(EntityType.SKELETON, AbstractSkeletonEntity.createAbstractSkeletonAttributes().build()).put(EntityType.SKELETON_HORSE, SkeletonHorseEntity.createSkeletonHorseAttributes().build()).put(EntityType.SLIME, HostileEntity.createHostileAttributes().build()).put(EntityType.SNOW_GOLEM, SnowGolemEntity.createSnowGolemAttributes().build()).put(EntityType.SPIDER, SpiderEntity.createSpiderAttributes().build()).put(EntityType.SQUID, SquidEntity.createSquidAttributes().build()).put(EntityType.STRAY, AbstractSkeletonEntity.createAbstractSkeletonAttributes().build()).put(EntityType.STRIDER, StriderEntity.createStriderAttributes().build()).put(EntityType.TRADER_LLAMA, LlamaEntity.createLlamaAttributes().build()).put(EntityType.TROPICAL_FISH, FishEntity.createFishAttributes().build()).put(EntityType.TURTLE, TurtleEntity.createTurtleAttributes().build()).put(EntityType.VEX, VexEntity.createVexAttributes().build()).put(EntityType.VILLAGER, VillagerEntity.createVillagerAttributes().build()).put(EntityType.VINDICATOR, VindicatorEntity.createVindicatorAttributes().build()).put(EntityType.WANDERING_TRADER, MobEntity.createMobAttributes().build()).put(EntityType.WITCH, WitchEntity.createWitchAttributes().build()).put(EntityType.WITHER, WitherEntity.createWitherAttributes().build()).put(EntityType.WITHER_SKELETON, AbstractSkeletonEntity.createAbstractSkeletonAttributes().build()).put(EntityType.WOLF, WolfEntity.createWolfAttributes().build()).put(EntityType.ZOGLIN, ZoglinEntity.createZoglinAttributes().build()).put(EntityType.ZOMBIE, ZombieEntity.createZombieAttributes().build()).put(EntityType.ZOMBIE_HORSE, ZombieHorseEntity.createZombieHorseAttributes().build()).put(EntityType.ZOMBIE_VILLAGER, ZombieEntity.createZombieAttributes().build()).put(EntityType.ZOMBIFIED_PIGLIN, ZombifiedPiglinEntity.createZombifiedPiglinAttributes().build()).build();

    */
}
