package bee.chat;

import java.io.Closeable;

public class ChatUtils {
	/**
	 * 释放资源
	 */
	public static void close(Closeable... targets) {
		for (Closeable target : targets) {
			try {
				if (null != target) {
					target.close();
				}
			} catch (Exception e) {

			}
		}
	}
}