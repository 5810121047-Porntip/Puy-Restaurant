package pnu.app.porntip.puyrestaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by USER on 10/4/2559.
 */
public class MyAdapter extends BaseAdapter {

    //ประกาศตัวแปร
    private Context context;
    private String[] foodStrings, priceStrings, iconStrings;

    public MyAdapter(Context context,
                     String[] foodStrings,
                     String[] priceStrings,
                     String[] iconStrings) {
        this.context = context;
        this.foodStrings = foodStrings;
        this.priceStrings = priceStrings;
        this.iconStrings = iconStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return foodStrings.length;
    }   // นับจำนวนเรคคอร์ค


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        // for textview
        TextView foodTextView = (TextView) view1.findViewById(R.id.textView3);
        foodTextView.setText(foodStrings[i]);

        TextView priceTextView = (TextView) view1.findViewById(R.id.textView4);
        priceTextView.setText(priceStrings[i]);

        //for image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView2);
        Picasso.with(context).load(iconStrings[i]).resize(130, 130).into(iconImageView);

        return view1;
    }
}   // Main Class
