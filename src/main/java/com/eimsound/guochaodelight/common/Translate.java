package com.eimsound.guochaodelight.common;

import com.eimsound.guochaodelight.GuochaoDelight;
import net.minecraft.client.resources.language.I18n;

public class Translate {
    public static final String ITEM = "item";

    public static String get(String type, String key) {
        var format = String.format("%s.%s.%s", type, GuochaoDelight.MODID, key);
        return I18n.get(format);
    }
}
