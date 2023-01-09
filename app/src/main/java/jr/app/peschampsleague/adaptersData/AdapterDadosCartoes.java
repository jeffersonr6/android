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
import jr.app.peschampsleague.getSet.DadosCartoes;

public class AdapterDadosCartoes extends RecyclerView.Adapter<AdapterDadosCartoes.mvh> {

    private final List<DadosCartoes> lstDadosCartoes;

    public AdapterDadosCartoes(List<DadosCartoes> lista) {
        this.lstDadosCartoes = lista;
    }

    @NonNull
    @Override
    public mvh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.dadoscartoes, parent, false);
        return new mvh(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDadosCartoes.mvh holder, int position) {
        DadosCartoes dadosCartoes = lstDadosCartoes.get(position);

        holder.jogadorCartao.setText(dadosCartoes.getJogadorCartoes());
        holder.equipeCartao.setText(dadosCartoes.getEquipeCartoes());
        holder.qtdCAmarelo.setText(dadosCartoes.getQtdCAmarelos());
        holder.qtdCVermelho.setText(dadosCartoes.getQtdCVermelhos());
        holder.imgEquipeCards.setImageResource(dadosCartoes.getImgEquipeCards());
    }

    @Override
    public int getItemCount() {
        return lstDadosCartoes.size();
    }

    public static class mvh extends RecyclerView.ViewHolder {

        TextView jogadorCartao;
        TextView equipeCartao;
        TextView qtdCAmarelo;
        TextView qtdCVermelho;
        ImageView imgEquipeCards;

        public mvh(View itemView) {
            super(itemView);
            jogadorCartao = itemView.findViewById(R.id.lblJogadorCartao);
            equipeCartao = itemView.findViewById(R.id.lblEquipeCartao);
            qtdCAmarelo = itemView.findViewById(R.id.lblQtdCartaoA);
            qtdCVermelho = itemView.findViewById(R.id.lblQtdCartaoV);
            imgEquipeCards = itemView.findViewById(R.id.imgEquipeCards);
        }
    }
}
