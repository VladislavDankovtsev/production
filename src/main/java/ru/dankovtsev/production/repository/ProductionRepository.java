package ru.dankovtsev.production.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dankovtsev.production.model.Production;

import java.util.UUID;

@Repository
public interface ProductionRepository extends JpaRepository<Production, UUID> {
}
