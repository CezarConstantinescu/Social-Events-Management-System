package com.social_events_management_system.services.computation;

public class ComputationResult<T> {
    private final T result;

    public ComputationResult(T result) { this.result = result; }
    public T getResult() { return result; }
}
