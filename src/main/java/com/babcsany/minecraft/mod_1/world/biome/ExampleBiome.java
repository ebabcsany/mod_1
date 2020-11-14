package com.babcsany.minecraft.mod_1.world.biome;

import com.babcsany.minecraft.mod_1.world.feature.ModDefaultBiomeFeatures;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.*;

public class ExampleBiome extends Biome {
	public ExampleBiome(Builder biomeBuilder) {
		super(biomeBuilder);
		this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 10, 2, 5));
		this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 20, 2, 10));
		DefaultBiomeFeatures.func_235197_c_(this);
		ModDefaultBiomeFeatures.addKnurth(this);
	}
	
	@Override
	public int getGrassColor(double posX, double posZ) {
		return 0x000000;
	}
}

//update mappings post command:
//gradlew --refresh-dependencies
