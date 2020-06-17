package vazkii.quark.base.client.gui;

import java.text.NumberFormat;

public class FormatUtils {
    private static final NumberFormat integerFormat = NumberFormat.getIntegerInstance();

    public static String formatInteger(int value) {
        return integerFormat.format(value);
    }
}
