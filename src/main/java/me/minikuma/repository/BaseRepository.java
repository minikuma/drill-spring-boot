package me.minikuma.repository;

public interface BaseRepository {
    void insert(String value);
    void delete(String value);
    boolean search(String value);
}
