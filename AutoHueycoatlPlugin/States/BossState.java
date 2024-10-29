package com.theplug.AutoHueycoatlPlugin.States;

import com.theplug.AutoHueycoatlPlugin.AutoHueycoatlPlugin;
import com.theplug.AutoHueycoatlPlugin.AutoHueycoatlPluginConfig;

public class BossState implements State {
    AutoHueycoatlPlugin plugin;
    AutoHueycoatlPluginConfig config;

    public BossState(AutoHueycoatlPlugin plugin, AutoHueycoatlPluginConfig config) {
        super();
        this.plugin = plugin;
        this.config = config;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean shouldExecuteState() {
        return false;
    }

    @Override
    public void threadedOnGameTick() {

    }

    @Override
    public void threadedLoop() {

    }
}