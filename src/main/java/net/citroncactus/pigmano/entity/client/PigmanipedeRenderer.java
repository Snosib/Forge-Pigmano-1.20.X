package net.citroncactus.pigmano.entity.client;


import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.entity.custom.PigmanipedeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PigmanipedeRenderer extends MobRenderer<PigmanipedeEntity, PigmanipedeModel<PigmanipedeEntity>> {
    public PigmanipedeRenderer(EntityRendererProvider.Context pContext)  {
        super(pContext, new PigmanipedeModel<>(pContext.bakeLayer(ModModelLayers.PIGMANIPEDE_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(PigmanipedeEntity pEntity) {
        return new ResourceLocation(Pigmano.MOD_ID, "textures/entity/pigmanipede.png");
    }

}
