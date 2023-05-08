package net.theeveeye.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.theeveeye.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));

    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.CITRINE, RAW_TANZANITE);
        addToItemGroup(ModItemGroup.CITRINE, TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_TANZANITE);
        addToItemGroup(ItemGroups.INGREDIENTS, TANZANITE);

        addToItemGroup(ModItemGroup.CITRINE, RAW_CITRINE);
        addToItemGroup(ModItemGroup.CITRINE, CITRINE);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_CITRINE);
        addToItemGroup(ItemGroups.INGREDIENTS, CITRINE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        FirstMod.LOGGER.debug("Registering Mod Items for " + FirstMod.MOD_ID);

        addItemsToItemGroup();
    }
}
