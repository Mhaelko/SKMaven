package HW.Lesson07.Additional.Task03;

import java.util.Arrays;

public class ArrayExtImpl implements ArrayExt{
    private int basicSize;
    private Object[] Obj = new Object[basicSize];

    public void setBasicSize(int basicSize) {
        this.basicSize = basicSize;
    }

    public void setObj(Object[] obj) {
        Obj = obj;
    }

    @Override
    public String toString() {
        return "Object = {" + Arrays.toString(Obj) + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayExtImpl arrayExt = (ArrayExtImpl) o;
        return Arrays.equals(Obj, arrayExt.Obj);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(Obj);
    }

    @Override
    public Object get(int index) {
        return Obj[index];

    }

    @Override
    public int size() {
        return Obj.length;
    }

    @Override
    public void add(Object el) {

    }

    @Override
    public void add(int index, Object el) {

    }

    @Override
    public void remove(int index) {

    }
}
