package com.babcsany.minecraft.mod_1.entity.ai;

import com.babcsany.minecraft.mod_1.entity.animal.AbstractSrechEntity;
import com.google.gson.JsonObject;
import net.minecraft.advancements.criterion.AbstractCriterionTrigger;
import net.minecraft.advancements.criterion.CriterionInstance;
import net.minecraft.advancements.criterion.EntityPredicate;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.loot.ConditionArrayParser;
import net.minecraft.loot.ConditionArraySerializer;
import net.minecraft.loot.LootContext;
import net.minecraft.util.ResourceLocation;

public class TameSrechEntityTrigger extends AbstractCriterionTrigger<TameSrechEntityTrigger.Instance> {
   private static final ResourceLocation ID = new ResourceLocation("tame_animal");

   public ResourceLocation getId() {
      return ID;
   }

   public TameSrechEntityTrigger.Instance deserializeTrigger(JsonObject json, EntityPredicate.AndPredicate entityPredicate, ConditionArrayParser conditionsParser) {
      EntityPredicate.AndPredicate entitypredicate$andpredicate = EntityPredicate.AndPredicate.deserializeJSONObject(json, "entity", conditionsParser);
      return new TameSrechEntityTrigger.Instance(entityPredicate, entitypredicate$andpredicate);
   }

   public void trigger(ServerPlayerEntity player, AbstractSrechEntity entity) {
      LootContext lootcontext = EntityPredicate.getLootContext(player, entity);
      this.triggerListeners(player, (p_227251_1_) -> {
         return p_227251_1_.test(lootcontext);
      });
   }

   public static class Instance extends CriterionInstance {
      private final EntityPredicate.AndPredicate entity;

      public Instance(EntityPredicate.AndPredicate player, EntityPredicate.AndPredicate entity) {
         super(TameSrechEntityTrigger.ID, player);
         this.entity = entity;
      }

      public static TameSrechEntityTrigger.Instance any() {
         return new TameSrechEntityTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, EntityPredicate.AndPredicate.ANY_AND);
      }

      public static TameSrechEntityTrigger.Instance create(EntityPredicate entityCondition) {
         return new TameSrechEntityTrigger.Instance(EntityPredicate.AndPredicate.ANY_AND, EntityPredicate.AndPredicate.createAndFromEntityCondition(entityCondition));
      }

      public boolean test(LootContext context) {
         return this.entity.testContext(context);
      }

      public JsonObject serialize(ConditionArraySerializer conditions) {
         JsonObject jsonobject = super.serialize(conditions);
         jsonobject.add("entity", this.entity.serializeConditions(conditions));
         return jsonobject;
      }
   }
}