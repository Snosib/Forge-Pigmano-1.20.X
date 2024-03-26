package net.citroncactus.pigmano.entity;

import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.entity.custom.PigmanipedeEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Pigmano.MOD_ID) ;

    public static final RegistryObject<EntityType<PigmanipedeEntity>> PIGMANIPEDE =
            ENTITY_TYPES.register("pigmanipede", () -> EntityType.Builder.of(PigmanipedeEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 1.0f).build("pigmanipede"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
