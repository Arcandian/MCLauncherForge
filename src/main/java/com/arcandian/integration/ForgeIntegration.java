package com.arcandian.integration;

import java.io.File;

import com.kokakiwi.mclauncher.MCLauncher;

public class ForgeIntegration {

	public static MCLauncher main;

	public static void cleanMods() {

		try {

			if (main.getApi().getConfig().getString("versions.name").contains("forge")) {

				final File mDir = main.getApi().getMinecraftDirectory();
				System.out.print(mDir);
				final File core = new File(mDir.toString() + "/coremods");
				System.out.print(core.getAbsolutePath().toString());
				final File mods = new File(mDir.toString() + "/mods");
				System.out.print(mods.getAbsolutePath().toString());
				final File config = new File(mDir.toString() + "/config");
				System.out.print(config.getAbsolutePath().toString());
				final File modpatches = new File(mDir.toString() + "/modpatches");
				System.out.print(modpatches.getAbsolutePath().toString());

				System.out.print("Installation avec FML detectee, nettoyage des dossiers avant MAJ...");

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

				if (modpatches.exists()) {

					modpatches.delete();
					System.out.print("Suppression de modpatches...");

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
