package com.eimsound.guochaodelight.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import java.util.function.Consumer;

public class ItemBuilder {
    public static Item food(Consumer<FoodProperties.Builder> consumer) {
        var builder = new FoodProperties.Builder();
        consumer.accept(builder);
        return new Item(new Item.Properties()
                .food(builder.build()));
    }
}
