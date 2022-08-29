package com.project.inuadadafaundation.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.inuadadafaundation.Models.WhatsNewModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.ui.home.HomeFragment;

import java.util.ArrayList;

public class WhatsNewAdapter extends RecyclerView.Adapter<WhatsNewAdapter.ViewHolder> {
    Context context;
    ArrayList<WhatsNewModel> list;

    public WhatsNewAdapter(Context context, ArrayList<WhatsNewModel> list, HomeFragment homeFragment) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.whatsnew_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.image.setImageResource(list.get(position).getImage());
        holder.date.setText(list.get(position).getDate());
        holder.header.setText(list.get(position).getHeading());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView date, header;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.whatsnew_image);
            date = itemView.findViewById(R.id.whatsnew_date);
            header = itemView.findViewById(R.id.whatsnew_header);

        }
    }
}
