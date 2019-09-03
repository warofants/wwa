# Structure

## MVP

MVP stands for Minimum Viable Product. It is a product with just enough features to satisfy the requirements and elicit

## Main Scope of WWA

- This game will have permanent death (for now)
- Turn-based game, text adventure game
- ~~No game saves (for now, unless it's simple to implement)~~
- Main goal of the game is to eliminate all randomly placed colonies of rival ants
- The player wins when they eradicate all other colonies in their region
- The player loses if their colony is eradicated
- The player loses if their colony dies off from starvation
- The player controls the decisions of an entire colony of ants
- All ant classes will need to either player controlled or NPC (some are NPC-only for now)

## Main menu options

- NEW GAME button

  - NEW GAME will take player to screen where they select their species
  - Player picks from various classes of ant species (PICK YOUR SPECIES)

    - Given a list of stats for each species

      - Player can read through list of strengths and weaknesses for all species, including NPC species (NPC species should be noted as such)
      - Some stats will increase or decrease with player decisions throughout the game, or with time passed (decrease overall colony HP or population if enough time has passed without food, increase armour if well fed, etc)
      - The species that is picked determines what region of the world the level will be in, all other classes and environments will be unique to this region

        - Stats are randomized, but within set ranges
        - All stats TBD

- OPTIONS button will allow player to choose difficulty levels (easy, normal, hard)

  - Each difficulty level changes RNG for resources, ant stats, combat, map size, starvation rate and enemy spawn rate

- HOW TO PLAY button describes the basics of the game (control, goals, death, collecting resources, combat, etc)

  - Advanced button describes in detail about what affects player and world variables, percentages, HP, etc.

- Easter egg in game menu that floods the screen with ASCII ants? (pressing ESC exits)

--------------------------------------------------------------------------------

## Resources

- Food:

  - Individual ants and insects (easy, low source)
  - Has a nourishment value and a moisture value
  - Termites (easy, medium source, but also attracts anteaters)
  - Left Over Food {half eaten apple, broken leaves etc}(medium,High source, attracts NPC and other ants)
  - Skirmish with a enemy food collecting party.(Take someone else's food,hard,depends on the enemy party)
  - Colonies (highest source, but all or nothing)

- How to collect food:

  - Army ant classes are always on the move, player chooses what to pursue in game based on what the scout ants find up ahead (use RNG from a predetermined list of things)
  - Skirmishes with NPCs or Enemy carrying food.

- Things to improve colony

  - Leaf cutter ants need to build up a

    - refuse (waste management).
    - Better refuse chambers means faster HP refresh when resting (The commented link suggests that ants produce food out of their excrement, but it takes a lot of time to form and needs to be harvested, hence this type of food could be the best food source but might take a long time to produce)

      - brood chambers (reproduction)

        - The more resources for brood chambers, the faster the colony grows (A well fed queen?)

      - fungus gardens

        - A auto-replenishing food source, the higher this resource, the more it replenishes (Food with high moisture values, a certain amount of moisture value needs to be maintained for it to work )

--------------------------------------------------------------------------------

## Obstacles

- The need for food and resources (ant population begins reducing at x rate, after x amount of time without food. Timers and status counters always on UI)
- Aggressors

  - Wasps
  - Birds
  - Lizards
  - Humans
  - Parasites
  - Other colonies
  - Anteaters (this nukes a colony and should only be introduced in hard mode. Players are enticed to get closer by very high rewards, closer proximity means higher rewards, but getting too close will aggro anteater, anteater takes a long time to move away from area. This isn't factually accurate. From wiki: an anteater normally spends about a minute at a nest before moving on to another)

    - Why not have the anteater be a short nuke which destroys 60%-70% of the ant population, leaves in a minute and has a chance of wiping out the colony.

- Obstacles will be encountered randomly for scouts, and randomly for entire colonies while resting or while hunting/moving.

  - If scout ants die without returning nothing can be done in that area until a new scout team is sent.

- Each aggressor obstacle will be its own class that will have an overall effect on the entire colony, or the scouts.

--------------------------------------------------------------------------------

## Colonies

- Colonies will start with random number of ants, within a specified range

  - Giant Amazonian ants have fewer than 100 individuals
  - Leaf cutter ants can have up to 8 million individuals
  - Will get specific numbers for all colonies later
  - This number will be important during combat, as greater numbers means very high odds of victory

--------------------------------------------------------------------------------

## Player actions

- Colonies will care for livestock (food and health)
- Construct complex colonies (resources)
- Pursue agriculture (food)
- Symbiotic relationships (health)

--------------------------------------------------------------------------------

## Basic player mechanics

- Turn-based
- Player makes a move
- pause the stream
- give some basic ASCII animations that are unique to the player's decision
- output a new set of values (health, resources, food, population, etc) that were affected by the player's choice on previous turn
- Rinse and repeat

--------------------------------------------------------------------------------

## Using individual ants

- Player can send scouts out to find other colonies or resources, but these scouts are not player controlled, have RNG chance for success based on what the scouts encounter (for now).

--------------------------------------------------------------------------------

## Combat

- Skirmishes

  - Smaller, quicker battles. 25% of the colony will skirmish
  - Can be between same species, except AA can't fight other AA
  - Player will win skirmish 100% of the time if their population is far greater (define far greater) than the opponent. Player will not know the exact numbers of opponent, just the species (this system may need tweaking)
  - Rewards from skirmish will be medium food counts, low resource counts
  - Loses will be the entire 25% that began the skirmish

- Raids

  - Larger, longer, and more complex battles. 50% of the colony will raid
  - Can be between same species, except AA can't fight other AA
  - Player will win raid 100% of the time if their population is far greater AND their resources are far greater (this system may need tweaking)
  - Loses will be the entire 50% that began the raid

- Invasions

  - Full-out invasions, and take-overs of other colonies. 100% of colony must invade
  - Must be between different species
  - Player will win raid 100% of the time if their pop, resources, and food are all far greater than the invaded (may need tweaking)
  - Loses end the game!

- After combat, players will be notified of their loses and will have to plan to recoup losses at some point.

- If skirmishes or raids are lost, the player will take a big penalty to many stats, forcing them into a retreat and healing strategy

--------------------------------------------------------------------------------

## Class/species specifics

Starting ant species to choose from (will add more species pending part 2 video from [Kurzgesagt](https://www.youtube.com/channel/UCsXVk37bltHxD1rDPwtNM8Q)):

- Army ants (Eciton) (offensive class)
- Bullet ants (offensive class)
- Giant Amazonian ants (offensive class)
- Leaf Cutter ants (defensive class)

- Army Ant (AA)

  - The most aggressive class in the game, will probably be a player favorite
  - Must attack everything they encounter immediately, even entire colonies
  - AA don't fight other AA
  - AA send massive columns of ants out to scour and immediately kill every insect or small vertebrae they encounter
  - AA can send scouts before attacking, this increases the AA colony's chances of a successful invasion, if the scouts are not killed first!
  - AA colonies must rest to recuperate the colony's overall HP

- Bullet Ant (BA)

  - 100% effective at repelling humans
  - This ant is a predator of the glasswing butterfly. This butterfly attempts to combat Bullet ant by producing chemical extracts during the larval stage that are unpalatable to these ants. (maybe we make turn this into an active defense instead of passive?)
  - The small phorid fly is a parasite of injured workers of Bullet ants, of which the supply is constant because frequent aggressive encounters occur between neighboring colonies, resulting in maimed workers. The flies are able to parasitize healthy ants if the ants are artificially restrained, but healthy ants are agile and able to repel them. Army Ants must rest to regain HP and fend off phorid flies. Phorid flies will continually lower AA's HP the longer the AA's are not resting.
  - Sting is the strongest of all ants? (confirm if true IRL)

- Giant Amazonian Ants (GA)

  - TBD

- Leafcutter ants (LC)

  - Highly effective at defending against AA, except for NomaEsen ants
  - LC must enter "crisis mode" when they detect attacking ants

    - Crisis mode stops all other production, 100% of colony is on defense, very effective
    - The large soldiers swarm to sight of attack to create a front line

      - This front line should be effective against some AA species, but ineffective with NomaEsen
      - Has only 20% chance to stop NomaEsen

  - LC (player) can choose to "fall back" and seal off nest entrances
  - This increases odds of successful defense to 75%
  - If NomaEsen successfully invades and steals brood, total LC pop is reduced by 80%, food, health, brood, and resources all reduced by 90%

--------------------------------------------------------------------------------

## Other Ants

- NPC class: P. desertorum (desert ants)

  - Effective defense against all army ant classes
  - Spawned when player chooses an AA class
  - Immediately evacuate nest when they notice army ants
  - Carry as many larvae as they can in order to return and rebuild after attack
  - High chance of ineffective invasion by player

- NPC class: P. obtusospinosa (square head ants)

  - Spawned when player chooses an AA class
  - Worker classes have big square heads
  - Used to block entrances to nest when army ants show up
  - Attackers give up after a while (high chance of repelling invasions from player)

- NPC class: Nomamyrmex Esenbeckii ("NomaEsen" for short, an AA class)

  - The only species that can successfully eradicate a colony of leafcutters
  - Should be spawned with player choose LC

--------------------------------------------------------------------------------

[Original document link, open to comments](https://docs.google.com/document/d/1Ifrb9M22DZtGeZhFImdIjLQhQbWsZbalRC0N4u_YL1A/edit)
