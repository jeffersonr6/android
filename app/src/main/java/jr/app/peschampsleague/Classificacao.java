package jr.app.peschampsleague;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import jr.app.peschampsleague.adaptersTab.AdapterClassificacao;

public class Classificacao extends Fragment {

    public AdapterClassificacao adptClassificacao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootFrag = inflater.inflate(R.layout.fragment_classificacao, container, false);
        FragmentManager fgm = getActivity().getSupportFragmentManager();

        TabLayout tbGrupos = rootFrag.findViewById(R.id.tbGrupos);
        ViewPager vpgGrupos = rootFrag.findViewById(R.id.vpgGrupos);
        adptClassificacao = new AdapterClassificacao(fgm, tbGrupos.getTabCount());

        vpgGrupos.setAdapter(adptClassificacao);
        tbGrupos.setupWithViewPager(vpgGrupos);

        return rootFrag;
    }
}