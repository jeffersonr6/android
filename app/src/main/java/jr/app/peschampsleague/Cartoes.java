package jr.app.peschampsleague;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jr.app.peschampsleague.adaptersData.AdapterDadosCartoes;
import jr.app.peschampsleague.getSet.DadosCartoes;

public class Cartoes extends Fragment {

    private final List<DadosCartoes> lstCartoes = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootFrag = inflater.inflate(R.layout.fragment_cartoes, container, false);
        RecyclerView rcvCartoes = rootFrag.findViewById(R.id.rcvCartoes);

        //Adapter
        AdapterDadosCartoes adptA = new AdapterDadosCartoes(lstCartoes);

        //Layout Manager
        RecyclerView.LayoutManager lRclArtilharia = new LinearLayoutManager(getContext().getApplicationContext());
        rcvCartoes.setLayoutManager(lRclArtilharia);
        rcvCartoes.setHasFixedSize(true);
        rcvCartoes.setAdapter(adptA);

        //DataSet
        this.criarDadosCartoes();

        return rootFrag;
    }

    private void criarDadosCartoes() {

        DadosCartoes dadosCartoes = new DadosCartoes("Messi", "Barcelona", "02", "00", R.drawable.logo_barcelona);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("C. Ronaldo", "Juventus", "02", "01", R.drawable.logo_juventus);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Odegaard", "Arsenal", "02", "01", R.drawable.logo_arsenal);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Reinaldo", "São Paulo", "02", "01", R.drawable.logo_sao_paulo);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Neymar", "PSG", "02", "01", R.drawable.logo_psg);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Gil", "Corinthians", "02", "01", R.drawable.logo_corinthians);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Ademir", "América MG", "02", "01", R.drawable.logo_america_mineiro);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Arrascaeta", "Flamengo", "02", "01", R.drawable.logo_flamengo);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Aguero", "M. City", "02", "01", R.drawable.logo_manchester_city);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Cano", "Vasco", "02", "01", R.drawable.logo_vasco_da_gama);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Gilberto", "Bahia", "02", "01", R.drawable.logo_bahia);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Lewandowski", "Bayern", "02", "01", R.drawable.logo_bayern_munique);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Everton", "Benfica", "02", "01", R.drawable.logo_benfica);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Rafael Sobis", "Cruzeiro", "02", "01", R.drawable.logo_cruzeiro);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Galhardo", "Internacional", "02", "01", R.drawable.logo_internacional);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Lukaku", "Internazionale", "02", "01", R.drawable.logo_internazionale);
        lstCartoes.add(dadosCartoes);

        dadosCartoes = new DadosCartoes("Santos", "At. Paraná", "02", "01", R.drawable.logo_atletico_paranaense);
        lstCartoes.add(dadosCartoes);
    }
}