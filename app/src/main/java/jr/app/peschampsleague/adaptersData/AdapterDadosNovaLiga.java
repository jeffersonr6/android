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
import jr.app.peschampsleague.getSet.DadosNovaLiga;

public class AdapterDadosNovaLiga extends RecyclerView.Adapter<AdapterDadosNovaLiga.mvh> {

    private final List<DadosNovaLiga> lstDadosNovaLiga;

    public AdapterDadosNovaLiga(List<DadosNovaLiga> lista) {
        this.lstDadosNovaLiga = lista;
    }

    @NonNull
    @Override
    public AdapterDadosNovaLiga.mvh onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.dadosequipesadd, parent, false);
        return new mvh(itemLista);
    }

    @Override
    public void onBindViewHolder(AdapterDadosNovaLiga.mvh holder, int position) {
        DadosNovaLiga dadosNovaLiga = lstDadosNovaLiga.get(position);

        // Aqui serão bucados as informações do banco e exibidas em tela
        holder.img.setImageResource(dadosNovaLiga.getImg());
        holder.equipe.setText(dadosNovaLiga.getEquipe());
        holder.player.setText(dadosNovaLiga.getPlayer());
        holder.grupo.setText(dadosNovaLiga.getGrupo());
    }

    @Override
    public int getItemCount() {
        return lstDadosNovaLiga.size();
    }

    public static class mvh extends RecyclerView.ViewHolder {
        ImageView img;
        TextView equipe;
        TextView player;
        TextView grupo;


        public mvh(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgListSelect);
            equipe = itemView.findViewById(R.id.lblNmEquipeSelect);
            player = itemView.findViewById(R.id.lblNmPlayerSelect);
            grupo = itemView.findViewById(R.id.lblGrupoSelect);
        }
    }
}
