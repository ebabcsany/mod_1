package com.babcsany.minecraft.mod_1.world.surfacebuilders;

import com.babcsany.minecraft.mod_1.init.BlockInit;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class KnurthBiomeSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

	public KnurthBiomeSurfaceBuilder(Codec<SurfaceBuilderConfig> function) {
		super(function);
	}

	@Override
	public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
			BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
		Random rd = new Random();
		int i = rd.nextInt(14);
		if (i == 0) {
			SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
					defaultFluid, seaLevel, seed,
					new SurfaceBuilderConfig(BlockInit.KNURTH.get().getDefaultState(),
							BlockInit.KNURTH.get().getDefaultState(), BlockInit.KNURTH.get().getDefaultState()
					));
		} else {
			SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
					defaultFluid, seaLevel, seed,
					new SurfaceBuilderConfig(
							i == 1 ? BlockInit.KNURTH.get().getDefaultState()
									: BlockInit.KNURTH.get().getDefaultState(),
							BlockInit.KNURTH.get().getDefaultState(), BlockInit.KNURTH.get().getDefaultState()
					));
		}
	}
}
