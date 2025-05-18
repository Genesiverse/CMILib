package net.Zrips.CMILib.Util;

import org.bukkit.Color;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public final class HexColor {
    public static Color stringToHexColor(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }

        final int r = Integer.valueOf(hex.substring(0, 2), 16);
        final int g = Integer.valueOf(hex.substring(2, 4), 16);
        final int b = Integer.valueOf(hex.substring(4, 6), 16);

        return Color.fromRGB(r, g, b);
    }
}
