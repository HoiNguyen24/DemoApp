package src.manager;

import src.model.Clothes;

public class ClothesManager extends BaseManager<Clothes> {
    @Override
    public void add(Clothes element) {
        this.list.add(element);
    }

    @Override
    public void remove(int index) {
       this.list.remove(index);
    }

    @Override
    public void edit(int index, Clothes element) {
        this.list.set(index, element);
    }
}
