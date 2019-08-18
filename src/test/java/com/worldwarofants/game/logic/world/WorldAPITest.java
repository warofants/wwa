package com.worldwarofants.game.logic.world;

import org.junit.Test;

public class WorldAPITest {
    @Test
    public void testAddingEntities() {
        WorldAPI.createWorld(500, 500);

        // Adding entity with valid pos and uid
        WorldEntity test = new WorldEntity(0, 0, 1, WorldEntity.EntityType.ANT_GROUP);
        WorldAPIRequest request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, test);

        WorldAPI.call(request);
        assert WorldAPI.getEntity(1).equals(test);

        // Adding entity with random pos
        test = new WorldEntity(-1, -1, 2, WorldEntity.EntityType.ANT_GROUP);
        request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, test);

        WorldAPI.call(request);
        WorldEntity e = WorldAPI.getEntity(2);
        assert e.getPosX() != -1 && e.getPosY() != -1;

        // Adding entity with random uid
        test = new WorldEntity(1, 1, 0, WorldEntity.EntityType.ANT_GROUP);
        request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, test);

        WorldAPI.call(request);
        assert test.getUid() != 0;

        // Adding entity with invalid uid sets new uid
        test = new WorldEntity(1, 1, -1, WorldEntity.EntityType.ANT_GROUP);
        request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, test);

        WorldAPI.call(request);
        assert test.getUid() != -1;
    }

    @Test
    public void testGettingEntities() {
        WorldAPI.createWorld(500, 500);

        // Add some entities
        WorldAPIRequest[] requests = new WorldAPIRequest[] {
            new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(10, 10, 0, WorldEntity.EntityType.ANT_GROUP)),
            new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(5, 10, 0, WorldEntity.EntityType.ANT_GROUP)),
            new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(10, 7, 0, WorldEntity.EntityType.COLONY)),
            new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(3, 6, 0, WorldEntity.EntityType.COLONY)),
            new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(10, 10, 0, WorldEntity.EntityType.ANT_GROUP)),
            new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(4, 15, 0, WorldEntity.EntityType.ANT_GROUP))
        };

        for (WorldAPIRequest request: requests) {
            WorldAPI.call(request);
        }

        // Get entities at position
        assert WorldAPI.getEntitiesAtPosition(10, 10).size() == 2;
        // Check there are 2 colonies
        assert WorldAPI.getEntitiesFromFilter(entity -> entity.getType() == WorldEntity.EntityType.COLONY).size() == 2;
        // Check can filter y positions
        assert WorldAPI.getEntitiesFromFilter(entity -> entity.getPosY() == 10).size() == 3;
    }

    @Test
    public void testUpdatingEntities() {
        WorldAPI.createWorld(500, 500);

        // Add some entities
        WorldAPIRequest[] requests = new WorldAPIRequest[] {
                new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(10, 10, 1, WorldEntity.EntityType.ANT_GROUP)),
                new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(5, 5, 2, WorldEntity.EntityType.COLONY))
        };

        for (WorldAPIRequest request: requests) {
            WorldAPI.call(request);
        }

        // Change position of uid 1
        WorldEntity test = new WorldEntity(0, 0, 1, WorldEntity.EntityType.ANT_GROUP);
        WorldAPIRequest request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.PUT_ENTITY, test);

        WorldAPI.call(request);
        assert WorldAPI.getEntity(1).equals(test);
        assert WorldAPI.getEntitiesFromFilter(entity -> entity.getUid() == 1).size() == 1;

        // Test can't update to invalid position
        // Change position of uid 1
        test = new WorldEntity(-5, -5, 1, WorldEntity.EntityType.ANT_GROUP);
        request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.PUT_ENTITY, test);

        assert !WorldAPI.call(request);
        assert WorldAPI.getEntity(1).getPosX() != -5;

        // Test can update type
        test = new WorldEntity(5, 5, 2, WorldEntity.EntityType.ANT_GROUP);
        request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.PUT_ENTITY, test);

        assert WorldAPI.call(request);
        assert WorldAPI.getEntity(2).getType() == WorldEntity.EntityType.ANT_GROUP;

        // Test putting entity that doesn't does nothing
        test = new WorldEntity(3, 3, 3, WorldEntity.EntityType.ANT_GROUP);
        request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.PUT_ENTITY, test);

        assert !WorldAPI.call(request);
        assert WorldAPI.getEntity(3) == null;
    }

    @Test
    public void testRemoveEntities() {
        // Add some entities
        WorldAPIRequest[] requests = new WorldAPIRequest[] {
                new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(10, 10, 1, WorldEntity.EntityType.ANT_GROUP)),
                new WorldAPIRequest(WorldAPIRequest.WorldEventType.ADD_ENTITY, new WorldEntity(5, 5, 2, WorldEntity.EntityType.COLONY))
        };

        for (WorldAPIRequest request: requests) {
            WorldAPI.call(request);
        }

        WorldAPIRequest request = new WorldAPIRequest(WorldAPIRequest.WorldEventType.DELETE_ENTITY, 1);
        assert WorldAPI.call(request);
        assert WorldAPI.getEntity(1) == null;
    }
}
