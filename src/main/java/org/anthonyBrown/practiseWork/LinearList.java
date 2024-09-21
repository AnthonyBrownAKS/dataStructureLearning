package org.anthonyBrown.practiseWork;

public interface LinearList<T> {

    /*
    标准的List所应当具有的功能:
    1、增删改查
    2、是否包含
    3、找相同
    4、返回长度
    5、清空
    6、判断是否为空
    7、遍历
     */

    public T get(int i);// 获取顺序表的元素
    public void set(int i,T t);// 设置顺序表的元素-索引+元素
    public int insert (T t);// 在顺序表最后插入元素t,返回t序号
    public int insert(int i,T t);// 在线性表位置i插入元素t,返回t序号
    public T remove(int i);// 删除索引为i的元素，返回被删除的元素
    public boolean contains(T t);// 判断表中是否有传入的元素
    public int indexOf(T t);// 在线性表中查找首次出现和传入元素相同的元素,有返回索引,没有返回-1
    public int size();// 返回线性表长度
    public void clear();// 清空
    public boolean isEmpty();// 判断是否为空
    public void printList();// 遍历



}
