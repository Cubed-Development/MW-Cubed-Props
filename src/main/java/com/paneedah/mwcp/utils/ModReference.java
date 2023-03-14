package com.paneedah.mwcp.utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModReference {

    public static final String id = "mwcp";
    public static final String name = "Modern Warfare Cubed: Props";
    public static final String version = "@VERSION@";

    public static final String clientProxy = "com.paneedah.mwcp.proxy.ClientProxy";
    public static final String serverProxy = "com.paneedah.mwcp.proxy.ServerProxy";
    public static final Logger log = LogManager.getLogger(id);
}