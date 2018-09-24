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

    @Query (nativeQuery = true, value="SELECT * FROM listing l WHERE l.address LIKE ?1 or l.status LIKE ?1 " +
            "or l.bedrooms LIKE ?1 or l.bathrooms LIKE ?1 or l.description LIKE ?1 or l.year_built LIKE ?1 or l.zipcode LIKE ?1")
    List<Listing> searchByKeyword(String x);
}

