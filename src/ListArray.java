public class ListArray<T> implements List<T> {

    private Object[] array = new Object[1];
    private int size = 0;

    @Override
    public void add(T obj) {
        if(size >= array.length){
            Object[] newArray = new Object[size * 2];
            for(int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = obj;
        size++;
    }

    @Override
    public T get(int index) {
        if(index >= size) throw new ArrayIndexOutOfBoundsException("Index is out of list bounds");
        return (T)array[index];
    }

    @Override
    public void pop(int index) {
        if(index >= size) throw new ArrayIndexOutOfBoundsException("Index is out of list bounds");
        array[index] = null;
        for(int i = index; i < size-1; i++){
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Object[1];
        size = 0;
    }
}
