package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.Mod_1;
import com.babcsany.minecraft.mod_1.entity.animal.SrechEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            Mod_1.MOD_ID);

    public static final RegistryObject<EntityType<SrechEntity>> SRECH_ENTITY = ENTITY_TYPES
            .register("srech_entity",
                    () -> EntityType.Builder.<SrechEntity>create(SrechEntity::new, EntityClassification.CREATURE)
                            .size(1.6f, 3.2f).func_233606_a_(10)
                            .build(new ResourceLocation(Mod_1.MOD_ID, "srach/srech").toString()
                            ));
}
