package com.homefindertx.homefindertx.repositories;

import com.homefindertx.homefindertx.models.listing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends CrudRepository<listing, Long> {


    }

