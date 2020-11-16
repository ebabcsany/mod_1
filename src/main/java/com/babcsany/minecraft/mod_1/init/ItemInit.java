package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.Mod_1;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_1.MOD_ID);

    public static final RegistryObject<Item> TRURTR = ITEMS.register("trurtr", () -> new Item(
            (new Item.Properties())
    ));
}
