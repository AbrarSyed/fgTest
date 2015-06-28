package com.example.tweaker;

import java.io.File;
import java.util.List;

import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;

public class TestTweaker implements ITweaker {

    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {}

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader) {
        System.out.println("Hello World.");
    }

    @Override
    public String[] getLaunchArguments() {
        return new String[0];
    }

    @Override
    public String getLaunchTarget() {
        return "net.minecraft.client.main.Main";
    }

}
