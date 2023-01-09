package jr.app.peschampsleague.partidas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jr.app.peschampsleague.R;
import jr.app.peschampsleague.adaptersData.AdapterDadosJogos;
import jr.app.peschampsleague.partidas.getSet.DadosJogos;

public class Finais extends Fragment {

    private final List<DadosJogos> lstDadosJogos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootFrag = inflater.inflate(R.layout.fragment_finais, container, false);
        RecyclerView rcvFinais = rootFrag.findViewById(R.id.rcvFinais);

        //Adapter
        AdapterDadosJogos adptA = new AdapterDadosJogos(lstDadosJogos);

        //Layout Manager
        RecyclerView.LayoutManager lRclPartidas = new LinearLayoutManager(getContext().getApplicationContext());
        rcvFinais.setLayoutManager(lRclPartidas);
        rcvFinais.setHasFixedSize(true);
        rcvFinais.setAdapter(adptA);

        //DataSet
        this.criarDadosFinais();

        return rootFrag;
    }

    private void criarDadosFinais() {

        DadosJogos dadosJogos = new DadosJogos("Barcelona", "R. Madrid", "2", "1", R.drawable.logo_barcelona, R.drawable.logo_real_madrid, "Concluida", "Terceiro Lugar");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Flamengo", "Vasco", "3", "0", R.drawable.logo_flamengo_crf, R.drawable.logo_vasco_da_gama, "Concluida", "Final");
        lstDadosJogos.add(dadosJogos);

    }
}