package exc_lab;

public class ArrayProcessor {
	int getArrayLength(Object [] a) {
		int count = 0;
		try {
			while (true) {
				@SuppressWarnings("unused")
				Object t = a[count];
				count++;
			}
		} catch(ArrayIndexOutOfBoundsException e) {}
		return count;
	}
}
