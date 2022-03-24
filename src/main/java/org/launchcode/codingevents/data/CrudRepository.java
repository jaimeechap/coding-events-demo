package org.launchcode.codingevents.data;

public interface CrudRepository<E, I extends Number> {
    Object findAll();
}
