package com.github.yoojia.events;

/**
 * @author Yoojia Chen (yoojiachen@gmail.com)
 * @since 1.2
 */
final class MethodDefine {

    public final int schedule;
    public final Class<?>[] types;
    public final String name;

    MethodDefine(int schedule, Class<?>[] types, String name) {
        this.schedule = schedule;
        this.types = types;
        this.name = name;
    }
}