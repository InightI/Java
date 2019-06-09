import java.util.Arrays;

public class ArrayList {
	private int size = 0;
	private int[] array;
	
	public ArrayList() {
		array = new int[10];
	}
	
	public ArrayList(int[] array) {
		// 1. this.array 和 array 不是一回事
		// 2. 申请的空间至少需要 array.length 长
		this.array = new int[array.length];
		
		// 1. 把传入数组的所有元素 copy 到属性 array 中
		for (int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
		
		// 记得更新 size
		size = array.length;
	}
	
	// 将 element 插入到 index 所在的下标位置
	// 要求对 index 做合法性校验
	// 最坏情况是 index == 0 的时候，时间复杂度 O(n)
	public void insert(int index, int element) {
		// [0, size]
		if (index < 0 || index > size) {
			System.out.printf("index 取值范围是 [0, %d]%n", size);
			return;
		}
		
		// 确保空间够用，否则进行扩容
		ensureCapacity();
		
		// 插入过程
		// 要将 [index, size - 1] 数据往后搬移一格
		// 倒着遍历
		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		
		array[index] = element;
		size++;
	}
	
	// 删除下标 index 所在数据元素，要求对 index 做合法性校验
	// 最坏情况是 index == 0 的时候，时间复杂度 O(n)
	public void erase(int index) {
		// [0, size - 1]
		if (index < 0 || index >= size) {
			System.out.printf("index 取值范围是 [0, %d]%n", size - 1);
			return;
		}
		
		// 要把 [index + 1, size - 1] 数据往前移动一格
		// 要从前往后遍历
		for (int i = index + 1; i <= size - 1; i++) {
			array[i - 1] = array[i];
		}
		
		size--;
		// 可选
		array[size] = 0;
	}
	
	private void ensureCapacity() {
		if (size < array.length) {
			return;
		}
		
		// 否则进行扩容
		// 1. 申请新空间，通常大小是 1.5 或者 2 倍
		int oldCapacity = array.length;
		int newCapacity = oldCapacity + oldCapacity / 2;
		int[] newArray = new int[newCapacity];
		// 2. 搬家
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		// 3. 通知大家我的新地址
		array = newArray;
		// 4. 释放老空间，GC 会去回收
	}
	
	public String toString() {
		return Arrays.toString(
			Arrays.copyOf(array, size)
		);
	}
	
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		ArrayList arrayList = new ArrayList(array);
		System.out.println(arrayList.toString());
		arrayList.insert(5, 106);	// 报错
		System.out.println(arrayList.toString());
		arrayList.erase(1);
		System.out.println(arrayList.toString());
	}
}