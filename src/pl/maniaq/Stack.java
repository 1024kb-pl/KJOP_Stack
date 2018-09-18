package pl.maniaq;

public class Stack<T> {
    private T [] elements;
    private int lastIndex;

    public Stack() {
        elements = (T[]) new Object[10];
        lastIndex = -1;
    }

    public void push(T element) {
        if (isNotEmptySpaceInArray()) {
            elements = increaseArraySize(elements);
        }
        lastIndex++;
        elements[lastIndex] = element;
    }

    private T[] increaseArraySize(T[] elements) {
        int newSize = elements.length * 2; // rozmiar zwiększamy dwukrotnie, jest to podobno optymalne względem zużycia pamięci oraz złożoności obliczeniowej
        return copyToNewArray(elements, newSize);
    }

    private T[] copyToNewArray(T[] elements, int newSize) {
        T [] newElements = (T[]) new Object[newSize];
        for(int i=0;i<elements.length;i++) {
            newElements[i] = elements[i];
        }
        return newElements;
    }

    private boolean isNotEmptySpaceInArray() {
        return lastIndex >= elements.length - 1;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T popElement = elements[lastIndex];
        elements[lastIndex] = null;
        lastIndex--;
        return popElement;
    }

    private boolean isEmpty() {
        return lastIndex == -1;
    }

    public void displayStack() {
        for (int i=0;i<=lastIndex;i++) {
            System.out.println(elements[i]);
        }
    }


}
