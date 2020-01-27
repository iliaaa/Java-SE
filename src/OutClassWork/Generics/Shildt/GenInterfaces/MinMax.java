package OutClassWork.Generics.Shildt.GenInterfaces;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
