package com.sealService.PlombService.lkselaingrepository;

import com.sealService.PlombService.entitiy.lksealingentity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, String> {
}
