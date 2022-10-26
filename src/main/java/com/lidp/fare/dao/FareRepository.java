package com.lidp.fare.dao;

import java.util.Optional;

import com.lidp.fare.domain.Fare;
import com.lidp.fare.domain.FareId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FareRepository extends CrudRepository<Fare, Long>
{
   Iterable<Fare> findAll();
   Optional<Fare> findById(FareId fareId);
   Fare save(Fare fare);
}
