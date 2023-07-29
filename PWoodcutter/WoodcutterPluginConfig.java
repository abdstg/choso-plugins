package com.example.PWoodcutter;

import net.runelite.client.config.*;

@ConfigGroup("WoodcutterPluginConfig")
public interface WoodcutterPluginConfig extends Config {
    @ConfigItem(
            keyName = "startHotkey",
            name = "Start hotkey",
            description = "Hotkey to start the plugin",
            position = 25
    )
    default Keybind startHotkey() {
        return null;
    }

    @ConfigItem(
            keyName = "selectedTree",
            name = "Selected tree to chop",
            description = "Select the preferred banking method to use",
            position = 5
    )
    default Tree selectedTree() {
        return Tree.Teak;
    }

    @ConfigItem(
            keyName = "treeRangeRadius",
            name = "Tree radius",
            description = "Chop selected trees within in this radius from starting position",
            position = 10
    )

    default int treeRangeRadius() {
        return 10;
    }

    @ConfigItem(
            keyName = "targetLevel",
            name = "Targeted woodcutting level",
            description = "Level to reach before stopping",
            position = 11
    )

    default int targetLevel() {
        return 99;
    }
}
