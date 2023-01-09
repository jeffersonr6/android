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
import jr.app.peschampsleague.grupos.getSet.DadosClass;

public class AdapterDadosClass extends RecyclerView.Adapter<AdapterDadosClass.mvh> {

    private final List<DadosClass> lstDadosClass;

    public AdapterDadosClass(List<DadosClass> lista) {
        this.lstDadosClass = lista;
    }

    @NonNull
    @Override
    public mvh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.dadosclassificacao, parent, false);
        return new mvh(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull mvh holder, int position) {
        DadosClass dadosClass = lstDadosClass.get(position);

        // Aqui serão bucados as informações do banco e exibidas em tela
        holder.equipe.setText(dadosClass.getEquipe());
        holder.pontos.setText(dadosClass.getPontos());
        holder.jogos.setText(dadosClass.getJogos());
        holder.vitorias.setText(dadosClass.getVitorias());
        holder.empates.setText(dadosClass.getEmpates());
        holder.derrotas.setText(dadosClass.getDerrotas());
        holder.saldoGols.setText(dadosClass.getSaldoGols());
        holder.golsPro.setText(dadosClass.getGolsPro());
        holder.golsContra.setText(dadosClass.getGolsContra());
        holder.cAmarelos.setText(dadosClass.getcAmarelos());
        holder.cVermelhos.setText(dadosClass.getcVermelhos());
        holder.imgEquipeClass.setImageResource(dadosClass.getImgEquipeClass());

    }

    @Override
    public int getItemCount() {
        return lstDadosClass.size();
    }

    public static class mvh extends RecyclerView.ViewHolder {
        TextView equipe;
        TextView pontos;
        TextView jogos;
        TextView vitorias;
        TextView empates;
        TextView derrotas;
        TextView saldoGols;
        TextView golsPro;
        TextView golsContra;
        TextView cAmarelos;
        TextView cVermelhos;
        ImageView imgEquipeClass;

        public mvh(View itemView) {
            super(itemView);

            equipe = itemView.findViewById(R.id.lblEquipe);
            pontos = itemView.findViewById(R.id.lblPontos);
            jogos = itemView.findViewById(R.id.lblJogos);
            vitorias = itemView.findViewById(R.id.lblVitoria);
            empates = itemView.findViewById(R.id.lblEmpate);
            derrotas = itemView.findViewById(R.id.lblDerrotas);
            saldoGols = itemView.findViewById(R.id.lblSaldoGols);
            golsPro = itemView.findViewById(R.id.lblGolsPro);
            golsContra = itemView.findViewById(R.id.lblGolsContra);
            cAmarelos = itemView.findViewById(R.id.lblCAmarelo);
            cVermelhos = itemView.findViewById(R.id.lblCVermelho);
            imgEquipeClass = itemView.findViewById(R.id.imgEquipeClass);

        }
    }
}
