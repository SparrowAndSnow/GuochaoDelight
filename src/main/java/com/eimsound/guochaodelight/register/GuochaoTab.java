package com.eimsound.guochaodelight.register;

import com.eimsound.guochaodelight.GuochaoDelight;
import com.eimsound.guochaodelight.common.Translate;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class GuochaoTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GuochaoDelight.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = CREATIVE_MODE_TABS
            .register("guochaodelight", () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable("tab." + GuochaoDelight.MODID + ".title"))
                    .icon(() -> GuochaoItems.FREE_SAUSAGE.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.acceptAll(GuochaoItems.ITEMS.getEntries().stream()
                                .map(item -> item.get().getDefaultInstance())
                                .toList());

                        output.acceptAll(GuochaoBlocks.BLOCKS.getEntries().stream()
                                .map(item -> item.get().asItem().getDefaultInstance())
                                .toList());
                    }).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
