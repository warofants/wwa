# Colony
* ~~Work with values team~~ create your own values and work with species team to create both unique and common      structures used in ant colonies. brood chambers and farms are just some ideas
* Work on natural disasters and other things that can destroy a colony.
* Think of Fallout shelter when designing the colony and related structures, this module will try to give the same feeling as that.




## Colony mechanics
* All colonies start with a random number of ants, this number depends on the species of the ant. (Currently, work with a common constant until more information is provided)
* Colonies are a graph with each node being a structure/building.
* Colonies can be accessed anytime during the game, so the colony mechanics will have to suit that.
* Colony hunger mechanics depend upon the number of ants and the type of ants.
* The entrance node(structure) will connect the colony to the overworld.
* The starvation mechanic reduces food at an exponential rate, the longer you remain without food the faster the colony dies.

## Colony Class implementation

### Constructor/Global Variables
* A reference to the entrance node(head of the graph).
* A variable to keep track of the colony ID.
* A variable to keep track of which player does the colony belong to.
* A variable to keep track of the number of ants in the colony.
* A variable to keep track of the number of nodes(structures) in the colony.
* A variable to keep track of the amount of food in the colony.
* A variable to keep track the amount of dirt in the colony.
* A variable to keep track of the number of attacking entities(attack parties).
* A variable to keep track of the number of scavenging entities(scavenge parties)
* A variable to keep track of the number of scouting entities(scouting parties)
* A variable to keep track of the entity - queen.

### Colony Methods
* Add node(structure)
* This function adds a node to the colony graph.
* This function takes an input(String possibly).

### Upgrade Node(structure)
* This function takes an input(String possibly)
* This function upgrades the stats of a structure.

### Remove Node(structure)
* This function takes an input(String Possibly)
* This function removes a structure(what happens to the resources in a structure?probably gone)

### Calamity
* This function does not take any input.
* This function is passive.(player is not actively using it)
* This function removes nodes and reduces ant population by a random factor.

### Setters/Getters
* These functions set and get the values of global variables.
* Getters don’t take any input, setters take the value to be set as an input.

### Generate Structure ID
* This function doesn’t take any parameter
* Generates a random unused ID for a structure.


## Structures
* Structures act as nodes of the colony graph
* Each structure needs to store a certain number of ants.
* Production values depend on the structure stats and the number of ants in the structure.
* Each structure is connected to at most three other structures.
* Each structure has different hp ,storage and production stats.

## Structure class group implementation
### Constructor
* Variable to store the node(structure) health,storage and production stats.
* A variable to keep track of the structure ID
* A variable to keep track of which colony does the structure belongs to.
* A variable to keep track of the amount of ants in the structure
* A variable to check if the structure is upgradable.
* Two references to other structures.(can be null)

### Structure methods
* Setter/Getter
   * These methods set and return the above mentioned values.

## Different types of structures
### Storage structures
* These include resource storage areas, nurseries, barracks.

### Resource storage
* This class extends the structure class.
* This class needs  variables that keeps track of  the amount of resources there are.(both food and dirt)
* The resource limit for now is 15 units and can be upgraded.

### Nurseries 
* This class extends the structure class.
* This class needs a variable to keep track of the amount of larvae in the structure.
* The larvae die in the state of starvation.
* The larvae grow up after a set amount of turns.

### Barracks
* This class extends the structure class.
* This class keeps track of the number of ants in the colony.
* This class also keeps track of the number of parties(attack/forage/scout) in the colony.
* Number of entities in a barrack start at 24 and can be increased.
* Barracks reduce hp drain from hunger and increase hp gain for a damaged party/entity.

## Production Structures
* These include dirt production areas, food production areas, refuse chambers and brood chambers.
* Production stops if the storage areas are full.

### Dirt production areas
* This extends structure class
* This class deals with the amount of dirt produced per turn.
* This area needs resources to function, mainly food with low nutrition value.
* This can be upgraded.

### Food production areas
* This extends the structure class
* This class deals with the amount of food produced.
* This area needs resources to function, mainly food with high moisture value.
* This can be upgraded.

### Refuse Chambers
* This extends the structure class
* This class deals with food production and Hp gain.
* The food produced here takes the longest time to harvest and is the best food source in the whole game.
* This also increases the rate at which the ants heal.
* This cannot be upgraded.

### Brood Chambers
* This extends the structure class
* This class deals with ant production
* This class stores the queen
* The rate at which the ants are produced is directly proportional to the queen's health.
* This cannot be upgraded.

### Entrance
* This extends the structure class and is an empty structure.
* This connects the colony to the overworld.

### Healing Chambers
* TBD


	

# NOTES:
* Once the current tasks are done and approved we will make specialized structures, we have a starting list of ant species so when that time comes, we will need more ideas.
* Feel free to comment on the document(comment before change, or add in suggestion)
* Add as many suggestions as you want and a mentor will review and comment on them, if they are good suggestions they will be added.
* We will work on the view part (see the architecture explanation) later, since we are already(kind of ) working on the module, but if someone wants to work on the view, just put some stuff here about what you are working on and just go ahead.

# THOUGHTS and SUGGESTIONS!
* Thoughts about food production areas - the impression I got was that all the food would come from foraging and scouting, as ants do IRL. Although I understand this addition will most likely simplify some things.
* Suggestion for brood chambers - if there is enough food, the brood chambers get filled up by the queen, then in the incubation period, there needs to be “nurse-ants” to look after the larvae. Without enough nurse-ants, a portion of the larvae stand a high chance of dying relative to the number of nurse-ants missing
* Suggestion for the brood chambers - the ant type should be decided before the larvae are created so as to allow this decision to affect the amount of incubation time (this also encourages strategising)
* How about adding healing chambers?

# Current Tasks!
* Make a colony structure(there is no need to make an abstract class for it, also leave the below-mentioned functions from the class, you can  add their headers)
* ~~Make a Structure abstract class (Ask away on discord if anything needs to be changed)~~
* Make the calamity function.(This will be randomly generated on certain turns.)
* Design the RNG mechanics for the colony(this includes resource production)
* Make the barracks structure.
* Make the refuse chamber structure
* Make the resource storage structure
* Make the food production structure
* Make the dirt production structure.
* Make the Brood chamber structure.
* Make the entrance.
* Make the nurseries.

***

[Link to the original document](https://docs.google.com/document/d/14ZrK6CXqnMUoUFCtlNzjaMDxNjT7v6mTOKCm6EhfKHo/edit), open to comments from the public.


