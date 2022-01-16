# Skarpcraft [1.8.9-1.18.1]
This repository contains all of the mods created by Anksharskarp for Minecraft, Forge, FabricMC, Bukkit, Spigot, and PaperMC.

If you want more information and explanatory text about the concepts, the following links might be useful:

  - [The Official Forge documentation][forgedocs] (parts of it are rather outdated but on the whole still very useful starting reference)
  - [Fabric Wiki][fabricwiki] (some of it is specific to the Fabric API, but a lot of useful general info too) 
  - [Forge Modder Support Forum][Forge forum] ask for advice from the experts
  - [McJty Tutorials][McJty] lots of step-by-step instructions / tutorial
  - [Mr Crayfish Furniture Mod (contains lots of examples of good modding practices)](https://github.com/MrCrayfish/MrCrayfishFurnitureMod)
  - [Cadiboo's Example Mod](https://github.com/Cadiboo/Example-Mod) some great tutorials for when you're starting out
  
## Development Environment Setup
  - You can browse directly in GitHub, or alternatively, download it as a zip and browse it locally.

  - If you want to install it and compile it, the basic steps for beginners are:
    1. Download the project as a zip.
    2. Unzip it to an appropriate folder on your computer, such as My Documents.  (Or, if you know how to fork a project on GitHub and import it into a local git repository, you can do that instead)
    3. Look at Forge's README.txt file in this folder and follow the instructions to import it into Eclipse or IntelliJ IDEA.
    4. Use the gradle task runClient to run or debug the project.

### How to Compile and Run:
1) Execute gradle task runClient to test the client installation
or
2) Execute gradle task runServer to test the dedicated server installation.  (The first time you run this task it will exit without starting the server.  You then need to edit the eula.txt file in the run directory, and execute runServer again.)

[forgedocs]:https://mcforge.readthedocs.org/en/latest/
[more_help]:https://suppergerrie2.com/minecraft-1-14-modding-with-forge-1-setting-up-a-dev-environment/
 
[Forge forum]: https://www.minecraftforge.net/forum/forum/70-modder-support/
[fabricwiki]: https://fabricmc.net/wiki/start
[McJty]: https://wiki.mcjty.eu/modding/index.php?title=YouTube-1.14

[gradle_tool_window]: https://www.jetbrains.com/idea/help/gradle-tool-window.html
