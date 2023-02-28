package com.mailservice.app1.repository;

import com.mailservice.app1.model.Domain;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
@EntityScan

public interface DomainRepository extends JpaRepository<Domain,Long> {}