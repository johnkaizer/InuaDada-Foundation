package com.project.inuadadafaundation.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.inuadadafaundation.Models.LiveBlogModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.ui.Liveblog.SlideshowFragment;

import java.util.ArrayList;

public class LiveBlogAdapter extends RecyclerView.Adapter<LiveBlogAdapter.ViewHolder> {

    Context context;
    ArrayList<LiveBlogModel> list;

    public LiveBlogAdapter(Context context, ArrayList<LiveBlogModel> list, SlideshowFragment slideshowFragment) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.live_blog_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.time.setText(list.get(position).getTime());
        holder.topic.setText(list.get(position).getHeader());
        holder.text.setText(list.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView time, topic, text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView5);
            time = itemView.findViewById(R.id.textView8);
            topic = itemView.findViewById(R.id.textView7);
            text = itemView.findViewById(R.id.textView9);
        }
    }
}
