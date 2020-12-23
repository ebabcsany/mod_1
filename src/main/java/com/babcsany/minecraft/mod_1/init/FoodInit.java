package com.babcsany.minecraft.mod_1.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {

    public static final Food TRURTR = (new Food.Builder()).hunger(160).saturation(30.0F).effect(new EffectInstance(Effects.INSTANT_HEALTH, 3000, 10000), 10000).fastToEat().build();
    public static final Food KRUTH = (new Food.Builder()).hunger(1).saturation(0.15625F).effect(new EffectInstance(Effects.WATER_BREATHING, 3000, 10000), 10000).fastToEat().build();
    public static final Food DRURURN = (new Food.Builder()).hunger(10).saturation(5.0F).effect(new EffectInstance(Effects.NAUSEA, 60, 30), 30).effect(new EffectInstance(Effects.HUNGER, 360, 90), 90).effect(new EffectInstance(Effects.UNLUCK, 60, 30), 30).effect(new EffectInstance(Effects.INSTANT_DAMAGE, 1, 1),1).effect(new EffectInstance(Effects.SLOWNESS,5, 10),10).effect(new EffectInstance(Effects.SATURATION,10,2),1).effect(new EffectInstance(Effects.WEAKNESS,60,30),30).effect(new EffectInstance(Effects.MINING_FATIGUE,60,30),30).effect(new EffectInstance(Effects.GLOWING,60,30),30).effect(new EffectInstance(Effects.WITHER,1,1),1).meat().build();
    public static final Food DRURN = (new Food.Builder()).hunger(1).saturation(0.05F).effect(new EffectInstance(Effects.WITHER, 12, 1), 1).build();
    public static final Food DRURN_STAGE = (new Food.Builder()).hunger(0).saturation(0.0375F).effect(new EffectInstance(Effects.WITHER, 4, 1), 1).build();
    public static final Food DRURN_STAGE0 = (new Food.Builder()).hunger(4).saturation(1.0F).effect(new EffectInstance(Effects.SATURATION,10,2),1).effect(new EffectInstance(Effects.WITHER, 20, 1), 1).meat().build();
    public static final Food DRURN_STAGE1 = (new Food.Builder()).hunger(6).saturation(2.0F).build();
    public static final Food DRURN_STAGE2 = (new Food.Builder()).hunger(8).saturation(3.0F).build();
    public static final Food DRURN_STAGE3 = (new Food.Builder()).hunger(10).saturation(4.0F).build();
    public static final Food DRURN_STAGE4 = (new Food.Builder()).hunger(12).saturation(5.0F).build();
    public static final Food DRURN_STAGE5 = (new Food.Builder()).hunger(14).saturation(6.0F).build();
    public static final Food DRURN_STAGE6 = (new Food.Builder()).hunger(16).saturation(7.0F).build();
    public static final Food DRURN_STAGE7 = (new Food.Builder()).hunger(18).saturation(8.0F).build();
    public static final Food DRURN_STAGE8 = (new Food.Builder()).hunger(20).saturation(9.0F).build();
    public static final Food DRURN_STAGES = (new Food.Builder()).hunger(30).saturation(10.0F).effect(new EffectInstance(Effects.REGENERATION, 50, 10), 10).fastToEat().build();

    private static Food buildSherk(int hunger) {
        return (new Food.Builder()).hunger(hunger).saturation(5.0F).build();
    }
}
