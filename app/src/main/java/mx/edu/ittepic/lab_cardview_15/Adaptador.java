package mx.edu.ittepic.lab_cardview_15;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Carolina Mondragon on 22/02/2018.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderMusica> implements View.OnClickListener,View.OnCreateContextMenuListener {
    ArrayList<musica> listaMusica;
    private View.OnClickListener listener;
    Context context;
    public Adaptador(ArrayList<musica> listaMusica,Context context) {
        this.listaMusica = listaMusica;
        this.context=context;
    }

    @Override
    public ViewHolderMusica onCreateViewHolder(ViewGroup parent, int viewType) {
        int layout=R.layout.vista;
        View view= LayoutInflater.from(parent.getContext()).inflate(layout,null,false);
        view.setOnClickListener(this);
        view.setOnCreateContextMenuListener(this);
        return new ViewHolderMusica(view);
    }
    @Override
    public void onBindViewHolder(ViewHolderMusica holder, int position) {
        holder.boton.setBackgroundColor(listaMusica.get(position).getColor());
        holder.card.setCardBackgroundColor(listaMusica.get(position).getColor());
        holder.nombremusica.setText(listaMusica.get(position).getGenero());
        holder.detallemusica.setText(listaMusica.get(position).getCancion());
        int imageResource = context.getResources().getIdentifier(listaMusica.get(position).getFoto(), null, context.getPackageName());
        holder.foto.setImageDrawable(context.getResources().getDrawable(imageResource));

    }

    @Override
    public int getItemCount() {
        return listaMusica.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View view) {
        if (listener!=null){
            listener.onClick(view);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {

    }


    public class ViewHolderMusica extends RecyclerView.ViewHolder {

        TextView nombremusica,detallemusica;
        ImageView foto;
        CardView card;
        Button boton;
        public ViewHolderMusica(View itemView) {
            super(itemView);
            card=(CardView) itemView.findViewById(R.id.caru);
            boton=(Button) itemView.findViewById(R.id.button);
            nombremusica= (TextView) itemView.findViewById(R.id.nommbremusica);
            detallemusica= (TextView) itemView.findViewById(R.id.detallemusica);
            foto= (ImageView) itemView.findViewById(R.id.imagen);
        }
    }
}

