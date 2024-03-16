package net.citroncactus.pigmano.item;

import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Pigmano.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PIGMANO_TAB = CREATIVE_MODE_TABS.register("pigmano_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.putrid_pork.get()))
                    .title(Component.translatable("creativetab.pigmano_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.putrid_pork.get());
                        pOutput.accept(ModItems.tusk.get());

                        pOutput.accept(ModBlocks.reinforced_concrete.get());
                        pOutput.accept(ModBlocks.low_density_structures.get());

                    })
                    .build()) ;


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus) ;
    }
}
