package com.example.recyclerview2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class LAdapter extends ListAdapter<Element, LAdapter.EViewHolder>{

    public static final DiffUtil.ItemCallback<Element> DIFF_CALLBACK=
            new DiffUtil.ItemCallback<Element>() {
                @Override
                public boolean areItemsTheSame(@NonNull Element oldItem, @NonNull Element newItem) {
                    return false;
                }

                @Override
                public boolean areContentsTheSame(@NonNull Element oldI, @NonNull Element newI) {
                    return oldI.equals(newI);
                }
            };
    protected LAdapter(){
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public LAdapter.EViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.element_list, parent, false);
        return new LAdapter.EViewHolder(view); /*pasamos el view que inflamos recientemente*/
    }

    @Override
    public void onBindViewHolder(@NonNull LAdapter.EViewHolder holder, int position) {
        Element elemento = getItem(position);
        holder.bind(elemento);
    }

    class EViewHolder extends RecyclerView.ViewHolder {
        private TextView t1, t2;

        public EViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.texto_1);
            t2 = itemView.findViewById(R.id.texto_2);

        }
        public void bind (Element elemento){
            t1.setText(String.valueOf(elemento.getTexto_1()));
            t2.setText(String.valueOf(elemento.getTexto_2()));
        }
    }
}
