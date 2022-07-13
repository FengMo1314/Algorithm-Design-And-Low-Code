package gather_����.sequential_˳���;

import java.util.Comparator;


/**
 * ���Ա������������
 * @param <T> ����Ԫ�ص���������
 * @author JackY
 */
public interface Gathers<T>{//���Ա�ӿ�
	  /**
     * �����±�Ϊindex��Ԫ��
     * @param index �±�
     * @return Ԫ��
     */
    T get(int index);

    /**
     * �滻�б���ָ��λ�õ�Ԫ��
     * @param index ָ��λ���±�
     * @param element �滻�õ�Ԫ��
     */
    void set(int index, T element);

    /**
     * �����Ա��ָ��λ�ô�����Ԫ��
     * @param index ָ��λ���±�
     * @param element �������Ԫ��
     * @return �����Ԫ�ص����
     */
    int insert(int index, T element);

    /**
     * �����Ա��������Ԫ��
     * @param element �������Ԫ��
     * @return �����Ԫ�ص����
     */
    int insert(T element);

    /**
     * ɾ��ָ��λ�õ�Ԫ��
     * @param index ָ��λ���±�
     * @return ��ɾ����Ԫ��
     */
    T remove(int index);

    /**
     * �����Ա��в����״γ��ֵ��뱻��Ԫ����ͬ��Ԫ�ص�λ��
     * @param element ����Ԫ��
     * @return ����鵽������Ԫ��λ�ã����򷵻� -1
     */
    int indexOf(T element);

    /**
     * �ж����Ա����Ƿ����ָ��Ԫ��
     * @param element ָ��Ԫ��
     * @return ����������� true������ false
     */
    boolean contains(T element);

    /**
     * �������Ա�ĳ���
     * @return ���Ա�ĳ���
     */
    int size();

    /**
     * �������Ա��ռ�ÿռ�
     * @return ռ�ÿռ�
     */
    int space();

    /**
     * ������Ա�
     */
    void clear();

    /**
     * �ж����Ա��Ƿ�Ϊ��
     * @return ����գ����� true�� ���� false
     */
    boolean isEmpty();

    /**
     * �������Ա�����Ԫ��
     */
    void printList();

    /**
     * ���� Ĭ�ϴ�С����
     * @param c comparator
     */
    void sort(Comparator<T> c);
}
