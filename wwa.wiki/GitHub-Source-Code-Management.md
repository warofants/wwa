#  Pre-Requisites: 
If you are a developer looking to commit the new changes for your task
* ~~Make sure you are part of a team~~
* Make sure you talk to your mentor about your idea or bug you have found, so that you can create a branch 
* Make sure you have access to the mentors github fork of main project
* Make sure to install git in your workstation

# How to Commit code as a Developer:
Once you have access to the mentor's development branch:
1. Clone your mentor's development branch to your personal machine `git clone --single-branch --branch <branchname> <remote-repo>`
2. Create a branch with naming convention of feature/task_name or bugfix/task_name `git checkout -b branch_name`
3. Before committing code:
    1. Remove any local machine references
    2. Variable are named aptly (GoodVariable: `combatAntCharacteristics`, Bad Variable: `x`)
    3. Variables follow camelCase (`goodVariable`, `badvariable`)

4. Then change the code or add the new files and commit the code. `git add fileName && git commit -m “Message about the changes”`. Make sure the message is clear about what the purpose is.
5. Then push the code to the mentors upstream repository. `git push --set-upstream origin branchName` ---> (needs to be done only once.)
6. Do a pull request to the development branch of your mentor's repository.
7. Send a Message to the mentor about the changes.
8. Go to your PR on github.com and choose a label for your PR

![test](https://i.imgur.com/CBlb5yg.png)

# Mentor Checklist for Accepting Changes:
Before you send the code PR to the organizational Branch, here are the key things you need to consider before accepting the changes:

1. Make sure your master is protected from the unwanted pushes, by going into the setting of your repo.
   1. Select the settings tab
   2. Select branches from the sidebar. 
   3. Click on the add rule add branch name pattern as master.
   4. Then select create to create a rule, this will allow any changes to be not pushed directly into master.
   5. Do the same for the development branch. 

2. Check the new PR raised by your mentee for code quality, consistent naming pattern, good comments and syntax errors.

3. Once you think code is looking good, raise a pull request to the Organizational development Branch, ~~include at least 3 reviewers who are other team mentors etc.~~ This is superseded by GitHub settings to require 6 approval reviews before merging. 
4. Once the code passes all the reviewer's review, then it is merged to development branch.
5. The code will be tested on a couple of other machines, once successful the mentee branch is merged to your master branch, then accept the PR and notify all your mentee about the new master changes. Ask them to re-base their branches according to master to maintain good timeline in commits.
6. Then raise a PR from your master branch to the organizational Development branch. 

# How to pull other team updates from the organizational master branch:
[Please follow the steps listed for syncing a fork](https://help.github.com/en/articles/syncing-a-fork)

# Branches and Branching Strategy: 
**Master Branch (master):**  This branch is the main code branch should always be stable and should accept pull request or merges only after the new pull requests are tested and tests are passed.  
**Development Branch (Development):** This is the branch that contains changes from the new members which may or may not be stable, mentors should always do pull request to this branch. Once the multiple people test (probably a couple of mentors), the team mentor will submit the pull request to the master branch.

# Additional Resources:
* To learn about the fundamentals of GIT: http://gitimmersion.com/
* To learn about git branching in general: https://learngitbranching.js.org/

