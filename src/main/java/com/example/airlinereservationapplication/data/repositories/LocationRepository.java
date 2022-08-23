package com.example.airlinereservationapplication.data.repositories;

import com.example.airlinereservationapplication.data.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {


}
