public class ListArray<T> implements List<T> {
    private T[] data= (T[]) new Object[1];
    private int length = 0;

    public ListArray() {
    }
    @Override
    public void add(T obj) {
        length=data.length;
        int indexTerakhir=length-1;
        if (data[indexTerakhir]==null)
            data[indexTerakhir]=obj;
        else {
            T[] databaru = (T[]) new Object[data.length * 2];
            for (int i = 0; i < databaru.length; i++) {
                if (i < data.length) {
                    for (int x = 0; x < data.length; x++) {
                        databaru[x] = data[x];
                        i=x;
                    }
                } else {
                    databaru[i] = obj;
                    i=i+1;
                    length++;
                }
            }
            data = databaru;
        }
    }


    @Override
    public T get(int index) {
        if(index == length){
        }
        return data[index];
    }

    @Override
    public void pop(int index) {
        data[index]=null;
        for (int i=index; i>length-1; i++){
            data[i]=data[i+1];
        }
        data[length-1]= null;
        length--;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void clear() {
        T[] datakosong = (T[]) new Object[data.length];
        this.length=0;
    }

}
