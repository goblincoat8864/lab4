package utsa.cs3443.yvz641_lab4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.MyViewHolder> {
Context context;
ArrayList<ss1_personel> ss1Personels;
    public recyclerViewAdapter(Context context, ArrayList<ss1_personel> ss1Personels){
        this.context=context;
        this.ss1Personels=ss1Personels;
    }
    @NonNull
    @Override
    public recyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.fleet_display, parent,false);

        return new recyclerViewAdapter.MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull recyclerViewAdapter.MyViewHolder holder, int position) {
//assigning values we created on the recycler view in the xml
        //based on the position of view
        holder.tvname.setText(ss1Personels.get(position).getss1Personels());
        holder.tvstats.setText(ss1Personels.get(position).getStats());
        holder.imageView.setImageResource(ss1Personels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        //gets the number of items to be displayed
        return ss1Personels.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
//grabbing views from reclycler rows in xml
        ImageView imageView;
        TextView tvname, tvstats;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageView);
            tvname = itemView.findViewById(R.id.textView);
            tvstats = itemView.findViewById(R.id.textView2);
        }
    }
}
