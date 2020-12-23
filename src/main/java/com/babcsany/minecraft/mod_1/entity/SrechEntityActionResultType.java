package com.babcsany.minecraft.mod_1.entity;

public enum SrechEntityActionResultType {
   SUCCESS,
   CONSUME,
   PASS,
   FAIL;

   public boolean isSuccessOrConsume() {
      return this == SUCCESS || this == CONSUME;
   }

   public boolean isSuccess() {
      return this == SUCCESS;
   }

   public static SrechEntityActionResultType drurn_action(boolean drurn_action) {
      return drurn_action ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_0_(boolean drurn_action_0_) {
      return drurn_action_0_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_1_(boolean drurn_action_1_) {
      return drurn_action_1_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_2_(boolean drurn_action_2_) {
      return drurn_action_2_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_3_(boolean drurn_action_3_) {
      return drurn_action_3_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_4_(boolean drurn_action_4_) {
      return drurn_action_4_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_5_(boolean drurn_action_5_) {
      return drurn_action_5_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_6_(boolean drurn_action_6_) {
      return drurn_action_6_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_7_(boolean drurn_action_7_) {
      return drurn_action_7_ ? SUCCESS : CONSUME;
   }

   public static SrechEntityActionResultType drurn_action_8_(boolean drurn_action_8_) {
      return drurn_action_8_ ? SUCCESS : CONSUME;
   }
}