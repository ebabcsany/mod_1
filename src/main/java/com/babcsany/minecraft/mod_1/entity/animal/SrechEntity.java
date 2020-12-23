package com.babcsany.minecraft.mod_1.entity.animal;

import com.babcsany.minecraft.mod_1.init.BlockInit;
import com.babcsany.minecraft.mod_1.init.EntityInit;
import com.babcsany.minecraft.mod_1.init.ItemInit;
import com.babcsany.minecraft.mod_1.entity.SrechEntityActionResultType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SrechEntity extends AnimalEntity {
   public SrechEntity(EntityType<? extends SrechEntity> type, World worldIn) {
      super(type, worldIn);
   }

   protected void registerGoals() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new PanicGoal(this, 10.0D));
      this.goalSelector.addGoal(2, new BreedGoal(this, 5.0D));
      this.goalSelector.addGoal(3, new TemptGoal(this, 5.25D, Ingredient.fromItems(BlockInit.GRUVTRERS.get()), false));
      this.goalSelector.addGoal(4, new FollowParentGoal(this, 6.25D));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 5.0D));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 30.0F));
      this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
   }

   public static AttributeModifierMap.MutableAttribute gsetCustomAttributes() {
      return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 5000.0D).createMutableAttribute(Attributes.MOVEMENT_SPEED, (double)0.5F);
   }

   protected SoundEvent getAmbientSound() {
      return SoundEvents.ENTITY_COW_AMBIENT;
   }

   protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
      return SoundEvents.ENTITY_COW_HURT;
   }

   protected SoundEvent getDeathSound() {
      return SoundEvents.ENTITY_COW_DEATH;
   }

   protected void playStepSound(BlockPos pos, BlockState blockIn) {
      this.playSound(SoundEvents.ENTITY_COW_STEP, 0.75F, 5.0F);
   }

   /**
    * Returns the volume for the sounds this mob makes.
    */
   protected float getSoundVolume() {
      return 2.0F;
   }

   public SrechEntityActionResultType drurn_action_0_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE0.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_0_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_1_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE1.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_1_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_2_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE2.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_2_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_3_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE3.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_3_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_4_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE4.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_4_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_5_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE5.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_5_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_6_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE6.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_6_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_7_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE7.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_7_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntityActionResultType drurn_action_8_(PlayerEntity p_230254_1_, Hand p_230254_2_) {
      ItemStack itemstack = p_230254_1_.getHeldItem(p_230254_2_);
      if (itemstack.getItem() == ItemInit.DRURN_STAGE8.get() && !this.isChild()) {
         p_230254_1_.playSound(SoundEvents.ENTITY_COW_MILK, 5.0F, 5.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemstack, p_230254_1_, ItemInit.DRURN_STAGES.get().getDefaultInstance());
         p_230254_1_.setHeldItem(p_230254_2_, itemstack1);
         return SrechEntityActionResultType.drurn_action_8_(this.world.isRemote);
      } else {
         return super.drurn_action(p_230254_1_, p_230254_2_);
      }
   }

   public SrechEntity createChild(AgeableEntity ageable) {
      return EntityInit.SRECH_ENTITY.get().create(this.world);
   }

   protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
      return this.isChild() ? sizeIn.height * 5.75F : 6.5F;
   }
}