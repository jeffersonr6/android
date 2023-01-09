package jr.app.peschampsleague;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class EquipesAdd extends Fragment {

    public View rootFrag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootFrag = inflater.inflate(R.layout.dadosequipesadd, container, false);

        return rootFrag;
    }
}