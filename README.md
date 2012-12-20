MCLauncher Forge Edition par Arcandian
=================================================================================
Projet original : https://github.com/Kokakiwi/MCLauncher

Merci à Kokakiwi pour ce super Launcher !

=================================================================================

	NOTE A PROPOS DU BUG D'EXTRACTION DES ZIPS :
	
			Il arrive parfois que le launcher refuse d'extraire le fichier zip. Rassurez-vous,
			ce n'est pas dû à une erreur de programmation, mais à un où plusieurs fichiers pouvant
			être corrompus lors de la compression de l'archive. Voici mon conseil : si ce problème
			survient, testez l'archive avec WinRAR, car il affiche un log console si une erreur survient
			qui est plutôt parlante (Dans mon cas : "CRC match failed ! <fichier> file is corrupted", quelque
			chose de ce genre). Si <fichier> est corrompu, je vous recommande de remplacer celui-ci
			par l'original et de re-tester. Pour reprendre mon exemple, c'était un des fichiers de musique du
			jeu original qui était corrompu. Alors, une fois remplacé, tout est revenu à la normale.
			
=================================================================================
		
			A PROPOS :

		Cette réedition rajoute principalement la gestion des dossiers générés de Forge API et de Forge Mod Loader,
ainsi que par d'autres mods.

		Objectifs :

			- Effacer automatiquement les dossiers "mods", "coremods", "config" et autres, afin d'éviter des mods doublons,
			des conflits de configuration, etc... le tout, sans manipulation de la part de l'utilisateur, et le minimum de la
			part de l'admin des MAJs ;
			
			- Donner la possibilité aux admins de configurer, via le fichier de configuration, une liste d'exclusions des dossiers,
			afin de conserver certains paramètres côtés utilisateur (ex : Rei's Minimap dans mods/rei_minimap) ;

=================================================================================

  Bien sûr, cette petite liste d'objectifs est temporaire et pourrait être amenée à évoluer.
  
  Merci encore à Kokakiwi d'avoir crée MCLauncher. Je me suis basé sur la dernière version actuelle qui est la 1.0.1.
  
Enjoy !