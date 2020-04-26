package com.company;

import java.util.Collection;

public interface List<T> {

    interface Node<T> {

    }

    void addFirst(T value);

    void addLast(T value, int index);

    void addAllFirst(Collection<T> collection);

    void addAllLast(Collection<T> collection);

    void addAllFirst(Collection<T> collection, int index);

    void addAllLast(Collection<T> collection, int index);

    /**
     * @return the index of the first occurrence of the node with same value
     * */
    void indexOf(T value);

    /**
     * @return the index of the last occurrence of the node with same value
     * */
    void lastIndexOf(T value);

    T remove(int index);

    /**
     * Removes the first element of the list
     * @return value of the first element
     * */
    T removeFirst(); //

    /**
     * Removes the last element of the list
     * @return value of the last element
     * */
    T removeLast();

    /**
     * Removes the first occurrence of the node with same value
     * @return true if it was success else false
     * */
    boolean removeFirstOccurrence(T value);

    /**
     * Removes the last occurrence of the node with same value
     * @return true if it was success else false
     * */
    boolean removeLastOccurrence(T value);

    boolean contains(T value);

    void set(int index, T value);

    int size();

    Node[] toArray();

    T[] toArray(T[] a);

    void clear();

    void isEmpty();

    List clone();

    List<T> subList(int fromIndex, int toIndex);
}
