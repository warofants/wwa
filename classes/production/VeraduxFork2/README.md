![GitHub contributors](https://img.shields.io/github/contributors/warofants/wwa)
![Discord](https://img.shields.io/discord/610183667905462306)
[![Build Status](https://travis-ci.org/warofants/wwa.svg?branch=master)](https://travis-ci.org/warofants/wwa)
[![codecov](https://codecov.io/gh/warofants/wwa/branch/master/graph/badge.svg)](https://codecov.io/gh/warofants/wwa)

# World War of Ants

World War of Ants is a game about managing lives of ants, making sure their colony is fed, maintained, defended and prosperous. It is built with Java, and uses a command line interface for player input.

## Motivation

An open source project created mostly by motivated beginners and experienced professionals alike. This project aims at creating a community of developers and creatives in order to release a video game to the public.

## How to play

To play the game you'll need to download the jar file from the [releases tab](https://github.com/warofants/wwa/releases) or build the jar file yourself as explained under [building](#Building).

## Getting Started

### Prerequisites

#### Java Development Kit

First, you'll need to install the Java Development Kit (JDK). Considering compatibility and other issues, it was decided that OpenJDK 8 would be used to develop this project.

We recommend getting OpenJDK from [AdoptOpenJDK](https://adoptopenjdk.net/), select OpenJDK 8 and choose HotSpot as the JVM.

If you do not want to use that you can also use [Redhat's openJDK](https://developers.redhat.com/products/openjdk/download).

Since OpenJDK 11 is (mostly) backwards compatible with java 8 you can also use that, which is the jdk shipped with Intellij IDEA (This means that if you plan on using Intellij IDEA you can skip this step).

#### Integrated Development Environment
 
 You'll also need to install an Integrated Development Environment (IDE) to make your own life easier. There are several good options to choose from, so feel free to pick one. A few options below:
 
 + Visual Studio Code (code-oss)
 + Eclipse
 + NetBeans
 + IntelliJ Community IDEA
 
 We recommend using [IntelliJ](https://www.jetbrains.com/idea/), as it is easy to install and contains tutorials for its interface. It also gives you the option to download plugins, some of which may be useful to you. Its most recent version include OpenJDK 11, making step one optional.
 
 #### Git
 
 You'll also need to install git on your computer. You can find it for your particular Operating System by following [this link](https://git-scm.com/downloads)
 
 Anyone is welcome to contribute. Feel free to fork this repository, and make a Pull Request when you've got something working. Contact [anthonyLuttrell](https://github.com/anthonyLuttrell) if you'd like to request additional permissions.
 
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
+ [Trello](https://trello.com/b/xDj6KfHq/world-war-of-ants)
+ [Programming Help](https://docs.google.com/document/d/1p5i64NT7B5y-CNH9MyeQT5jwRByZ2o8yJnSnykOSJNQ/edit)
+ [Suggestions](https://docs.google.com/document/d/1yr9REhs6ev9SFzBuuHrqM-ivjuUrOdPJwc0rheYKv28/edit)

## Authors

* **Anthony Luttrell** - *The creator of this project* - [Anthony Luttrell](https://github.com/anthonyLuttrell)

See also the list of [contributors](https://github.com/warofants/wwa/contributors) who participated in this project.

## License

[GNU General Public License](https://www.gnu.org/licenses/gpl-3.0.en.html)
