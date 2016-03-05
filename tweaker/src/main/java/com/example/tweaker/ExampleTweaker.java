package com.example.tweaker;

import java.io.File;
import java.util.List;

import com.google.common.collect.Lists;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;

public class ExampleTweaker implements ITweaker
{
    private List<String> args;

    @Override
    public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile)
    {
        // stupid launch wrapper...
        this.args = Lists.newArrayList(args);
        this.args.add("--version");
        this.args.add(profile);
    }

    @Override
    public void injectIntoClassLoader(LaunchClassLoader classLoader)
    {
        System.out.println("Hello World.");
    }

    @Override
    public String getLaunchTarget()
    {
        return "net.minecraft.client.main.Main";
    }

    @Override
    public String[] getLaunchArguments()
    {
        return this.args.toArray(new String[this.args.size()]);
    }
}
