package com.homefindertx.homefindertx.repositories;

import com.homefindertx.homefindertx.models.Listing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends CrudRepository<Listing, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM listing l where l.user_id = ?1")
 List<Listing> findByUser(long id);

    }

