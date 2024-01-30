package src.manager;

import java.util.ArrayList;

public abstract class BaseManager<E> {
    protected ArrayList<E> list = new ArrayList<E>();
    public abstract void add(E element);

    public abstract void remove(int index);

    public abstract void edit(int index, E element);


}
