package com.example.xyzreader.ui;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class RecyclePargraph extends RecyclerView.Adapter<RecyclePargraph.MyViewHolder> {
        private String[] mDataset;

        // Provide a reference to the views for each data item
        // Complex data items may need more than one view per item, and
        // you provide access to all the views for a data item in a view holder
        public static class MyViewHolder extends RecyclerView.ViewHolder {
            // each data item is just a string in this case
            public TextView textView;
            public MyViewHolder(TextView v) {
                super(v);
                textView = v;
            }
        }

        // Provide a suitable constructor (depends on the kind of dataset)
        public RecyclePargraph(String myDataset) {
          //  StringTokenizer stringTokenizer=new StringTokenizer(myDataset,"\n\n|\n|.");
            if (myDataset != null) {

                //new  LockTask().doInBackground(myDataset);
              mDataset = myDataset.split("\n\n");
            } else {
                mDataset = new String[1];
            }

        }

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecyclePargraph(String myDataset[]) {
        //  StringTokenizer stringTokenizer=new StringTokenizer(myDataset,"\n\n|\n|.");
        if (myDataset != null) {

            //new  LockTask().doInBackground(myDataset);
            mDataset = myDataset;
        } else {
            mDataset = new String[1];
        }

    }


        // Create new views (invoked by the layout manager)
        @Override
        public RecyclePargraph.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
            // create a new view
            TextView v = (TextView) LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.my_text_view, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            holder.textView.setText((mDataset[position]));

        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return mDataset.length;
        }
    }
