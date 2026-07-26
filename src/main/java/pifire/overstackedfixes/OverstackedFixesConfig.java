package pifire.overstackedfixes;

import dev.isxander.yacl3.api.*;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.minecraft.client.gui.screen.Screen;

@Config(name = "overstackedfixes")
public class OverstackedFixesConfig implements ConfigData {

    public Screen createGui(final Screen parent) {
        final OverstackedFixesConfig INSTANCE = OverstackedFixesClient.CONFIG;

        return YetAnotherConfigLib.createBuilder()
            .build()
            .generateScreen(parent);
    }
}
