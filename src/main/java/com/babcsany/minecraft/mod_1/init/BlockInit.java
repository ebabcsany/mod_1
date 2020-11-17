package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.block.Knurth;
import com.babcsany.minecraft.mod_1.Mod_1;
import com.babcsany.minecraft.mod_1.block.crops.TrurtrStage;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
                    .setLightLevel(Value -> 14)
                    .sound(SoundType.WOOD), ParticleTypes.FLAME)
    );
    public static final RegistryObject<Block> TRURTR_STAGE = BLOCKS.register("crops/trurtr_stage", () -> new TrurtrStage(
            Block.Properties.create(Material.PLANTS)
                    .zeroHardnessAndResistance()
                    .doesNotBlockMovement()
                    .tickRandomly()
                    .sound(SoundType.CROP)
    ));
}
