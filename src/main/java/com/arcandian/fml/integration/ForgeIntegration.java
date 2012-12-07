package com.arcandian.fml.integration;

import java.io.File;

import com.kokakiwi.mclauncher.api.LauncherAPI;

public class ForgeIntegration {

	public static LauncherAPI api;

	public static void cleanMods() {

		try {

			if (api.getConfig().getStringList("versions.name")
					.contains("forge")) {

				final File mDir = api.getMinecraftDirectory();
				System.out.print(mDir);
				final File core = new File(mDir.toString() + "/coremods");
				final File mods = new File(mDir.toString() + "/mods");
				final File config = new File(mDir.toString() + "/config");

				System.out
						.print("Installation avec FML detectee, nettoyage des dossiers avant MAJ...");

				if (core.exists()) {

					core.delete();
					System.out.print("Suppression de coremods...");

				}

				if (mods.exists()) {

					mods.delete();
					System.out.print("Suppression de mods...");

				}

				if (config.exists()) {

					config.delete();
					System.out.print("Suppression de config...");

				}

				System.out
						.print("Suppression effectuee avec succes, lancement...");

			}
		} catch (final Exception e) {
			System.out.print("Echec de la suppression...");
			e.printStackTrace();
		}

	}

}
