package ru.jdroid.serg;

public interface Observer<T> {
    void onChanged(T t);
}

