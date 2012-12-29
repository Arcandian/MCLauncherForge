package com.arcandian.integration;

import java.io.File;

import com.kokakiwi.mclauncher.api.LauncherAPI;

public class ForgeIntegration {

	public static void cleanMods(LauncherAPI api) {

		try {

			final String mDir = api.getMinecraftDirectory().toString();
			System.out.println(mDir);
			final File bin = new File(mDir + File.separatorChar + "bin"
					+ File.separatorChar);
			final File core = new File(mDir + File.separatorChar + "coremods"
					+ File.separatorChar);
			final File mods = new File(mDir + File.separatorChar + "mods"
					+ File.separatorChar);
			final File config = new File(mDir + File.separatorChar + "config"
					+ File.separatorChar);
			final File resources = new File(mDir + File.separatorChar
					+ "resources" + File.separatorChar);
			final File flanpath = new File(mDir + File.separatorChar + "Flan"
					+ File.separatorChar);
			final File matmospath = new File(mDir + File.separatorChar
					+ "matmos" + File.separatorChar);

			if (bin.exists()) {

				deleteFilesInDirectory(bin.getAbsolutePath().toString());
				System.out.println("Suppression de bin...");

			}

			if (core.exists()) {

				deleteFilesInDirectory(core.getAbsolutePath().toString());
				System.out.println("Suppression de coremods...");

			}

			if (mods.exists()) {

				deleteFilesInDirectory(mods.getAbsolutePath().toString());
				System.out.println("Suppression de mods...");

			} else {
				System.out.println("Dossier mods inexistant !");
			}

			if (config.exists()) {

				deleteFilesInDirectory(config.getAbsolutePath().toString());
				System.out.println("Suppression de config...");

			} else {
				System.out.println("Dossier config inexistant !");
			}

			if (resources.exists()) {

				deleteFilesInDirectory(resources.getAbsolutePath().toString());
				System.out.println("Suppression de resources...");

			} else {
				System.out.println("Dossier resources inexistant !");
			}

			if (flanpath.exists()) {

				deleteFilesInDirectory(flanpath.getAbsolutePath().toString());
				System.out.println("Suppression de Flan...");

			} else {
				System.out.println("Dossier Flan inexistant !");
			}

			if (matmospath.exists()) {

				deleteFilesInDirectory(matmospath.getAbsolutePath().toString());
				System.out.println("Suppression de matmos...");

			} else {
				System.out.println("Dossier matmos inexistant !");
			}

			System.out
					.println("Suppression effectuee avec succes, lancement...");

		} catch (final Exception e) {
			System.out.println("Echec de la suppression...");
			e.printStackTrace();
		}

	}

	static private void deleteFilesInDirectory(String emplacement) {
		File path = new File(emplacement);
		String sep = File.separator.toString();
		if (path.exists()) {
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteFilesInDirectory(path + sep + files[i] + sep);

				}
				files[i].delete();
				System.out.println("Supression du fichier : "
						+ files[i].getName().toString());
			}
		}
	}

}
