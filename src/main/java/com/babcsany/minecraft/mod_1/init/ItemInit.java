package com.babcsany.minecraft.mod_1.init;

import com.babcsany.minecraft.mod_1.Mod_1;
import com.babcsany.minecraft.mod_1.item.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_1.MOD_ID);

    public static final RegistryObject<Item> TRURTR = ITEMS.register("crops/trurtr", () -> new Item(
            (new Item.Properties()).food(FoodInit.TRURTR)
    ));
    public static final RegistryObject<Item> KRUTH = ITEMS.register("kruth", () -> new Item(
            (new Item.Properties()).food(FoodInit.KRUTH)
    ));
    public static final RegistryObject<Item> TRURTR_SEEDS = ITEMS.register("seeds/trurtr_seeds", () -> new BlockNamedItem(
            BlockInit.TRURTR_STAGE.get(), (new Item.Properties())
    ));
    public static final RegistryObject<Item> KNURTH_PICKAXE = ITEMS.register("knurth_pickaxe", () -> new PickaxeItem(
            ModItemTier.KNURTH, 1, -2.8F, (new Item.Properties())
    ));
    public static final RegistryObject<Item> DRURURN = ITEMS.register("drururn", () -> new Item(
            (new Item.Properties()).food(FoodInit.DRURURN)
    ));
    public static final RegistryObject<Item> DRURN = ITEMS.register("drurn", () -> new Item(
            (new Item.Properties()).food(FoodInit.DRURN)
    ));
    public static final RegistryObject<Item> DRURN_STAGE = ITEMS.register("drurn_stage", () -> new Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE)
    ));
    public static final RegistryObject<Item> DRURN_STAGE0 = ITEMS.register("drurn_stage0", () -> new DrurnStage0Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE0)
    ));
    public static final RegistryObject<Item> DRURN_STAGE1 = ITEMS.register("drurn_stage1", () -> new DrurnStage1Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE1)
    ));
    public static final RegistryObject<Item> DRURN_STAGE2 = ITEMS.register("drurn_stage2", () -> new DrurnStage2Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE2)
    ));
    public static final RegistryObject<Item> DRURN_STAGE3 = ITEMS.register("drurn_stage3", () -> new DrurnStage3Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE3)
    ));
    public static final RegistryObject<Item> DRURN_STAGE4 = ITEMS.register("drurn_stage4", () -> new DrurnStage4Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE4)
    ));
    public static final RegistryObject<Item> DRURN_STAGE5 = ITEMS.register("drurn_stage5", () -> new DrurnStage5Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE5)
    ));
    public static final RegistryObject<Item> DRURN_STAGE6 = ITEMS.register("drurn_stage6", () -> new DrurnStage6Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE6)
    ));
    public static final RegistryObject<Item> DRURN_STAGE7 = ITEMS.register("drurn_stage7", () -> new DrurnStage7Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE7)
    ));
    public static final RegistryObject<Item> DRURN_STAGE8 = ITEMS.register("drurn_stage8", () -> new DrurnStage8Item(
            (new Item.Properties()).food(FoodInit.DRURN_STAGE8)
    ));
    public static final RegistryObject<Item> DRURN_STAGES = ITEMS.register("drurn_stages", () -> new DrurnStagesItem(
            (new Item.Properties()).food(FoodInit.DRURN_STAGES)
    ));
    public static final RegistryObject<Item> SRECH_ENTITY_SPAWN_EGG = ITEMS.register("spawn_eggs/srech_entity_spawn_egg", () -> new ModSpawnEggItem(
            EntityInit.SRECH_ENTITY, 0x604080, 0x706030, new Item.Properties()
    ));
}
