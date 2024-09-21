package org.anthonyBrown.practiseWork;

import java.util.Arrays;

public class class2List implements LinearList<studentClass2>{

    private Object[] array;// 内部数组
    private int size;// 当前元素数量
    private static final int INITIAL_CAPACITY = 10;  // 初始容量

    // 初始化New
    public class2List(){
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    // 获取,若是索引不符合规范则抛出异常
    @Override
    public studentClass2 get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (studentClass2)array[i];
    }

    // 设置元素
    @Override
    public void set(int i, studentClass2 studentClass2) {
        array[i] = studentClass2;
    }

    // 插入元素,先判断存储,若是不够则扩容
    @Override
    public int insert(studentClass2 studentClass2) {
        if (size == array.length){
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array,newCapacity);
        }
        array[size++] = studentClass2;
        return size;
    }

    // 插入指定位置元素,若是不够则向后移动
    @Override
    public int insert(int i, studentClass2 studentClass2) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        // 创建一个比原数组多一个元素的新数组
        studentClass2[] newArray = new studentClass2[array.length];
        // 复制插入位置之前的元素
        System.arraycopy(array, 0, newArray, 0, i);
        // 插入新元素
        newArray[i] = studentClass2;
        // 复制插入位置之后的元素
        System.arraycopy(array, i, newArray, i + 1, array.length - i);
        // 替换原数组
        array = newArray;
        return i;
    }

    @Override
    public studentClass2 remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        @SuppressWarnings("unchecked")
        studentClass2 oldValue = (studentClass2) array[i];
        // 移动元素
        int numMoved = size - i - 1;
        if (numMoved > 0) {
            System.arraycopy(array, i + 1, array, i, numMoved);
        }
        array[--size] = null;
        // 返回被删除的元素
        return oldValue;
    }

    // 是否含有
    @Override
    public boolean contains(studentClass2 studentClass2) {
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (studentClass2.equals(array[i])){
                b = true;
                break;
            }
        }
        return b;
    }

    // 寻找相同元素
    @Override
    public int indexOf(studentClass2 studentClass2) {
        int index = -1;
        // 遍历
        for (int i = 0; i < array.length; i++) {
            if (studentClass2.equals(array[i])){
                index = i;
                break;
            }
        }
        return index;
    }

    // 大小
    @Override
    public int size() {
        return size;
    }

    // 清除
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (size != 0){
            return true;
        }else {
            return false;
        }
    }

    // 打印
    @Override
    public void printList() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
