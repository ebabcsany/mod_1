package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.Mod_1;
import com.babcsany.minecraft.mod_1.world.biome.KnurthBiome;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.babcsany.minecraft.mod_1.world.surfacebuilders.*;

public class BiomeInit {
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES,
			Mod_1.MOD_ID);
	
	public static final RegistryObject<Biome> KNURTH_BIOME = BIOMES
			.register("example_biome",
					() -> new KnurthBiome(
							new Biome.Builder().precipitation(RainType.SNOW).scale(1.2f).temperature(0.5f)
									.func_235097_a_((new BiomeAmbience.Builder()).setWaterColor(16777215).setWaterFogColor(16777210).setFogColor(1677241).build())
									.surfaceBuilder(
											new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
													register("example_surface",
															new KnurthBiomeSurfaceBuilder(
																	SurfaceBuilderConfig.field_237203_a_)),
													new SurfaceBuilderConfig(BlockInit.KNURTH.get().getDefaultState(),
															BlockInit.KNURTH.get().getDefaultState(),
															BlockInit.KNURTH.get().getDefaultState())))
									.category(Category.THEEND).downfall(0.5f).depth(0.12f).parent(null)
					));

	public static void registerBiomes() {
		registerBiomeCool(KNURTH_BIOME.get(), Type.OVERWORLD, Type.OVERWORLD);
	}

	private static void registerBiomeCool(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10000));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	private static void registerBiomeCool1(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100000));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	private static void registerBiomeCool2(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 1000000));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	private static void registerBiomeDesert(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biome, 1000000));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	private static void registerBiomeIcy(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(biome, 1000000));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	private static void registerBiomeWarm(Biome biome, Type... types) {
		// the line below will make it spawn in the overworld
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 1000000));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}

	@SuppressWarnings("deprecation")
	private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
		return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
	}
}
