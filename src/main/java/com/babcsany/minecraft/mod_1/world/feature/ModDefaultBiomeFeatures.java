package com.babcsany.minecraft.mod_1.world.feature;

import com.babcsany.minecraft.mod_1.init.BlockInit;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HugeMushroomBlock;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.*;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.structure.*;
import net.minecraft.world.gen.foliageplacer.*;
import net.minecraft.world.gen.placement.*;
import net.minecraft.world.gen.treedecorator.*;
import net.minecraft.world.gen.trunkplacer.*;

import java.util.OptionalInt;

import static net.minecraft.block.Blocks.SOUL_SOIL;

public class ModDefaultBiomeFeatures {
   private static final BlockState GRASS = Blocks.GRASS.getDefaultState();
   private static final BlockState TRURTR_CROPS_BLOCK = BlockInit.TRURTR_CROPS_BLOCK.get().getDefaultState();
   private static final BlockState AIR = Blocks.AIR.getDefaultState();
   private static final BlockState SOUL_FIRE = Blocks.GRASS.getDefaultState();
   private static final BlockState KNURTH = BlockInit.KNURTH.get().getDefaultState();
   private static final BlockState OBSIDIAN = Blocks.OBSIDIAN.getDefaultState();
   private static final BlockState BARRIER = Blocks.BARRIER.getDefaultState();
   private static final BlockState END_STONE = Blocks.END_STONE.getDefaultState();
   private static final BlockState FERN = Blocks.FERN.getDefaultState();
   private static final BlockState PODZOL = Blocks.PODZOL.getDefaultState();
   private static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
   private static final BlockState OAK_LEAVES = Blocks.OAK_LEAVES.getDefaultState();
   private static final BlockState JUNGLE_LOG = Blocks.JUNGLE_LOG.getDefaultState();
   private static final BlockState JUNGLE_LEAVES = Blocks.JUNGLE_LEAVES.getDefaultState();
   private static final BlockState SPRUCE_LOG = Blocks.SPRUCE_LOG.getDefaultState();
   private static final BlockState SPRUCE_LEAVES = Blocks.SPRUCE_LEAVES.getDefaultState();
   private static final BlockState ACACIA_LOG = Blocks.ACACIA_LOG.getDefaultState();
   private static final BlockState ACACIA_LEAVES = Blocks.ACACIA_LEAVES.getDefaultState();
   private static final BlockState BIRCH_LOG = Blocks.BIRCH_LOG.getDefaultState();
   private static final BlockState BIRCH_LEAVES = Blocks.BIRCH_LEAVES.getDefaultState();
   private static final BlockState DARK_OAK_LOG = Blocks.DARK_OAK_LOG.getDefaultState();
   private static final BlockState DARK_OAK_LEAVES = Blocks.DARK_OAK_LEAVES.getDefaultState();
   private static final BlockState WATER = Blocks.WATER.getDefaultState();
   private static final BlockState LAVA = Blocks.LAVA.getDefaultState();
   private static final BlockState DIRT = Blocks.DIRT.getDefaultState();
   private static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
   private static final BlockState GRANITE = Blocks.GRANITE.getDefaultState();
   private static final BlockState DIORITE = Blocks.DIORITE.getDefaultState();
   private static final BlockState ANDESITE = Blocks.ANDESITE.getDefaultState();
   private static final BlockState COAL_ORE = Blocks.COAL_ORE.getDefaultState();
   private static final BlockState IRON_ORE = Blocks.IRON_ORE.getDefaultState();
   private static final BlockState GOLD_ORE = Blocks.GOLD_ORE.getDefaultState();
   private static final BlockState REDSTONE_ORE = Blocks.REDSTONE_ORE.getDefaultState();
   private static final BlockState DIAMOND_ORE = Blocks.DIAMOND_ORE.getDefaultState();
   private static final BlockState LAPIS_ORE = Blocks.LAPIS_ORE.getDefaultState();
   private static final BlockState STONE = Blocks.STONE.getDefaultState();
   private static final BlockState EMERALD_ORE = Blocks.EMERALD_ORE.getDefaultState();
   private static final BlockState INFESTED_STONE = Blocks.INFESTED_STONE.getDefaultState();
   private static final BlockState SAND = Blocks.SAND.getDefaultState();
   private static final BlockState CLAY = Blocks.CLAY.getDefaultState();
   private static final BlockState GRASS_BLOCK = Blocks.GRASS_BLOCK.getDefaultState();
   private static final BlockState MOSSY_COBBLESTONE = Blocks.MOSSY_COBBLESTONE.getDefaultState();
   private static final BlockState LARGE_FERN = Blocks.LARGE_FERN.getDefaultState();
   private static final BlockState TALL_GRASS = Blocks.TALL_GRASS.getDefaultState();
   private static final BlockState LILAC = Blocks.LILAC.getDefaultState();
   private static final BlockState ROSE_BUSH = Blocks.ROSE_BUSH.getDefaultState();
   private static final BlockState PEONY = Blocks.PEONY.getDefaultState();
   private static final BlockState BROWN_MUSHROOM = Blocks.BROWN_MUSHROOM.getDefaultState();
   private static final BlockState RED_MUSHROOM = Blocks.RED_MUSHROOM.getDefaultState();
   private static final BlockState SEAGRASS = Blocks.SEAGRASS.getDefaultState();
   private static final BlockState PACKED_ICE = Blocks.PACKED_ICE.getDefaultState();
   private static final BlockState BLUE_ICE = Blocks.BLUE_ICE.getDefaultState();
   private static final BlockState LILY_OF_THE_VALLEY = Blocks.LILY_OF_THE_VALLEY.getDefaultState();
   private static final BlockState BLUE_ORCHID = Blocks.BLUE_ORCHID.getDefaultState();
   private static final BlockState POPPY = Blocks.POPPY.getDefaultState();
   private static final BlockState DANDELION = Blocks.DANDELION.getDefaultState();
   private static final BlockState DEAD_BUSH = Blocks.DEAD_BUSH.getDefaultState();
   private static final BlockState MELON = Blocks.MELON.getDefaultState();
   private static final BlockState PUMPKIN = Blocks.PUMPKIN.getDefaultState();
   private static final BlockState SWEET_BERRY_BUSH = Blocks.SWEET_BERRY_BUSH.getDefaultState().with(SweetBerryBushBlock.AGE, Integer.valueOf(3));
   private static final BlockState FIRE = Blocks.FIRE.getDefaultState();
   private static final BlockState NETHERRACK = Blocks.NETHERRACK.getDefaultState();
   private static final BlockState LILY_PAD = Blocks.LILY_PAD.getDefaultState();
   private static final BlockState SNOW = Blocks.SNOW.getDefaultState();
   private static final BlockState JACK_O_LATERN = Blocks.JACK_O_LANTERN.getDefaultState();
   private static final BlockState SUNFLOWER = Blocks.SUNFLOWER.getDefaultState();
   private static final BlockState CACTUS = Blocks.CACTUS.getDefaultState();
   private static final BlockState SUGAR_CANE = Blocks.SUGAR_CANE.getDefaultState();
   public static final StructureFeature<MineshaftConfig, ? extends Structure<MineshaftConfig>> MINESHAFT_NORMAL = Structure.field_236367_c_.func_236391_a_(new MineshaftConfig((double)0.004F, MineshaftStructure.Type.NORMAL));
   public static final StructureFeature<MineshaftConfig, ? extends Structure<MineshaftConfig>> MINESHAFT_MESA = Structure.field_236367_c_.func_236391_a_(new MineshaftConfig(0.004D, MineshaftStructure.Type.MESA));
   public static final StructureFeature<ShipwreckConfig, ? extends Structure<ShipwreckConfig>> RUINED_PORTAL = Structure.field_236373_i_.func_236391_a_(new ShipwreckConfig(false));
   public static final StructureFeature<NoFeatureConfig, ? extends Structure<NoFeatureConfig>> STRONGHOLD = Structure.field_236375_k_.func_236391_a_(NoFeatureConfig.field_236559_b_);
   private static final BlockState RED_MUSHROOM_BLOCK = Blocks.RED_MUSHROOM_BLOCK.getDefaultState().with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));
   private static final BlockState BROWN_MUSHROOM_BLOCK = Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState().with(HugeMushroomBlock.UP, Boolean.valueOf(true)).with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));
   private static final BlockState MUSHROOM_STEM = Blocks.MUSHROOM_STEM.getDefaultState().with(HugeMushroomBlock.UP, Boolean.valueOf(false)).with(HugeMushroomBlock.DOWN, Boolean.valueOf(false));
   public static final BaseTreeFeatureConfig OAK_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0, 0, 0, 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
   private static final BeehiveTreeDecorator FEW_BEEHIVES = new BeehiveTreeDecorator(0.002F);
   private static final BeehiveTreeDecorator BEEHIVES = new BeehiveTreeDecorator(0.02F);
   private static final BeehiveTreeDecorator BEEHIVES1 = new BeehiveTreeDecorator(0.5F);
   private static final BeehiveTreeDecorator BEEHIVES2 = new BeehiveTreeDecorator(5.0F);
   private static final BeehiveTreeDecorator MANY_BEEHIVES = new BeehiveTreeDecorator(0.05F);
   public static final BaseTreeFeatureConfig OAK_TREE_WITH_MORE_BEEHIVES_CONFIG = OAK_TREE_CONFIG.func_236685_a_(ImmutableList.of(MANY_BEEHIVES));
   public static final BaseTreeFeatureConfig OAK_TREE_WITH_FEW_BEEHIVES_CONFIG = OAK_TREE_CONFIG.func_236685_a_(ImmutableList.of(FEW_BEEHIVES));
   public static final BaseTreeFeatureConfig JUNGLE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(JUNGLE_LEAVES), new BlobFoliagePlacer(2, 0, 0, 0, 3), new StraightTrunkPlacer(4, 8, 0), new TwoLayerFeature(1, 0, 1))).func_236703_a_(ImmutableList.of(new CocoaTreeDecorator(0.2F), TrunkVineTreeDecorator.field_236879_b_, LeaveVineTreeDecorator.field_236871_b_)).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig JUNGLE_SAPLING_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(JUNGLE_LEAVES), new BlobFoliagePlacer(2, 0, 0, 0, 3), new StraightTrunkPlacer(4, 8, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig PINE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES), new PineFoliagePlacer(1, 0, 1, 0, 3, 1), new StraightTrunkPlacer(6, 4, 0), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig SPRUCE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES), new SpruceFoliagePlacer(2, 1, 0, 2, 1, 1), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(2, 0, 2))).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig ACACIA_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ACACIA_LOG), new SimpleBlockStateProvider(ACACIA_LEAVES), new AcaciaFoliagePlacer(2, 0, 0, 0), new ForkyTrunkPlacer(5, 2, 2), new TwoLayerFeature(1, 0, 2))).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig BIRCH_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0, 0, 0, 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig KNURTH1_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(KNURTH), new SimpleBlockStateProvider(KNURTH), new BlobFoliagePlacer(2, 4, 6, 3, 3), new StraightTrunkPlacer(5, 4, 0), new TwoLayerFeature(3, 6, 3))).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig BIRCH_TREE_WITH_FEW_BEEHIVES_CONFIG = BIRCH_TREE_CONFIG.func_236685_a_(ImmutableList.of(FEW_BEEHIVES));
   public static final BaseTreeFeatureConfig KNURTH1_TREE_WITH_BEEHIVES2_CONFIG = KNURTH1_TREE_CONFIG.func_236685_a_(ImmutableList.of(BEEHIVES2));
   public static final BaseTreeFeatureConfig BIRCH_TREE_WITH_BEEHIVES_CONFIG = BIRCH_TREE_CONFIG.func_236685_a_(ImmutableList.of(BEEHIVES));
   public static final BaseTreeFeatureConfig BIRCH_TREE_CONFIG_CLASH = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0, 0, 0, 3), new StraightTrunkPlacer(5, 2, 6), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().func_236703_a_(ImmutableList.of(FEW_BEEHIVES)).build();
   public static final BaseTreeFeatureConfig SWAMP_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(3, 0, 0, 0, 3), new StraightTrunkPlacer(5, 3, 0), new TwoLayerFeature(1, 0, 1))).func_236701_a_(1).func_236703_a_(ImmutableList.of(LeaveVineTreeDecorator.field_236871_b_)).build();
   public static final BaseTreeFeatureConfig FANCY_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new FancyFoliagePlacer(2, 0, 4, 0, 4), new FancyTrunkPlacer(3, 11, 0), new TwoLayerFeature(0, 0, 0, OptionalInt.of(4)))).setIgnoreVines().func_236702_a_(Heightmap.Type.MOTION_BLOCKING).build();
   public static final BaseTreeFeatureConfig FANCY_TREE_WITH_FEW_BEEHIVES_CONFIG = FANCY_TREE_CONFIG.func_236685_a_(ImmutableList.of(FEW_BEEHIVES));
   public static final BaseTreeFeatureConfig FANCY_TREE_WITH_BEEHIVES_CONFIG = FANCY_TREE_CONFIG.func_236685_a_(ImmutableList.of(BEEHIVES));
   public static final BaseTreeFeatureConfig FANCY_TREE_WITH_MORE_BEEHIVES_CONFIG = FANCY_TREE_CONFIG.func_236685_a_(ImmutableList.of(MANY_BEEHIVES));
   public static final BaseTreeFeatureConfig field_230133_o_ = FANCY_TREE_CONFIG.func_236685_a_(ImmutableList.of(FEW_BEEHIVES));
   public static final BaseTreeFeatureConfig field_230133_p_ = FANCY_TREE_CONFIG.func_236685_a_(ImmutableList.of(BEEHIVES));
   public static final BaseTreeFeatureConfig field_230134_q_ = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(0, 0,4,0, 0), new StraightTrunkPlacer(1, 2, 3), new TwoLayerFeature(3, 2, 1))).setIgnoreVines().func_236703_a_(ImmutableList.of(BEEHIVES)).build();
   public static final BaseTreeFeatureConfig field_230134_r_ = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0,6,4, 0), new StraightTrunkPlacer(3, 5, 2), new TwoLayerFeature(6, 0, 1))).setIgnoreVines().func_236703_a_(ImmutableList.of(MANY_BEEHIVES)).build();
   public static final BaseTreeFeatureConfig field_230136_s_ = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new MegaPineFoliagePlacer(2, 6, 4, 3, 5, 1), new GiantTrunkPlacer(4, 5, 6), new ThreeLayerFeature(5, 6, 7, 3, 2, OptionalInt.empty()))).func_236703_a_(ImmutableList.of(TrunkVineTreeDecorator.field_236879_b_, LeaveVineTreeDecorator.field_236871_b_)).build();
   public static final BaseTreeFeatureConfig JUNGLE_GROUND_BUSH_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BushFoliagePlacer(2, 0, 1, 0, 2), new StraightTrunkPlacer(1, 0, 0), new TwoLayerFeature(0, 0, 0))).func_236702_a_(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES).build();
   public static final BaseTreeFeatureConfig DARK_OAK_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(DARK_OAK_LOG), new SimpleBlockStateProvider(DARK_OAK_LEAVES), new DarkOakFoliagePlacer(0, 0, 0, 0), new DarkOakTrunkPlacer(6, 2, 1), new ThreeLayerFeature(1, 1, 0, 1, 2, OptionalInt.empty()))).func_236701_a_(Integer.MAX_VALUE).func_236702_a_(Heightmap.Type.MOTION_BLOCKING).setIgnoreVines().build();
   public static final BaseTreeFeatureConfig MEGA_SPRUCE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES), new MegaPineFoliagePlacer(0, 0, 0, 0, 4, 13), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(PODZOL)))).build();
   public static final BaseTreeFeatureConfig MEGA_PINE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SPRUCE_LOG), new SimpleBlockStateProvider(SPRUCE_LEAVES), new MegaPineFoliagePlacer(0, 0, 0, 0, 4, 3), new GiantTrunkPlacer(13, 2, 14), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(PODZOL)))).build();
   public static final BaseTreeFeatureConfig MEGA_JUNGLE_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(JUNGLE_LOG), new SimpleBlockStateProvider(JUNGLE_LEAVES), new JungleFoliagePlacer(2, 0, 0, 0, 2), new MegaJungleTrunkPlacer(10, 2, 19), new TwoLayerFeature(1, 1, 2))).func_236703_a_(ImmutableList.of(TrunkVineTreeDecorator.field_236879_b_, LeaveVineTreeDecorator.field_236871_b_)).build();
   public static final BlockClusterFeatureConfig GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(GRASS), new SimpleBlockPlacer())).tries(32).build();
   public static final BlockClusterFeatureConfig TRURTR_CROPS_BLOCK_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TRURTR_CROPS_BLOCK), new SimpleBlockPlacer())).tries(32).build();
   public static final BlockClusterFeatureConfig OBSIDIAN_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(OBSIDIAN), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig TAIGA_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(GRASS, 1).addWeightedBlockstate(FERN, 4), SimpleBlockPlacer.field_236447_c_)).tries(32).build();
   public static final BlockClusterFeatureConfig LUSH_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(GRASS, 3).addWeightedBlockstate(FERN, 1), SimpleBlockPlacer.field_236447_c_)).blacklist(ImmutableSet.of(PODZOL)).tries(32).build();
   public static final BlockClusterFeatureConfig LILY_OF_THE_VALLEY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LILY_OF_THE_VALLEY), SimpleBlockPlacer.field_236447_c_)).tries(64).build();
   public static final BlockClusterFeatureConfig BLUE_ORCHID_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BLUE_ORCHID), new SimpleBlockPlacer())).tries(64).build();
   public static final BlockClusterFeatureConfig DEFAULT_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).addWeightedBlockstate(POPPY, 2).addWeightedBlockstate(DANDELION, 1), SimpleBlockPlacer.field_236447_c_)).tries(64).build();
   public static final BlockClusterFeatureConfig PLAINS_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new PlainFlowerBlockStateProvider(), new SimpleBlockPlacer())).tries(64).build();
   public static final BlockClusterFeatureConfig FOREST_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new ForestFlowerBlockStateProvider(), new SimpleBlockPlacer())).tries(64).build();
   public static final BlockClusterFeatureConfig DEAD_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(DEAD_BUSH), new SimpleBlockPlacer())).tries(4).build();
   public static final BlockClusterFeatureConfig MELON_PATCH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(MELON), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).replaceable().func_227317_b_().build();
   public static final BlockClusterFeatureConfig PUMPKIN_PATCH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(PUMPKIN), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).func_227317_b_().build();
   public static final BlockClusterFeatureConfig SWEET_BERRY_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SWEET_BERRY_BUSH), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(GRASS_BLOCK.getBlock())).func_227317_b_().build();
   public static final BlockClusterFeatureConfig NETHER_FIRE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(FIRE), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(NETHERRACK.getBlock())).func_227317_b_().build();
   public static final BlockClusterFeatureConfig LILY_PAD_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LILY_PAD), new SimpleBlockPlacer())).tries(10).build();
   public static final BlockClusterFeatureConfig RED_MUSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(RED_MUSHROOM), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig BROWN_MUSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BROWN_MUSHROOM), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig LILAC_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LILAC), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig NETHER_SOUL_FIRE = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SOUL_FIRE), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(SOUL_SOIL.getBlock())).func_227317_b_().build();
   public static final BlockClusterFeatureConfig ROSE_BUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(ROSE_BUSH), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig PEONY_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(PEONY), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig SUNFLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SUNFLOWER), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig TALL_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(TALL_GRASS), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig LARGE_FERN_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(LARGE_FERN), new DoublePlantBlockPlacer())).tries(64).func_227317_b_().build();
   public static final BlockClusterFeatureConfig CACTUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(CACTUS), new ColumnBlockPlacer(1, 2))).tries(10).func_227317_b_().build();
   public static final BlockClusterFeatureConfig SUGAR_CANE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SUGAR_CANE), new ColumnBlockPlacer(2, 2))).tries(20).xSpread(4).ySpread(0).zSpread(4).func_227317_b_().requiresWater().build();
   public static final BlockStateProvidingFeatureConfig HAY_PILE_CONFIG = new BlockStateProvidingFeatureConfig(new AxisRotatingBlockStateProvider(Blocks.HAY_BLOCK));
   public static final BlockStateProvidingFeatureConfig SNOW_PILE_CONFIG = new BlockStateProvidingFeatureConfig(new SimpleBlockStateProvider(SNOW));
   public static final BlockStateProvidingFeatureConfig MELON_PILE_CONFIG = new BlockStateProvidingFeatureConfig(new SimpleBlockStateProvider(MELON));
   public static final BlockStateProvidingFeatureConfig PUMPKIN_PILE_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(PUMPKIN, 19).addWeightedBlockstate(JACK_O_LATERN, 1));
   public static final BlockStateProvidingFeatureConfig BLUE_ICE_PILE_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).addWeightedBlockstate(BLUE_ICE, 1).addWeightedBlockstate(PACKED_ICE, 5));
   public static final LiquidsConfig WATER_SPRING_CONFIG = new LiquidsConfig(Fluids.WATER.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE));
   public static final LiquidsConfig LAVA_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), true, 4, 1, ImmutableSet.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE));
   public static final LiquidsConfig NETHER_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), false, 4, 1, ImmutableSet.of(Blocks.NETHERRACK));
   public static final LiquidsConfig ENCLOSED_NETHER_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), false, 5, 0, ImmutableSet.of(Blocks.NETHERRACK));
   public static final BigMushroomFeatureConfig BIG_RED_MUSHROOM = new BigMushroomFeatureConfig(new SimpleBlockStateProvider(RED_MUSHROOM_BLOCK), new SimpleBlockStateProvider(MUSHROOM_STEM), 2);
   public static final BigMushroomFeatureConfig BIG_BROWN_MUSHROOM = new BigMushroomFeatureConfig(new SimpleBlockStateProvider(BROWN_MUSHROOM_BLOCK), new SimpleBlockStateProvider(MUSHROOM_STEM), 3);

   public static void addCarvers(Biome biomeIn) {
      biomeIn.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
      biomeIn.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.02F)));
   }

   public static void addOceanCarvers(Biome biomeIn) {
      biomeIn.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.06666667F)));
      biomeIn.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.02F)));
      biomeIn.addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CANYON, new ProbabilityConfig(0.02F)));
      biomeIn.addCarver(GenerationStage.Carving.LIQUID, Biome.createCarver(WorldCarver.UNDERWATER_CAVE, new ProbabilityConfig(0.06666667F)));
   }

   public static void func_235189_a_(Biome p_235189_0_) {
      p_235189_0_.func_235063_a_(MINESHAFT_MESA);
      p_235189_0_.func_235063_a_(STRONGHOLD);
   }

   public static void func_235196_b_(Biome p_235196_0_) {
      p_235196_0_.func_235063_a_(MINESHAFT_NORMAL);
      p_235196_0_.func_235063_a_(STRONGHOLD);
   }

   public static void func_235197_c_(Biome p_235197_0_) {
      p_235197_0_.func_235063_a_(MINESHAFT_NORMAL);
      p_235197_0_.func_235063_a_(RUINED_PORTAL);
   }

   /*public static void addStructures1(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, Feature.MINESHAFT.withConfiguration(new MineshaftConfig((double)0.004F, MineshaftStructure.Type.NORMAL)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.PILLAGER_OUTPOST.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, Feature.STRONGHOLD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.SWAMP_HUT.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.DESERT_PYRAMID.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.JUNGLE_TEMPLE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.IGLOO.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.SHIPWRECK.withConfiguration(new ShipwreckConfig(false)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.OCEAN_MONUMENT.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.WOODLAND_MANSION.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.OCEAN_RUIN.withConfiguration(new OceanRuinConfig(OceanRuinStructure.Type.COLD, 0.3F, 0.9F)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, Feature.BURIED_TREASURE.withConfiguration(new BuriedTreasureConfig(0.01F)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.VILLAGE.withConfiguration(new VillageConfig("village/plains/town_centers1", 6)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
   }*/

   public static void addLakes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(WATER)).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(4))));
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(LAVA)).withPlacement(Placement.LAVA_LAKE.configure(new ChanceConfig(80))));
   }

   public static void addWaterLakes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(WATER)).withPlacement(Placement.WATER_LAKE.configure(new ChanceConfig(40))));
   }

   public static void addDesertLakes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.LAKE.withConfiguration(new BlockStateFeatureConfig(LAVA)).withPlacement(Placement.LAVA_LAKE.configure(new ChanceConfig(80))));
   }

   public static void addMonsterRooms(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, Feature.MONSTER_ROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.DUNGEONS.configure(new ChanceConfig(8))));
   }

   public static void addStoneVariants(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIRT, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 256))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GRAVEL, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 256))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GRANITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIORITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ANDESITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
   }

   public static void addKnurth(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, KNURTH, 400)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(100, 0, 0, 2000))));
   }

   public static void addKnurth1(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, KNURTH, 40)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 200))));
   }

   public static void addAir(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, AIR, 400)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(100, 0, 0, 2000))));
   }

   public static void addOres(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, COAL_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, IRON_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GOLD_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, REDSTONE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIAMOND_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 16))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, LAPIS_ORE, 7)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(1, 16, 16))));
   }

   public static void addExtraGoldOre(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GOLD_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 32, 32, 80))));
   }

   public static void addExtraDiamondOre(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIAMOND_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 1, 1, 32))));
   }

   public static void addExtraEmeraldOre(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(STONE, EMERALD_ORE)).withPlacement(Placement.EMERALD_ORE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
   }

   public static void addInfestedStone(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, INFESTED_STONE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 0, 0, 64))));
   }

   public static void addSedimentDisks(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(SAND, 7, 2, Lists.newArrayList(DIRT, GRASS_BLOCK))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(3))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(CLAY, 4, 1, Lists.newArrayList(DIRT, CLAY))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(GRAVEL, 6, 2, Lists.newArrayList(DIRT, GRASS_BLOCK))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));
   }

   public static void addSwampClayDisks(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(CLAY, 4, 1, Lists.newArrayList(DIRT, CLAY))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));
   }

   public static void addTaigaRocks(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(MOSSY_COBBLESTONE, 0)).withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(3))));
   }

   public static void addTaigaLargeFerns(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(LARGE_FERN_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(7))));
   }

   public static void addSparseBerryBushes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SWEET_BERRY_BUSH_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(12))));
   }

   public static void addBerryBushes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SWEET_BERRY_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
   }

   public static void addBamboo(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.BAMBOO.withConfiguration(new ProbabilityConfig(0.0F)).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(16))));
   }

   public static void addBambooJungleVegetation(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.BAMBOO.withConfiguration(new ProbabilityConfig(0.2F)).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(160, 80.0D, 0.3D, Heightmap.Type.WORLD_SURFACE_WG))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(FANCY_TREE_CONFIG).withChance(0.05F), Feature.field_236291_c_.withConfiguration(JUNGLE_GROUND_BUSH_CONFIG).withChance(0.15F), Feature.field_236291_c_.withConfiguration(MEGA_JUNGLE_TREE_CONFIG).withChance(0.7F)), Feature.RANDOM_PATCH.withConfiguration(LUSH_GRASS_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(30, 0.1F, 1))));
   }

   public static void addTaigaConifers(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(PINE_TREE_CONFIG).withChance(0.33333334F)), Feature.field_236291_c_.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
   }

   public static void addScatteredOakTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(FANCY_TREE_CONFIG).withChance(0.1F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
   }

   public static void addBirchTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_236291_c_.withConfiguration(BIRCH_TREE_WITH_FEW_BEEHIVES_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
   }

   public static void addKnurth1Trees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_236291_c_.withConfiguration(KNURTH1_TREE_WITH_BEEHIVES2_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(100, 1.0F, 10))));
   }

   public static void addForestTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(BIRCH_TREE_WITH_FEW_BEEHIVES_CONFIG).withChance(0.2F), Feature.field_236291_c_.withConfiguration(FANCY_TREE_WITH_FEW_BEEHIVES_CONFIG).withChance(0.1F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_WITH_FEW_BEEHIVES_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
   }

   public static void addTallBirchForestTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(BIRCH_TREE_CONFIG_CLASH).withChance(0.5F)), Feature.field_236291_c_.withConfiguration(BIRCH_TREE_WITH_FEW_BEEHIVES_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
   }

   public static void addSavannaTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(ACACIA_TREE_CONFIG).withChance(0.8F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
   }

   public static void addShatteredSavannaTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(ACACIA_TREE_CONFIG).withChance(0.8F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
   }

   public static void addScatteredOakAndSpruceTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(SPRUCE_TREE_CONFIG).withChance(0.666F), Feature.field_236291_c_.withConfiguration(FANCY_TREE_CONFIG).withChance(0.1F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
   }

   public static void addOakAndSpruceTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(SPRUCE_TREE_CONFIG).withChance(0.666F), Feature.field_236291_c_.withConfiguration(FANCY_TREE_CONFIG).withChance(0.1F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
   }

   public static void addJungleTreeForest(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(FANCY_TREE_CONFIG).withChance(0.1F), Feature.field_236291_c_.withConfiguration(JUNGLE_GROUND_BUSH_CONFIG).withChance(0.5F), Feature.field_236291_c_.withConfiguration(MEGA_JUNGLE_TREE_CONFIG).withChance(0.33333334F)), Feature.field_236291_c_.withConfiguration(JUNGLE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(50, 0.1F, 1))));
   }

   public static void addOakAndJungleTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(FANCY_TREE_CONFIG).withChance(0.1F), Feature.field_236291_c_.withConfiguration(JUNGLE_GROUND_BUSH_CONFIG).withChance(0.5F)), Feature.field_236291_c_.withConfiguration(JUNGLE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
   }

   public static void addSparseOakTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_236291_c_.withConfiguration(OAK_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
   }

   public static void addScatteredSpruceTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_236291_c_.withConfiguration(SPRUCE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
   }

   public static void addGiantSpruceTaigaTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).withChance(0.33333334F), Feature.field_236291_c_.withConfiguration(PINE_TREE_CONFIG).withChance(0.33333334F)), Feature.field_236291_c_.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
   }

   public static void addGiantTreeTaigaTrees(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).withChance(0.025641026F), Feature.field_236291_c_.withConfiguration(MEGA_PINE_TREE_CONFIG).withChance(0.30769232F), Feature.field_236291_c_.withConfiguration(PINE_TREE_CONFIG).withChance(0.33333334F)), Feature.field_236291_c_.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
   }

   public static void addJungleGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(LUSH_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(25))));
   }

   public static void addTallGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TALL_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(7))));
   }

   public static void addDenseGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(5))));
   }

   public static void addVeryDenseGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
   }

   public static void addGrassAndDeadBushes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DEAD_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
   }

   public static void addDoubleFlowers(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_RANDOM_SELECTOR.withConfiguration(new MultipleWithChanceRandomFeatureConfig(ImmutableList.of(Feature.RANDOM_PATCH.withConfiguration(LILAC_CONFIG), Feature.RANDOM_PATCH.withConfiguration(ROSE_BUSH_CONFIG), Feature.RANDOM_PATCH.withConfiguration(PEONY_CONFIG), Feature.FLOWER.withConfiguration(LILY_OF_THE_VALLEY_CONFIG)), 0)).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(5))));
   }

   public static void addGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(2))));
   }

   public static void addTrurtrCropsBlock(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TRURTR_CROPS_BLOCK_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(2))));
   }

   public static void addTrurtrCropsBlock1(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TRURTR_CROPS_BLOCK_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(5))));
   }

   public static void addTrurtrCropsBlock2(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TRURTR_CROPS_BLOCK_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
   }

   public static void addSwampVegetation(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_236291_c_.withConfiguration(SWAMP_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(BLUE_ORCHID_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(5))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DEAD_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(LILY_PAD_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(4))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BROWN_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(8, 0.25F))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(RED_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new HeightWithChanceConfig(8, 0.125F))));
   }

   public static void addHugeMushrooms(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_BOOLEAN_SELECTOR.withConfiguration(new TwoFeatureChoiceConfig(Feature.HUGE_RED_MUSHROOM.withConfiguration(BIG_RED_MUSHROOM), Feature.HUGE_BROWN_MUSHROOM.withConfiguration(BIG_BROWN_MUSHROOM))).withPlacement(Placement.COUNT_HEIGHTMAP.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BROWN_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(1, 0.25F))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(RED_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new HeightWithChanceConfig(1, 0.125F))));
   }

   public static void addOakTreesFlowersGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.field_236291_c_.withConfiguration(FANCY_TREE_WITH_MORE_BEEHIVES_CONFIG).withChance(0.33333334F)), Feature.field_236291_c_.withConfiguration(OAK_TREE_WITH_MORE_BEEHIVES_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(0, 0.05F, 1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(PLAINS_FLOWER_CONFIG).withPlacement(Placement.NOISE_HEIGHTMAP_32.configure(new NoiseDependant(-0.8D, 15, 4))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.NOISE_HEIGHTMAP_DOUBLE.configure(new NoiseDependant(-0.8D, 5, 10))));
   }

   public static void addDeadBushes(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DEAD_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(2))));
   }

   public static void addTaigaGrassDeadBushesMushrooms(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TAIGA_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(7))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(DEAD_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BROWN_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(3, 0.25F))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(RED_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new HeightWithChanceConfig(3, 0.125F))));
   }

   public static void addDefaultFlowers(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DEFAULT_FLOWER_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(2))));
   }

   public static void addExtraDefaultFlowers(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DEFAULT_FLOWER_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(4))));
   }

   public static void addSparseGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
   }

   public static void addTaigaGrassAndMushrooms(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TAIGA_GRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BROWN_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(1, 0.25F))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(RED_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP_DOUBLE.configure(new HeightWithChanceConfig(1, 0.125F))));
   }

   public static void addPlainsTallGrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(TALL_GRASS_CONFIG).withPlacement(Placement.NOISE_HEIGHTMAP_32.configure(new NoiseDependant(-0.8D, 0, 7))));
   }

   public static void addMushrooms(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BROWN_MUSHROOM_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(4))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(RED_MUSHROOM_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(8))));
   }

   public static void addReedsAndPumpkins(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SUGAR_CANE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(PUMPKIN_PATCH_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(32))));
   }

   public static void addReedsPumpkinsCactus(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SUGAR_CANE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(13))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(PUMPKIN_PATCH_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(32))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(CACTUS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(5))));
   }

   public static void addJunglePlants(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(MELON_PATCH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.VINES.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHT_64.configure(new FrequencyConfig(50))));
   }

   public static void addExtraReedsPumpkinsCactus(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SUGAR_CANE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(60))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(PUMPKIN_PATCH_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(32))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(CACTUS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10))));
   }

   public static void addExtraReedsAndPumpkins(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SUGAR_CANE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(20))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(PUMPKIN_PATCH_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(32))));
   }

   public static void addDesertFeatures(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.DESERT_WELL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP.configure(new ChanceConfig(1000))));
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.CHANCE_PASSTHROUGH.configure(new ChanceConfig(64))));
   }

   public static void addFossils(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.FOSSIL.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.CHANCE_PASSTHROUGH.configure(new ChanceConfig(64))));
   }

   public static void addExtraKelp(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.KELP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(120, 80.0D, 0.0D, Heightmap.Type.OCEAN_FLOOR_WG))));
   }

   public static void addSeagrass(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SIMPLE_BLOCK.withConfiguration(new BlockWithContextConfig(SEAGRASS, ImmutableList.of(STONE), ImmutableList.of(WATER), ImmutableList.of(WATER))).withPlacement(Placement.CARVING_MASK.configure(new CaveEdgeConfig(GenerationStage.Carving.LIQUID, 0.1F))));
   }

   public static void addTallSeagrassSparse(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.withConfiguration(new SeaGrassConfig(80, 0.3D)).withPlacement(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
   }

   public static void addTallSeagrassLush(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SEAGRASS.withConfiguration(new SeaGrassConfig(80, 0.8D)).withPlacement(Placement.TOP_SOLID_HEIGHTMAP.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
   }

   public static void addKelp(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.KELP.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(80, 80.0D, 0.0D, Heightmap.Type.OCEAN_FLOOR_WG))));
   }

   public static void addSprings(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SPRING_FEATURE.withConfiguration(WATER_SPRING_CONFIG).withPlacement(Placement.COUNT_BIASED_RANGE.configure(new CountRangeConfig(50, 8, 8, 256))));
      biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SPRING_FEATURE.withConfiguration(LAVA_SPRING_CONFIG).withPlacement(Placement.COUNT_VERY_BIASED_RANGE.configure(new CountRangeConfig(20, 8, 16, 256))));
   }

   public static void addIcebergs(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.ICEBERG.withConfiguration(new BlockStateFeatureConfig(PACKED_ICE)).withPlacement(Placement.ICEBERG.configure(new ChanceConfig(16))));
      biomeIn.addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.ICEBERG.withConfiguration(new BlockStateFeatureConfig(BLUE_ICE)).withPlacement(Placement.ICEBERG.configure(new ChanceConfig(200))));
   }

   public static void addBlueIce(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.BLUE_ICE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.RANDOM_COUNT_RANGE.configure(new CountRangeConfig(20, 30, 32, 64))));
   }

   public static void addFreezeTopLayer(Biome biomeIn) {
      biomeIn.addFeature(GenerationStage.Decoration.TOP_LAYER_MODIFICATION, Feature.FREEZE_TOP_LAYER.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
   }

   public static void addEndCity(Biome p_225489_0_) {
      p_225489_0_.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, Feature.END_ISLAND.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
   }
}