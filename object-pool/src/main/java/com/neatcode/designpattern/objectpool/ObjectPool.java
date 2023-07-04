package com.neatcode.designpattern.objectpool;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Generic object pool.
 *
 * @param <T> Type T of Object in the Pool
 */
public abstract class ObjectPool<T> {

    private final Set<T> available = new HashSet<>();
    private final Set<T> inUse = new HashSet<>();

    private int currentInventorySize;

    protected abstract Optional<T> create();

    /**
     * Checkout object from pool.
     */
    public synchronized T request() {
        if (available.isEmpty()) {
            Optional<T> obj = create();
            if(obj.isPresent()) {
                available.add(obj.get());
                currentInventorySize += 1;
            }
        }
        var instance = available.iterator().next();
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    public synchronized void release(T instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    public int getInventorySize() {
        return this.currentInventorySize;
    }

    @Override
    public synchronized String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
}
