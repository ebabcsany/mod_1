package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.block.Knurth;
import com.babcsany.minecraft.mod_1.Mod_1;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_1.MOD_ID);

    public static final RegistryObject<Block> KNURTH = BLOCKS.register("knurth", () -> new Knurth(
            AbstractBlock.Properties.create(Material.ROCK)
                    .setRequiresTool()
                    .harvestLevel(0)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(1.5F, 6.0F)
    ));
    public static final RegistryObject<Block> KNURTH_TORCH = BLOCKS.register("knurth_torch", () -> new TorchBlock(
            AbstractBlock.Properties.create(Material.MISCELLANEOUS, MaterialColor.WOOD)
                    .doesNotBlockMovement()
                    .zeroHardnessAndResistance()
                    .setLightLevel(Value -> 15)
                    .sound(SoundType.WOOD), ParticleTypes.FLAME));
}
