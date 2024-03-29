package net.sefalonzophry.voidascension.setup.moditems;

import net.sefalonzophry.voidascension.VoidAscension;
import net.sefalonzophry.voidascension.setup.*;
import net.sefalonzophry.voidascension.setup.customblocks.ModBlocks;
import net.sefalonzophry.voidascension.setup.moditems.custom.ModArmorItem;
import net.sefalonzophry.voidascension.setup.moditems.custom.ModItemTier;
import net.sefalonzophry.voidascension.setup.moditems.custom.VoidArrowItem;
import net.sefalonzophry.voidascension.setup.moditems.custom.VoidBow;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.sefalonzophry.voidascension.data.RiftsItemGroup;
import net.sefalonzophry.voidascension.setup.entity.ModEntityTypes;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VoidAscension.MOD_ID);

    //Items
    public static final RegistryObject<Item> RIFT_FORMER = Registration.ITEMS.register("rift_former", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> RIFT_CRYSTAL = Registration.ITEMS.register("rift_crystal", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> UNSTABLE_RIFT_CRYSTAL = Registration.ITEMS.register("unstable_rift_crystal", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_INFUSED_STRING = Registration.ITEMS.register("void_infused_string", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> LIVING_VOID_INGOT = Registration.ITEMS.register("living_void_ingot", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_ESSENCE = Registration.ITEMS.register("void_essence", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> EMPOWERED_VOID_ESSENCE = Registration.ITEMS.register("empowered_void_essence", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> NE_RELIC_PIECE = Registration.ITEMS.register("ne_relic_piece", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> SE_RELIC_PIECE = Registration.ITEMS.register("se_relic_piece", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> SW_RELIC_PIECE = Registration.ITEMS.register("sw_relic_piece", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> NW_RELIC_PIECE = Registration.ITEMS.register("nw_relic_piece", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> RELIC = Registration.ITEMS.register("relic", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_ESSENCE_CAPSULE = Registration.ITEMS.register("void_essence_capsule", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> EMPTY_VOID_ESSENCE_CAPSULE = Registration.ITEMS.register("empty_void_essence_capsule", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> EMPTY_SYRINGE = Registration.ITEMS.register("empty_syringe", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> FILLED_VOID_ESSENCE_SYRINGE = Registration.ITEMS.register("filled_void_essence_syringe", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    //Tool Workables
    public static final RegistryObject<Item> VOID_PICKAXE_HEAD = Registration.ITEMS.register("void_pickaxe_head", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_TOOL_HANDLE = Registration.ITEMS.register("void_tool_handle", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SWORD_GUARD = Registration.ITEMS.register("void_sword_guard", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SWORD_HANDLE = Registration.ITEMS.register("void_sword_handle", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SWORD_LOWER_HALF = Registration.ITEMS.register("void_sword_lower_half", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SWORD_BLADE = Registration.ITEMS.register("void_sword_blade", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_BOW_BODY = Registration.ITEMS.register("void_bow_body", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_BOW_UNPOWERED_BODY = Registration.ITEMS.register("void_bow_unpowered_body", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SHOVEL_HEAD = Registration.ITEMS.register("void_shovel_head", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_BATTLE_AXE_HEAD = Registration.ITEMS.register("void_battle_axe_head", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));


    //Tools
    public static final RegistryObject<Item> VOID_SWORD_UNPOWERED = Registration.ITEMS.register("void_sword_unpowered", () ->
            new SwordItem(ModItemTier.VOID,6, -2.5F,
                    new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SWORD_POWERED = Registration.ITEMS.register("void_sword_powered", () ->
            new SwordItem(ModItemTier.VOID,13, -2.3F,
                    new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_PICKAXE = Registration.ITEMS.register("void_pickaxe", () ->
            new PickaxeItem(ModItemTier.VOID, 2,  -2.4F,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_SHOVEL = Registration.ITEMS.register("void_shovel", () ->
            new ShovelItem(ModItemTier.VOID, 2,  -2.3F,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_BATTLE_AXE = Registration.ITEMS.register("void_battle_axe", () ->
            new AxeItem(ModItemTier.VOID, 19, -2.7F,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_BOW = Registration.ITEMS.register("void_bow", () ->
            new VoidBow(new Item.Properties() .tab(RiftsItemGroup.creativeTab).stacksTo(1) .durability( 2500)));

    //Arrows
    public static final RegistryObject<Item> VOID_ARROW =Registration.ITEMS.register("void_arrow", () -> new VoidArrowItem(new Item.Properties() .tab(RiftsItemGroup.creativeTab), 1.5F));

    //Arrow Workables
    public static final RegistryObject<Item> VOID_ARROW_SHAFT = Registration.ITEMS.register("void_arrow_shaft", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_ARROW_HEAD = Registration.ITEMS.register("void_arrow_head", () ->
            new Item(new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    //Armor
    public static final RegistryObject<Item> VOID_HELMET = Registration.ITEMS.register("void_helmet", () ->
            new ArmorItem(ModArmorMaterial.VOID, EquipmentSlotType.HEAD,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_CHESTPLATE = Registration.ITEMS.register("void_chestplate", () ->
            new ArmorItem(ModArmorMaterial.VOID, EquipmentSlotType.CHEST,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_LEGGINGS = Registration.ITEMS.register("void_leggings", () ->
            new ArmorItem(ModArmorMaterial.VOID, EquipmentSlotType.LEGS,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_BOOTS = Registration.ITEMS.register("void_boots", () ->
            new ArmorItem(ModArmorMaterial.VOID, EquipmentSlotType.FEET,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_RELIC_HELMET = Registration.ITEMS.register("void_relic_helmet", () ->
            new ArmorItem(ModArmorMaterial.VOID_RELIC, EquipmentSlotType.HEAD,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_RELIC_CHESTPLATE = Registration.ITEMS.register("void_relic_chestplate", () ->
            new ModArmorItem(ModArmorMaterial.VOID_RELIC, EquipmentSlotType.CHEST,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_RELIC_LEGGINGS = Registration.ITEMS.register("void_relic_leggings", () ->
            new ArmorItem(ModArmorMaterial.VOID_RELIC, EquipmentSlotType.LEGS,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> VOID_RELIC_BOOTS = Registration.ITEMS.register("void_relic_boots", () ->
            new ArmorItem(ModArmorMaterial.VOID_RELIC, EquipmentSlotType.FEET,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    //SpawnEggs
    public static final RegistryObject<ModSpawnEggs> VOID_SPAWN_SPAWN_EGG = Registration.ITEMS.register("void_spawn_spawn_egg", () ->
            new ModSpawnEggs(ModEntityTypes.VOIDSPAWN, 0x464F57, 0x1D6338,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<ModSpawnEggs> INJECTOR_SPAWN_EGG = Registration.ITEMS.register("injector_spawn_egg", () ->
            new ModSpawnEggs(ModEntityTypes.INJECTOR, 0x464F51, 0x1D6330,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<ModSpawnEggs> ELITE_VOID_SPAWN_SPAWN_EGG = Registration.ITEMS.register("elite_void_spawn_spawn_egg", () ->
            new ModSpawnEggs(ModEntityTypes.ELITEVOIDSPAWN, 0x464F51, 0x1D6330,
                    new Item.Properties() .tab(RiftsItemGroup.creativeTab)));



    // Block Items

//    public static final RegistryObject<Item> ALTAR_ITEM = Registration.ITEMS.register("altar", () -> new BlockItem(ModBlocks.ALTAR.get(), new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> CHALICE = Registration.ITEMS.register("chalice", () -> new BlockItem(ModBlocks.CHALICE.get(), new Item.Properties().tab(RiftsItemGroup.creativeTab)));

    public static final RegistryObject<Item> PEDESTAL = Registration.ITEMS.register("pedestal", () -> new BlockItem(ModBlocks.PEDESTAL.get(), new Item.Properties().tab(RiftsItemGroup.creativeTab)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
