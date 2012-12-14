package com.arcandian.integration;

import java.io.File;

import com.kokakiwi.mclauncher.api.LauncherAPI;

public class ForgeIntegration {

	@SuppressWarnings("unused")
	private LauncherAPI api;

	public static void cleanMods(LauncherAPI api) {

		try {

			final String mDir = api.getMinecraftDirectory().toString();
			System.out.println(mDir);
			final File core = new File(mDir + "/coremods/");
			System.out.println(core.getAbsolutePath().toString());
			final File mods = new File(mDir + "/mods/");
			System.out.println(mods.getAbsolutePath().toString());
			final File config = new File(mDir + "/config/");
			System.out.println(config.getAbsolutePath().toString());
			final File modpatches = new File(mDir + "/modpatches/");
			System.out.println(modpatches.getAbsolutePath().toString());
			final File resources = new File(mDir + "/resources/");
			System.out.println(resources.getAbsolutePath().toString());

			System.out.println("Installation avec FML detectee, nettoyage des dossiers avant MAJ...");

			if (core.exists()) {

				core.delete();
				System.out.println("Suppression de coremods...");

			}

			if (mods.exists()) {

				mods.delete();
				System.out.println("Suppression de mods...");
					
			}
			else {
				System.out.println("Dossier mods inexistant !");
			}

			if (config.exists()) {

				config.delete();
				System.out.println("Suppression de config...");

			}
			else {
				System.out.println("Dossier config inexistant !");
			}

			if (modpatches.exists()) {

				modpatches.delete();
				System.out.println("Suppression de modpatches...");

			}
			else {
				System.out.println("Dossier modpatches inexistant !");
			}
			
			if (resources.exists()) {

				resources.delete();
				System.out.println("Suppression de resources...");

			}
			else {
				System.out.println("Dossier resources inexistant !");
			}

			System.out.println("Suppression effectuee avec succes, lancement...");

		} catch (final Exception e) {
			System.out.println("Echec de la suppression...");
			e.printStackTrace();
		}

	}

}
