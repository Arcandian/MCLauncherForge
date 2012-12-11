package com.arcandian.integration;

import java.io.File;

import com.kokakiwi.mclauncher.api.LauncherAPI;

public class ForgeIntegration {

	@SuppressWarnings("unused")
	private LauncherAPI api;

	public static void cleanMods(LauncherAPI api) {

		try {

			final String mDir = api.getMinecraftDirectory().toString();
			System.out.print(mDir + "\n");
			final File core = new File(mDir + "/coremods/" + "\n");
			System.out.print(core.getAbsolutePath().toString());
			final File mods = new File(mDir + "/mods/" + "\n");
			System.out.print(mods.getAbsolutePath().toString());
			final File config = new File(mDir + "/config/" + "\n");
			System.out.print(config.getAbsolutePath().toString());
			final File modpatches = new File(mDir + "/modpatches/" + "\n");
			System.out.print(modpatches.getAbsolutePath().toString());

			System.out
					.print("Installation avec FML detectee, nettoyage des dossiers avant MAJ..." + "\n");

			if (core.exists()) {

				core.delete();
				System.out.print("Suppression de coremods..." + "\n");

			}

			if (mods.exists()) {

				mods.delete();
				System.out.print("Suppression de mods..." + "\n");

			}

			if (config.exists()) {

				config.delete();
				System.out.print("Suppression de config..." + "\n");

			}

			if (modpatches.exists()) {

				modpatches.delete();
				System.out.print("Suppression de modpatches..." + "\n");

			}

			System.out.print("Suppression effectuee avec succes, lancement..." + "\n");

		} catch (final Exception e) {
			System.out.print("Echec de la suppression..." + "\n");
			e.printStackTrace();
		}

	}

}
