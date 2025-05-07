package com.adrian.roadmap.collections;

public class GenericsExample<T> {

    private T content;

    public void save(T object) {
        this.content = object;
    }

    public T get() {
        return content;
    }

    public static void main(String[] args) {
        GenericsExample<String> example = new GenericsExample<>();
        example.save("Hello");
        System.out.println(example.get());

        GenericsExample<Integer> example2 = new GenericsExample<>();
        example2.save(1);
        System.out.println(example2.get());
    }
}
