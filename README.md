<p align="center">
<img src="https://i.imgur.com/Hz0yupe.png" width="200">
</p>

# World War of Ants
![GitHub contributors](https://img.shields.io/github/contributors/warofants/wwa)
![Discord](https://img.shields.io/discord/610183667905462306)
[![Build Status](https://travis-ci.org/warofants/wwa.svg?branch=master)](https://travis-ci.org/warofants/wwa)
[![codecov](https://codecov.io/gh/warofants/wwa/branch/master/graph/badge.svg)](https://codecov.io/gh/warofants/wwa)

__World War of Ants \**the game*\*__ is about managing a live colony of ants, making sure the colony is fed, maintained, defended and prosperous. The object of the game is to defeat all surrounding rival colonies within the game-world. The player can choose from various ant species, each with its own unique set of characteristics and traits, and each requiring a completely different strategy to win. Other rival colonies can also invade the player's colony.

For now, the game will be a turn-based strategy game (see phases of development, below). The player will have only so many moves they can make before their turn is over. The game will provide some challenges and obstacles that the player has to work through in order to succeed.

Currently, the game is built with Java and uses a command line interface for player input.

__World War of Ants \**the project*\*__ is intended to introduce beginners at any stage to Java, GitHub, open-source projects, and working with a team. It is also meant to give people an opportunity to break out of that online tutorial cycle, where things never seem to really materialize into something greater.

## FAQ

<details>
  <summary>Why Java?</summary>
<p>

> While this may be heavily debatable, Java is generally a common "first language" for many programmers.

</p>
</details>

<details>
  <summary>I don't know anything about anything, how can I start?</summary>
<p>

> For now, I highly recommend you get started with [this MOOC](http://moocfi.github.io/courses/2013/programming-part-1/) (Massive Open Online Course). It's free, and offers some great tutorials with an automated pass/fail system. Once you complete the first two weeks of the program (it shouldn't take two full weeks), head over to the [Issues tab on GitHub](https://github.com/warofants/wwa/issues) and look for anything labeled as <a href="https://github.com/warofants/wwa/issues?q=is%3Aissue+is%3Aopen+label%3Abeginner-friendly" alt="beginner-friendly"><img src="https://i.imgur.com/OhdcyCC.png" height="18"></a>

</p>
</details>

<details>
  <summary>I know a bit of Java, but I don't know anything about Git or GitHub, how can I start?</summary>
<p>

> Git and GitHub are not the most intuitive tools to learn. For now, I highly recommend you start with this YouTube video series:
>
> <a href="http://www.youtube.com/watch?feature=player_embedded&v=BCQHnlnPusY
" target="_blank"><img src="http://img.youtube.com/vi/BCQHnlnPusY/0.jpg"
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>

</p>
</details>

<details>
  <summary>I feel comfortable with Java and GitHub, but I'm still not sure where to start.</summary>
<p>

> The [wiki home page](https://github.com/warofants/wwa/wiki) is a good place to start. From there, familiarize yourself with the [source code management doc](https://github.com/warofants/wwa/wiki/GitHub-Source-Code-Management). Once you're ready to contribute code, head over to the [issues page](https://github.com/warofants/wwa/issues) and find something there that you want to work on. Most issues are associated with a [project](https://github.com/warofants/wwa/projects), where you will find a list of mentors for each project. The mentors are a group of developers who have more experience and are willing to lend a helping hand if you need it.

</p>
</details>

<details>
  <summary>I am so busy, I don't have much time to contribute.</summary>
<p>

> Totally fine! Contribute as much or as little as you want. This project is intended to be low stress, low pressure. Come and go as much as you would like.

</p>
</details>

<details>
  <summary>I am very experienced with Java and GitHub and I'd love to help the project where I can.</summary>
<p>

> We are always looking for more experienced programmers to help out as a mentor, code reviewer, or even a project manager. You can DM me on Discord (stranger#4525) or <a href="mailto:anthonyluttrell@gmail.com">email me</a>

</p>
</details>

<details>
  <summary>Why can't we have multiplayer, and 3D graphics, and online functionality, and...</summary>
<p>

> Woah there cowboy! Those are all really great goals, but for now, the focus is keeping things simple and approachable for aspiring programmers of all experience levels.

</p>
</details>


## Phases of development

<details>
  <summary>Phase I :point_left: [we are here]</summary>

* Build the MVP, UML and GitHub layout for the project's foundation
* Develop a very basic console-based game in Java
* Add additional features or enhancements 

</details>

<details>
  <summary>Phase II</summary>

* Develop a basic top-down 2D game with roguelike stylizing and design traits
* Create new beginner-friendly mini-games within the main game
* Build development tools to automate some processes

</details>

<details>
  <summary>Phase III</summary>

* Expand upon existing 2D game
* Possibly integrate 3D graphics into existing scenes
* Look into multiplayer possibilities 

</details>

## Getting Started

### Prerequisites

<details>
  <summary>Java Development Kit (JDK)</summary>
<p>

First, you'll need to install the Java Development Kit (JDK). Considering compatibility and other issues, it was decided that OpenJDK 8 would be used to develop this project.

We recommend getting OpenJDK from [AdoptOpenJDK](https://adoptopenjdk.net/), select OpenJDK 8 and choose HotSpot as the JVM.

If you do not want to use that you can also use [Redhat's openJDK](https://developers.redhat.com/products/openjdk/download).

Since OpenJDK 11 is (mostly) backwards compatible with java 8 you can also use that, which is the jdk shipped with Intellij IDEA (This means that if you plan on using Intellij IDEA you can skip this step).

</p>
</details>

<details>
  <summary>Integrated Development Environment (IDE)</summary>
<p>

You'll also need to install an Integrated Development Environment (IDE) to make your own life easier. There are several good options to choose from, so feel free to pick one. A few options below:

 + Visual Studio Code (code-oss)
 + Eclipse
 + NetBeans
 + IntelliJ Community IDEA

We recommend using [IntelliJ](https://www.jetbrains.com/idea/), as it is easy to install and contains tutorials for its interface. It also gives you the option to download plugins, some of which may be useful to you. Its most recent version include OpenJDK 11, making step one optional.

</p>
</details>

<details>
  <summary>Git</summary>
<p>

You'll also need to install git on your computer. You can find it for your particular Operating System by following [this link](https://git-scm.com/downloads)

Anyone is welcome to contribute. Feel free to fork this repository, and make a Pull Request when you've got something working. Contact [anthonyLuttrell](https://github.com/anthonyLuttrell) if you'd like to request additional permissions.

</p>
</details>

### Getting the code

To get World War of Ants locally you need to clone the repository, it is recommended to make a fork first so you can mess around in the code without affecting the original.

You do this by clicking fork in the top right, then open a command prompt, powershell or terminal where you want the code and running:
```
git clone https://github.com/YOURGITHUBNAME/wwa.git
```

If you just want the latest version without making a fork run:
```
git clone https://github.com/warofants/wwa.git
```

## Building

To build the game into a runnable jar you need to run
```
mvn package
```

This jar file can then be run using the command
```
java -jar FILENAME.jar
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on the process for submitting pull requests to us.

## Resources
+ [Discord](https://discordapp.com/invite/NACP6WZ)
+ [Programming Help](https://docs.google.com/document/d/1p5i64NT7B5y-CNH9MyeQT5jwRByZ2o8yJnSnykOSJNQ/edit)
+ [Suggestions](https://docs.google.com/document/d/1yr9REhs6ev9SFzBuuHrqM-ivjuUrOdPJwc0rheYKv28/edit)

## Authors

* **Anthony Luttrell** - *The creator of this project* - [Anthony Luttrell](https://github.com/anthonyLuttrell)

See also the list of [contributors](https://github.com/warofants/wwa/contributors) who participated in this project.

## License

[GNU General Public License](https://www.gnu.org/licenses/gpl-3.0.en.html)
