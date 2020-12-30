package com.babcsany.minecraft.mod_1.entity;

import com.babcsany.minecraft.mod_1.entity.ai.BredSrechEntityTrigger;
import com.babcsany.minecraft.mod_1.entity.ai.TameSrechEntityTrigger;
import com.google.common.collect.Maps;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraft.advancements.criterion.*;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Map;

public class ModCriteriaTriggers {
   private static final Map<ResourceLocation, ICriterionTrigger<?>> REGISTRY = Maps.newHashMap();
   public static final BredSrechEntityTrigger BRED_SRECH_ENTITY_TRIGGER = register(new BredSrechEntityTrigger());
   public static final PositionTrigger LOCATION = register(new PositionTrigger(new ResourceLocation("location")));
   public static final PositionTrigger SLEPT_IN_BED = register(new PositionTrigger(new ResourceLocation("slept_in_bed")));
   public static final CuredZombieVillagerTrigger CURED_ZOMBIE_VILLAGER = register(new CuredZombieVillagerTrigger());
   public static final VillagerTradeTrigger VILLAGER_TRADE = register(new VillagerTradeTrigger());
   public static final ItemDurabilityTrigger ITEM_DURABILITY_CHANGED = register(new ItemDurabilityTrigger());
   public static final LevitationTrigger LEVITATION = register(new LevitationTrigger());
   public static final ChangeDimensionTrigger CHANGED_DIMENSION = register(new ChangeDimensionTrigger());
   public static final TickTrigger TICK = register(new TickTrigger());
   public static final TameAnimalTrigger TAME_ANIMAL = register(new TameAnimalTrigger());
   public static final TameSrechEntityTrigger TAME_SRECH_ENTITY_TRIGGER = register(new TameSrechEntityTrigger());
   public static final PlacedBlockTrigger PLACED_BLOCK = register(new PlacedBlockTrigger());
   public static final ConsumeItemTrigger CONSUME_ITEM = register(new ConsumeItemTrigger());
   public static final EffectsChangedTrigger EFFECTS_CHANGED = register(new EffectsChangedTrigger());
   public static final UsedTotemTrigger USED_TOTEM = register(new UsedTotemTrigger());
   public static final NetherTravelTrigger NETHER_TRAVEL = register(new NetherTravelTrigger());
   public static final FishingRodHookedTrigger FISHING_ROD_HOOKED = register(new FishingRodHookedTrigger());
   public static final ChanneledLightningTrigger CHANNELED_LIGHTNING = register(new ChanneledLightningTrigger());
   public static final ShotCrossbowTrigger SHOT_CROSSBOW = register(new ShotCrossbowTrigger());
   public static final KilledByCrossbowTrigger KILLED_BY_CROSSBOW = register(new KilledByCrossbowTrigger());
   public static final PositionTrigger HERO_OF_THE_VILLAGE = register(new PositionTrigger(new ResourceLocation("hero_of_the_village")));
   public static final PositionTrigger VOLUNTARY_EXILE = register(new PositionTrigger(new ResourceLocation("voluntary_exile")));
   public static final SlideDownBlockTrigger SLIDE_DOWN_BLOCK = register(new SlideDownBlockTrigger());
   public static final BeeNestDestroyedTrigger BEE_NEST_DESTROYED = register(new BeeNestDestroyedTrigger());
   public static final TargetHitTrigger TARGET_HIT = register(new TargetHitTrigger());
   public static final RightClickBlockWithItemTrigger RIGHT_CLICK_BLOCK_WITH_ITEM = register(new RightClickBlockWithItemTrigger());
   public static final PlayerGeneratesContainerLootTrigger PLAYER_GENERATES_CONTAINER_LOOT = register(new PlayerGeneratesContainerLootTrigger());
   public static final ThrownItemPickedUpByEntityTrigger THROWN_ITEM_PICKED_UP_BY_ENTITY = register(new ThrownItemPickedUpByEntityTrigger());
   public static final PlayerEntityInteractionTrigger PLAYER_ENTITY_INTERACTION = register(new PlayerEntityInteractionTrigger());

   public static <T extends ICriterionTrigger<?>> T register(T criterion) {
      if (REGISTRY.containsKey(criterion.getId())) {
         throw new IllegalArgumentException("Duplicate criterion id " + criterion.getId());
      } else {
         REGISTRY.put(criterion.getId(), criterion);
         return criterion;
      }
   }

   @Nullable
   public static <T extends ICriterionInstance> ICriterionTrigger<T> get(ResourceLocation id) {
      return (ICriterionTrigger<T>) REGISTRY.get(id);
   }

   public static Iterable<? extends ICriterionTrigger<?>> getAll() {
      return REGISTRY.values();
   }
}