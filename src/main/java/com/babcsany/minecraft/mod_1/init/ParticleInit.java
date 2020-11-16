package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.Mod_1;
import com.babcsany.minecraft.mod_1.particles.ColouredParticle;
import com.mojang.serialization.Codec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleInit {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Mod_1.MOD_ID);

    public static final RegistryObject<ParticleType<ColouredParticle.ColouredParticleData>> COLOURED_PARTICLE = PARTICLE_TYPES.register(
            "coloured_particle",
            () -> new ParticleType<ColouredParticle.ColouredParticleData>(false, ColouredParticle.ColouredParticleData.DESERIALIZER) {
                @Override
                public Codec<ColouredParticle.ColouredParticleData> func_230522_e_() {
                    return null;
                }
            });

    @SuppressWarnings("resource")
    @SubscribeEvent
    public static void registerParticleFactory(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particles.registerFactory(ParticleInit.COLOURED_PARTICLE.get(),
                ColouredParticle.Factory::new);
    }
}