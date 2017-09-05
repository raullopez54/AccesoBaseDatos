package com.lab.persistence.mapper;

import com.lab.persistence.model.ItemModel;
import java.util.List;


public interface ItemMapper
{
  public List<ItemModel> itemMapper(ItemModel obj) throws Exception;
  public List<ItemModel> PesoItemMapper(ItemModel obj) throws Exception;
  public List<ItemModel> getItemMapper(ItemModel obj) throws Exception;
}