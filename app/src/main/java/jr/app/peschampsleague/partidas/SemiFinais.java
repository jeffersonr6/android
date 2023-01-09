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

public class SemiFinais extends Fragment {

    private final List<DadosJogos> lstDadosJogos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootFrag = inflater.inflate(R.layout.fragment_semi_finais, container, false);
        RecyclerView rcvSemiFinais = rootFrag.findViewById(R.id.rcvFinais);

        //Adapter
        AdapterDadosJogos adptA = new AdapterDadosJogos(lstDadosJogos);

        //Layout Manager
        RecyclerView.LayoutManager lRclPartidas = new LinearLayoutManager(getContext().getApplicationContext());
        rcvSemiFinais.setLayoutManager(lRclPartidas);
        rcvSemiFinais.setHasFixedSize(true);
        rcvSemiFinais.setAdapter(adptA);

        //DataSet
        this.criarDadosSemiFinais();

        return rootFrag;
    }

    private void criarDadosSemiFinais() {

        DadosJogos dadosJogos = new DadosJogos("Flamengo", "Barcelona", "2", "0", R.drawable.logo_flamengo_crf, R.drawable.logo_barcelona, "Concluida", "Fase Semi-Finais");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Vasco", "R. Madrid", "1", "0", R.drawable.logo_vasco_da_gama, R.drawable.logo_real_madrid, "Concluida", "Fase Semi-Finais");
        lstDadosJogos.add(dadosJogos);

    }
}