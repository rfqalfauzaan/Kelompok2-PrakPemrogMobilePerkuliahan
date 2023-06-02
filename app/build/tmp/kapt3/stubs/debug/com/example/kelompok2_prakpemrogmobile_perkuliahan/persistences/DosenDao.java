package com.example.kelompok2_prakpemrogmobile_perkuliahan.persistences;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0013H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/kelompok2_prakpemrogmobile_perkuliahan/persistences/DosenDao;", "", "delete", "", "item", "Lcom/example/kelompok2_prakpemrogmobile_perkuliahan/model/Dosen;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "find", "getList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAll", "items", "", "([Lcom/example/kelompok2_prakpemrogmobile_perkuliahan/model/Dosen;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAll", "Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract interface DosenDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Dosen ORDER BY nidn DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.kelompok2_prakpemrogmobile_perkuliahan.model.Dosen>> loadAll();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Dosen ORDER BY nidn DESC")
    public abstract java.lang.Object getList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.kelompok2_prakpemrogmobile_perkuliahan.model.Dosen>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM Dosen WHERE id = :id")
    public abstract java.lang.Object find(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.kelompok2_prakpemrogmobile_perkuliahan.model.Dosen> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    com.example.kelompok2_prakpemrogmobile_perkuliahan.model.Dosen[] items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.kelompok2_prakpemrogmobile_perkuliahan.model.Dosen> items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.kelompok2_prakpemrogmobile_perkuliahan.model.Dosen item);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM Dosen WHERE id = :id")
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}