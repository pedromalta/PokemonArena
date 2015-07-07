package view;

import model.Avatar;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class PlayersImgsArrayAdapter extends BaseAdapter {
	private Avatar[] images;
	private Context context;

	public  PlayersImgsArrayAdapter(Context context, Avatar[] images) {
		this.images = images;
		this.context = context;
	}

	public int getCount() {
		return images.length;
	}

	public Object getItem(int position) {
		return images[position];
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView item = null;

		if (convertView != null)
			item = (ImageView) convertView;
		else
			item = new ImageView(context);
		
		//item.setAlpha(2);

		//item.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		item.setImageBitmap(load(((Avatar) getItem(position)).getImg()));

		return item;
	}
	
	private Bitmap load(int resourceId) {
		return BitmapFactory.decodeResource(context.getResources(), resourceId);
	}
}