package net.citroncactus.pigmano.event;


import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.entity.client.ModModelLayers;
import net.citroncactus.pigmano.entity.client.PigmanipedeModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Pigmano.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value= Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PIGMANIPEDE_LAYER, PigmanipedeModel::createBodyLayer);
    }
}
