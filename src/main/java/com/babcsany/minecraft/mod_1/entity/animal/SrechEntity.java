package com.babcsany.minecraft.mod_1.entity.animal;

import com.babcsany.minecraft.mod_1.entity.ai.goal.SrechEntityBreedGoal;
import com.babcsany.minecraft.mod_1.entity.ai.goal.SrechEntityFollowParentGoal;
import com.babcsany.minecraft.mod_1.init.EntityInit;
import com.babcsany.minecraft.mod_1.init.ItemInit;
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

public class SrechEntity extends AbstractSrechEntity {
   public SrechEntity(EntityType<? extends AbstractSrechEntity> type, World worldIn) {
      super(type, worldIn);
   }

   protected void registerGoals() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
      this.goalSelector.addGoal(2, new SrechEntityBreedGoal(this, 1.0D));
      this.goalSelector.addGoal(3, new TemptGoal(this, 1.25D, Ingredient.fromItems(ItemInit.DRURURN.get()), false));
      this.goalSelector.addGoal(4, new SrechEntityFollowParentGoal(this, 1.25D));
      this.goalSelector.addGoal(5, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
      this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
      this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
   }

   public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
      return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MAX_HEALTH, 40.0D).createMutableAttribute(Attributes.MOVEMENT_SPEED, (double)1.0F);
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
      this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
   }

   /**
    * Returns the volume for the sounds this mob makes.
    */
   protected float getSoundVolume() {
      return 0.2F;
   }

   public ActionResultType func_230254_b_(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE0.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return ActionResultType.func_233537_a_(this.world.isRemote);
      } else {
         return super.func_230254_b_(playerEntity, hand);
      }
   }

   /*public SrechEntityActionResultType drurn_action(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE0.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE1.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE2.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE3.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE4.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE5.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE6.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE7.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      }
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE8.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGES.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action(this.world.isRemote);
      } else {
         return super.drurn_action(playerEntity, hand);
      }
   }

   /*public SrechEntityActionResultType drurn_action_1(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE1.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_1_(this.world.isRemote);
      } else {
         return super.drurn_action_1(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_2(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE2.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_2_(this.world.isRemote);
      } else {
         return super.drurn_action_2(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_3(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE3.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_3_(this.world.isRemote);
      } else {
         return super.drurn_action_3(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_4(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE4.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_4_(this.world.isRemote);
      } else {
         return super.drurn_action_4(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_5(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE5.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_5_(this.world.isRemote);
      } else {
         return super.drurn_action_5(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_6(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE6.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_6_(this.world.isRemote);
      } else {
         return super.drurn_action_6(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_7(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE7.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGE8.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_7_(this.world.isRemote);
      } else {
         return super.drurn_action_7(playerEntity, hand);
      }
   }

   public SrechEntityActionResultType drurn_action_8(PlayerEntity playerEntity, Hand hand) {
      ItemStack itemStack = playerEntity.getHeldItem(hand);
      if (itemStack.getItem() == ItemInit.DRURN_STAGE_DRURN_STAGE8.get() && !this.isChild()) {
         playerEntity.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
         ItemStack itemstack1 = DrinkHelper.func_241445_a_(itemStack, playerEntity, ItemInit.DRURN_STAGES.get().getDefaultInstance());
         playerEntity.setHeldItem(hand, itemstack1);
         return SrechEntityActionResultType.drurn_action_8_(this.world.isRemote);
      } else {
         return super.drurn_action_8(playerEntity, hand);
      }
   }*/

   public SrechEntity createChild(AgeableEntity ageable) {
      return EntityInit.SRECH_ENTITY.get().create(this.world);
   }

   protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
      return this.isChild() ? sizeIn.height * 1.9F : 2.6F;
   }
}