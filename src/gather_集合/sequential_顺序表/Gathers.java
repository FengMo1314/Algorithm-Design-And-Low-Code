package gather_集合.sequential_顺序表;

import java.util.Comparator;


/**
 * 线性表抽象数据类型
 * @param <T> 数据元素的数据类型
 * @author JackY
 */
public interface Gathers<T>{//线性表接口
	  /**
     * 返回下标为index的元素
     * @param index 下标
     * @return 元素
     */
    T get(int index);

    /**
     * 替换列表中指定位置的元素
     * @param index 指定位置下标
     * @param element 替换用的元素
     */
    void set(int index, T element);

    /**
     * 在线性表的指定位置处插入元素
     * @param index 指定位置下标
     * @param element 待插入的元素
     * @return 插入后元素的序号
     */
    int insert(int index, T element);

    /**
     * 在线性表的最后插入元素
     * @param element 待插入的元素
     * @return 插入后元素的序号
     */
    int insert(T element);

    /**
     * 删除指定位置的元素
     * @param index 指定位置下标
     * @return 被删除的元素
     */
    T remove(int index);

    /**
     * 在线性表中查找首次出现的与被查元素相同的元素的位置
     * @param element 被查元素
     * @return 如果查到，返回元素位置，否则返回 -1
     */
    int indexOf(T element);

    /**
     * 判断线性表中是否包含指定元素
     * @param element 指定元素
     * @return 如果包含返回 true，否则 false
     */
    boolean contains(T element);

    /**
     * 返回线性表的长度
     * @return 线性表的长度
     */
    int size();

    /**
     * 返回线性表的占用空间
     * @return 占用空间
     */
    int space();

    /**
     * 清空线性表
     */
    void clear();

    /**
     * 判断线性表是否为空
     * @return 如果空，返回 true， 否则 false
     */
    boolean isEmpty();

    /**
     * 遍历线性表所有元素
     */
    void printList();

    /**
     * 排序 默认从小到大
     * @param c comparator
     */
    void sort(Comparator<T> c);
}
