package com.adrian.legacy.annotations;

import java.lang.reflect.Method;

public class AuthorService {

    @Author(author = "Adrian", date = "2021-01-01")
    public void readAuthor(){
        System.out.println("Reading author...");
    }

    public static void main(String[] args) throws Exception{
        Method method = AuthorService.class.getMethod("readAuthor");
        Author annotation = method.getAnnotation(Author.class);
        assert annotation != null;
        System.out.println(annotation.author());
        System.out.println(annotation.date());
    }
}
