package com.example.tokoatm.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tokoatm.model.Buku
import kotlinx.coroutines.flow.Flow

@Dao
interface BukuDao {
    @Query("SELECT * FROM `buku_table` ORDER BY name ASC")
    fun getAllBuku(): Flow<List<Buku>>

    @Insert
    suspend fun insertBuku(Buku: Buku)

    @Delete
    suspend fun deleteBuku(Buku: Buku)

    @Update fun updateBuku(Buku: Buku)
}