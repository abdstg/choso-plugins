package com.theplug.NMZHelperPlugin;

import net.runelite.client.config.*;

@ConfigGroup("NMZHelperPluginConfig")
public interface NMZHelperPluginConfig extends Config {
    @ConfigSection(
            name = "General settings",
            description = "General settings",
            position = 1,
            closedByDefault = false
    )
    String generalSettings = "generalSettings";

    @ConfigItem(
            keyName = "drinkPotionsBelowBoost",
            name = "Drink potions below boost",
            description = "Drink skill boosting potions if the current boost amount is below this value",
            position = 1,
            section = generalSettings
    )
    @Range(
            min = 0,
            max = 15
    )
    default int drinkPotionsBelowBoost() {
        return 9;
    }

    @ConfigItem(
            keyName = "useZapper",
            name = "Grab zapper",
            description = "Enable to have the plugin activate zapper powerups when they spawn",
            position = 2,
            section = generalSettings
    )
    default boolean useZapper() {
        return false;
    }

    @ConfigItem(
            keyName = "useRecurrentDamage",
            name = "Grab recurrent damage",
            description = "Enable to have the plugin activate recurrent damage powerups when they spawn",
            position = 3,
            section = generalSettings
    )
    default boolean useRecurrentDamage() {
        return false;
    }

    @ConfigItem(
            keyName = "usePowerSurge",
            name = "Grab power surges",
            description = "Enable to have the plugin activate power surge powerups when they spawn",
            position = 4,
            section = generalSettings
    )
    default boolean usePowerSurge() {
        return false;
    }

    @ConfigItem(
            keyName = "offensivePrayDuringPowerSurge",
            name = "Off. prayer in power surge",
            description = "Enable to have the plugin activate offensive prayers during power surges.",
            position = 5,
            section = generalSettings
    )
    default boolean offensivePrayDuringPowerSurge() {
        return false;
    }

    @ConfigItem(
            keyName = "fullAutoMode",
            name = "Full auto mode",
            description = "Enable to have the plugin restock and re-enter NMZ automatically using previous settings. Set potions to withdraw below. Requires rock cake / locator orb.",
            position = 6,
            section = generalSettings
    )
    default boolean fullAutoMode() {
        return false;
    }

    @ConfigItem(
            keyName = "overloadsQuantity",
            name = "Overloads amount",
            description = "The amount of overload potions to withdraw in full auto mode",
            position = 7,
            section = generalSettings
    )
    default int overloadsQuantity() {
        return 28;
    }

    @ConfigItem(
            keyName = "absorptionQuantity",
            name = "Absorption amount",
            description = "The amount of absorption potions to withdraw in full auto mode",
            position = 8,
            section = generalSettings
    )
    default int absorptionQuantity() {
        return 76;
    }

    @ConfigItem(
            keyName = "superRangingQuantity",
            name = "Spr. Ranging amount",
            description = "The amount of super ranging potions to withdraw in full auto mode",
            position = 9,
            section = generalSettings
    )
    default int superRangingQuantity() {
        return 0;
    }

    @ConfigItem(
            keyName = "superMagicQuantity",
            name = "Spr. Magic amount",
            description = "The amount of super magic potions to withdraw in full auto mode",
            position = 10,
            section = generalSettings
    )
    default int superMagicQuantity() {
        return 0;
    }

    @ConfigSection(
            name = "Special attack settings",
            description = "Special attack settings",
            position = 15,
            closedByDefault = false
    )
    String specSettings = "specSettings";

    @ConfigItem(
            keyName = "specEquipmentString",
            name = "Spec equipment",
            description = "Wear your special attack switch equipment and right click your equipment icon to copy-paste the equipment string and put it here",
            position = 1,
            section = specSettings
    )
    default String specEquipmentString() {
        return "";
    }

    @ConfigItem(
            keyName = "useSpecialAttack",
            name = "Use special attack",
            description = "Use special attack during fight",
            position = 2,
            section = specSettings
    )
    default boolean useSpecialAttack() {
        return false;
    }

    @ConfigItem(
            keyName = "onlySpecDuringPowerSurge",
            name = "Only during power surge",
            description = "Use special attacks only during power surge",
            position = 3,
            section = specSettings
    )
    default boolean onlySpecDuringPowerSurge() {
        return false;
    }

    @ConfigItem(
            keyName = "specEnergyMinimum",
            name = "Minimum spec %",
            description = "Minimum spec energy % to use special attack of the spec weapon",
            position = 4,
            section = specSettings
    )
    @Range(
            min = 25,
            max = 100
    )
    default int specEnergyMinimum() {
        return 100;
    }

    @ConfigItem(
            keyName = "startHotkey",
            name = "Start hotkey",
            description = "Hotkey to start the plugin",
            position = 35
    )
    default Keybind startHotkey() {
        return null;
    }
}
