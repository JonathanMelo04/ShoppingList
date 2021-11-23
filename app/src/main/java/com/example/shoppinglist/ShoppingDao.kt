package com.example.shoppinglist

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface ShoppingDao {

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun upsert(item: ShoppingItem)

  @Delete
  suspend fun delete(item: ShoppingItem)

}