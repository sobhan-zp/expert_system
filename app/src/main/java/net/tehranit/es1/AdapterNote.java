package net.tehranit.es1;

import java.util.ArrayList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdapterNote extends ArrayAdapter<StructNote> {

    public AdapterNote(ArrayList<StructNote> array) {
        super(G.context, R.layout.layout3, array);

    }


    private static class ViewHolder {

        public TextView  txt_descreption;
        public TextView  txt_title;
        public ImageView img_profile;


        public ViewHolder(View view) {
            txt_descreption = (TextView) view.findViewById(R.id.txt_descreption);
            txt_title = (TextView) view.findViewById(R.id.txt_title);
            img_profile = (ImageView) view.findViewById(R.id.img_profile);

        }


        public void fill(ArrayAdapter<StructNote> adapter, StructNote item, int position) {
            txt_descreption.setText(item.description);
            txt_title.setText(item.title);
            if (item.done) {
                img_profile.setImageResource(R.drawable.user_profile);
            }
            else {
                img_profile.setImageResource(R.drawable.expert_profile);
            }

        }
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        StructNote item = getItem(position);
        if (convertView == null) {
            convertView = G.inflater.inflate(R.layout.layout3, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.fill(this, item, position);
        return convertView;
    }

}
