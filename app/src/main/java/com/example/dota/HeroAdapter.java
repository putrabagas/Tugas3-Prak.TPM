package com.example.dota;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {
    private ArrayList<HeroModel> listHero;
    private Context context;

    public HeroAdapter(ArrayList<HeroModel> datalist, Context context){
        this.listHero = datalist;
        this.context = context;
    }

    @NonNull
    @Override

    public  HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.item_card_recyclerview, parent, false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HeroViewHolder holder, int position) {
        String image = listHero.get(position).getImage();
        String name = listHero.get(position).getName();
        String role = listHero.get(position).getRole();
        String lore = listHero.get(position).getLore();

        Glide.with(holder.itemView.getContext())
                .load(listHero.get(position).getImage())
                .into(holder.image);
        holder.name.setText(name);
        holder.role.setText(role);
        holder.lore.setText(lore);

        try {

            holder.btnPreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDetailActivity(image, name, role, lore);
                }
            });

            holder.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareHero(name, lore);
                }
            });
        }catch (Exception e) {
            Log.d("DetailActivity", "MyErr : " + e);
        }
    }

    @Override
    public int getItemCount() {
        return (listHero != null) ? listHero.size() : 0;
    }

    public static class HeroViewHolder extends RecyclerView.ViewHolder{
        private final ImageView image;
        private final TextView name, role, lore;
        private final Button btnPreview, btnShare;

        public HeroViewHolder(View itemView){
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.hero_image);
            name = (TextView)itemView.findViewById(R.id.hero_name);
            role = (TextView)itemView.findViewById(R.id.hero_role);
            lore = (TextView)itemView.findViewById(R.id.hero_lore);
            btnPreview = (Button)itemView.findViewById(R.id.btnPreview);
            btnShare = (Button)itemView.findViewById(R.id.btnShare);
        }
    }

    public void openDetailActivity(@NonNull String ...hero) {
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra("IMAGE_KEY", hero[0]);
        i.putExtra("NAME_KEY", hero[1]);
        i.putExtra("ROLE_KEY", hero[2]);
        i.putExtra("LORE_KEY", hero[3]);
        context.startActivity(i);
    }

    public void shareHero(@NonNull String ...hero) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, hero[0] + "\n\n" + hero[1]);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);
    }
}
