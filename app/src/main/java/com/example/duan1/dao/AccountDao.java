package com.example.duan1.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.duan1.model.Account;

import java.util.List;

@Dao
public interface AccountDao {
    @Insert
    void insert(Account account);
    @Update
    void update(Account account);
    @Delete
    void delete(Account account);
    @Query("select*from Account")
    List<Account> getAll();
}