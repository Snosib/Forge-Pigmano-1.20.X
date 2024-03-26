package net.citroncactus.pigmano.item;

import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.block.ModBlocks;
import net.citroncactus.pigmano.entity.ModEntities;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Pigmano.MOD_ID) ;

    public static final RegistryObject<Item> putrid_pork = ITEMS.register("putrid_pork",
            () -> new Item(new Item.Properties())) ;
    public static final RegistryObject<Item> tusk = ITEMS.register("tusk",
            () -> new Item(new Item.Properties())) ;

    public static final RegistryObject<Item> flogger = ITEMS.register("flogger",
            () -> new Item(new Item.Properties().stacksTo(1))) ;
    public static final RegistryObject<Item> reinforced_concrete = ITEMS.register("reinforced_concrete",
            () -> new BlockItem(ModBlocks.reinforced_concrete.get(), new Item.Properties()));
    public static final RegistryObject<Item> low_density_structures = ITEMS.register("low_density_structures",
            () -> new BlockItem(ModBlocks.low_density_structures.get(), new Item.Properties()));
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> PIGMANIPEDE_SPAWN_EGG = ITEMS.register("pigmanipede_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.PIGMANIPEDE, 0x272727, 0xA44134,
                    new Item.Properties()));

}
