package net.citroncactus.pigmano.block;

import net.citroncactus.pigmano.Pigmano;
import net.citroncactus.pigmano.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Pigmano.MOD_ID);


    public static final RegistryObject<Block> reinforced_concrete = registerBlock("reinforced_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK).strength(-1.0F, 6.0F)));

    public static final RegistryObject<Block> low_density_structures = registerBlock("low_density_structures",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(1.0F, 12.0F).instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().sound(SoundType.METAL)));


   private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
       RegistryObject<T> toReturn = BLOCKS.register(name, block) ;
       return toReturn;

   }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    public boolean isFullyOpaque(BlockState state)
    {
        return false;
    }
    public boolean isOpaqueCube(BlockState state) {
        return false;
    }
}


