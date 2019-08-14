# Guide: How to get VSC (an IDE) and the Project to work <!-- omit in toc -->

This guide is aimed to help complete beginners to install an IDE and start looking through the project in order to get a better understanding.
For a spexific area please follow the TOC (Table of contents).
If you feel like something is missing contact ZweiEuro on the discord server.


- [What is an IDE?](#what-is-an-ide)
- [What is git ?](#what-is-git)
- [How to get the things you will need](#how-to-get-the-things-you-will-need)
  - [How to get an IDE:](#how-to-get-an-ide)
  - [How to get git:](#how-to-get-git)
- [Getting everything together](#getting-everything-together)
  - [Git the project](#git-the-project)
    - [GUI](#gui)
    - [BASH](#bash)
  - [Setup VSCode](#setup-vscode)
    - [Plugins](#plugins)
    - [add the project](#add-the-project)

## What is an IDE?
An IDE (Integrated Development Environment) is a piece of software which makes developing other programms much easier by combining the execution of the programm you are working on with a bunch of tools to help you debug (fix errors) features and develop new ones.

## What is git ?
Git is a Version Control Software, it allows many people to work on the same project with much more clarity then sending the files around th globe via E-Mail. Git ensures that everyone in a roject is up to date and noone is left behind working on a software that might not even be inside the main project anymore.

## How to get the things you will need
### How to get an IDE:
We will be developing on the IDE VSCode, but you are free to develop the code on in any IDE you are familiar and confortable with. Download VSCode [here](https://code.visualstudio.com/#alt-downloads).
Download VSC for your appropriate system.

### How to get git:
Git all in all is a very lightweight programm and there are a lot of clients for it. You will have to find your version yourself [here](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git). 


## Getting everything together

### Git the project
We will start by cloning the main project, which means you can change files locally but not push them to the main project. This will be explained later on on git forks and pull requests and how they work, for now this is just for demonstration purposes.

First off let's start by getting the Project data ont your computer with git.
For this you will need to choose a folder in which you want to put your project files, it doesn't matter where but on windows machines Documents makes most sense and on Linux/Max OSX machines ~/ (home) makes the most sense.

On windows if you have installed all the git tools from the installer you should be able to right click and choose an option "Git GUI here" or "Git Bash here". On linux you will need to use a terminal (in which case the process is the same as in the git bash). 
#### GUI
- In the git GUI you can chose "clone repository" to clone the project files onto your computer.
   
![clone gui](pics/gui-clone.png)
- Choose a place to store your project files. (Target)
- And as a source enter the github link. https://github.com/anthonyLuttrell/wwa.git
![clone gui fin](pics/gui-clone.png)

- after will create a folder (with the name you chose, in this case "here") in which the project files will land.
-  this is done you can close the git GUI we will be using VSC buildin tools for the rest of the tasks

#### BASH
- Open a bash / a terminal.
- use ```cd``` (change directory) to move somewhere you want the project to be, with ```pwd``` (powered directory) you can see where you currently are and ```ls``` (list) tells you what files are in the folder you currently are.
- Enter the command:
  ```git clone https://github.com/anthonyLuttrell/wwa.git```
  ![terminal](pics/clone.png)
- this will create a folder wwa in which the roject files are located.

### Setup VSCode
#### Plugins
Start VSCode for the first time, we will be needing to install a few plugins to make things easier in the future.
You can Install plugins (and search them) via this:

![plugin tab](pics/i_plugs.png)
For now we will need a few things:
- git lense in order to use git from VSCode:
  ![lense](pics/GitLens.png)
- (optional) markdown if you want to read the guides inside VSC ![markdown](pics/markdown.png)
- install a java plugin ![java plugin](pics/java_plug.png)

*IMPORTANT* IF you do not have a java JDK/Version installed on your computer you might et his message: ![err](pics/err_java.png)
do not panic, just ignore it.
If you do not have Java installed yet or the VSC plugin cannot find it the plugin will open it's overview for you in order to make installation easier.
![jar overview](pics/o_view.png)
select JDK 8 and follow the download instructions/install instructions.
#### add the project
In VSCode click File -> open Folder
and choose the folder in which you have loaded the git project.

# WIP
At the moment my computer won'T recognise java, as soon as i have fixed that the guide will become longer.
Sadly i can't add to this guide until Sunday 18.8.2019, so please ask a discord mentor for help.
Sorry for the inconvenience. 
- ZweiEuro

# GUIDES TO FOLLOW
- something for maven
- github workflow
- trello workflow/how to read
