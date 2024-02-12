package com.nethdarsmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NethdarsMod implements ModInitializer {
	public static final String MOD_ID = "nethdarsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("nethdarsmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Nethdars Mod successfully Loaded!");
	}
}