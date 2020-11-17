package com.babcsany.minecraft.mod_1.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {

    public static final Food TRURTR = (new Food.Builder()).hunger(160).saturation(30.0F).effect(new EffectInstance(Effects.REGENERATION, 3000, 100), 100.0F).fastToEat().build();

}
