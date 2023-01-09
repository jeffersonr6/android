package jr.app.peschampsleague;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import jr.app.peschampsleague.adaptersTab.AdapterPartidas;

public class Partidas extends Fragment {

    public AdapterPartidas adptPartidas;
    public View rootFrag, rootFrag2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootFrag = inflater.inflate(R.layout.fragment_listapartidas, container, false);
        rootFrag2 = inflater.inflate(R.layout.listapartidas, container, false);
        FragmentManager fgm = getActivity().getSupportFragmentManager();

        TabLayout tbFases = rootFrag.findViewById(R.id.tbFases);
        ViewPager vpgPartidas = rootFrag.findViewById(R.id.vpgPartidas);
        adptPartidas = new AdapterPartidas(fgm, tbFases.getTabCount());

        vpgPartidas.setAdapter(adptPartidas);
        tbFases.setupWithViewPager(vpgPartidas, true);

        return rootFrag;
    }

}