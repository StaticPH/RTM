package com.static7s.relearning_to_mod.proxy;

public interface IProxy {//classes which implement this proxy must implement the methods within, UNLESS the class is an abstract class

    public abstract ClientProxy getClientProxy();

    public abstract void registerKeyBindings();
    public abstract void initRenders ();
//    public abstract void registerClientEvents();
}
