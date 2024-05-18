package com.fahimsheikh.lil.learningspring.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CrudRepo takes the entity and the type of the ID
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
