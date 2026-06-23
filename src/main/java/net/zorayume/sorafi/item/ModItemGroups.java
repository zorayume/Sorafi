package net.zorayume.sorafi.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zorayume.sorafi.Sorafi;

public class ModItemGroups {
    public static final ItemGroup RED_DIAMOND_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Sorafi.MOD_ID, "reddiamond"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.red_diamond"))
                .icon(() -> new ItemStack(ModItems.RED_DIAMOND)).entries((displayContext, entries) -> {
                    entries.add(Items.EMERALD);
                    entries.add(Items.DIAMOND);

                    entries.add(Blocks.IRON_BLOCK);
            }).build());

    public static void registerItemGroups() {
        Sorafi.LOGGER.info("Registering Item Groups for " + Sorafi.MOD_ID);
    }
}
