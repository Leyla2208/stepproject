package com.booking.dao;

import com.booking.entity.Booking;
import com.booking.entity.Flight;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public interface DAO<A>{
    Optional<A> get(int id);

    Collection<A> getAll();

    Collection<A> geztAllBy(Predicate<Booking> p);

    Collection<Booking> getAllBy(Predicate<Flight> p);

    void create(A data);

    void delete(int id);
}
