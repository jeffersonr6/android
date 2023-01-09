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

public class GrupoB extends Fragment {

    private final List<DadosClass> lstDadosClass = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootFrag = inflater.inflate(R.layout.fragment_grupob, container, false);
        RecyclerView rcvGrupos = rootFrag.findViewById(R.id.rcvGruposB);

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
        DadosClass dadosClass = new DadosClass("Vasco", "12", "4", "4", "0", "0", "10", "5", "5", "2", "0", R.drawable.logo_vasco_da_gama);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("Santos", "9", "4", "3", "0", "1", "7", "5", "2", "3", "1", R.drawable.logo_santos);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("PSV", "6", "4", "2", "0", "2", "7", "6", "1", "0", "0", R.drawable.logo_psv);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("Juventus", "1", "4", "0", "1", "3", "5", "6", "-1", "2", "0", R.drawable.logo_juventus);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("Milan", "1", "4", "0", "1", "3", "4", "7", "-3", "3", "1", R.drawable.logo_milan);
        lstDadosClass.add(dadosClass);

        dadosClass = new DadosClass("Chapecoense", "1", "4", "0", "1", "3", "4", "7", "-3", "3", "1", R.drawable.logo_chapecoense);
        lstDadosClass.add(dadosClass);
    }
}
