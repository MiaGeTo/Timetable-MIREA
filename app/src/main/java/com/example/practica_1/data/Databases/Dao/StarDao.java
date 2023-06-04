package com.example.practica_1.data.Databases.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.practica_1.data.Databases.Entity.StarEntity;

import java.util.List;

@Dao
public interface StarDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(StarEntity star);
    @Query("DELETE FROM star_tablee")
    void deleteAll();
    @Query("SELECT * FROM star_tablee ORDER BY name")
    LiveData<List<StarEntity>> getStars();
}