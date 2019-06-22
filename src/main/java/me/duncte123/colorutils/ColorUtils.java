package me.duncte123.colorutils;

public class ColorUtils {
    /**
     * Converts a color in the form of an integer to a hex string
     *
     * @param color
     *         The int color to convert
     *
     * @return The int color converted to a hex string
     */
    public static String intToHexString(int color) {
        final int r = (color & 0xFF0000) >> 16;
        final int g = (color & 0xFF00) >> 8;
        final int b = (color & 0xFF);

        return String.format("#%02x%02x%02x", r, g, b);
    }

    /**
     * Converts a hex string to an color int
     *
     * @param hex
     *         The hex string to convert to a color int
     *
     * @return The color as int
     */
    public static int hexStringToInt(String hex) {
        final String hexValue = "0x" + hex.replaceFirst("#", "");

        return Integer.decode(hexValue);
    }
}
