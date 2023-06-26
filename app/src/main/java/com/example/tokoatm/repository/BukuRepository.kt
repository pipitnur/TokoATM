package com.example.tokoatm.repository

import com.example.tokoatm.dao.BukuDao
import com.example.tokoatm.model.Buku
import kotlinx.coroutines.flow.Flow

class BukuRepository(private val BukuDao: BukuDao) {
    val allBukus: Flow<List<Buku>> = BukuDao.getAllBuku()

    suspend fun insertBuku(Buku: Buku) {
        BukuDao.insertBuku(Buku)
    }

    suspend fun deleteBuku(Buku: Buku) {
        BukuDao.updateBuku(Buku)
    }
}