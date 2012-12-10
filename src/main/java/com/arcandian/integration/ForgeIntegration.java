package com.arcandian.integration;

import java.io.File;

import com.kokakiwi.mclauncher.MCLauncher;
import com.kokakiwi.mclauncher.api.LauncherAPI;

public class ForgeIntegration {

	public static MCLauncher main;

	public static void cleanMods() {

		try {

				final File mDir = main.getApi().getMinecraftDirectory();
				System.out.print(mDir);
				final File core = new File(mDir + "coremods/");
				System.out.print(core.getAbsolutePath().toString());
				final File mods = new File(mDir + "mods/");
				System.out.print(mods.getAbsolutePath().toString());
				final File config = new File(mDir + "config/");
				System.out.print(config.getAbsolutePath().toString());
				final File modpatches = new File(mDir + "modpatches/");
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
			catch (final Exception e) {
			System.out.print("Echec de la suppression...");
			e.printStackTrace();
		}

	}

}
