package com.company;

@FunctionalInterface
public interface OnTaskErrorListener<T> {
    void ifError(T result);
}
