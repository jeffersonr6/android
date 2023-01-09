package jr.app.peschampsleague.partidas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jr.app.peschampsleague.R;
import jr.app.peschampsleague.adaptersData.AdapterDadosJogos;
import jr.app.peschampsleague.partidas.getSet.DadosJogos;

public class Jogos extends Fragment {

    private final List<DadosJogos> lstDadosJogos = new ArrayList<>();
    public View rootFrag, rootFrag2;

    public Jogos() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootFrag = inflater.inflate(R.layout.fragment_jogos, container, false);
        rootFrag2 = inflater.inflate(R.layout.listapartidas, container, false);
        RecyclerView rcvJogos = rootFrag.findViewById(R.id.rcvJogos);

        //Adapter
        AdapterDadosJogos adptA = new AdapterDadosJogos(lstDadosJogos);

        //Layout Manager
        RecyclerView.LayoutManager lRclPartidas = new LinearLayoutManager(getContext().getApplicationContext());
        rcvJogos.setLayoutManager(lRclPartidas);
        rcvJogos.setHasFixedSize(true);
        rcvJogos.setAdapter(adptA);

        //DataSet
        this.criarDadosJogos();

        //        Chamar layout Partida quando necessario.
//        LinearLayout lnr = rootFrag2.findViewById(R.id.lnrBasePartidas);
//        lnr.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity().getApplicationContext(),"Partida", Toast.LENGTH_LONG).show();
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.nav_host_fragment, new Partida())
//                        .commit();
//            }
//        });


        return rootFrag;
    }

    public void criarDadosJogos() {
        DadosJogos dadosJogos = new DadosJogos("Flamengo", "Corinthians", "3", "0", R.drawable.logo_flamengo_crf, R.drawable.logo_corinthians, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Barcelona", "R. Madrid", "2", "1", R.drawable.logo_barcelona, R.drawable.logo_real_madrid, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Fiorentina", "PSG", "1", "4", R.drawable.logo_fiorentina, R.drawable.logo_psg, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Juventus", "M. City", "2", "2", R.drawable.logo_juventus, R.drawable.logo_manchester_city, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Udinese", "Liverpool", "1", "0", R.drawable.logo_udinese, R.drawable.logo_liverpool, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Napoli", "Tottenham", "3", "0", R.drawable.logo_napoli, R.drawable.logo_tottenham, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Sport", "PSV", "2", "1", R.drawable.logo_sport_recife, R.drawable.logo_psv, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Roma", "Lion", "1", "4", R.drawable.logo_roma, R.drawable.logo_olympique_lyonnais, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Vasco", "Botafogo", "2", "2", R.drawable.logo_vasco_da_gama, R.drawable.logo_botafogo, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Bayern", "M. United", "1", "0", R.drawable.logo_bayern_munique, R.drawable.logo_manchester_united, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("River Plate", "Boca Juniors", "3", "0", R.drawable.logo_river_plate, R.drawable.logo_boca_juniors, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Shakhtar", "Leverkusen", "2", "1", R.drawable.logo_shakhtar, R.drawable.logo_bayer_leverkusen, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Atalanta", "At. Madrid", "1", "4", R.drawable.logo_atalanta, R.drawable.logo_atletico_madrid, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Porto", "Goias", "2", "2", R.drawable.logo_porto, R.drawable.logo_goias, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Ceará", "Chelsea", "1", "0", R.drawable.logo_ceara, R.drawable.logo_chelsea, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Leicester", "Arsenal", "3", "5", R.drawable.logo_leicester_city, R.drawable.logo_arsenal, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Internacional", "Internazionale", "2", "1", R.drawable.logo_internacional, R.drawable.logo_internazionale, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Lazio", "Zenit", "1", "4", R.drawable.logo_lazio, R.drawable.logo_zenit, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Cruzeiro", "At. Mineiro", "1", "6", R.drawable.logo_cruzeiro, R.drawable.logo_atletico_mineiro, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);

        dadosJogos = new DadosJogos("Fluminense", "Santos", "1", "0", R.drawable.logo_fluminense, R.drawable.logo_santos, "Concluida", "Fase de Grupos");
        lstDadosJogos.add(dadosJogos);
    }

}