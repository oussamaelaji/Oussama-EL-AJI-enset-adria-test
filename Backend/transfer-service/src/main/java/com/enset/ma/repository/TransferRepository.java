package com.enset.ma.repository;

import com.enset.ma.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface TransferRepository extends JpaRepository<Transfer, String> {
}
