package jr.app.peschampsleague;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jr.app.peschampsleague.adaptersData.AdapterDadosNovaLiga;
import jr.app.peschampsleague.getSet.DadosNovaLiga;

public class NovaLiga extends Fragment {

    private final List<DadosNovaLiga> lst = new ArrayList<>();
    private final String[] nmEqp = new String[]{"Flamengo", "Corinthians", "Vasco", "Palmeiras", "Fluminense", "Santos", "Botafogo", "São Paulo"};
    private final String[] nmJgd = new String[]{"Jefferson", "Janderson"};
    private final String[] nmGrp = new String[]{"Grupo A", "Grupo B"};
    private final int[] imgEqp = {R.drawable.logo_flamengo, R.drawable.logo_corinthians, R.drawable.logo_vasco_da_gama, R.drawable.logo_palmeiras,
            R.drawable.logo_fluminense, R.drawable.logo_santos, R.drawable.logo_botafogo, R.drawable.logo_sao_paulo};
    public View rootFrag;
    public Spinner spnE;
    public Spinner spnJ;
    public Spinner spnG;
    public ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootFrag = inflater.inflate(R.layout.fragment_nova_liga, container, false);

        ArrayAdapter<String> adptE = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_dropdown_item, nmEqp);
        ArrayAdapter<String> adtpJ = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_dropdown_item, nmJgd);
        ArrayAdapter<String> adptG = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_dropdown_item, nmGrp);

        img = rootFrag.findViewById(R.id.imgEquipeSelected);
        spnE = rootFrag.findViewById(R.id.spnNomeEquipe);
        spnE.setAdapter(adptE);
        spnE.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                img.setImageResource(imgEqp[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spnJ = rootFrag.findViewById(R.id.spnNomeJogador);
        spnJ.setAdapter(adtpJ);
        spnJ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spnG = rootFrag.findViewById(R.id.spnGrupo);
        spnG.setAdapter(adptG);
        spnG.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //////////////////////////////////////////////////////////////////////////////////

        final RecyclerView rcv = rootFrag.findViewById(R.id.rcvEquipesAdd);
        AdapterDadosNovaLiga adptN = new AdapterDadosNovaLiga(lst);

        RecyclerView.LayoutManager lLst = new LinearLayoutManager(getContext().getApplicationContext());
        rcv.setLayoutManager(lLst);
        rcv.setHasFixedSize(true);
        rcv.setAdapter(adptN);

        Button btn = rootFrag.findViewById(R.id.btnSalvarDados);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pos = spnE.getSelectedItemPosition();

                preencherRcv(imgEqp[pos],
                        spnE.getSelectedItem().toString(),
                        spnJ.getSelectedItem().toString(),
                        spnG.getSelectedItem().toString());
                rcv.scrollToPosition(0);
            }
        });

//        this.criarDadosNovaLiga();
        return rootFrag;
    }

    private void preencherRcv(int i, String e, String j, String g) {

        DadosNovaLiga dnl;
        dnl = new DadosNovaLiga(i, e, j, g);
        lst.add(dnl);

    }

    private void criarLiga() {

        Date dti;


    }

//    private void criarDadosNovaLiga() {
//        DadosNovaLiga dadosNovaLiga = new DadosNovaLiga(R.drawable.logo_flamengo, "Flamengo", "Jefferson", "Grupo A");
//        lst.add(dadosNovaLiga);
//
//        dadosNovaLiga = new DadosNovaLiga(R.drawable.logo_corinthians, "Corinthians", "Janderson", "Grupo B");
//        lst.add(dadosNovaLiga);
//
//        dadosNovaLiga = new DadosNovaLiga(R.drawable.logo_barcelona, "Barcelona", "Jefferson", "Grupo A");
//        lst.add(dadosNovaLiga);
//
//        dadosNovaLiga = new DadosNovaLiga(R.drawable.logo_real_madrid, "R. Madrid", "Janderson", "Grupo B");
//        lst.add(dadosNovaLiga);
//    }
}