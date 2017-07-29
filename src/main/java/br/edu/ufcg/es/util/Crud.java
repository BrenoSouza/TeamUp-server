package br.edu.ufcg.es.util;

import java.util.Iterator;
import java.util.List;

public interface Crud<T> {
    T create(T t);

    List<T> getAll();

    T getById(Long id);

    T update(T t);
    
    List<T> getAllById(List<Long> ids);
    
    boolean removeById(Long id);

    boolean removeAll();
}