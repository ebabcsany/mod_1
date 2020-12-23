package com.babcsany.minecraft.mod_1.client.entity.model;

import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SrechModel<T extends Entity> extends QuadrupedModel<T> {
   public SrechModel() {
      super(60, 0.0F, false, 50.0F, 20.0F, 10.0F, 10.0F, 120);
      this.headModel = new ModelRenderer(this, 0, 0);
      this.headModel.addBox(-20.0F, -20.0F, -30.0F, 40.0F, 40.0F, 30.0F, 0.0F);
      this.headModel.setRotationPoint(0.0F, 20.0F, -40.0F);
      this.headModel.setTextureOffset(110, 0).addBox(-25.0F, -25.0F, -20.0F, 5.0F, 15.0F, 5.0F, 0.0F);
      this.headModel.setTextureOffset(110, 0).addBox(20.0F, -25.0F, -20.0F, 5.0F, 15.0F, 5.0F, 0.0F);
      this.body = new ModelRenderer(this, 90, 20);
      this.body.addBox(-30.0F, -50.0F, -35.0F, 60.0F, 90.0F, 50.0F, 0.0F);
      this.body.setRotationPoint(0.0F, 25.0F, 10.0F);
      this.body.setTextureOffset(260, 0).addBox(-10.0F, 10.0F, -40.0F, 20.0F, 30.0F, 5.0F);
      --this.legBackRight.rotationPointX;
      ++this.legBackLeft.rotationPointX;
      this.legBackRight.rotationPointZ += 0.0F;
      this.legBackLeft.rotationPointZ += 0.0F;
      --this.legFrontRight.rotationPointX;
      ++this.legFrontLeft.rotationPointX;
      --this.legFrontRight.rotationPointZ;
      --this.legFrontLeft.rotationPointZ;
   }

   public ModelRenderer getHead() {
      return this.headModel;
   }
}