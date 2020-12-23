package com.babcsany.minecraft.mod_1.particles;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleType;
import net.minecraft.util.registry.Registry;

public class BasicParticleType1 extends ParticleType<BasicParticleType1> implements IParticleData {
   public static final IDeserializer<BasicParticleType1> DESERIALIZER = new IDeserializer<BasicParticleType1>() {
      public BasicParticleType1 deserialize(ParticleType<BasicParticleType1> particleTypeIn, StringReader reader) throws CommandSyntaxException {
         return (BasicParticleType1)particleTypeIn;
      }

      public BasicParticleType1 read(ParticleType<BasicParticleType1> particleTypeIn, PacketBuffer buffer) {
         return (BasicParticleType1)particleTypeIn;
      }
   };
   private final Codec<BasicParticleType1> field_239825_b_ = Codec.unit(this::getType);

   public BasicParticleType1(boolean alwaysShow) {
      super(alwaysShow, DESERIALIZER);
   }

   public BasicParticleType1 getType() {
      return this;
   }

   public Codec<BasicParticleType1> func_230522_e_() {
      return this.field_239825_b_;
   }

   public void write(PacketBuffer buffer) {
   }

   public String getParameters() {
      return Registry.PARTICLE_TYPE.getKey(this).toString();
   }
}