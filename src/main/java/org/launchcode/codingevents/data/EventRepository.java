package org.launchcode.codingevents.data;


import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer>{

    Object findAll();
}
