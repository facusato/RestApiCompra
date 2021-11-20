package com.unla.RestApiCompra.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.RestApiCompra.entities.Items;


@Repository("itemsRepository")
public interface IItemsRepository extends JpaRepository<Items, Serializable> {
}
