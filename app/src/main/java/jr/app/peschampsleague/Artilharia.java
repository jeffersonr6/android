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

import jr.app.peschampsleague.adaptersData.AdapterDadosArtilharia;
import jr.app.peschampsleague.getSet.DadosArtilharia;


public class Artilharia extends Fragment {

    private final List<DadosArtilharia> lstDadosArtilharia = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootFrag = inflater.inflate(R.layout.fragment_artilharia, container, false);
        RecyclerView rcvArtilharia = rootFrag.findViewById(R.id.rcvArtilharia);

        //Adapter
        AdapterDadosArtilharia adptA = new AdapterDadosArtilharia(lstDadosArtilharia);

        //Layout Manager
        RecyclerView.LayoutManager lRclArtilharia = new LinearLayoutManager(getContext().getApplicationContext());
        rcvArtilharia.setLayoutManager(lRclArtilharia);
        rcvArtilharia.setHasFixedSize(true);
        rcvArtilharia.setAdapter(adptA);

        //DataSet
        this.criarDadosArtilharia();

        return rootFrag;
    }

    public void criarDadosArtilharia() {

        DadosArtilharia dadosArtilharia = new DadosArtilharia("C. Ronaldo", "Juventus", "06", R.drawable.logo_juventus);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Pedro", "Flamengo", "10", R.drawable.logo_flamengo);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Gabigol", "Flamengo", "06", R.drawable.logo_flamengo);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Neymar", "PSG", "05", R.drawable.logo_psg);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Vini", "R. Madrid", "05", R.drawable.logo_real_madrid);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Tevez", "Boca Juniors", "05", R.drawable.logo_boca_juniors);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Cano", "Vasco", "05", R.drawable.logo_vasco_da_gama);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("De Arrascaeta", "Flamengo", "04", R.drawable.logo_flamengo);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Gil", "Corinthians", "04", R.drawable.logo_corinthians);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Hulk", "At. Mineiro", "04", R.drawable.logo_atletico_mineiro);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Lukaku", "Internazionale", "04", R.drawable.logo_internazionale);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Aguero", "M. City", "03", R.drawable.logo_manchester_city);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Benzema", "R. Madrid", "04", R.drawable.logo_real_madrid);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Gabriel Jesus", "M. City", "02", R.drawable.logo_manchester_city);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Everton", "Benfica", "02", R.drawable.logo_benfica);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Messi", "Barcelona", "02", R.drawable.logo_barcelona);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Galhardo", "Internacional", "02", R.drawable.logo_internacional);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Renan Lodi", "Barcelona", "02", R.drawable.logo_atletico_madrid);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Reinaldo", "São Paulo", "01", R.drawable.logo_sao_paulo);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Vina", "Ceará", "01", R.drawable.logo_ceara);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Mané", "LiverPool", "01", R.drawable.logo_liverpool);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Fred", "Fluminense", "01", R.drawable.logo_fluminense);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Guerreiro", "Internacional", "01", R.drawable.logo_internacional);
        lstDadosArtilharia.add(dadosArtilharia);

        dadosArtilharia = new DadosArtilharia("Pique", "Barcelona", "01", R.drawable.logo_barcelona);
        lstDadosArtilharia.add(dadosArtilharia);
    }

}