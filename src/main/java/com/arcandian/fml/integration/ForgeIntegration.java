package com.arcandian.fml.integration;

import java.io.File;

import com.kokakiwi.mclauncher.api.LauncherAPI;

public class ForgeIntegration {

	public static LauncherAPI api;
	
	public static void cleanMods() {

		if(api.getConfig().getStringList("versions.name").contains("forge")) {

			File core = new File (api.getMinecraftDirectory().toString() + "/coremods");
			File mods = new File (api.getMinecraftDirectory().toString() + "/mods");
			File config = new File (api.getMinecraftDirectory().toString() + "/config");
			
			System.out.print("Installation avec FML detectee, nettoyage des dossiers avant MAJ...");
			
			if(core.exists()) {
				
				core.delete();
				System.out.print("Suppression de coremods...");
				
			}
			
			if(mods.exists()) {
				
				mods.delete();
				System.out.print("Suppression de mods...");
				
			}
			
			if(config.exists()) {
				
				config.delete();
				System.out.print("Suppression de config...");
				
			}
			
			System.out.print("Suppression effectuee avec succes, lancement...");
			
			
			}
		else
			
			System.out.print("Echec de la suppression...");
		
		}
		
}
