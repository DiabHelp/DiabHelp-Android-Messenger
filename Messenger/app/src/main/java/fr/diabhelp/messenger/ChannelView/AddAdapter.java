package fr.diabhelp.messenger.ChannelView;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import fr.diabhelp.messenger.R;

/**
 * Created by naqued on 17/03/16.
 */
public class AddAdapter extends RecyclerView.Adapter<AddAdapter.ViewHolder> {
    private String[] mDataset; // var créer car il n'y a que des textview, rajouter des imageview si jamais
    private int mImg;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ImageButton img;
        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.info_text);
            img = (ImageButton) v.findViewById(R.id.deleteButton);

/*            v.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    TextView t = (TextView) v.findViewById(R.id.info_text);
                    Intent intent = new Intent(this, FaqSubmenu.class);

                    // item clicked
                }
            });*/
        }


    }


    // Provide a suitable constructor (depends on the kind of dataset)
    public AddAdapter(String[] myDataset, int myImg) {
        mDataset = myDataset;
        mImg = myImg;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public AddAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        final ViewGroup root = parent;
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        // set the view's size, margins, paddings and layout parameters
//        ...
/*        v.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent;
                TextView t = (TextView) v.findViewById(R.id.info_text);
                Log.e("item : ", t.getText().toString());
*//*
                if (t.getText().toString().compareTo("Type de Diabète, Cause, Traitements") == 0)
                    intent = new Intent(root.getContext(), FaqSubmenu.class);
                else
                    intent = new Intent(root.getContext(), InfoActivity.class);
                intent.putExtra("title", t.getText());

                root.getContext().startActivity(intent);*//*

                // item clicked
            }
        });*/
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);
        holder.img.setImageResource(mImg);
        if (mImg == R.drawable.ic_add_black_24dp)
            holder.img.setTag('A');
        else if (mImg == R.drawable.ic_delete_black_24dp)
            holder.img.setTag('D');
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
