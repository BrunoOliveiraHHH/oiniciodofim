package com.iniciodofim.iniciodofim.repository;

import org.springframework.data.repository.CrudRepository;

import com.iniciodofim.iniciodofim.model.ItemModel;

public interface ItemRepository extends CrudRepository<ItemModel, String> {

}
