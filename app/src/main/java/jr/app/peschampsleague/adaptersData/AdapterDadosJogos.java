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
import jr.app.peschampsleague.partidas.getSet.DadosJogos;

public class AdapterDadosJogos extends RecyclerView.Adapter<AdapterDadosJogos.mvh> {

    private final List<DadosJogos> lstDadosJogos;

    public AdapterDadosJogos(List<DadosJogos> lista) {
        this.lstDadosJogos = lista;
    }

    @NonNull
    @Override
    public mvh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.listapartidas, parent, false);
        return new mvh(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDadosJogos.mvh holder, int position) {
        DadosJogos dadosJogos = lstDadosJogos.get(position);

        // Aqui serão bucados as informações do banco e exibidas em tela
        holder.equipeA.setText(dadosJogos.getEquipeA());
        holder.equipeB.setText(dadosJogos.getEquipeB());
        holder.resultadoA.setText(dadosJogos.getResultadoA());
        holder.resultadoB.setText(dadosJogos.getResultadoB());
        holder.imgEquipeA.setImageResource(dadosJogos.getImgEquipeA());
        holder.imgEquipeB.setImageResource(dadosJogos.getImgEquipeB());
        holder.statusPartida.setText(dadosJogos.getStatusPartida());
        holder.tipoJogo.setText(dadosJogos.getTipoJogo());

    }

    @Override
    public int getItemCount() {
        return lstDadosJogos.size();
    }

    public static class mvh extends RecyclerView.ViewHolder {
        TextView equipeA;
        TextView equipeB;
        TextView resultadoA;
        TextView resultadoB;
        ImageView imgEquipeA;
        ImageView imgEquipeB;
        TextView statusPartida;
        TextView tipoJogo;

        public mvh(View itemView) {
            super(itemView);
            equipeA = itemView.findViewById(R.id.lblEquipeA);
            equipeB = itemView.findViewById(R.id.lblEquipeB);
            resultadoA = itemView.findViewById(R.id.lblResultadoA);
            resultadoB = itemView.findViewById(R.id.lblResultadoB);
            imgEquipeA = itemView.findViewById(R.id.imgEquipeA);
            imgEquipeB = itemView.findViewById(R.id.imgEquipeB);
            statusPartida = itemView.findViewById(R.id.lblStatusPartida);
            tipoJogo = itemView.findViewById(R.id.lblTipoJogo);
        }
    }
}
