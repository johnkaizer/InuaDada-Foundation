package com.project.inuadadafaundation.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.inuadadafaundation.Models.WhatsNewModel;
import com.project.inuadadafaundation.R;
import com.project.inuadadafaundation.Activities.WhatsNewDetail;
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
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.image.setImageResource(list.get(position).getImage());
        holder.date.setText(list.get(position).getDate());
        holder.header.setText(list.get(position).getHeading());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WhatsNewDetail.class);
                intent.putExtra("image",list.get(position).getImage());
                intent.putExtra("date",list.get(position).getDate());
                intent.putExtra("heading",list.get(position).getHeading());
                intent.putExtra("description",list.get(position).getDescription());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });
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
