package rabiul.cu.cse;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;

public class Notifier {
	public static final int NEW_MESSAGE = 1;

	public static Notification build(int icon, CharSequence tickerText) {
		Notification notification = new Notification(icon, tickerText,
				System.currentTimeMillis());
		notification.flags |= Notification.FLAG_AUTO_CANCEL;
		return notification;
	}

	public static void notify(Context context, int id, Notification notification) {
		getManager(context).notify(id, notification);
	}

	public static void notify(Context context, String tag, int id,
			Notification notification) {
		getManager(context).notify(tag, id, notification);
	}

	public static void cancel(Context context, int id) {
		getManager(context).cancel(id);
	}

	public static void cancel(Context context, String tag, int id) {
		getManager(context).cancel(tag, id);
	}

	private static NotificationManager getManager(Context context) {
		return (NotificationManager) context
				.getSystemService(Context.NOTIFICATION_SERVICE);
	}
}
