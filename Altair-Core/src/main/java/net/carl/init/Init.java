package net.carl.init;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.pomelo.EventManager;


//CREDITS:

	//A lot of the design of this client was brought from the Minecraft Base Hacked Client for 1.8.8.
	//https://github.com/OxideWaveLength/Minecraft-Hack-BaseClient
	//The event system in particular of this client was ported from Seppuku Client in 1.12.2. You can read the source code here!
	//https://github.com/seppukudevelopment/seppuku/tree/master/src/main/java/me/rigamortis/seppuku/api

	//As this project is in its early phases and made by an inexperienced developer, expect this to have bugs. Please report them to me on discord at Carlll#0001 or add an issue in the GitHub.

public class Init implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("altair");
	public static final String clientName = "Altair";
	public static final String clientVersion = "b0.01-1.18.2";

	public static Init instance;

	//Initialize events, modules, and more as added.
	private EventManager eventManager;

	public Init(){
		instance = this;
	}


	@Override
	public void onInitialize() {
		//once minecraft runs, this is the code that writes, we build the mod from this point
		LOGGER.info("if you're seeing this, the client boots! -c");

		this.eventManager = new EventManager();

	}

	public EventManager getEventManager() {
		return eventManager;
	}

}
