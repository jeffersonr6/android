package jr.app.peschampsleague.adaptersData;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import jr.app.peschampsleague.R;
import jr.app.peschampsleague.getSet.DadosArtilharia;

public class AdapterDadosArtilharia extends RecyclerView.Adapter<AdapterDadosArtilharia.mvh> {

    private final List<DadosArtilharia> lstDadosArtilharia;

    public AdapterDadosArtilharia(List<DadosArtilharia> lista) {
        this.lstDadosArtilharia = lista;
    }

    @NonNull
    @Override
    public mvh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.dadosartilharia, parent, false);
        return new mvh(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDadosArtilharia.mvh holder, int position) {
        DadosArtilharia dadosArtilharia = lstDadosArtilharia.get(position);

        // Aqui serão bucados as informações do banco e exibidas em tela
        holder.imgEquipeArt.setImageResource(dadosArtilharia.getImgEquipeArt());
        holder.jogador.setText(dadosArtilharia.getJogador());
        holder.equipe.setText(dadosArtilharia.getEquipe());
        holder.gols.setText(dadosArtilharia.getGols());
    }

    @Override
    public int getItemCount() {
        return lstDadosArtilharia.size();
    }

    public static class mvh extends RecyclerView.ViewHolder {
        ImageView imgEquipeArt;
        TextView jogador;
        TextView equipe;
        TextView gols;

        public mvh(View itemView) {
            super(itemView);

            imgEquipeArt = itemView.findViewById(R.id.imgEquipeArt);
            jogador = itemView.findViewById(R.id.lblJogador);
            equipe = itemView.findViewById(R.id.lblEquipeArtilheiro);
            gols = itemView.findViewById(R.id.lblGolsMarcados);
        }
    }
}

