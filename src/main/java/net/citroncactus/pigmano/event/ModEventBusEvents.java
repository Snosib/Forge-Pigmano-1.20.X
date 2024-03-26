package net.citroncactus.pigmano.event;


import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.entity.ModEntities;

import net.citroncactus.pigmano.entity.custom.PigmanipedeEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Pigmano.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event)  {
        event.put(ModEntities.PIGMANIPEDE.get(), PigmanipedeEntity.createAttributes().build());
    }
}
