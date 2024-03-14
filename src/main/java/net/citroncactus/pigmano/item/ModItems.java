package net.citroncactus.pigmano.item;

import net.citroncactus.pigmano.Pigmano;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Pigmano.MOD_ID) ;

    public static final RegistryObject<Item> putrid_pork = ITEMS.register("putrid_pork",
            () -> new Item(new Item.Properties())) ;
    public static final RegistryObject<Item> tusk = ITEMS.register("tusk",
            () -> new Item(new Item.Properties())) ;

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
