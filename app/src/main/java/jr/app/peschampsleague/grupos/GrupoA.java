package jr.app.peschampsleague.grupos;

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
import jr.app.peschampsleague.adaptersData.AdapterDadosClass;
import jr.app.peschampsleague.grupos.getSet.DadosClass;

public class GrupoA extends Fragment {

    private final List<DadosClass> lstDadosClass = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootFrag = inflater.inflate(R.layout.fragment_grupoa, container, false);
        RecyclerView rcvGrupos = rootFrag.findViewById(R.id.rcvGruposA);

        //Adapter
        AdapterDadosClass adptA = new AdapterDadosClass(lstDadosClass);

        //Layout Manager
        RecyclerView.LayoutManager lRclGrupos = new LinearLayoutManager(getContext().getApplicationContext());
        rcvGrupos.setLayoutManager(lRclGrupos);
        rcvGrupos.setHasFixedSize(true);
        rcvGrupos.setAdapter(adptA);

        //DataSet
        this.criarDadosClass();

        return rootFrag;
    }

    public void criarDadosClass() {
        DadosClass dadosClass = new DadosClass("Flamengo", "12", "4", "4", "0", "0", "10", "5", "5", "2", "0", R.drawable.logo_flamengo);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("Corinthians", "9", "4", "3", "0", "1", "7", "5", "2", "3", "1", R.drawable.logo_corinthians);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("PSG", "6", "4", "2", "0", "2", "7", "6", "1", "0", "0", R.drawable.logo_psg);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("Barcelona", "1", "4", "0", "1", "3", "5", "6", "-1", "2", "0", R.drawable.logo_barcelona);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("R. Madrid", "1", "4", "0", "1", "3", "4", "7", "-3", "3", "1", R.drawable.logo_real_madrid);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("At. Goianiense", "1", "4", "0", "1", "3", "4", "7", "-3", "3", "1", R.drawable.logo_atletico_goianiense);
        lstDadosClass.add(dadosClass);
    }
}

