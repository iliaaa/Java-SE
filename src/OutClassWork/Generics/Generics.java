package OutClassWork.Generics;

import java.util.NoSuchElementException;

public class Generics {
    static class Shmoption<T> {
        T value;

        public Shmoption(T value) {
            this.value = value;
        }

        public T getValue() {
            if(value == null) throw new NoSuchElementException();
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public T orElse(T other) {
            return value == null ? other : value;
        }

        public boolean isPresent() {
            return value != null;
        }
    }

    static class NumberShmoption<N extends Number> extends Shmoption<N> {
        public NumberShmoption(N value) {
            super(value);
        }
    }

    static class IntegerShmoption extends NumberShmoption<Integer> {
        public IntegerShmoption(Integer value) {
            super(value);
        }
    }
}

