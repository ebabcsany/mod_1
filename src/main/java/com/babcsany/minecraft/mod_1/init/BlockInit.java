package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.Knurth;
import com.babcsany.minecraft.mod_1.Mod_1;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_1.MOD_ID);

    public static final RegistryObject<Block> KNURTH = BLOCKS.register("knurth", () -> new Knurth(
            Block.Properties.create(Material.ROCK)
                    .harvestLevel(0)
                    .setRequiresTool()
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
}
