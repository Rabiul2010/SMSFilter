package rabiul.cu.cse;

import bughunter2.smsfilter.R;
import bughunter2.smsfilter.R.layout;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

class SimpleListItem2 {
	public static RelativeLayout build(Context context, int id, String title,
			String summary) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		RelativeLayout v = (RelativeLayout) inflater.inflate(
				R.layout.simple_list_item_2, null);
		v.setId(id);
		TextView textView;
		textView = (TextView) v.findViewById(android.R.id.title);
		textView.setText(title);
		textView = (TextView) v.findViewById(android.R.id.summary);
		textView.setText(summary);
		return v;
	}
}
