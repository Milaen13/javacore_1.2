package com.company;

@FunctionalInterface
public interface OnTaskDoneListener<T> {
    void ifDone(T result);
}
