package com.example.flixster.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flixster.R;
import com.example.flixster.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    Context context;
    List<Movie> movies;

    public MovieAdapter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvOverview;
        public ImageView ivPoster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvOverview = (TextView) itemView.findViewById(R.id.tvOverview);
            ivPoster = (ImageView) itemView.findViewById(R.id.ivPoster);
        }
    }
}
