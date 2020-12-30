package com.babcsany.minecraft.mod_1.client.entity.render;

import com.babcsany.minecraft.mod_1.Mod_1;
import com.babcsany.minecraft.mod_1.client.entity.model.SrechModel;
import com.babcsany.minecraft.mod_1.entity.animal.SrechEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SrechRender extends MobRenderer<SrechEntity, SrechModel<SrechEntity>> {
   private static final ResourceLocation SRECH_TEXTURES = new ResourceLocation(Mod_1.MOD_ID,"textures/entity/srech.png");

   public SrechRender(EntityRendererManager renderManagerIn) {
      super(renderManagerIn, new SrechModel<>(), 0.7F);
   }

   /**
    * Returns the location of an entity's texture.
    */
   public ResourceLocation getEntityTexture(SrechEntity entity) {
      return SRECH_TEXTURES;
   }
}