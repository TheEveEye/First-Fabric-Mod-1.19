package net.theeveeye.firstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.theeveeye.firstmod.FirstMod;

public class ModItemGroup {

    public static ItemGroup CITRINE;

    public static void registerItemGroups() {
        CITRINE = FabricItemGroup.builder(new Identifier(FirstMod.MOD_ID, "citrine"))
                .displayName(Text.translatable("itemgroup.citrine"))
                .icon(() -> new ItemStack(ModItems.TANZANITE)).build();
    }
    }
