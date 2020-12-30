package com.babcsany.minecraft.mod_1.entity.ai.goal;

import com.babcsany.minecraft.mod_1.entity.animal.AbstractSrechEntity;
import net.minecraft.entity.ai.goal.Goal;

import java.util.List;

public class SrechEntityFollowParentGoal extends Goal {
   private final AbstractSrechEntity childAnimal;
   private AbstractSrechEntity parentAnimal;
   private final double moveSpeed;
   private int delayCounter;

   public SrechEntityFollowParentGoal(AbstractSrechEntity animal, double speed) {
      this.childAnimal = animal;
      this.moveSpeed = speed;
   }

   /**
    * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
    * method as well.
    */
   public boolean shouldExecute() {
      if (this.childAnimal.getGrowingAge() >= 0) {
         return false;
      } else {
         List<AbstractSrechEntity> list = this.childAnimal.world.getEntitiesWithinAABB(this.childAnimal.getClass(), this.childAnimal.getBoundingBox().grow(8.0D, 4.0D, 8.0D));
         AbstractSrechEntity animalentity = null;
         double d0 = Double.MAX_VALUE;

         for(AbstractSrechEntity animalentity1 : list) {
            if (animalentity1.getGrowingAge() >= 0) {
               double d1 = this.childAnimal.getDistanceSq(animalentity1);
               if (!(d1 > d0)) {
                  d0 = d1;
                  animalentity = animalentity1;
               }
            }
         }

         if (animalentity == null) {
            return false;
         } else if (d0 < 9.0D) {
            return false;
         } else {
            this.parentAnimal = animalentity;
            return true;
         }
      }
   }

   /**
    * Returns whether an in-progress EntityAIBase should continue executing
    */
   public boolean shouldContinueExecuting() {
      if (this.childAnimal.getGrowingAge() >= 0) {
         return false;
      } else if (!this.parentAnimal.isAlive()) {
         return false;
      } else {
         double d0 = this.childAnimal.getDistanceSq(this.parentAnimal);
         return !(d0 < 9.0D) && !(d0 > 256.0D);
      }
   }

   /**
    * Execute a one shot task or start executing a continuous task
    */
   public void startExecuting() {
      this.delayCounter = 0;
   }

   /**
    * Reset the task's internal state. Called when this task is interrupted by another one
    */
   public void resetTask() {
      this.parentAnimal = null;
   }

   /**
    * Keep ticking a continuous task that has already been started
    */
   public void tick() {
      if (--this.delayCounter <= 0) {
         this.delayCounter = 10;
         this.childAnimal.getNavigator().tryMoveToEntityLiving(this.parentAnimal, this.moveSpeed);
      }
   }
}