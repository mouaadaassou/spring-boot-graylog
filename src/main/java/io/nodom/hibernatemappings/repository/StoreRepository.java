package io.nodom.hibernatemappings.repository;

import io.nodom.hibernatemappings.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
