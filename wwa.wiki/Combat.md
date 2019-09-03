# Combat
* Start to develop the code for handling the combat system
* To start, work from a list of known ant colonies (found from scouting) to predict chance of winning. Keep the chance of winning calculated from some RNG but in the future it would be great to have a tactical battle simulator (my guts says this would be awesome) 
   * rng based on number/type of ants, geography?


## Skirmishes 
* Infinite per game world
* Smaller, quicker battles. 25% of the colony will skirmish
* Can be between same species, except AA can’t fight other AA
* Player will win skirmish 100% of the time if their population is far greater (define far greater) than the opponent. Player will not know the exact numbers of opponent, just the species (this system may need tweaking) (player should still sustain some losses)
* Rewards from successful skirmish will be medium food counts, low resource counts
* Loses will be the entire 25% that began the skirmish
* Player should not be able to complete, say, 5,000 skirmishes in order to boost stats and win all invasions. Winning skirmishes should be more of a temporary boost to food and resources. (base skirmish availability on population/resource counts/ratios?)
## Raids
* 3-4 per game world, optional
* Larger, longer, and more complex battles. 50% of the colony will raid
* Can be between same species, except AA can’t fight other AA
* Player will win raid 100% of the time if their population is far greater AND their resources are far greater (this system may need tweaking) (player should still sustain some losses, more costly?)
* Rewards from successful raids will be high food counts and medium resource counts (maybe not 100% efficient?)
* Loses will be the entire 50% that began the raid
## Invasions 
* 1-3 per game world, 1 for easy difficulty, 2 for medium, 3 for hard, all mandatory
* Full-out invasions, and take-overs of other colonies. 100% of colony will invade
* Must be between different species 
* Player will win invasion 100% of the time if their pop, health, resources, and food are all far greater than the invaded (may need tweaking) (should probably also be based on species)
* Rewards from successful invasions will increase all colony/player stats by 175% (unless this would be more than the enemy had in total? also probably should not impact player population, just resources/food/other)
* Loses end the game!

## Notes
* After combat, players will be notified of their gains or loses and will have to plan accordingly (go to next fight, or forced to recover)
* If combat is lost, the player will take a big penalty to many stats, forcing them into a retreat and healing strategy

***
[Link to original document](https://docs.google.com/document/d/1ilsPB3HL6Hpeesk_3SQu6TqPzreM0VFmi09dMWo93W0/edit), open to comments from the public. 