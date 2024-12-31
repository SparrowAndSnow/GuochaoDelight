package com.eimsound.guochaodelight.register;

import com.eimsound.guochaodelight.GuochaoDelight;
import com.eimsound.guochaodelight.common.ItemBuilder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class GuochaoItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GuochaoDelight.MODID);

    public static final RegistryObject<Item> FREE_SAUSAGE = ITEMS.register("free_sausage",
            () -> ItemBuilder.food(builder ->
                builder.nutrition(3).saturationMod(0.5f)
                        // 5s (20 ticks = 1 second)
                        // 0 = level1 1 = level2
                        // 0.1f = 10% chance
                        .effect(()-> new MobEffectInstance(MobEffects.CONFUSION,20 * 10,0),0.3f)
            ));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

