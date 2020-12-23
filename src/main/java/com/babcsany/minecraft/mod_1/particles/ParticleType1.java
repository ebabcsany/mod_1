package com.babcsany.minecraft.mod_1.particles;

import com.mojang.serialization.Codec;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public abstract class ParticleType1<T extends IParticleData1>  extends net.minecraftforge.registries.ForgeRegistryEntry<ParticleType1<?>>{
   private final boolean alwaysShow;
   private final IParticleData1.IDeserializer<T> deserializer;

   public ParticleType1(boolean alwaysShow, IParticleData1.IDeserializer<T> deserializer) {
      this.alwaysShow = alwaysShow;
      this.deserializer = deserializer;
   }

   @OnlyIn(Dist.CLIENT)
   public boolean getAlwaysShow() {
      return this.alwaysShow;
   }

   public IParticleData1.IDeserializer<T> getDeserializer() {
      return this.deserializer;
   }

   public abstract Codec<T> func_230522_e_();
}